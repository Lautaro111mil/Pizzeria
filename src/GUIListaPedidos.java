
import java.awt.Color;
import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.TimerTask;
import java.util.Timer;

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

    private List<Pedido> pedidos = new ArrayList<>();

    /**
     * Creates new form GUIListaPedidos
     */
    public GUIListaPedidos() {
        initComponents();
        iniciarTimer();
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void agregarPedido(Pedido pedido) {

        pedidos.add(pedido);

        int pos = pedidos.size();
        if (pos == 1) {
            jLabelNombre.setText(pedido.getNombreCliente());
            String hora = (String) String.valueOf(pedido.getHoraPedido());
            String minuto = (String) String.valueOf(pedido.getMinutosPedido());
            String demora = (String) String.valueOf(pedido.getMinutosDemora());
            String costo = (String) String.valueOf(pedido.getItemPedido().calcularCosto());

            jLabelHora.setText(hora);
            jLabelMinutos.setText(minuto);
            jLabelDemora.setText(demora);
            jLabelCosto.setText(costo);
        }
        if (pos == 2) {
            jLabelNombre1.setText(pedido.getNombreCliente());
            String hora = (String) String.valueOf(pedido.getHoraPedido());
            String minuto = (String) String.valueOf(pedido.getMinutosPedido());
            String demora = (String) String.valueOf(pedido.getMinutosDemora());
            String costo = (String) String.valueOf(pedido.getItemPedido().calcularCosto());

            jLabelHora1.setText(hora);
            jLabelMinutos1.setText(minuto);
            jLabelDemora1.setText(demora);
            jLabelCosto1.setText(costo);
        }
        if (pos == 3) {
        jLabelNombre2.setText(pedido.getNombreCliente());
            String hora = (String) String.valueOf(pedido.getHoraPedido());
            String minuto = (String) String.valueOf(pedido.getMinutosPedido());
            String demora = (String) String.valueOf(pedido.getMinutosDemora());
            String costo = (String) String.valueOf(pedido.getItemPedido().calcularCosto());

            jLabelHora2.setText(hora);
            jLabelMinutos2.setText(minuto);
            jLabelDemora2.setText(demora);
            jLabelCosto2.setText(costo);

    }
        if (pos == 4) {
        jLabelNombre3.setText(pedido.getNombreCliente());
            String hora = (String) String.valueOf(pedido.getHoraPedido());
            String minuto = (String) String.valueOf(pedido.getMinutosPedido());
            String demora = (String) String.valueOf(pedido.getMinutosDemora());
            String costo = (String) String.valueOf(pedido.getItemPedido().calcularCosto());

            jLabelHora3.setText(hora);
            jLabelMinutos3.setText(minuto);
            jLabelDemora3.setText(demora);
            jLabelCosto3.setText(costo);

    }
        if (pos == 5) {
        jLabelNombre4.setText(pedido.getNombreCliente());
            String hora = (String) String.valueOf(pedido.getHoraPedido());
            String minuto = (String) String.valueOf(pedido.getMinutosPedido());
            String demora = (String) String.valueOf(pedido.getMinutosDemora());
            String costo = (String) String.valueOf(pedido.getItemPedido().calcularCosto());

            jLabelHora4.setText(hora);
            jLabelMinutos4.setText(minuto);
            jLabelDemora4.setText(demora);
            jLabelCosto4.setText(costo);

    }
        }

    private void iniciarTimer() {
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                for (int i = 0; i < pedidos.size(); i++) {
                    if (pedidos.get(i).estaAtrasado(new Date())) {
                        if (i == 0) {
                            jLabelHora.setForeground(Color.red);
                            jLabelMinutos.setForeground(Color.red);
                            
                        }
                        if (i == 1) {
                            jLabelHora1.setForeground(Color.red);
                            jLabelMinutos1.setForeground(Color.red);
                        }
                        if (i == 2) {
                            jLabelHora2.setForeground(Color.red);
                            jLabelMinutos2.setForeground(Color.red);
                            } 
                        if (i == 3)  {
                            jLabelHora3.setForeground(Color.red);
                            jLabelMinutos3.setForeground(Color.red);
                        }
                        if (i == 4) {
                            jLabelHora4.setForeground(Color.red);
                            jLabelMinutos4.setForeground(Color.red);

                    }
                }
                    }
                
                //To change body of generated methods, choose Tools | Templates.
            }
        };
        Timer timer = new Timer();
        timer.schedule(task, 0, 60000);
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
        jLabelNombre = new javax.swing.JLabel();
        jLabelHora = new javax.swing.JLabel();
        jLabelMinutos = new javax.swing.JLabel();
        jLabelDemora = new javax.swing.JLabel();
        jLabelCosto = new javax.swing.JLabel();
        jLabelNombre1 = new javax.swing.JLabel();
        jLabelHora1 = new javax.swing.JLabel();
        jLabelMinutos1 = new javax.swing.JLabel();
        jLabelDemora1 = new javax.swing.JLabel();
        jLabelCosto1 = new javax.swing.JLabel();
        jLabelNombre2 = new javax.swing.JLabel();
        jLabelHora2 = new javax.swing.JLabel();
        jLabelMinutos2 = new javax.swing.JLabel();
        jLabelDemora2 = new javax.swing.JLabel();
        jLabelCosto2 = new javax.swing.JLabel();
        jLabelNombre3 = new javax.swing.JLabel();
        jLabelHora3 = new javax.swing.JLabel();
        jLabelMinutos3 = new javax.swing.JLabel();
        jLabelDemora3 = new javax.swing.JLabel();
        jLabelCosto3 = new javax.swing.JLabel();
        jLabelNombre4 = new javax.swing.JLabel();
        jLabelHora4 = new javax.swing.JLabel();
        jLabelMinutos4 = new javax.swing.JLabel();
        jLabelDemora4 = new javax.swing.JLabel();
        jLabelCosto4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonAgregarPedido.setText("Agregar Pedido");
        jButtonAgregarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarPedidoActionclock(evt);
            }
        });

        jLabelNombre.setText("jLabel1");

        jLabelHora.setText("jLabel2");

        jLabelMinutos.setText("jLabel3");

        jLabelDemora.setText("jLabel4");

        jLabelCosto.setText("jLabel6");

        jLabelNombre1.setText("jLabel1");

        jLabelHora1.setText("jLabel1");

        jLabelMinutos1.setText("jLabel1");

        jLabelDemora1.setText("jLabel1");

        jLabelCosto1.setText("jLabel1");

        jLabelNombre2.setText("jLabel1");

        jLabelHora2.setText("jLabel2");

        jLabelMinutos2.setText("jLabel3");

        jLabelDemora2.setText("jLabel4");

        jLabelCosto2.setText("jLabel5");

        jLabelNombre3.setText("jLabel1");

        jLabelHora3.setText("jLabel2");

        jLabelMinutos3.setText("jLabel3");

        jLabelDemora3.setText("jLabel4");

        jLabelCosto3.setText("jLabel5");

        jLabelNombre4.setText("jLabel1");

        jLabelHora4.setText("jLabel2");

        jLabelMinutos4.setText("jLabel3");

        jLabelDemora4.setText("jLabel4");

        jLabelCosto4.setText("jLabel5");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(jButtonAgregarPedido)
                .addContainerGap(104, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelNombre4)
                    .addComponent(jLabelNombre3)
                    .addComponent(jLabelNombre2)
                    .addComponent(jLabelNombre1)
                    .addComponent(jLabelNombre))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelHora2)
                        .addGap(43, 43, 43)
                        .addComponent(jLabelMinutos2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelHora)
                        .addGap(43, 43, 43)
                        .addComponent(jLabelMinutos))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelHora1)
                        .addGap(43, 43, 43)
                        .addComponent(jLabelMinutos1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelHora4)
                            .addComponent(jLabelHora3))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelMinutos3)
                            .addComponent(jLabelMinutos4))))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelDemora)
                    .addComponent(jLabelDemora1)
                    .addComponent(jLabelDemora2)
                    .addComponent(jLabelDemora3)
                    .addComponent(jLabelDemora4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelCosto, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelCosto1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelCosto2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelCosto3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelCosto4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombre)
                    .addComponent(jLabelHora)
                    .addComponent(jLabelMinutos)
                    .addComponent(jLabelDemora)
                    .addComponent(jLabelCosto))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombre1)
                    .addComponent(jLabelHora1)
                    .addComponent(jLabelMinutos1)
                    .addComponent(jLabelDemora1)
                    .addComponent(jLabelCosto1))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombre2)
                    .addComponent(jLabelHora2)
                    .addComponent(jLabelMinutos2)
                    .addComponent(jLabelDemora2)
                    .addComponent(jLabelCosto2))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombre3)
                    .addComponent(jLabelHora3)
                    .addComponent(jLabelMinutos3)
                    .addComponent(jLabelDemora3)
                    .addComponent(jLabelCosto3))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombre4)
                    .addComponent(jLabelHora4)
                    .addComponent(jLabelMinutos4)
                    .addComponent(jLabelDemora4)
                    .addComponent(jLabelCosto4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 208, Short.MAX_VALUE)
                .addComponent(jButtonAgregarPedido)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAgregarPedidoActionclock(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarPedidoActionclock
        GUIPizzeria agregarPedido = new GUIPizzeria();
        agregarPedido.setPantallaListado(this);
        agregarPedido.setVisible(true);
    }//GEN-LAST:event_jButtonAgregarPedidoActionclock

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAgregarPedido;
    private javax.swing.JLabel jLabelCosto;
    private javax.swing.JLabel jLabelCosto1;
    private javax.swing.JLabel jLabelCosto2;
    private javax.swing.JLabel jLabelCosto3;
    private javax.swing.JLabel jLabelCosto4;
    private javax.swing.JLabel jLabelDemora;
    private javax.swing.JLabel jLabelDemora1;
    private javax.swing.JLabel jLabelDemora2;
    private javax.swing.JLabel jLabelDemora3;
    private javax.swing.JLabel jLabelDemora4;
    private javax.swing.JLabel jLabelHora;
    private javax.swing.JLabel jLabelHora1;
    private javax.swing.JLabel jLabelHora2;
    private javax.swing.JLabel jLabelHora3;
    private javax.swing.JLabel jLabelHora4;
    private javax.swing.JLabel jLabelMinutos;
    private javax.swing.JLabel jLabelMinutos1;
    private javax.swing.JLabel jLabelMinutos2;
    private javax.swing.JLabel jLabelMinutos3;
    private javax.swing.JLabel jLabelMinutos4;
    public javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelNombre1;
    private javax.swing.JLabel jLabelNombre2;
    private javax.swing.JLabel jLabelNombre3;
    private javax.swing.JLabel jLabelNombre4;
    // End of variables declaration//GEN-END:variables

}
