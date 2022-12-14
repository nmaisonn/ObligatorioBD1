/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Presentacion;

import Negocio.DTOS.AplicativoDTO;
import Negocio.DTOS.AplicativoMenuDTO;
import Negocio.DTOS.RolAplicativoDTO;
import Negocio.DTOS.RolAplicativoMenuDTO;
import Negocio.DTOS.RolNegocioAplicativoDTO;
import Negocio.Servicios.AplicativoMenuServicio;
import Negocio.Servicios.PermisoServicio;
import Negocio.Servicios.RolAplicativoMenuServicio;
import Negocio.Servicios.RolAplicativoServicio;
import Negocio.Servicios.RolNegocioAplicativoServicio;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author prueba
 */
public class RolesAplicativosMenu extends javax.swing.JFrame {
    public  AplicativoDTO[] Aplicativos;
    public  String AppNombre;
    public int UserIdLogueado;
    static DefaultTableModel modeloRolesAplicativos;
    /**
     * Creates new form RolesAplicativosMenu
     * @param appNombre
     * @param aplicativos
     */
    public RolesAplicativosMenu(String appNombre, AplicativoDTO[] aplicativos,int userIdLogueado) {
        initComponents();
        this.AppNombre = appNombre;
        this.Aplicativos = aplicativos;
        this.UserIdLogueado = userIdLogueado;
        setearModeloTablaRolesAplicativos();
    }

    private RolesAplicativosMenu() {
        initComponents(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaRolesAplicativos = new javax.swing.JTable();
        BackBoton = new javax.swing.JButton();
        nombreAplicacion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        tablaRolesAplicativos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Rol", "Funciones"
            }
        ));
        jScrollPane1.setViewportView(tablaRolesAplicativos);

        BackBoton.setText("Back");
        BackBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBotonActionPerformed(evt);
            }
        });

        nombreAplicacion.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BackBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(nombreAplicacion))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(302, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(nombreAplicacion)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(BackBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBotonActionPerformed
        new AplicativosMenu(this.UserIdLogueado).setVisible(true);
    }//GEN-LAST:event_BackBotonActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
     cargarTablaRolesAplicativo();
// TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(RolesAplicativosMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RolesAplicativosMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RolesAplicativosMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RolesAplicativosMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RolesAplicativosMenu().setVisible(true);
            }
        });
    }
    private void cargarTablaRolesAplicativo(){

        nombreAplicacion.setText(this.AppNombre);
        int idApp = this.getAplicativoIdByName(this.AppNombre);
        int rolNegId= PermisoServicio.getRolNegIdByIds(this.UserIdLogueado, idApp);
        
        RolNegocioAplicativoDTO[] rolesNeg = RolNegocioAplicativoServicio.getRolesNegocioAplicativoByIds(rolNegId, idApp); //id user y id app
        //RolAplicativoDTO []  roles = new RolAplicativoDTO[rolesNeg.length];
        AplicativoMenuDTO []  menus = new AplicativoMenuDTO[rolesNeg.length];
        int i = 0;
        for(RolNegocioAplicativoDTO rol : rolesNeg){
            RolAplicativoMenuDTO menuRol = RolAplicativoMenuServicio.getRolAplicativoMenu(rol.AppId, rol.RolId);
            RolAplicativoDTO rolApp = RolAplicativoServicio.getRolAplicativo(menuRol.AppId, menuRol.RolId);
            AplicativoMenuDTO menuApp = AplicativoMenuServicio.getAplicativoMenu(menuRol.AppId, menuRol.MenuId);
            //roles[i] = RolAplicativoServicio.getRolAplicativo(rol.AppId, rol.RolId );// id app
            String[] texto = new String[2];
           texto[0] = String.valueOf(rolApp.Descripcion);
           texto[1] = String.valueOf(menuApp.Descripcion_Menu);

           modeloRolesAplicativos.addRow(texto); 
            i++;
        }

    }
    private void setearModeloTablaRolesAplicativos() {
        modeloRolesAplicativos = new DefaultTableModel();
        modeloRolesAplicativos.addColumn("Funcionalidad");
        modeloRolesAplicativos.addColumn("Menu");
       

        this.tablaRolesAplicativos.setModel(modeloRolesAplicativos);
        this.tablaRolesAplicativos.setCellSelectionEnabled(false);
        this.tablaRolesAplicativos.setRowSelectionAllowed(true);    
    }

    private int getAplicativoIdByName(String nombre){
        for(AplicativoDTO x :this.Aplicativos){
            if(x.NombreApp.equals(nombre)){
                return x.AppId;
            }
        }
        return 0;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBoton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nombreAplicacion;
    private javax.swing.JTable tablaRolesAplicativos;
    // End of variables declaration//GEN-END:variables
}
