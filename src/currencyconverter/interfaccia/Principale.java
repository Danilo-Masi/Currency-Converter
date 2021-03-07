package currencyconverter.interfaccia;

import currencyconverter.Applicazione;
import currencyconverter.modello.Costanti;
import javax.swing.JLabel;

public class Principale extends javax.swing.JPanel {
    
    public void inizializza() {
        initComponents();
        inizializzaComponenti();
        inizializzaAzioni();
    }
    
    private void inizializzaAzioni() {
        this.bottoneConverti.setAction(Applicazione.getInstance().getControlloPrincipale().getAzioneConverti());
    }
    
    private void inizializzaComponenti() {
        this.comboInserisciValutaIniziale.removeAllItems();
        this.comboInserisciValutaFinale.removeAllItems();
        this.comboInserisciValutaIniziale.addItem(Costanti.EURO);
        this.comboInserisciValutaFinale.addItem(" ");
        this.comboInserisciValutaFinale.addItem(Costanti.EURO);
        this.comboInserisciValutaFinale.addItem(Costanti.BITCOIN);
        this.comboInserisciValutaFinale.addItem(Costanti.ETHER);
        this.comboInserisciValutaFinale.addItem(Costanti.DOLLARO);
    }
    
    public double getValoreCampo() {
        String campo = this.campoInserisciValore.getText();
        double campoConverito = Double.parseDouble(campo);
        return campoConverito;
    }
    
    public String getComboFinale() {
        return this.comboInserisciValutaFinale.getSelectedItem().toString();
    }
    
    public JLabel labelRisultato() {
        return this.labelRisultato;
    }
    
    public JLabel labelPrimaParte() {
        return this.labelPrimaParteRisultato;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        campoInserisciValore = new javax.swing.JTextField();
        comboInserisciValutaIniziale = new javax.swing.JComboBox<>();
        comboInserisciValutaFinale = new javax.swing.JComboBox<>();
        labelRisultato = new javax.swing.JLabel();
        bottoneConverti = new javax.swing.JButton();
        labelPrimaParteRisultato = new javax.swing.JLabel();

        campoInserisciValore.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        comboInserisciValutaIniziale.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        comboInserisciValutaFinale.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        labelRisultato.setFont(new java.awt.Font("Dialog", 0, 25)); // NOI18N
        labelRisultato.setText("0.000024 Bitcoin");

        bottoneConverti.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        bottoneConverti.setText("jButton1");

        labelPrimaParteRisultato.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        labelPrimaParteRisultato.setText("1 euro uguale a ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(labelRisultato, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoInserisciValore, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bottoneConverti, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboInserisciValutaFinale, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboInserisciValutaIniziale, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(labelPrimaParteRisultato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(labelPrimaParteRisultato, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(labelRisultato, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoInserisciValore, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(comboInserisciValutaIniziale)))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(comboInserisciValutaFinale, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(bottoneConverti, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addGap(50, 50, 50))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bottoneConverti;
    private javax.swing.JTextField campoInserisciValore;
    private javax.swing.JComboBox<String> comboInserisciValutaFinale;
    private javax.swing.JComboBox<String> comboInserisciValutaIniziale;
    private javax.swing.JLabel labelPrimaParteRisultato;
    private javax.swing.JLabel labelRisultato;
    // End of variables declaration//GEN-END:variables
}
