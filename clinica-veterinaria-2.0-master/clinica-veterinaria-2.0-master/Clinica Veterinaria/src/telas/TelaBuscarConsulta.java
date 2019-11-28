/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import controller.VeterinarioController;
import static java.awt.image.ImageObserver.WIDTH;
import javax.swing.JOptionPane;
import registro.Consulta;

/**
 *
 * @author arthu
 */
public class TelaBuscarConsulta extends javax.swing.JFrame {
    
    VeterinarioController a = new VeterinarioController();
    /**
     * Creates new form TelaBuscarConsulta
     */
    public TelaBuscarConsulta() {
        initComponents();
    }
    public void fechar(){
        this.dispose();
    }
    public void preencherDados(String nomeCLiente, String especie, String data, String hora){
        
        txtNomeCliente.setText(nomeCLiente);
        txtEspecie.setText(especie);
        txtData.setText(data);
        txtHora.setText(hora);
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnVoltar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtNomeCliente = new javax.swing.JTextField();
        txtEspecie = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtData = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtHora = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtIdConsulta = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, 65, -1));

        jLabel1.setText("Nome do cliente:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        txtNomeCliente.setEditable(false);
        getContentPane().add(txtNomeCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 170, -1));

        txtEspecie.setEditable(false);
        txtEspecie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEspecieActionPerformed(evt);
            }
        });
        getContentPane().add(txtEspecie, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 170, -1));

        jLabel2.setText("Especie do pet:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jLabel3.setText("Data:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, -1, -1));

        txtData.setEditable(false);
        txtData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataActionPerformed(evt);
            }
        });
        getContentPane().add(txtData, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 170, -1));

        jLabel4.setText("Hora:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, -1));

        txtHora.setEditable(false);
        txtHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHoraActionPerformed(evt);
            }
        });
        getContentPane().add(txtHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 170, -1));

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, -1, -1));

        jLabel5.setText("* Campos Obrigatorios");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/dd30vdi-d5955ad2-b1f6-4c5a-9da4-53ae3d45f3c1.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 320, 470));

        txtIdConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdConsultaActionPerformed(evt);
            }
        });
        getContentPane().add(txtIdConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 170, -1));

        jLabel7.setText("Id Consulta:*");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtEspecieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEspecieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEspecieActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        fechar();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void txtDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataActionPerformed

    private void txtHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHoraActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        
        if(!txtIdConsulta.getText().trim().isEmpty()){
            Consulta consulta = new Consulta();
            consulta = a.buscarConsulta(txtIdConsulta.getText());
            if(!consulta.equals(null)){
                preencherDados(consulta.getNomeCliente(), consulta.getEspecie(), consulta.getData(), consulta.getHorario());
            }else JOptionPane.showMessageDialog(null, "Preencha os campos necessários :(", null, WIDTH);
        }else JOptionPane.showMessageDialog(null, "Id da Consulta não inserido", null, WIDTH);

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtIdConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdConsultaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdConsultaActionPerformed
    
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
            java.util.logging.Logger.getLogger(TelaBuscarConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaBuscarConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaBuscarConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaBuscarConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaBuscarConsulta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtEspecie;
    private javax.swing.JTextField txtHora;
    private javax.swing.JTextField txtIdConsulta;
    private javax.swing.JTextField txtNomeCliente;
    // End of variables declaration//GEN-END:variables
}
