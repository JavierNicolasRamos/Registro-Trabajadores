/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Javier
 */
public class ListaTrabajadores extends javax.swing.JFrame {

   Connection con;
    
    public ListaTrabajadores() {
        initComponents();
        this.setLocationRelativeTo(null);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(NuevoTrabajador.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    public void eliminarDatos(){
        try{
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/trabajadores","trabajadores","");
            int filaSeleccionada = tablaTrabajadores.getSelectedRow();
            String Sql="delete from trabajadores where dni="+tablaTrabajadores.getValueAt(filaSeleccionada,4);
            Statement st;
            st = con.createStatement();
            
            int n=st.executeUpdate(Sql);
            
            if(n>=0){
                JOptionPane.showMessageDialog(null,"Trabajador eliminado");
                
            }
        }
        catch(Exception e){
        JOptionPane.showMessageDialog(null,"Error al eliminar"+e.getMessage());
    }
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBuscar = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaTrabajadores = new javax.swing.JTable();
        tfApellido = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(750, 470));
        setMinimumSize(new java.awt.Dimension(750, 470));
        setPreferredSize(new java.awt.Dimension(750, 470));
        getContentPane().setLayout(null);

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar);
        btnBuscar.setBounds(395, 390, 70, 30);

        btnMenu.setText("Menu");
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });
        getContentPane().add(btnMenu);
        btnMenu.setBounds(480, 390, 59, 30);

        jButton1.setText("Eliminar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(280, 390, 100, 30);

        tablaTrabajadores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Apellido", "Edad", "Telefono", "Dnil", "Salario"
            }
        ));
        jScrollPane1.setViewportView(tablaTrabajadores);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(70, 200, 469, 153);

        tfApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfApellidoActionPerformed(evt);
            }
        });
        getContentPane().add(tfApellido);
        tfApellido.setBounds(70, 160, 147, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Apellido:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(70, 140, 60, 20);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Consulta de Trabajadores");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(77, 60, 310, 40);

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Javier\\Desktop\\workspace1\\ControlTrabajadores\\src\\main\\java\\imagen\\busqueda.jpeg")); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 760, 570);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
       Menu menu = new Menu();
       menu.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btnMenuActionPerformed

    private void tfApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfApellidoActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        
        try {
            DefaultTableModel modelo = (DefaultTableModel) tablaTrabajadores.getModel();
            
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/trabajadores","trabajadores","");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM trabajadores WHERE apellido LIKE'"+tfApellido.getText()+"%'");
            
            rs.next();
            modelo.setRowCount(0);
            do{
                String[] fila = {rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6)};
                
                modelo.addRow(fila);
                
                
      
            }
            while(rs.next());
            
        } catch (SQLException ex) {
            Logger.getLogger(ListaTrabajadores.class.getName()).log(Level.SEVERE, null, ex);
        }
   
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        eliminarDatos();
        try {
            DefaultTableModel modelo = (DefaultTableModel) tablaTrabajadores.getModel();
            
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/trabajadores","trabajadores","");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM trabajadores WHERE apellido LIKE'"+tfApellido.getText()+"%'");
            
            rs.next();
            modelo.setRowCount(0);
            do{
                String[] fila = {rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6)};
                
                modelo.addRow(fila);
                
                
      
            }
            while(rs.next());
            
        } catch (SQLException ex) {
            Logger.getLogger(ListaTrabajadores.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(ListaTrabajadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaTrabajadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaTrabajadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaTrabajadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaTrabajadores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaTrabajadores;
    private javax.swing.JTextField tfApellido;
    // End of variables declaration//GEN-END:variables



}
