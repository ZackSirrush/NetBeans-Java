package sistemaadministrativorestaurante;

public class SistemaAdministrativodeRestaurante extends javax.swing.JFrame {

    public SistemaAdministrativodeRestaurante() {
        initComponents();
        setLocationRelativeTo(null); //Inicia el programa en el centro de la pantalla
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        Escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        inventarios = new javax.swing.JMenu();
        altaProductos = new javax.swing.JMenuItem();
        bajaProductos = new javax.swing.JMenuItem();
        modProductos = new javax.swing.JMenuItem();
        recursosHumanosMenu = new javax.swing.JMenu();
        sucursales = new javax.swing.JMenuItem();
        altaPersonal = new javax.swing.JMenuItem();
        bajapersonal = new javax.swing.JMenuItem();
        nominas = new javax.swing.JMenu();
        regnomina = new javax.swing.JMenuItem();
        reportes = new javax.swing.JMenu();
        reporteInvent = new javax.swing.JMenuItem();
        reportePersonal = new javax.swing.JMenuItem();
        reporteNomina = new javax.swing.JMenuItem();
        reporteSucursal = new javax.swing.JMenuItem();
        Consultas = new javax.swing.JMenu();
        consultanom = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        Escritorio.setForeground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1024, Short.MAX_VALUE)
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 696, Short.MAX_VALUE)
        );

        inventarios.setText("Inventarios");

        altaProductos.setText("Alta de producto");
        altaProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altaProductosActionPerformed(evt);
            }
        });
        inventarios.add(altaProductos);

        bajaProductos.setText("Baja de productos");
        bajaProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bajaProductosActionPerformed(evt);
            }
        });
        inventarios.add(bajaProductos);

        modProductos.setText("Modificar productos");
        modProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modProductosActionPerformed(evt);
            }
        });
        inventarios.add(modProductos);

        jMenuBar1.add(inventarios);

        recursosHumanosMenu.setText("Recursos Humanos");

        sucursales.setText("Sucursales");
        sucursales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sucursalesActionPerformed(evt);
            }
        });
        recursosHumanosMenu.add(sucursales);

        altaPersonal.setText("Alta de personal");
        altaPersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altaPersonalActionPerformed(evt);
            }
        });
        recursosHumanosMenu.add(altaPersonal);

        bajapersonal.setText("Baja de personal");
        bajapersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bajapersonalActionPerformed(evt);
            }
        });
        recursosHumanosMenu.add(bajapersonal);

        jMenuBar1.add(recursosHumanosMenu);

        nominas.setText("Nóminas");

        regnomina.setText("Registrar nómina");
        regnomina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regnominaActionPerformed(evt);
            }
        });
        nominas.add(regnomina);

        jMenuBar1.add(nominas);

        reportes.setText("Tablas");

        reporteInvent.setText("Tabla de inventarios");
        reporteInvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reporteInventActionPerformed(evt);
            }
        });
        reportes.add(reporteInvent);

        reportePersonal.setText("Tabla de personal");
        reportePersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportePersonalActionPerformed(evt);
            }
        });
        reportes.add(reportePersonal);

        reporteNomina.setText("Tabla de nómina");
        reporteNomina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reporteNominaActionPerformed(evt);
            }
        });
        reportes.add(reporteNomina);

        reporteSucursal.setText("Tabla de sucursal");
        reporteSucursal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reporteSucursalActionPerformed(evt);
            }
        });
        reportes.add(reporteSucursal);

        jMenuBar1.add(reportes);

        Consultas.setText("Consultas");
        Consultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultasActionPerformed(evt);
            }
        });

        consultanom.setText("Consulta de nómina");
        consultanom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultanomActionPerformed(evt);
            }
        });
        Consultas.add(consultanom);

        jMenuBar1.add(Consultas);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void altaProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altaProductosActionPerformed
        InvAltas verventana = new InvAltas(); //Muestra el respectivo formulario en el programa
        Escritorio.add(verventana);
        verventana.show();
    }//GEN-LAST:event_altaProductosActionPerformed

    private void bajaProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bajaProductosActionPerformed
        invBajas verventana = new invBajas();//Muestra el respectivo formulario en el programa
        Escritorio.add(verventana);
        verventana.show();
    }//GEN-LAST:event_bajaProductosActionPerformed

    private void modProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modProductosActionPerformed
        invModif verventana = new invModif();//Muestra el respectivo formulario en el programa
        Escritorio.add(verventana);
        verventana.show();
    }//GEN-LAST:event_modProductosActionPerformed

    private void altaPersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altaPersonalActionPerformed
        personal verventana = new personal();//Muestra el respectivo formulario en el programa
        Escritorio.add(verventana);
        verventana.show();
    }//GEN-LAST:event_altaPersonalActionPerformed

    private void reporteInventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reporteInventActionPerformed
        repInventario verventana=new repInventario();
        Escritorio.add(verventana);//Muestra el formulario correspondiente a reportes de inventario
        verventana.show();
    }//GEN-LAST:event_reporteInventActionPerformed

    private void reportePersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportePersonalActionPerformed
        repPersonal verventana = new repPersonal();//Muestra el formulario para los reportes de personal
        Escritorio.add(verventana);
        verventana.show();
    }//GEN-LAST:event_reportePersonalActionPerformed

    private void reporteNominaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reporteNominaActionPerformed
        repRh verventana = new repRh(); //Muestra el formulario para los reportes nómina
        Escritorio.add(verventana);
        verventana.show();
    }//GEN-LAST:event_reporteNominaActionPerformed

    private void sucursalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sucursalesActionPerformed
        sucursales verventana = new sucursales(); //Muestra el formulario para ingresar sucursales
        Escritorio.add(verventana);
        verventana.show();
    }//GEN-LAST:event_sucursalesActionPerformed

    private void regnominaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regnominaActionPerformed
        nomina verventana = new nomina(); //Muestra el formulario para los cálculos de nómina
        Escritorio.add(verventana);
        verventana.show();
    }//GEN-LAST:event_regnominaActionPerformed

    private void bajapersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bajapersonalActionPerformed
        personal_bajas verventana = new personal_bajas(); //Muestra el formulario para la baja del personal
        Escritorio.add(verventana);
        verventana.show();
    }//GEN-LAST:event_bajapersonalActionPerformed

    private void ConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultasActionPerformed
        
    }//GEN-LAST:event_ConsultasActionPerformed

    private void consultanomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultanomActionPerformed
        consultas verventana = new consultas(); //Muestra el formulario para visualizar y exportar la nómina
        Escritorio.add(verventana);
        verventana.show();
    }//GEN-LAST:event_consultanomActionPerformed

    private void reporteSucursalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reporteSucursalActionPerformed
        repSucursales verventana = new repSucursales(); //Muestra el formulario para visualizar y exportar la nómina
        Escritorio.add(verventana);
        verventana.show();
    }//GEN-LAST:event_reporteSucursalActionPerformed

    public static void main(String args[]) {
//Método main
        java.awt.EventQueue.invokeLater(() -> {
            new SistemaAdministrativodeRestaurante().setVisible(true); //Método main
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Consultas;
    private javax.swing.JDesktopPane Escritorio;
    private javax.swing.JMenuItem altaPersonal;
    private javax.swing.JMenuItem altaProductos;
    private javax.swing.JMenuItem bajaProductos;
    private javax.swing.JMenuItem bajapersonal;
    private javax.swing.JMenuItem consultanom;
    private javax.swing.JMenu inventarios;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JMenuItem modProductos;
    private javax.swing.JMenu nominas;
    private javax.swing.JMenu recursosHumanosMenu;
    private javax.swing.JMenuItem regnomina;
    private javax.swing.JMenuItem reporteInvent;
    private javax.swing.JMenuItem reporteNomina;
    private javax.swing.JMenuItem reportePersonal;
    private javax.swing.JMenuItem reporteSucursal;
    private javax.swing.JMenu reportes;
    private javax.swing.JMenuItem sucursales;
    // End of variables declaration//GEN-END:variables
}
