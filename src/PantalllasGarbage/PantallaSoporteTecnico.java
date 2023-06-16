/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PantalllasGarbage;

/**
 *
 * @author hanze
 */
public class PantallaSoporteTecnico extends javax.swing.JFrame {

    /**
     * Creates new form PantallaSoporteTecnico
     */
    public PantallaSoporteTecnico() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblSoporteTecnico = new javax.swing.JLabel();
        cmbProblema = new javax.swing.JComboBox<>();
        txtSoporte = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSoporteTecnico.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblSoporteTecnico.setForeground(new java.awt.Color(255, 255, 255));
        lblSoporteTecnico.setText("Soporte Tecnico");
        getContentPane().add(lblSoporteTecnico, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, -1));

        cmbProblema.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Selecione un Problema-", " ", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cmbProblema, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 160, -1));

        txtSoporte.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout txtSoporteLayout = new javax.swing.GroupLayout(txtSoporte);
        txtSoporte.setLayout(txtSoporteLayout);
        txtSoporteLayout.setHorizontalGroup(
            txtSoporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
        );
        txtSoporteLayout.setVerticalGroup(
            txtSoporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
        );

        getContentPane().add(txtSoporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 320, 160));

        btnSalir.setBackground(new java.awt.Color(255, 0, 51));
        btnSalir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 110, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo_soporte.PNG"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 340));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        PantallaPrincipal PP4 = new PantallaPrincipal();
         PP4.setVisible(true);
         this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PantallaSoporteTecnico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaSoporteTecnico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaSoporteTecnico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaSoporteTecnico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaSoporteTecnico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cmbProblema;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblSoporteTecnico;
    private javax.swing.JPanel txtSoporte;
    // End of variables declaration//GEN-END:variables
}
