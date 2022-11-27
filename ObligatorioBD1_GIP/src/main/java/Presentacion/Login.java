/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Presentacion;

import Negocio.DTOS.PersonaDTO;
import Negocio.DTOS.PersonaPreguntaDTO;
import Negocio.DTOS.PreguntaDTO;
import Negocio.Servicios.PersonaPreguntaServicio;
import Negocio.Servicios.PersonaServicio;
import Negocio.Servicios.PreguntaServicio;
import Recursos.Hashing;
import java.awt.Dimension;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author nmais
 */
public class Login extends javax.swing.JFrame {

    private static int[] sAdministradores = {52670221,49894668,51368035};
 
    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ventanaRecuperar1 = new javax.swing.JFrame();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ciUser = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        ventanaRecuperar2 = new javax.swing.JFrame();
        respuestaUser = new javax.swing.JTextField();
        preguntaUser = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        ventanaRecuperar3 = new javax.swing.JFrame();
        jLabel8 = new javax.swing.JLabel();
        pass1 = new javax.swing.JTextField();
        pass2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCI = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnIngresar = new javax.swing.JButton();

        jLabel5.setText("Recuperar contraseña");

        jLabel6.setText("CI");

        jButton1.setText("Recuperar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout ventanaRecuperar1Layout = new javax.swing.GroupLayout(ventanaRecuperar1.getContentPane());
        ventanaRecuperar1.getContentPane().setLayout(ventanaRecuperar1Layout);
        ventanaRecuperar1Layout.setHorizontalGroup(
            ventanaRecuperar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventanaRecuperar1Layout.createSequentialGroup()
                .addContainerGap(199, Short.MAX_VALUE)
                .addGroup(ventanaRecuperar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ventanaRecuperar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(ventanaRecuperar1Layout.createSequentialGroup()
                            .addComponent(ciUser, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ventanaRecuperar1Layout.createSequentialGroup()
                            .addGroup(ventanaRecuperar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ventanaRecuperar1Layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(54, 54, 54)))
                            .addGap(192, 192, 192)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ventanaRecuperar1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(209, 209, 209))))
        );
        ventanaRecuperar1Layout.setVerticalGroup(
            ventanaRecuperar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventanaRecuperar1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel5)
                .addGap(39, 39, 39)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ciUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(191, Short.MAX_VALUE))
        );

        jButton2.setText("Recuperar");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel7.setText("Responde esta pregunta");

        javax.swing.GroupLayout ventanaRecuperar2Layout = new javax.swing.GroupLayout(ventanaRecuperar2.getContentPane());
        ventanaRecuperar2.getContentPane().setLayout(ventanaRecuperar2Layout);
        ventanaRecuperar2Layout.setHorizontalGroup(
            ventanaRecuperar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventanaRecuperar2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ventanaRecuperar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(preguntaUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(respuestaUser, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ventanaRecuperar2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(202, 202, 202))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ventanaRecuperar2Layout.createSequentialGroup()
                .addContainerGap(192, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(168, 168, 168))
        );
        ventanaRecuperar2Layout.setVerticalGroup(
            ventanaRecuperar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventanaRecuperar2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel7)
                .addGap(49, 49, 49)
                .addComponent(preguntaUser)
                .addGap(33, 33, 33)
                .addComponent(respuestaUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jButton2)
                .addContainerGap(156, Short.MAX_VALUE))
        );

        jLabel8.setText("Indica tu nueva contraseña");

        jLabel9.setText("Repetir contraseña");

        jButton3.setText("Actualizar contraseña");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout ventanaRecuperar3Layout = new javax.swing.GroupLayout(ventanaRecuperar3.getContentPane());
        ventanaRecuperar3.getContentPane().setLayout(ventanaRecuperar3Layout);
        ventanaRecuperar3Layout.setHorizontalGroup(
            ventanaRecuperar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventanaRecuperar3Layout.createSequentialGroup()
                .addContainerGap(187, Short.MAX_VALUE)
                .addGroup(ventanaRecuperar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ventanaRecuperar3Layout.createSequentialGroup()
                        .addGroup(ventanaRecuperar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pass1)
                            .addComponent(pass2)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(170, 170, 170))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ventanaRecuperar3Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(149, 149, 149))))
        );
        ventanaRecuperar3Layout.setVerticalGroup(
            ventanaRecuperar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventanaRecuperar3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel8)
                .addGap(27, 27, 27)
                .addComponent(pass1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pass2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jButton3)
                .addContainerGap(140, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Login");

        jLabel2.setText("CI");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel3.setText("Contraseña");

        jLabel4.setText("Has olvidado la contraseña?");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(105, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtCI, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(jLabel4)))
                        .addGap(118, 118, 118))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(178, 178, 178))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(51, 51, 51)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(40, 40, 40)
                .addComponent(btnIngresar, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        int xCi = Integer.parseInt(txtCI.getText());
        if (esAdminSistema(xCi)) {
            PersonaDTO xPersona = PersonaServicio.getPersonaByUserId(xCi);
            if (xPersona != null) {
                try {
                    if (xPersona.Password.equals(Hashing.DoHash(txtContraseña.getText()))) {
                        JOptionPane.showMessageDialog(null, "Logeado correctamente!");
                        this.setVisible(false);
                        new Gestion().setVisible(true);
                    } else {
                        JOptionPane.showMessageDialog(null, "Error al logear!");
                        txtCI.setText("");
                        txtContraseña.setText("");
                    }
                } catch (Error e) {
                    System.out.println(e);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Error al logear!");
                txtCI.setText("");
                txtContraseña.setText("");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Error al logear! Usted no es administrador");
            txtCI.setText("");
            txtContraseña.setText("");
        }
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        ventanaRecuperar1.setMinimumSize(new Dimension(500, 359));
        ventanaRecuperar1.setVisible(true);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        PersonaDTO xPersona = PersonaServicio.getPersonaByUserId(Integer.parseInt(ciUser.getText()));
        if (xPersona != null) {
            try {
                PersonaPreguntaDTO persPreg = PersonaPreguntaServicio.getPersPregByUserId(xPersona.UserId);

                PreguntaDTO preg = PreguntaServicio.getPregById(persPreg.PregId);

                // Buscar pregunta y mostrarla
                preguntaUser.setText(preg.Pregunta);
                // Mostrar cosas
                ventanaRecuperar1.setVisible(false);
                ventanaRecuperar2.setMinimumSize(new Dimension(500, 359));
                ventanaRecuperar2.setVisible(true);
            } catch (Error e) {
                System.out.println(e);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Error al recuperar la contraseña!");
            ciUser.setText("");
            ventanaRecuperar1.setVisible(false);
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked

    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
        if (pass1.getText().equals(pass2.getText())) {
            PersonaDTO xPersona = new PersonaDTO(Integer.parseInt(ciUser.getText()), "", "", "", "", "", Hashing.DoHash(pass1.getText()));
            try {
                PersonaServicio.changePassword(xPersona);
                JOptionPane.showMessageDialog(null, "Contraseña cambiada con exito!");
                pass1.setText("");
                pass2.setText("");
                ventanaRecuperar3.setVisible(false);
            } catch (SQLException ex) {
            }

        } else {
            JOptionPane.showMessageDialog(null, "Error al cambiar la contraseña!");
            pass1.setText("");
            pass2.setText("");
            ventanaRecuperar3.setVisible(false);
        }
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        PersonaDTO xPersona = PersonaServicio.getPersonaByUserId(Integer.parseInt(ciUser.getText()));
        PersonaPreguntaDTO persPreg = PersonaPreguntaServicio.getPersPregByUserId(xPersona.UserId);
        if (persPreg.Respuesta.equals(respuestaUser.getText())) {
            ventanaRecuperar2.setVisible(false);
            ventanaRecuperar3.setMinimumSize(new Dimension(500, 359));
            ventanaRecuperar3.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Error al recuperar la contraseña!");
            respuestaUser.setText("");
            ventanaRecuperar2.setVisible(false);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private boolean esAdminSistema(int pCi){
        for(int x : sAdministradores){
            if(pCi == x){
                return true;
            }
        }
        return false;
    }
    
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JTextField ciUser;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField pass1;
    private javax.swing.JTextField pass2;
    private javax.swing.JLabel preguntaUser;
    private javax.swing.JTextField respuestaUser;
    private javax.swing.JTextField txtCI;
    private javax.swing.JTextField txtContraseña;
    private javax.swing.JFrame ventanaRecuperar1;
    private javax.swing.JFrame ventanaRecuperar2;
    private javax.swing.JFrame ventanaRecuperar3;
    // End of variables declaration//GEN-END:variables
}
