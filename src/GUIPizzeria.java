
import java.util.Calendar;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author User
 */
public class GUIPizzeria extends javax.swing.JFrame {

    /**
     * Creates new form GUIPizzeria
     */
    public GUIPizzeria() {
        initComponents();
        configurarHora();
        setTitle("Agregar Pedido");
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxTamaño = new javax.swing.JComboBox<>();
        jComboBoxTipo = new javax.swing.JComboBox<>();
        jComboBoxVAriedad = new javax.swing.JComboBox<>();
        jButtonOK = new javax.swing.JButton();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldHora = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldMinuto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldDemora = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabelErrorNombre = new javax.swing.JLabel();
        jLabelErrorDemora = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabelErrorCantidad = new javax.swing.JLabel();
        jTextFieldCantidad = new javax.swing.JTextField();
        jLabelErrorHoraMinuto = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldObservacion = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jLabel1.setText("Nombre");

        jLabel2.setText("Hora");

        jLabel3.setText("Demora");

        jComboBoxTamaño.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Grande (8)", "Extra grande (10)", "Gigante (12)" }));
        jComboBoxTamaño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTamañoActionPerformed(evt);
            }
        });

        jComboBoxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Piedra", "Parrilla", "Molde" }));

        jComboBoxVAriedad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Muzzarella", "Jamon y morrones", "Fugazzeta", "Cuatro quesos", "Napolitana" }));

        jButtonOK.setText("OK");
        jButtonOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOKClick(evt);
            }
        });

        jTextFieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreActionPerformed(evt);
            }
        });

        jTextFieldHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldHoraActionPerformed(evt);
            }
        });

        jLabel4.setText("hora");

        jTextFieldMinuto.setText(" ");
        jTextFieldMinuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMinutoActionPerformed(evt);
            }
        });

        jLabel5.setText("minutos");

        jLabel6.setText("(en minutos)");

        jLabelErrorNombre.setForeground(new java.awt.Color(255, 0, 0));

        jLabelErrorDemora.setForeground(new java.awt.Color(255, 0, 0));

        jLabel7.setText("Cantidad de pizzas");

        jLabelErrorCantidad.setForeground(new java.awt.Color(255, 0, 0));
        jLabelErrorCantidad.setText("  ");

        jLabelErrorHoraMinuto.setForeground(new java.awt.Color(255, 0, 0));

        jLabel8.setText("Observacion");

        jTextFieldObservacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldObservacionActionPerformed(evt);
            }
        });

        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel2)))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextFieldDemora, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jTextFieldHora, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldMinuto, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelErrorDemora, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabelErrorHoraMinuto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addContainerGap())
                        .addComponent(jLabelErrorNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 22, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jTextFieldCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxTamaño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxVAriedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(121, 121, 121)
                                .addComponent(jButtonOK))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabelErrorCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldObservacion))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jButton1)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(57, 57, 57))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelErrorNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelErrorHoraMinuto, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(jTextFieldMinuto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelErrorDemora, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jTextFieldDemora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxTamaño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxVAriedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelErrorCantidad)
                    .addComponent(jLabel8)
                    .addComponent(jTextFieldObservacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonOK)
                    .addComponent(jButton1))
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxTamañoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTamañoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxTamañoActionPerformed

    private void jButtonOKClick(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOKClick
        
        jLabelErrorCantidad.setText("");
        jLabelErrorDemora.setText("");
        jLabelErrorHoraMinuto.setText("");
        jLabelErrorNombre.setText("");
        
        ventanaDatosDePedido ventana = new ventanaDatosDePedido();
        Pizza pizza = new Pizza();
        if (jComboBoxTamaño.getSelectedItem().equals("Grande (8)")) {
            pizza.setTamaño(8);
        }
        if (jComboBoxTamaño.getSelectedItem().equals("Extra grande (10)")) {
            pizza.setTamaño(10);
        }
        if (jComboBoxTamaño.getSelectedItem().equals("Gigante (12)")) {
            pizza.setTamaño(12);
        }

        if (jComboBoxTipo.getSelectedItem().equals("Piedra")) {
            pizza.setTipo(Tipo.PIEDRA);
        }
        if (jComboBoxTipo.getSelectedItem().equals("Parrilla")) {
            pizza.setTipo(Tipo.PARRILLA);
        }
        if (jComboBoxTipo.getSelectedItem().equals("Molde")) {
            pizza.setTipo(Tipo.MOLDE);
        }

        if (jComboBoxVAriedad.getSelectedItem().equals("Muzzarella")) {
            pizza.setVariedad(muzzarella);
        }
        if (jComboBoxVAriedad.getSelectedItem().equals("Jamon y morrones")) {
            pizza.setVariedad(jamonYMorrones);
        }
        if (jComboBoxVAriedad.getSelectedItem().equals("Fugazzeta")) {
            pizza.setVariedad(fugazzeta);
        }
        if (jComboBoxVAriedad.getSelectedItem().equals("Cuatro quesos")) {
            pizza.setVariedad(cuatroQuesos);
        }
        if (jComboBoxVAriedad.getSelectedItem().equals("Napolitana")) {
            pizza.setVariedad(napolitana);
        }

        try {

            long cantidad = Long.valueOf(jTextFieldCantidad.getText());

        } catch (Exception e) {
            jLabelErrorCantidad.setText("Agregue un número válido");
        }

        long cantidad = Long.valueOf(jTextFieldCantidad.getText());
        if (cantidad <= 0 || jTextFieldCantidad.getText().isEmpty()) {
            jLabelErrorCantidad.setText("La cantidad tiene que ser igual mayor a 1");

        }
        ItemPedido pedido = new ItemPedido(pizza, cantidad);

        String nombreIngresado = jTextFieldNombre.getText();
        nombreIngresado = nombreIngresado.trim();

        if (nombreIngresado.isEmpty()) {
            jLabelErrorNombre.setText("Necesita ingresar un nombre");
        } else {

            ventana.jLabelVentana.setText(jTextFieldNombre.getText());

            ventana.jLabelHora.setText(jTextFieldHora.getText());
            ventana.jLabelMinutos.setText(jTextFieldMinuto.getText());

            String demoraIngresada = jTextFieldDemora.getText();
            demoraIngresada = demoraIngresada.trim();
            String cantidadIngresada = jTextFieldCantidad.getText().trim();

            try {
                long demoraEnNumero = Long.valueOf(demoraIngresada);
                long cantidadNumero = Long.valueOf(cantidadIngresada);
                
                ventana.jLabelDemora.setText(jTextFieldDemora.getText());
            try {
                long horaNumero = Long.valueOf(jTextFieldHora.getText());
                long minutoNumero = Long.valueOf(jTextFieldMinuto.getText());
                ventana.setVisible(true);

            } catch (Exception e) {
                jLabelErrorHoraMinuto.setText("Tiene que ingresar hora o minutos válidos");
            }
            double CostoEnNumero = pedido.calcularCosto();
            String costo = (String) String.valueOf(CostoEnNumero);
            ventana.jLabelCosto.setText(costo);
            String tamaño = (String) jComboBoxTamaño.getSelectedItem();
            ventana.jLabelTamaño1.setText(tamaño);
            String tipo = (String) jComboBoxTipo.getSelectedItem();
            ventana.jLabelTipo1.setText(tipo);
            String variedad = (String) jComboBoxVAriedad.getSelectedItem();
            ventana.jLabelVariedad1.setText(variedad);
            ventana.jLabelCantidad1.setText(cantidadIngresada);
            ventana.jLabelObservacion.setText(jTextFieldObservacion.getText());
            pedido.setObservacion(jTextFieldObservacion.getText());
            dispose();

            } catch (Exception e) {
                    jLabelErrorDemora.setText("Tiene que ingresar demora valida");
            }
            

        }
    }//GEN-LAST:event_jButtonOKClick

    private void jTextFieldMinutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMinutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMinutoActionPerformed

    private void jTextFieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombreActionPerformed

    private void jTextFieldHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldHoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldHoraActionPerformed

    private void jTextFieldObservacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldObservacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldObservacionActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
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
            java.util.logging.Logger.getLogger(GUIPizzeria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIPizzeria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIPizzeria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIPizzeria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIPizzeria().setVisible(true);
            }
        });
    }

    Variedad muzzarella = new Variedad("Muzzarella", 50);
    Variedad jamonYMorrones = new Variedad("Jamon y morrones", 60);
    Variedad fugazzeta = new Variedad("Fugazzeta", 40);
    Variedad cuatroQuesos = new Variedad("Cuatro quesos", 70);
    Variedad napolitana = new Variedad("Napolitana", 70);


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonOK;
    private javax.swing.JComboBox<String> jComboBoxTamaño;
    private javax.swing.JComboBox<String> jComboBoxTipo;
    private javax.swing.JComboBox<String> jComboBoxVAriedad;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelErrorCantidad;
    private javax.swing.JLabel jLabelErrorDemora;
    private javax.swing.JLabel jLabelErrorHoraMinuto;
    private javax.swing.JLabel jLabelErrorNombre;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextFieldCantidad;
    private javax.swing.JTextField jTextFieldDemora;
    private javax.swing.JTextField jTextFieldHora;
    private javax.swing.JTextField jTextFieldMinuto;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldObservacion;
    // End of variables declaration//GEN-END:variables

    private void configurarHora() {
        Calendar cal = Calendar.getInstance();

        String hora = String.valueOf(cal.get(cal.HOUR_OF_DAY));
        jTextFieldHora.setText(hora);
        long horaEnNumero = Long.valueOf(hora);
        if (horaEnNumero == 0 || horaEnNumero < 10) {
            jTextFieldHora.setText("0" + hora);
        }

        String minutos = String.valueOf(cal.get(cal.MINUTE));
        jTextFieldMinuto.setText(minutos);
        long minutosEnNumero = Long.valueOf(minutos);
        if (minutosEnNumero == 0 || minutosEnNumero < 10) {
            jTextFieldMinuto.setText("0" + minutos);

        }

    }

}
