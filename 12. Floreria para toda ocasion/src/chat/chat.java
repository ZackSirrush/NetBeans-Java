package chat;

import java.awt.Dimension;

public class chat extends javax.swing.JInternalFrame {

    public chat() {
        initComponents();/* Interfáz del chat */
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        clienteBttn = new javax.swing.JToggleButton();
        clienteBttn1 = new javax.swing.JToggleButton();
        cliente1Pnl = new javax.swing.JPanel();
        cliente2Pnl = new javax.swing.JPanel();

        setClosable(true);
        setTitle("Simulador de chat");

        clienteBttn.setText("Conectar usuario 1");
        clienteBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clienteBttnActionPerformed(evt);
            }
        });

        clienteBttn1.setText("Conectar usuario 2");
        clienteBttn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clienteBttn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(clienteBttn)
                .addGap(18, 18, 18)
                .addComponent(clienteBttn1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clienteBttn)
                    .addComponent(clienteBttn1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout cliente1PnlLayout = new javax.swing.GroupLayout(cliente1Pnl);
        cliente1Pnl.setLayout(cliente1PnlLayout);
        cliente1PnlLayout.setHorizontalGroup(
            cliente1PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 454, Short.MAX_VALUE)
        );
        cliente1PnlLayout.setVerticalGroup(
            cliente1PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout cliente2PnlLayout = new javax.swing.GroupLayout(cliente2Pnl);
        cliente2Pnl.setLayout(cliente2PnlLayout);
        cliente2PnlLayout.setHorizontalGroup(
            cliente2PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
        );
        cliente2PnlLayout.setVerticalGroup(
            cliente2PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(cliente1Pnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cliente2Pnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cliente1Pnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cliente2Pnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clienteBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clienteBttnActionPerformed
        servidors verventana3 = new servidors();/* Inicializa el servidor */
        cliente1Pnl.add(verventana3);
        Dimension servidorPnlSize = cliente1Pnl.getSize();
        Dimension FrameSize = verventana3.getSize();/* Adapta el servidor al tamaño de la interfaz y la coloca en el centro */
        verventana3.setLocation((servidorPnlSize.width - FrameSize.width)/2, (servidorPnlSize.height - FrameSize.height)/2);
        verventana3.show(); 
    }//GEN-LAST:event_clienteBttnActionPerformed

    private void clienteBttn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clienteBttn1ActionPerformed
        clientes verventana2 = new clientes();
        cliente2Pnl.add(verventana2);/* Inicializa el cliente */
        Dimension cliente2PnlSize1 = cliente2Pnl.getSize();
        Dimension FrameSize1 = verventana2.getSize();/* Adapta el tamaño del cliente a la interfaz */
        verventana2.setLocation((cliente2PnlSize1.width - FrameSize1.width)/2, (cliente2PnlSize1.height - FrameSize1.height)/2);
        verventana2.show();
    }//GEN-LAST:event_clienteBttn1ActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel cliente1Pnl;
    private javax.swing.JPanel cliente2Pnl;
    private javax.swing.JToggleButton clienteBttn;
    private javax.swing.JToggleButton clienteBttn1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
