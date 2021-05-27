
package interfaz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class NuevoTrabajador extends javax.swing.JFrame {

    Connection con;
  
    public NuevoTrabajador() {
     
            initComponents();
            this.setLocationRelativeTo(null);
            
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(NuevoTrabajador.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tfNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfApellido = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfEdad = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfTelefono = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfDni = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tfSalario = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(390, 525));
        setMinimumSize(new java.awt.Dimension(390, 525));
        setPreferredSize(new java.awt.Dimension(390, 525));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Ingresar nombre:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 140, 150, 30);

        tfNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfNombreFocusGained(evt);
            }
        });
        tfNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNombreActionPerformed(evt);
            }
        });
        getContentPane().add(tfNombre);
        tfNombre.setBounds(170, 140, 150, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Ingresar Apellido:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 180, 140, 30);

        tfApellido.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfApellidoFocusGained(evt);
            }
        });
        tfApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfApellidoActionPerformed(evt);
            }
        });
        getContentPane().add(tfApellido);
        tfApellido.setBounds(170, 180, 150, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Ingresar Edad:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 220, 110, 30);

        tfEdad.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfEdadFocusGained(evt);
            }
        });
        tfEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfEdadActionPerformed(evt);
            }
        });
        getContentPane().add(tfEdad);
        tfEdad.setBounds(170, 220, 150, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Ingresar Telefono:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 260, 130, 30);

        tfTelefono.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfTelefonoFocusGained(evt);
            }
        });
        tfTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTelefonoActionPerformed(evt);
            }
        });
        getContentPane().add(tfTelefono);
        tfTelefono.setBounds(170, 260, 150, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Ingresar DNI:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 300, 110, 30);

        tfDni.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfDniFocusGained(evt);
            }
        });
        getContentPane().add(tfDni);
        tfDni.setBounds(170, 300, 150, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Ingresar Salario:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(30, 340, 120, 30);

        tfSalario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfSalarioFocusGained(evt);
            }
        });
        tfSalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSalarioActionPerformed(evt);
            }
        });
        getContentPane().add(tfSalario);
        tfSalario.setBounds(170, 340, 150, 30);

        jButton1.setText("Cargar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(40, 420, 98, 33);

        jButton2.setText("Menu");
        jButton2.setActionCommand("");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(170, 420, 98, 33);

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Javier\\Desktop\\workspace1\\ControlTrabajadores\\src\\main\\java\\imagen\\formulario.jpg")); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, -10, 380, 530);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/trabajadores","trabajadores","");
            Statement stmt=con.createStatement();
            stmt.executeUpdate("INSERT INTO trabajadores(nombre,apellido,edad,telefono,dni,salario)"
                    + "VALUES('"+tfNombre.getText()+"','"+tfApellido.getText()+"','"+tfEdad.getText()+"','"+tfTelefono.getText()+"','"+tfDni.getText()+"','"+tfSalario.getText()+"')");
           
        } catch (SQLException ex) {
            Logger.getLogger(NuevoTrabajador.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "No se puede conectar a la base de datos");
        }
        
        JOptionPane.showMessageDialog(null, "El trabajador se a cargado de manera exitosa");
        tfNombre.setText("");
        tfApellido.setText("");
        tfEdad.setText("");
        tfTelefono.setText("");
        tfDni.setText("");
        tfSalario.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tfEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfEdadActionPerformed

    private void tfNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNombreActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Menu menuUno = new Menu();
        menuUno.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tfApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfApellidoActionPerformed

    private void tfTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTelefonoActionPerformed

    private void tfNombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfNombreFocusGained
        
    }//GEN-LAST:event_tfNombreFocusGained

    private void tfApellidoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfApellidoFocusGained
       
    }//GEN-LAST:event_tfApellidoFocusGained

    private void tfEdadFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfEdadFocusGained
        
    }//GEN-LAST:event_tfEdadFocusGained

    private void tfTelefonoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfTelefonoFocusGained
        
    }//GEN-LAST:event_tfTelefonoFocusGained

    private void tfDniFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfDniFocusGained
      
    }//GEN-LAST:event_tfDniFocusGained

    private void tfSalarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfSalarioFocusGained
        
    }//GEN-LAST:event_tfSalarioFocusGained

    private void tfSalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSalarioActionPerformed
       
    }//GEN-LAST:event_tfSalarioActionPerformed

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
            java.util.logging.Logger.getLogger(NuevoTrabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NuevoTrabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NuevoTrabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NuevoTrabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NuevoTrabajador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField tfApellido;
    private javax.swing.JTextField tfDni;
    private javax.swing.JTextField tfEdad;
    private javax.swing.JTextField tfNombre;
    private javax.swing.JTextField tfSalario;
    private javax.swing.JTextField tfTelefono;
    // End of variables declaration//GEN-END:variables
}
