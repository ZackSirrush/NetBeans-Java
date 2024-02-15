package disenador;

import conexion.conexion;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

public class catalogoArreglos extends javax.swing.JInternalFrame {

    public catalogoArreglos() {
        initComponents();
        mostrar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        catalogoTable = new javax.swing.JTable();

        setClosable(true);
        setTitle("Catálogo de arreglos");
        setOpaque(false);

        catalogoTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID Arreglo", "Nombre", "Costo", "Tiempo de elaboración", "Comisión"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.Object.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        catalogoTable.setEnabled(false);
        jScrollPane1.setViewportView(catalogoTable);
        if (catalogoTable.getColumnModel().getColumnCount() > 0) {
            catalogoTable.getColumnModel().getColumn(0).setHeaderValue("ID Arreglo");
            catalogoTable.getColumnModel().getColumn(1).setHeaderValue("Nombre");
            catalogoTable.getColumnModel().getColumn(2).setHeaderValue("Costo");
            catalogoTable.getColumnModel().getColumn(3).setHeaderValue("Tiempo de elaboración");
            catalogoTable.getColumnModel().getColumn(4).setHeaderValue("Comisión");
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1303, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 794, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mostrar(){ /* muestra la tabla donde se almacenan los arreglos florales */
        DefaultTableModel modelo = new DefaultTableModel();
        ResultSet rs = conexion.getTabla("SELECT * FROM CATALOGO");
        modelo.setColumnIdentifiers(new Object[]{"ID Arreglo","Nombre del arreglo","Tiempo de elaboración","Costo del arreglo","Comisión"});
        try{
            while(rs.next()){
            modelo.addRow(new Object[]{rs.getInt("idArreglo"),rs.getString("nombreArreglo"),rs.getTime("tiempoElaboracion"),rs.getDouble("costoArreglo"),rs.getDouble("comision")});
            }
        catalogoTable.setModel(modelo);
        }catch(Exception e){
            System.out.println(e);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable catalogoTable;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
