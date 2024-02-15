package home;

import chat.servidors;
import disenador.*;
import administrador.*;
import chat.chat;
import chat.clientes;
import conexion.empleados;
import java.awt.Dimension;
import supervisor.comisionesEmp;
import supervisor.listapedidosPV;
import supervisor.reportesSeleccion;


public class Home extends javax.swing.JFrame {
    
    empleados mod;
    
    public Home() {
        initComponents();
    }
    
    public Home(empleados mod){/* determina la interfaz según el tipo de usuario */
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);/* abre sistema en pantalla completa */
        setLocationRelativeTo(null);
        this.mod = mod;
        
        jLabel1.setText("Bienvenido: "+mod.getNombreEmp()+" "+mod.getApellidoPaterno()+" "+mod.getApellidoMaterno());/* muestra mensaje en pantalla */
        jLabel2.setText("Usted es: "+mod.getNombreTipoUser());/* indica nombre del usuario, rol y punto de venta */
        jLabel3.setText("Punto de venta: "+mod.getpuntoDeVenta());
        
        switch (mod.getIdPuesto()) {/* segun el puesto */
            case 1: /* administrador acceso total al sistema */
                break;
            case 2:
                adminMenu.setVisible(false);/* diseñador solo puede ver la pestaña de diseñador y de consultas */
                supervisorMenu.setVisible(false);
                break;
            case 3:
                adminMenu.setVisible(false);/* supervisor solo puede ver pestaña de supervisor y consultas */
                disenadorMenu.setVisible(false);
                break;
            default:
                break;
        }
            
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        pnlEscritorio = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        adminMenu = new javax.swing.JMenu();
        registrouserMenu = new javax.swing.JMenuItem();
        catalogoarreglosMenu = new javax.swing.JMenuItem();
        registropedidosMenu = new javax.swing.JMenuItem();
        asignarpedidosMenu = new javax.swing.JMenuItem();
        disenadorMenu = new javax.swing.JMenu();
        catalogoMenu = new javax.swing.JMenuItem();
        pedidosMenu = new javax.swing.JMenuItem();
        iniciarpedidosMenu = new javax.swing.JMenuItem();
        supervisorMenu = new javax.swing.JMenu();
        listapedidosPV = new javax.swing.JMenuItem();
        comisionMenu = new javax.swing.JMenuItem();
        reportes = new javax.swing.JMenuItem();
        consultas = new javax.swing.JMenu();
        realizarConsul = new javax.swing.JMenuItem();
        chatMenu = new javax.swing.JMenu();
        abrirchatmenu = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));

        pnlEscritorio.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pnlEscritorio.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pnlEscritorio.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout pnlEscritorioLayout = new javax.swing.GroupLayout(pnlEscritorio);
        pnlEscritorio.setLayout(pnlEscritorioLayout);
        pnlEscritorioLayout.setHorizontalGroup(
            pnlEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEscritorioLayout.createSequentialGroup()
                .addContainerGap(653, Short.MAX_VALUE)
                .addGroup(pnlEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26))
        );
        pnlEscritorioLayout.setVerticalGroup(
            pnlEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEscritorioLayout.createSequentialGroup()
                .addContainerGap(449, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );

        adminMenu.setText("Administrador");

        registrouserMenu.setText("Registrar usuarios");
        registrouserMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrouserMenuActionPerformed(evt);
            }
        });
        adminMenu.add(registrouserMenu);

        catalogoarreglosMenu.setText("Registro de arreglos");
        catalogoarreglosMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                catalogoarreglosMenuActionPerformed(evt);
            }
        });
        adminMenu.add(catalogoarreglosMenu);

        registropedidosMenu.setText("Registrar pedidos");
        registropedidosMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registropedidosMenuActionPerformed(evt);
            }
        });
        adminMenu.add(registropedidosMenu);

        asignarpedidosMenu.setText("Asignar pedidos");
        asignarpedidosMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asignarpedidosMenuActionPerformed(evt);
            }
        });
        adminMenu.add(asignarpedidosMenu);

        jMenuBar1.add(adminMenu);

        disenadorMenu.setText("Diseñador");

        catalogoMenu.setText("Catálogo de arreglos");
        catalogoMenu.setBorderPainted(false);
        catalogoMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                catalogoMenuActionPerformed(evt);
            }
        });
        disenadorMenu.add(catalogoMenu);

        pedidosMenu.setText("Listado de pedidos");
        pedidosMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pedidosMenuActionPerformed(evt);
            }
        });
        disenadorMenu.add(pedidosMenu);

        iniciarpedidosMenu.setText("Aceptar pedidos");
        iniciarpedidosMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarpedidosMenuActionPerformed(evt);
            }
        });
        disenadorMenu.add(iniciarpedidosMenu);

        jMenuBar1.add(disenadorMenu);

        supervisorMenu.setText("Supervisor");

        listapedidosPV.setText("Pedidos del punto de venta");
        listapedidosPV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listapedidosPVActionPerformed(evt);
            }
        });
        supervisorMenu.add(listapedidosPV);

        comisionMenu.setText("Comisiones empleados");
        comisionMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comisionMenuActionPerformed(evt);
            }
        });
        supervisorMenu.add(comisionMenu);

        reportes.setText("Reportes");
        reportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportesActionPerformed(evt);
            }
        });
        supervisorMenu.add(reportes);

        jMenuBar1.add(supervisorMenu);

        consultas.setText("Consultas");
        consultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultasActionPerformed(evt);
            }
        });

        realizarConsul.setText("Realizar consultas");
        realizarConsul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                realizarConsulActionPerformed(evt);
            }
        });
        consultas.add(realizarConsul);

        jMenuBar1.add(consultas);

        chatMenu.setText("Conexión a chat");
        chatMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chatMenuActionPerformed(evt);
            }
        });

        abrirchatmenu.setText("Menú chat");
        abrirchatmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirchatmenuActionPerformed(evt);
            }
        });
        chatMenu.add(abrirchatmenu);

        jMenuBar1.add(chatMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlEscritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlEscritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registrouserMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrouserMenuActionPerformed
        registroUsuarios verventana = new registroUsuarios();
        pnlEscritorio.add(verventana);/* direcciona el menú al jform indicado */
        Dimension pnlEscritorioSize = pnlEscritorio.getSize();
        Dimension FrameSize = verventana.getSize();
        verventana.setLocation((pnlEscritorioSize.width - FrameSize.width)/2, (pnlEscritorioSize.height - FrameSize.height)/2);
        verventana.show();
    }//GEN-LAST:event_registrouserMenuActionPerformed

    private void registropedidosMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registropedidosMenuActionPerformed
        registrarPedidos verventana = new registrarPedidos();
        pnlEscritorio.add(verventana);/* direcciona el menú al jform indicado */
        Dimension pnlEscritorioSize = pnlEscritorio.getSize();
        Dimension FrameSize = verventana.getSize();
        verventana.setLocation((pnlEscritorioSize.width - FrameSize.width)/2, (pnlEscritorioSize.height - FrameSize.height)/2);
        verventana.show();
    }//GEN-LAST:event_registropedidosMenuActionPerformed

    private void catalogoarreglosMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_catalogoarreglosMenuActionPerformed
        registrarArreglos verventana = new registrarArreglos();
        pnlEscritorio.add(verventana);/* direcciona el menú al jform indicado */
        Dimension pnlEscritorioSize = pnlEscritorio.getSize();
        Dimension FrameSize = verventana.getSize();
        verventana.setLocation((pnlEscritorioSize.width - FrameSize.width)/2, (pnlEscritorioSize.height - FrameSize.height)/2);
        verventana.show();
    }//GEN-LAST:event_catalogoarreglosMenuActionPerformed

    private void catalogoMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_catalogoMenuActionPerformed
        catalogoArreglos verventana = new catalogoArreglos();
        pnlEscritorio.add(verventana);/* direcciona el menú al jform indicado */
        Dimension pnlEscritorioSize = pnlEscritorio.getSize();
        Dimension FrameSize = verventana.getSize();
        verventana.setLocation((pnlEscritorioSize.width - FrameSize.width)/2, (pnlEscritorioSize.height - FrameSize.height)/2);
        verventana.show();
    }//GEN-LAST:event_catalogoMenuActionPerformed

    private void asignarpedidosMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asignarpedidosMenuActionPerformed
        asignarPedidos verventana = new asignarPedidos();
        pnlEscritorio.add(verventana);/* direcciona el menú al jform indicado */
        Dimension pnlEscritorioSize = pnlEscritorio.getSize();
        Dimension FrameSize = verventana.getSize();
        verventana.setLocation((pnlEscritorioSize.width - FrameSize.width)/2, (pnlEscritorioSize.height - FrameSize.height)/2);
        verventana.show();
    }//GEN-LAST:event_asignarpedidosMenuActionPerformed

    private void pedidosMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pedidosMenuActionPerformed
        listapedidos verventana = new listapedidos();
        pnlEscritorio.add(verventana);/* direcciona el menú al jform indicado */
        Dimension pnlEscritorioSize = pnlEscritorio.getSize();
        Dimension FrameSize = verventana.getSize();
        verventana.setLocation((pnlEscritorioSize.width - FrameSize.width)/2, (pnlEscritorioSize.height - FrameSize.height)/2);
        verventana.show();
    }//GEN-LAST:event_pedidosMenuActionPerformed

    private void iniciarpedidosMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarpedidosMenuActionPerformed
        aceptarPedidos verventana = new aceptarPedidos();
        pnlEscritorio.add(verventana);/* direcciona el menú al jform indicado */
        Dimension pnlEscritorioSize = pnlEscritorio.getSize();
        Dimension FrameSize = verventana.getSize();
        verventana.setLocation((pnlEscritorioSize.width - FrameSize.width)/2, (pnlEscritorioSize.height - FrameSize.height)/2);
        verventana.show();
    }//GEN-LAST:event_iniciarpedidosMenuActionPerformed

    private void consultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultasActionPerformed
        
    }//GEN-LAST:event_consultasActionPerformed

    private void realizarConsulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_realizarConsulActionPerformed
        consultas verventana = new consultas();
        pnlEscritorio.add(verventana);/* direcciona el menú al jform indicado */
        Dimension pnlEscritorioSize = pnlEscritorio.getSize();
        Dimension FrameSize = verventana.getSize();
        verventana.setLocation((pnlEscritorioSize.width - FrameSize.width)/2, (pnlEscritorioSize.height - FrameSize.height)/2);
        verventana.show();
    }//GEN-LAST:event_realizarConsulActionPerformed

    private void listapedidosPVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listapedidosPVActionPerformed
        listapedidosPV verventana = new listapedidosPV();
        pnlEscritorio.add(verventana);/* direcciona el menú al jform indicado */
        Dimension pnlEscritorioSize = pnlEscritorio.getSize();
        Dimension FrameSize = verventana.getSize();
        verventana.setLocation((pnlEscritorioSize.width - FrameSize.width)/2, (pnlEscritorioSize.height - FrameSize.height)/2);
        verventana.show();
    }//GEN-LAST:event_listapedidosPVActionPerformed

    private void comisionMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comisionMenuActionPerformed
        comisionesEmp verventana = new comisionesEmp();
        pnlEscritorio.add(verventana);/* direcciona el menú al jform indicado */
        Dimension pnlEscritorioSize = pnlEscritorio.getSize();
        Dimension FrameSize = verventana.getSize();
        verventana.setLocation((pnlEscritorioSize.width - FrameSize.width)/2, (pnlEscritorioSize.height - FrameSize.height)/2);
        verventana.show();
    }//GEN-LAST:event_comisionMenuActionPerformed

    private void reportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportesActionPerformed
        reportesSeleccion verventana = new reportesSeleccion();
        pnlEscritorio.add(verventana);/* direcciona el menú al jform indicado */
        Dimension pnlEscritorioSize = pnlEscritorio.getSize();
        Dimension FrameSize = verventana.getSize();
        verventana.setLocation((pnlEscritorioSize.width - FrameSize.width)/2, (pnlEscritorioSize.height - FrameSize.height)/2);
        verventana.show();
    }//GEN-LAST:event_reportesActionPerformed

    private void chatMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chatMenuActionPerformed

    }//GEN-LAST:event_chatMenuActionPerformed

    private void abrirchatmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirchatmenuActionPerformed
        chat verventana = new chat();
        pnlEscritorio.add(verventana);/* direcciona el menú al jform indicado */
        Dimension pnlEscritorioSize = pnlEscritorio.getSize();
        Dimension FrameSize = verventana.getSize();
        verventana.setLocation((pnlEscritorioSize.width - FrameSize.width)/2, (pnlEscritorioSize.height - FrameSize.height)/2);
        verventana.show();
    }//GEN-LAST:event_abrirchatmenuActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem abrirchatmenu;
    private javax.swing.JMenu adminMenu;
    private javax.swing.JMenuItem asignarpedidosMenu;
    private javax.swing.JMenuItem catalogoMenu;
    private javax.swing.JMenuItem catalogoarreglosMenu;
    private javax.swing.JMenu chatMenu;
    private javax.swing.JMenuItem comisionMenu;
    private javax.swing.JMenu consultas;
    private javax.swing.JMenu disenadorMenu;
    private javax.swing.JMenuItem iniciarpedidosMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem listapedidosPV;
    private javax.swing.JMenuItem pedidosMenu;
    public static javax.swing.JDesktopPane pnlEscritorio;
    private javax.swing.JMenuItem realizarConsul;
    private javax.swing.JMenuItem registropedidosMenu;
    private javax.swing.JMenuItem registrouserMenu;
    private javax.swing.JMenuItem reportes;
    private javax.swing.JMenu supervisorMenu;
    // End of variables declaration//GEN-END:variables
}