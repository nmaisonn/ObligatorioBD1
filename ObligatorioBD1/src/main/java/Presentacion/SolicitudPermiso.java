/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Presentacion;

import Negocio.DTOS.AplicativoDTO;
import Negocio.DTOS.PermisoDTO;
import Negocio.DTOS.RolNegocioAplicativoDTO;
import Negocio.DTOS.RolNegocioDTO;
import Negocio.Servicios.AplicativoServicio;
import Negocio.Servicios.PermisoServicio;
import Negocio.Servicios.RolNegocioAplicativoServicio;
import Negocio.Servicios.RolNegocioServicio;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author nmais
 */
public class SolicitudPermiso extends javax.swing.JFrame {

    public AplicativoDTO[] gAplicativos = null;
    public RolNegocioDTO[] gRolNegocio = null;
    public int gUserLogueadoId;

    /**
     * Creates new form SolicitudPermiso
     */
    public SolicitudPermiso(int pIdUser) {
        initComponents();
        this.gUserLogueadoId = pIdUser;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmbAplicativos = new javax.swing.JComboBox<>();
        cmbRolNegocio = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        btnSolicitar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        cmbAplicativos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbAplicativosItemStateChanged(evt);
            }
        });
        cmbAplicativos.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cmbAplicativosPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        cmbAplicativos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmbAplicativosMouseClicked(evt);
            }
        });
        cmbAplicativos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbAplicativosActionPerformed(evt);
            }
        });
        cmbAplicativos.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                cmbAplicativosPropertyChange(evt);
            }
        });

        jLabel1.setText("Solicitud de Permisos");

        btnSolicitar.setText("Solicitar");
        btnSolicitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSolicitarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbAplicativos, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbRolNegocio, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(jLabel1)))
                .addContainerGap(136, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnSolicitar)
                .addGap(67, 67, 67))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(90, 90, 90)
                .addComponent(cmbAplicativos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cmbRolNegocio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(btnSolicitar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbAplicativosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbAplicativosItemStateChanged

    }//GEN-LAST:event_cmbAplicativosItemStateChanged

    private void cmbAplicativosPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cmbAplicativosPopupMenuWillBecomeInvisible
        String textoComboBox = (String) cmbAplicativos.getSelectedItem();
        AplicativoDTO xAplicativo = getAplicativoSeleccionado(textoComboBox);
        try {
            cmbRolNegocio.removeAllItems();
            cargarRolesNegiocio(xAplicativo.AppId);
        } catch (SQLException ex) {
        }
    }//GEN-LAST:event_cmbAplicativosPopupMenuWillBecomeInvisible

    private void cmbAplicativosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbAplicativosMouseClicked

    }//GEN-LAST:event_cmbAplicativosMouseClicked

    private void cmbAplicativosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbAplicativosActionPerformed

    }//GEN-LAST:event_cmbAplicativosActionPerformed

    private void cmbAplicativosPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_cmbAplicativosPropertyChange

    }//GEN-LAST:event_cmbAplicativosPropertyChange

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        cargarAplicativos();
    }//GEN-LAST:event_formWindowOpened

    private void btnSolicitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSolicitarActionPerformed
        String textoComboAplicativo = (String) cmbAplicativos.getSelectedItem();
        int idAplicativo = obtenerIdAplicativoByNombre(textoComboAplicativo);
        String textoComboRolNegocio = (String) cmbRolNegocio.getSelectedItem();
        int idRolNegocio = obtenerIdRolNegocioByNombre(textoComboRolNegocio);
        PermisoDTO xSolicitud = new PermisoDTO(this.gUserLogueadoId, idRolNegocio, idAplicativo);
        try {
            PermisoServicio.crearSolicitud(xSolicitud);
            JOptionPane.showMessageDialog(null, "Se realizo su solicitud con exito");
            this.setVisible(false);
            new Login().setVisible(true);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Hubo un error al realizar la solicitud");
            Logger.getLogger(SolicitudPermiso.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSolicitarActionPerformed

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
            java.util.logging.Logger.getLogger(SolicitudPermiso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SolicitudPermiso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SolicitudPermiso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SolicitudPermiso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    private void cargarAplicativos() {
        gAplicativos = AplicativoServicio.getAplicativos();
        for (AplicativoDTO x : gAplicativos) {
            String nombre = x.NombreApp;
            cmbAplicativos.addItem(x.NombreApp);
        }
    }

    private AplicativoDTO getAplicativoSeleccionado(String pNombreApp) {
        for (AplicativoDTO x : gAplicativos) {
            if (x.NombreApp.equals(pNombreApp)) {
                return x;
            }
        }
        return null;
    }

    private void cargarRolesNegiocio(int pId) throws SQLException {
        RolNegocioAplicativoDTO[] xRolNegocioAplicativos = RolNegocioAplicativoServicio.getRolNegocioAplicativoByAppId(pId);
        if (xRolNegocioAplicativos != null) {
            gRolNegocio = new RolNegocioDTO[xRolNegocioAplicativos.length];
            int i = 0;
            for (RolNegocioAplicativoDTO x : xRolNegocioAplicativos) {
                gRolNegocio[i] = RolNegocioServicio.getRolNegocioById(x.RolNegId);
                i++;
            }
            for (RolNegocioDTO x : gRolNegocio) {
                cmbRolNegocio.addItem(x.Descripcion);
            }
        }

    }

    private int obtenerIdAplicativoByNombre(String pTexto) {
        for (AplicativoDTO x : gAplicativos) {
            if (x.NombreApp.equals(pTexto)) {
                return x.AppId;
            }
        }
        return 0;
    }

    private int obtenerIdRolNegocioByNombre(String pTexto) {
        for (RolNegocioDTO x : gRolNegocio) {
            if (x.Descripcion.equals(pTexto)) {
                return x.RolNegId;
            }
        }
        return 0;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSolicitar;
    private javax.swing.JComboBox<String> cmbAplicativos;
    private javax.swing.JComboBox<String> cmbRolNegocio;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
