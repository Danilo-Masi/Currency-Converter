package currencyconverter.modello;

public class Convertitore {

    public strictfp double convertiValute(double valore, String iniziale, String finale) {
        double nuovoValore = 0;
        if (finale.equals(Costanti.EURO)) {
            nuovoValore = valore;
        } else if (finale.equals(Costanti.BITCOIN)) {
            nuovoValore = (valore * Costanti.EURO_BITCOIN);
        } else if (finale.equals(Costanti.ETHER)) {
            nuovoValore = (valore * Costanti.EURO_ETHER);
        } else if (finale.equals(Costanti.DOLLARO)) {
            nuovoValore = (valore * Costanti.EURO_DOLLARO);
        }
        return nuovoValore;
    }

}
