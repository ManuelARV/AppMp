/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestorarchivos;

/**
 *
 * @author Marina
 */
public class Buscar extends javax.swing.JFrame {

    private Buscar() {
        initComponents();
    }
    
    private static Buscar obj = null;
    
    public static Buscar getObj() {
        if (obj == null) {
            obj = new Buscar();
        }     
        return obj;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tipoB = new javax.swing.JRadioButton();
        categoriaB = new javax.swing.JRadioButton();
        nombreB = new javax.swing.JRadioButton();
        todoB = new javax.swing.JRadioButton();
        lista_tiposB = new javax.swing.JComboBox<>();
        lista_categoriasB = new javax.swing.JComboBox<>();
        input_nombreB = new javax.swing.JTextField();
        buscarB = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaB = new javax.swing.JTable();
        aceptarB = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        opcionesB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        tipoB.setText("Tipo");
        tipoB.setPreferredSize(new java.awt.Dimension(120, 35));

        categoriaB.setText("Categoría");
        categoriaB.setPreferredSize(new java.awt.Dimension(120, 35));
        categoriaB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoriaBActionPerformed(evt);
            }
        });

        nombreB.setText("Nombre");
        nombreB.setPreferredSize(new java.awt.Dimension(120, 35));
        nombreB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreBActionPerformed(evt);
            }
        });

        todoB.setText("Todo");
        todoB.setPreferredSize(new java.awt.Dimension(120, 35));

        lista_tiposB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tipo" }));
        lista_tiposB.setPreferredSize(new java.awt.Dimension(120, 35));
        lista_tiposB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lista_tiposBActionPerformed(evt);
            }
        });

        lista_categoriasB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Categoria" }));
        lista_categoriasB.setPreferredSize(new java.awt.Dimension(120, 35));

        input_nombreB.setPreferredSize(new java.awt.Dimension(120, 30));
        input_nombreB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_nombreBActionPerformed(evt);
            }
        });

        buscarB.setText("❤");
        buscarB.setPreferredSize(new java.awt.Dimension(120, 45));
        buscarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarBActionPerformed(evt);
            }
        });

        jScrollPane1.setPreferredSize(new java.awt.Dimension(534, 200));

        tablaB.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nombre", "Tipo ", "Categoría"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaB.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(tablaB);
        tablaB.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (tablaB.getColumnModel().getColumnCount() > 0) {
            tablaB.getColumnModel().getColumn(0).setResizable(false);
            tablaB.getColumnModel().getColumn(1).setResizable(false);
            tablaB.getColumnModel().getColumn(2).setResizable(false);
        }

        aceptarB.setText("OK");
        aceptarB.setPreferredSize(new java.awt.Dimension(80, 40));
        aceptarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarBActionPerformed(evt);
            }
        });

        jLabel1.setText("Opciones:");
        jLabel1.setPreferredSize(new java.awt.Dimension(66, 40));

        opcionesB.setText("+");
        opcionesB.setPreferredSize(new java.awt.Dimension(66, 50));
        opcionesB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionesBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(tipoB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(categoriaB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(nombreB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(todoB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lista_tiposB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(lista_categoriasB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(input_nombreB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(buscarB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(opcionesB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(aceptarB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tipoB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(categoriaB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(todoB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lista_tiposB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lista_categoriasB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(input_nombreB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(opcionesB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(aceptarB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void categoriaBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoriaBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_categoriaBActionPerformed

    private void nombreBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreBActionPerformed

    private void lista_tiposBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lista_tiposBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lista_tiposBActionPerformed

    private void aceptarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarBActionPerformed
        dispose();
    }//GEN-LAST:event_aceptarBActionPerformed

    private void input_nombreBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_nombreBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_nombreBActionPerformed

    private void buscarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscarBActionPerformed

    private void opcionesBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionesBActionPerformed
        Opciones.getObj().setTitle("Opciones");
        Opciones.getObj().setVisible(true);
        Opciones.getObj().setLocationRelativeTo(null);
    }//GEN-LAST:event_opcionesBActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptarB;
    private javax.swing.JButton buscarB;
    private javax.swing.JRadioButton categoriaB;
    private javax.swing.JTextField input_nombreB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> lista_categoriasB;
    private javax.swing.JComboBox<String> lista_tiposB;
    private javax.swing.JRadioButton nombreB;
    private javax.swing.JButton opcionesB;
    private javax.swing.JTable tablaB;
    private javax.swing.JRadioButton tipoB;
    private javax.swing.JRadioButton todoB;
    // End of variables declaration//GEN-END:variables
}
