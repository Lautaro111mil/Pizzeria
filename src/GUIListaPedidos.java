
import java.awt.Color;
import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.TimerTask;
import java.util.Timer;
import java.awt.Toolkit;
import javax.swing.table.TableCellRenderer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author User
 */
public class GUIListaPedidos extends javax.swing.JFrame {

    private ModeloListaPedidos modelo;

    /**
     * Creates new form GUIListaPedidos
     */
    public GUIListaPedidos() {
        initComponents();
        inicializarTabla();
        iniciarTimer();
    }

    public void agregarPedido(Pedido pedido) {

        modelo.agregarPedido(pedido);
    }

    private void iniciarTimer() {
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                tabla.repaint();
           }
        };
        Timer timer = new Timer();
        timer.schedule(task, 0, 15000);
    }

    public void datosDelPedido(Pedido pedido) {
        String conversionNombre = (String) String.valueOf(pedido.getNombreCliente());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonAgregarPedido = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        clickBotonLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonAgregarPedido.setText("Agregar Pedido");
        jButtonAgregarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarPedidoActionclock(evt);
            }
        });

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

        clickBotonLimpiar.setText("Limpiar");
        clickBotonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickBotonLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jButtonAgregarPedido)
                .addGap(100, 100, 100)
                .addComponent(clickBotonLimpiar)
                .addContainerGap(112, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAgregarPedido)
                    .addComponent(clickBotonLimpiar))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAgregarPedidoActionclock(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarPedidoActionclock
        GUIPizzeria agregarPedido = new GUIPizzeria();
        agregarPedido.setPantallaListado(this);
        agregarPedido.setVisible(true);
//            for (int i = 0; i < pedidos.size(); i++) {
//                    if (pedidos.get(i).estaAtrasado(new Date())) {
//                        if (i == 0) {
//                            jLabelHora.setForeground(Color.red);
//                            jLabelMinutos.setForeground(Color.red);
//                            
//                        }
//                        if (i == 1) {
//                            jLabelHora1.setForeground(Color.red);
//                            jLabelMinutos1.setForeground(Color.red);
//                        }
//                        if (i == 2) {
//                            jLabelHora2.setForeground(Color.red);
//                            jLabelMinutos2.setForeground(Color.red);
//                            } 
//                        if (i == 3)  {
//                            jLabelHora3.setForeground(Color.red);
//                            jLabelMinutos3.setForeground(Color.red);
//                        }
//                        if (i == 4) {
//                            jLabelHora4.setForeground(Color.red);
//                            jLabelMinutos4.setForeground(Color.red);
//
//                    }
//                }
//                    }
            
    }//GEN-LAST:event_jButtonAgregarPedidoActionclock

    private void clickBotonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickBotonLimpiarActionPerformed
        modelo.limpiarPedidos();
    }//GEN-LAST:event_clickBotonLimpiarActionPerformed

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
            java.util.logging.Logger.getLogger(GUIListaPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIListaPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIListaPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIListaPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIListaPedidos().setVisible(true);
            }
        });
    }
    
    public void inicializarTabla(){
        modelo= new ModeloListaPedidos();
        tabla.setModel(modelo);
       
        ResaltadorDePedidosVencidos resaltador = new ResaltadorDePedidosVencidos (modelo);
        tabla.setDefaultRenderer(String.class, resaltador);
        Toolkit.getDefaultToolkit().beep();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clickBotonLimpiar;
    private javax.swing.JButton jButtonAgregarPedido;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables

}
