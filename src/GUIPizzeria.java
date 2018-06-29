
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.KeyValue;

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

    private GUIListaPedidos pantallaListado;
    private List<ItemPedido> listaItemPedidos = new ArrayList<ItemPedido>();
    private int costoTotal;
    private ModeloPizzas modelo;
    private List<Variedad> listado = new ArrayList<>();
    /**
     * Creates new form GUIPizzeria
     */
    public GUIPizzeria() {
        initComponents();
        inicializarTabla();
        configurarHora();
        setTitle("Agregar Pedido");
        this.setLocationRelativeTo(null);
        jTextFieldObservacion.setLineWrap(true);
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
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextFieldObservacion = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jButtonAgregar = new javax.swing.JButton();
        jLabelCostoP = new javax.swing.JLabel();
        jLabel = new javax.swing.JLabel();

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

        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextFieldObservacion.setColumns(20);
        jTextFieldObservacion.setRows(5);
        jScrollPane1.setViewportView(jTextFieldObservacion);

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tabla);

        jButtonAgregar.setText("Agregar");
        jButtonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarActionPerformedClick(evt);
            }
        });

        jLabelCostoP.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabelCostoP.setForeground(new java.awt.Color(204, 0, 0));
        jLabelCostoP.setText("Costo");

        jLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel.setForeground(new java.awt.Color(204, 0, 0));
        jLabel.setText("$");

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextFieldDemora, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelErrorDemora, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabelErrorHoraMinuto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addContainerGap())
                        .addComponent(jLabelErrorNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jTextFieldCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBoxTamaño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxVAriedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonAgregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(162, 162, 162)
                                .addComponent(jLabel8))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(130, 130, 130)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel)
                                    .addComponent(jButtonOK))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelCostoP)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(jButton1))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelErrorCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabelErrorCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxTamaño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxVAriedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAgregar))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCostoP)
                    .addComponent(jLabel))
                .addGap(58, 58, 58)
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

        if (!jTextFieldDemora.getText().isEmpty()) {

            ventanaDatosDePedido ventana = new ventanaDatosDePedido();

            ventana.jLabelVentana.setText(jTextFieldNombre.getText());
            ventana.jLabelHora.setText(jTextFieldHora.getText());
            ventana.jLabelMinutos.setText(jTextFieldMinuto.getText());
            String demoraIngresada = jTextFieldDemora.getText();
            demoraIngresada = demoraIngresada.trim();
            ventana.jLabelDemora.setText(demoraIngresada);

            try {
                Pedido pedido = new Pedido(jTextFieldNombre.getText(), Integer.valueOf(jTextFieldHora.getText()),
                        Integer.valueOf(jTextFieldMinuto.getText()), Integer.valueOf(jTextFieldDemora.getText().trim()), modelo.getPizzas());
                Integer.valueOf(demoraIngresada);
                pantallaListado.agregarPedido(pedido);

            } catch (Exception e) {
            }

            ventana.setVisible(true);

            String costoOtraVentana = String.valueOf(this.costoTotal);
            ventana.jLabelCosto.setText(costoOtraVentana);
            dispose();
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonAgregarActionPerformedClick(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarActionPerformedClick
        jLabelErrorCantidad.setText("");
        jLabelErrorDemora.setText("");
        jLabelErrorHoraMinuto.setText("");
        jLabelErrorNombre.setText("");

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

        Variedad variedadSeleccionada = listado.get(jComboBoxVAriedad.getSelectedIndex());
        pizza.setVariedad(variedadSeleccionada);
        


        try {

            long cantidad = Long.valueOf(jTextFieldCantidad.getText());

        } catch (Exception e) {
            jLabelErrorCantidad.setText("Agregue un número válido");
        }

        long cantidad = Long.valueOf(jTextFieldCantidad.getText());
        if (cantidad <= 0 || jTextFieldCantidad.getText().isEmpty()) {
            jLabelErrorCantidad.setText("La cantidad tiene que ser igual mayor a 1");

        }
        ItemPedido itemPedido = new ItemPedido(pizza, cantidad);

        String nombreIngresado = jTextFieldNombre.getText();
        nombreIngresado = nombreIngresado.trim();

        boolean nombreEsNumero = false;
        try {

            Long nombreEnNumero = Long.valueOf(nombreIngresado);
            nombreEsNumero = true;

        } catch (Exception e) {
            nombreEsNumero = false;
        }

        if (nombreIngresado.isEmpty() || nombreEsNumero) {
            jLabelErrorNombre.setText("Necesita ingresar un nombre");
        } else {

            String demoraIngresada = jTextFieldDemora.getText();
            demoraIngresada = demoraIngresada.trim();
            String cantidadIngresada = jTextFieldCantidad.getText().trim();

            try {
                int horaNumero = Integer.valueOf(jTextFieldHora.getText());
                int minutoNumero = Integer.valueOf(jTextFieldMinuto.getText());
//                long cantidadNumero = Long.valueOf(cantidadIngresada);

                // Darle el Pedido creado a la pantalla anterior
            } catch (Exception e) {
                jLabelErrorHoraMinuto.setText("Tiene que ingresar hora o minutos válidos");
            }
            try {
                int demoraEnNumero = Integer.valueOf(demoraIngresada);
                costoTotal += itemPedido.calcularCostoPizzasRepetidas();
                String costoTotalString = String.valueOf(costoTotal);
                jLabelCostoP.setText(costoTotalString);
                listaItemPedidos.add(itemPedido);
                agregarPizza(itemPedido);
            } catch (Exception e) {
                jLabelErrorDemora.setText("Ingrese demora valida");
            }

    }//GEN-LAST:event_jButtonAgregarActionPerformedClick
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonAgregar;
    private javax.swing.JButton jButtonOK;
    private javax.swing.JComboBox<String> jComboBoxTamaño;
    private javax.swing.JComboBox<String> jComboBoxTipo;
    private javax.swing.JComboBox<String> jComboBoxVAriedad;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelCostoP;
    private javax.swing.JLabel jLabelErrorCantidad;
    private javax.swing.JLabel jLabelErrorDemora;
    private javax.swing.JLabel jLabelErrorHoraMinuto;
    private javax.swing.JLabel jLabelErrorNombre;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextFieldCantidad;
    private javax.swing.JTextField jTextFieldDemora;
    private javax.swing.JTextField jTextFieldHora;
    private javax.swing.JTextField jTextFieldMinuto;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextArea jTextFieldObservacion;
    private javax.swing.JTable tabla;
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

    public void setPantallaListado(GUIListaPedidos pantallaListado) {
        this.pantallaListado = pantallaListado;
    }

    public void inicializarTabla() {
        modelo = new ModeloPizzas();
        tabla.setModel(modelo);
        administradorVariedades AV= new administradorVariedades();
        listado=AV.obtener();
        for (Variedad v:listado){
            jComboBoxVAriedad.addItem(v.getNombre());
        }
    }

    public void agregarPizza(ItemPedido itemPedido) {
        modelo.agregarPizzas(itemPedido);
    }

}
