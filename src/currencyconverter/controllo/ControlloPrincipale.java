package currencyconverter.controllo;

import currencyconverter.Applicazione;
import currencyconverter.interfaccia.Principale;
import currencyconverter.modello.Convertitore;
import currencyconverter.modello.Costanti;
import java.awt.event.ActionEvent;
import java.text.DecimalFormat;
import javax.swing.AbstractAction;
import javax.swing.Action;

public class ControlloPrincipale {

    private Action AzioneConverti = new AzioneConverti();

    private class AzioneConverti extends AbstractAction {

        public AzioneConverti() {
            this.putValue(NAME, "Converti");
            this.putValue(SHORT_DESCRIPTION, "Clicca per convertire le valute");
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            Principale principale = Applicazione.getInstance().getPrincipale();
            String valore = principale.getValoreCampo();
            double valoreConvertito = Double.parseDouble(valore);
            String comboFinale = principale.getComboFinale();
            String errori = convalida(valore, comboFinale);
            if (!errori.isEmpty()) {
                Applicazione.getInstance().getFrame().mostraMessaggioErrore(errori);
                return;
            }
            Convertitore convertitore = Applicazione.getInstance().getConvertitore();
            double risultato = convertitore.convertiValute(valoreConvertito, Costanti.EURO, comboFinale);
            
            DecimalFormat df = new DecimalFormat();
            df.setMaximumFractionDigits(5);
            
            String scriviPrimaParte = valore + " euro " + "uguale a ";
            String scriviSecondaParte = df.format(risultato) + " " + comboFinale;
            principale.labelPrimaParte().setText(scriviPrimaParte);
            principale.labelRisultato().setText(scriviSecondaParte);
        }

        public String convalida(String valore, String comboFinale) {
            StringBuilder errori = new StringBuilder();
            if (valore.isEmpty()) {
                errori.append("Inserire un valore da convertire").append("\n");
                double valoreConvertito = Double.parseDouble(valore);
                if (valoreConvertito < 0) {
                    errori.append("Inserire un valore maggiore di 0");
                }
            } else if (comboFinale.isBlank()) {
                errori.append("Inserire in quale valuta convertire").append("\n");
            }
            return errori.toString().trim();
        }
    }

    public Action getAzioneConverti() {
        return AzioneConverti;
    }

}
