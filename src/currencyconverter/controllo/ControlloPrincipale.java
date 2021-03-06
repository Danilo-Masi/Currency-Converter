package currencyconverter.controllo;

import currencyconverter.Applicazione;
import currencyconverter.interfaccia.Principale;
import currencyconverter.modello.Convertitore;
import currencyconverter.modello.Costanti;
import java.awt.event.ActionEvent;
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
            double valore = principale.getValoreCampo();
            String comboFinale = principale.getComboFinale();
            String errori = convalida(valore, comboFinale);
            if (!errori.isEmpty()) {
                Applicazione.getInstance().getFrame().mostraMessaggioErrore(errori);
                return;
            }
            Convertitore convertitore = Applicazione.getInstance().getConvertitore();
            double risultato = convertitore.convertiValute(valore, Costanti.EURO, comboFinale);
            String scriviRisultato = valore + " euro " + "valgono: " + risultato + " " + comboFinale;
            System.out.println(scriviRisultato);
            String nuovaLabel = principale.labelRisultato().replaceAll(NAME, scriviRisultato);
        }

        public String convalida(double valore, String comboFinale) {
            StringBuilder errori = new StringBuilder();
            if (valore < 0) {
                errori.append("Inserire un valore maggiore di 0").append("\n");
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
