package currencyconverter;

import com.formdev.flatlaf.FlatDarculaLaf;
import currencyconverter.controllo.ControlloFrame;
import currencyconverter.controllo.ControlloPrincipale;
import currencyconverter.interfaccia.Frame;
import currencyconverter.interfaccia.Principale;
import currencyconverter.modello.Convertitore;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Applicazione {
    
    private static Applicazione singleton = new Applicazione();
    
    public static Applicazione getInstance() {
        return singleton;
    }
    
    private Convertitore convertitore;
    private Frame frame;
    private Principale principale;
    private ControlloFrame controlloFrame;
    private ControlloPrincipale controlloPrincipale;

    public Convertitore getConvertitore() {
        return convertitore;
    }

    public Frame getFrame() {
        return frame;
    }

    public Principale getPrincipale() {
        return principale;
    }

    public ControlloFrame getControlloFrame() {
        return controlloFrame;
    }

    public ControlloPrincipale getControlloPrincipale() {
        return controlloPrincipale;
    }
    
    private void inizializza() {
        this.convertitore = new Convertitore();
        this.frame = new Frame();
        this.principale = new Principale();
        this.controlloFrame = new ControlloFrame();
        this.controlloPrincipale = new ControlloPrincipale();
        
        this.frame.inizializza();
        this.principale.inizializza();
    }
    
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new FlatDarculaLaf());
        } catch (UnsupportedLookAndFeelException ex) {
            System.err.println(ex.getMessage());
        }
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Applicazione.getInstance().inizializza();
            }
        });
    }
    
}
