package IGU;

import Logica.Controlador;
import java.util.Date;

public class VistaAdd extends javax.swing.JFrame {

    Controlador control;

    public VistaAdd() {
        initComponents();
    control = new Controlador();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jFechaVenc = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        txtCod = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        cmbTipo = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mCambiar = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setFocusable(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setForeground(new java.awt.Color(153, 153, 255));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 50, 269, 10));

        jLabel1.setFont(new java.awt.Font("Pristina", 0, 33)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 153, 255));
        jLabel1.setText("Carga de Productos");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 0));
        jLabel2.setText("Codigo : ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 91, 101, 35));

        jLabel3.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 153, 0));
        jLabel3.setText("Nombre : ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 158, 101, 35));

        jLabel4.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 153, 0));
        jLabel4.setText("Cantidad : ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 225, 101, 35));

        jLabel7.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 153, 0));
        jLabel7.setText("Vencimiento : ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, 110, 35));

        jLabel5.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 153, 0));
        jLabel5.setText("Precio : ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, 101, 35));

        jFechaVenc.setForeground(new java.awt.Color(255, 204, 153));
        jPanel1.add(jFechaVenc, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 480, 200, 35));

        jLabel6.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 153, 0));
        jLabel6.setText("Tipo : ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 358, 101, 35));

        txtCod.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        txtCod.setForeground(new java.awt.Color(0, 153, 255));
        jPanel1.add(txtCod, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 92, 200, 35));

        txtNombre.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(0, 153, 255));
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 159, 200, 35));

        txtCantidad.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        txtCantidad.setForeground(new java.awt.Color(0, 153, 255));
        jPanel1.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 226, 200, 35));

        txtPrecio.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        txtPrecio.setForeground(new java.awt.Color(0, 153, 255));
        jPanel1.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 420, 200, 35));

        cmbTipo.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        cmbTipo.setForeground(new java.awt.Color(0, 204, 102));
        cmbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Seleccion-", "Almacen", "Bebidas", "Alimentos Frescos", "Golosinas", "Panificados", "Limpieza", "Farmacia", "Verduras", "Frutas" }));
        jPanel1.add(cmbTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, 200, 35));

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\kisaw\\Downloads\\output-onlinepngtools.png")); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 80, 262, 389));

        btnLimpiar.setBackground(new java.awt.Color(0, 0, 0));
        btnLimpiar.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 153, 51));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 550, 122, -1));

        btnAgregar.setBackground(new java.awt.Color(0, 0, 0));
        btnAgregar.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(255, 153, 51));
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 550, 122, -1));

        jLabel10.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 153, 0));
        jLabel10.setText("Marca : ");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 292, 101, 35));

        txtMarca.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        txtMarca.setForeground(new java.awt.Color(0, 153, 255));
        jPanel1.add(txtMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 292, 200, 35));

        jLabel9.setBackground(new java.awt.Color(204, 0, 204));
        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\kisaw\\Downloads\\NicePng_luces-png_1168242.png")); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 610));

        mCambiar.setText("Cambiar");
        mCambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mCambiarActionPerformed(evt);
            }
        });

        jMenuItem1.setText("Vista");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        mCambiar.add(jMenuItem1);

        jMenuBar1.add(mCambiar);

        jMenu2.setText("Salir");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mCambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mCambiarActionPerformed
     

    }//GEN-LAST:event_mCambiarActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        dispose();
        Vista Vista = new Vista();
        Vista.setLocationRelativeTo(null);
        jPanel1.add(Vista);
        Vista.show();

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtCod.setText("");
        txtNombre.setText("");
        txtCantidad.setText("");
        txtMarca.setText("");
        txtPrecio.setText("");
        cmbTipo.setSelectedIndex(0);
        jFechaVenc.setDate(new Date());
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        int cod_prod = Integer.parseInt(txtCod.getText());
        String nombre = txtNombre.getText();
        int cantidad = Integer.parseInt(txtCantidad.getText());
        String marca = txtPrecio.getText();
        String tipo = (String) cmbTipo.getSelectedItem();
        int precio = Integer.parseInt(txtPrecio.getText());
        Date fecha_venc = jFechaVenc.getDate();

        control.altaProducto(cod_prod, nombre, cantidad, marca, tipo, precio, fecha_venc);

    }//GEN-LAST:event_btnAgregarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> cmbTipo;
    private com.toedter.calendar.JDateChooser jFechaVenc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JMenu mCambiar;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCod;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
