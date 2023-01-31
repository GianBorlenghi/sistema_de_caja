/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IGU;

import Impresion.Imprimir;
import Modelos.Producto;
import Servicios.ServicioProducto;
import Servicios.ServicioVenta;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.Document;

/**
 *
 * @author giaan
 */
public class Principal extends javax.swing.JFrame {

    ArrayList<Producto> compra = new ArrayList<>();
    ArrayList<Producto> listaProd = new ArrayList<>();
    ServicioProducto servP = new ServicioProducto();
    ServicioVenta serV = new ServicioVenta();
    DecimalFormat formatoDecimal = new DecimalFormat("#.00");

    float total = 0;

    public Principal() {
        initComponents();
        llenarComboProducto();
        setTitle("Principal");
        btnBorrarCompra.setEnabled(false);
        btnImprimir.setEnabled(false);
        comboPago.addItem("METODO DE PAGO");
        comboPago.addItem("EFECTIVO");
        comboPago.addItem("MERCADO PAGO");
        comboPago.addItem("DEBITO");
        comboPago.addItem("CREDITO");
        comboPago.addItem("ANK");

    }

    public void llenarComboProducto() {
        comboProducto.removeAllItems();
        listaProd = servP.listarProductos();
        listaProd.forEach(p -> comboProducto.addItem(p.getId_producto() + " - " + p.getNombre_producto()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelPrint = new javax.swing.JPanel();
        btnBorrarCompra = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        printPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaCompra = new javax.swing.JTable();
        txtTotal = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        comboPago = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        comboProducto = new javax.swing.JComboBox<>();
        txtCantidad = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        txtMarca = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        cerrarCajaMenu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(19, 0, 90));

        panelPrint.setBackground(new java.awt.Color(19, 0, 90));
        panelPrint.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, java.awt.Color.white, new java.awt.Color(204, 204, 204)));

        btnBorrarCompra.setBackground(new java.awt.Color(204, 51, 0));
        btnBorrarCompra.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnBorrarCompra.setForeground(new java.awt.Color(0, 0, 0));
        btnBorrarCompra.setText("BORRAR COMPRA");
        btnBorrarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarCompraActionPerformed(evt);
            }
        });

        btnImprimir.setBackground(new java.awt.Color(3, 201, 136));
        btnImprimir.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnImprimir.setForeground(new java.awt.Color(0, 0, 0));
        btnImprimir.setText("IMPRIMIR TICKET");
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });

        printPanel.setBackground(new java.awt.Color(204, 204, 204));

        tablaCompra.setBackground(new java.awt.Color(204, 204, 204));
        tablaCompra.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        tablaCompra.setForeground(new java.awt.Color(0, 0, 0));
        tablaCompra.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NOMBRE", "PRECIO", "CANTIDAD"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaCompra.setRowHeight(30);
        tablaCompra.setRowMargin(5);
        tablaCompra.setShowVerticalLines(false);
        tablaCompra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tablaCompraKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(tablaCompra);
        if (tablaCompra.getColumnModel().getColumnCount() > 0) {
            tablaCompra.getColumnModel().getColumn(0).setResizable(false);
            tablaCompra.getColumnModel().getColumn(1).setResizable(false);
            tablaCompra.getColumnModel().getColumn(2).setResizable(false);
        }

        txtTotal.setBackground(new java.awt.Color(51, 51, 51));
        txtTotal.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        txtTotal.setForeground(new java.awt.Color(204, 0, 0));
        txtTotal.setEnabled(false);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("TOTAL");

        javax.swing.GroupLayout printPanelLayout = new javax.swing.GroupLayout(printPanel);
        printPanel.setLayout(printPanelLayout);
        printPanelLayout.setHorizontalGroup(
            printPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(printPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, printPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        printPanelLayout.setVerticalGroup(
            printPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, printPanelLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(printPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap())
        );

        comboPago.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        comboPago.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboPagoItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout panelPrintLayout = new javax.swing.GroupLayout(panelPrint);
        panelPrint.setLayout(panelPrintLayout);
        panelPrintLayout.setHorizontalGroup(
            panelPrintLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrintLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(printPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(panelPrintLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(btnBorrarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(159, 159, 159)
                .addComponent(comboPago, 0, 222, Short.MAX_VALUE)
                .addGap(33, 33, 33)
                .addComponent(btnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        panelPrintLayout.setVerticalGroup(
            panelPrintLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrintLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(printPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(panelPrintLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBorrarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboPago, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        jPanel3.setBackground(new java.awt.Color(0, 51, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        comboProducto.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        comboProducto.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboProductoItemStateChanged(evt);
            }
        });
        comboProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                comboProductoMouseEntered(evt);
            }
        });

        txtCantidad.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtCantidad.setModel(new javax.swing.SpinnerNumberModel(1, 1, 15, 1));
        txtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cantidad");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Seleccionar producto");

        btnAgregar.setBackground(new java.awt.Color(3, 201, 136));
        btnAgregar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(0, 0, 0));
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        txtMarca.setBackground(new java.awt.Color(51, 51, 51));
        txtMarca.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        txtMarca.setForeground(new java.awt.Color(153, 0, 0));
        txtMarca.setEnabled(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCantidad, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                            .addComponent(comboProducto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(jLabel2))
                            .addComponent(txtMarca))
                        .addGap(114, 114, 114))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(104, 104, 104))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(btnAgregar)
                        .addGap(178, 178, 178))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(jLabel3)
                .addGap(26, 26, 26)
                .addComponent(comboProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(43, 43, 43)
                .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(panelPrint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelPrint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenuBar1.setBackground(new java.awt.Color(153, 153, 153));
        jMenuBar1.setForeground(new java.awt.Color(0, 0, 0));
        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jMenu1.setBackground(new java.awt.Color(204, 204, 204));
        jMenu1.setForeground(new java.awt.Color(0, 0, 0));
        jMenu1.setText("Acciones");

        jMenuItem1.setText("Productos");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Marcas");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Tipo de Productos");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setBackground(new java.awt.Color(204, 204, 204));
        jMenu2.setForeground(new java.awt.Color(0, 0, 0));
        jMenu2.setText("Caja");

        cerrarCajaMenu.setBackground(new java.awt.Color(204, 204, 204));
        cerrarCajaMenu.setForeground(new java.awt.Color(0, 0, 0));
        cerrarCajaMenu.setText("Cerrar caja");
        cerrarCajaMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarCajaMenuActionPerformed(evt);
            }
        });
        jMenu2.add(cerrarCajaMenu);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        AltaProducto altP = new AltaProducto();
        altP.setVisible(true);
        altP.setLocationRelativeTo(null);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        Marcas vistaMarca = new Marcas();
        vistaMarca.setVisible(true);
        vistaMarca.setLocationRelativeTo(null);

    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed

        TipoProductos tipoProdVista = new TipoProductos();
        tipoProdVista.setVisible(true);
        tipoProdVista.setLocationRelativeTo(null);

    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        System.out.println(compra.size());
        if (compra.size() > 0 && comboPago.getSelectedIndex() != 0) {
            String pago = String.valueOf(comboPago.getSelectedItem());
            try {
                int nTicker = serV.guardarVenta(compra, this.total, pago);
                Imprimir im = new Imprimir();
                im.imprimimos(compra, this.total, nTicker);
                btnImprimir.setEnabled(false);
                tablaCompra.setEnabled(false);
                comboPago.setEnabled(false);
                this.total = 0;
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, ex.toString());
            }

        } else if (compra.size() < 0) {
            JOptionPane.showMessageDialog(this, "Lista de productos vacía. \nPorfavor ingrese productos a la compra.");
        } else if (comboPago.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this, "Porfavor seleccione un metodo de pago.");

        }


    }//GEN-LAST:event_btnImprimirActionPerformed

    private void btnBorrarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarCompraActionPerformed
        DefaultTableModel model = (DefaultTableModel) tablaCompra.getModel();
        if (compra.size() > 0) {
            int opc = JOptionPane.showConfirmDialog(this, "¿ Está seguro de borrar toda la compra ?");

            if (opc == 0) {

                compra.removeAll(compra);
                this.total = 0;
                txtTotal.setText("0");
                model.setRowCount(0);
                btnBorrarCompra.setEnabled(false);
                btnImprimir.setEnabled(false);
                tablaCompra.setEnabled(true);
                comboPago.setEnabled(true);

            }
        } else {
            JOptionPane.showMessageDialog(this, "Lista de productos vacía. \nPorfavor ingrese productos a la compra.");

        }
    }//GEN-LAST:event_btnBorrarCompraActionPerformed

    private void tablaCompraKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablaCompraKeyPressed

        int key = evt.getKeyChar();
        int fila = tablaCompra.getSelectedRow();

        if (key == 127 && compra.size() > 0) {

            DefaultTableModel model = (DefaultTableModel) tablaCompra.getModel();
            String precio = String.valueOf(tablaCompra.getValueAt(fila, 1));
            String cant = String.valueOf(tablaCompra.getValueAt(fila, 2));

            model.removeRow(fila);
            compra.remove(fila);
            this.total = this.total - (Float.parseFloat(precio) * Integer.parseInt(cant));
            String p = formatoDecimal.format(this.total);
            txtTotal.setText("$ " + p);

        }

    }//GEN-LAST:event_tablaCompraKeyPressed

    private void cerrarCajaMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarCajaMenuActionPerformed

        try {
            VistaCierre vistaCierre = new VistaCierre();
            vistaCierre.setVisible(true);
            vistaCierre.setLocationRelativeTo(null);
            Imprimir im = new Imprimir();
            float total_del_dia = serV.cerrarCaja();
            if (total_del_dia == 0) {
                JOptionPane.showMessageDialog(this, "Aun no hay ventas");
            } else {
                try {
                    im.imprimirCierreCaja(total_del_dia);
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(this, ex.toString());
                }

            }
        } catch (ParseException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_cerrarCajaMenuActionPerformed

    private void comboPagoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboPagoItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_comboPagoItemStateChanged

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed

        DefaultTableModel model = (DefaultTableModel) tablaCompra.getModel();
        String seleccion = comboProducto.getSelectedItem().toString();
        String[] arrayString = seleccion.split(" ");
        int id = Integer.parseInt(arrayString[0].trim());
        int cant = (int) txtCantidad.getValue();
        Object[] objec = new Object[3];

        for (Producto prod : listaProd) {
            if (prod.getId_producto() == id) {

                if (!compra.contains(prod)) {
                    prod.setCant(cant);
                    compra.add(prod);
                    objec[0] = prod.getNombre_producto();
                    objec[1] = prod.getPrecio();
                    objec[2] = cant;
                    model.addRow(objec);
                    formatoDecimal.format(prod.getPrecio());
                    this.total += prod.getPrecio() * cant;
                    String p = formatoDecimal.format(this.total);
                    txtTotal.setText("$ " + p);
                    txtCantidad.setValue(1);
                    break;
                } else {

                    int q = (int) model.getValueAt(compra.indexOf(prod), 2);
                    q += cant;
                    prod.setCant(q);
                    formatoDecimal.format(prod.getPrecio());
                    this.total += prod.getPrecio() * cant;
                    String p = formatoDecimal.format(this.total);
                    txtTotal.setText("$ " + p);
                    txtCantidad.setValue(1);
                    model.setValueAt(q, compra.indexOf(prod), 2);

                }
            }
        }

        btnBorrarCompra.setEnabled(true);
        btnImprimir.setEnabled(true);
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void txtCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyTyped

    }//GEN-LAST:event_txtCantidadKeyTyped

    private void comboProductoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboProductoMouseEntered

    }//GEN-LAST:event_comboProductoMouseEntered

    private void comboProductoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboProductoItemStateChanged

        int i = comboProducto.getSelectedIndex();
        System.out.println(i);
        Producto p = listaProd.get(i);
        txtMarca.setText(p.getMarca_nombre());
    }//GEN-LAST:event_comboProductoItemStateChanged

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBorrarCompra;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JMenuItem cerrarCajaMenu;
    private javax.swing.JComboBox<String> comboPago;
    private javax.swing.JComboBox<String> comboProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel panelPrint;
    private javax.swing.JPanel printPanel;
    private javax.swing.JTable tablaCompra;
    private javax.swing.JSpinner txtCantidad;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
