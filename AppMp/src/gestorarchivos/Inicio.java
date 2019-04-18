/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestorarchivos;

import javax.swing.JFileChooser;

/**
 *
 * @author Marina
 */
public class Inicio extends javax.swing.JFrame {

    public Inicio() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BuscarP = new javax.swing.JDialog();
        input_nombreB = new javax.swing.JTextField();
        buscarB = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaB = new javax.swing.JTable();
        aceptarB = new javax.swing.JButton();
        TxtOpciones = new javax.swing.JLabel();
        opcionesB = new javax.swing.JButton();
        tipoB = new javax.swing.JRadioButton();
        categoriaB = new javax.swing.JRadioButton();
        lista_tiposB = new javax.swing.JComboBox<>();
        lista_categoriasB = new javax.swing.JComboBox<>();
        todoB = new javax.swing.JRadioButton();
        nombreB = new javax.swing.JRadioButton();
        CambiarColorP = new javax.swing.JDialog();
        cancelarCC = new javax.swing.JButton();
        aceptarCC = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        defaultCC = new javax.swing.JRadioButton();
        azulCC = new javax.swing.JRadioButton();
        amarilloCC = new javax.swing.JRadioButton();
        blancoCC = new javax.swing.JRadioButton();
        mostrarCC = new javax.swing.JPanel();
        seleccionColorCC = new javax.swing.ButtonGroup();
        seleccionBuscarP = new javax.swing.ButtonGroup();
        NuevaCategoriaP = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        existentesNC = new javax.swing.JComboBox<>();
        cancelarNC = new javax.swing.JButton();
        nuevaNC = new javax.swing.JTextField();
        confirmarNC = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        AgregarP = new javax.swing.JDialog();
        jLabel4 = new javax.swing.JLabel();
        aceptarS = new javax.swing.JButton();
        tipoS = new javax.swing.JComboBox<>();
        nombreS = new javax.swing.JTextField();
        seleccioneS = new javax.swing.JTextField();
        explorarS = new javax.swing.JButton();
        categoriaS = new javax.swing.JComboBox<>();
        cancelarS = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        buscarI = new javax.swing.JButton();
        agregarI = new javax.swing.JButton();
        cambiar_colorI = new javax.swing.JButton();
        nueva_categoriaI = new javax.swing.JButton();
        cancelarI = new javax.swing.JButton();
        inicio_mostrarI = new javax.swing.JPanel();

        BuscarP.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        BuscarP.setModal(true);
        BuscarP.setPreferredSize(new java.awt.Dimension(600, 410));
        BuscarP.setResizable(false);
        BuscarP.setSize(new java.awt.Dimension(600, 410));

        input_nombreB.setPreferredSize(new java.awt.Dimension(120, 30));
        input_nombreB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_nombreBActionPerformed(evt);
            }
        });
        input_nombreB.setVisible(false);

        buscarB.setText("Buscar");
        buscarB.setPreferredSize(new java.awt.Dimension(120, 45));
        buscarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarBActionPerformed(evt);
            }
        });
        buscarB.setVisible(true);

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

        aceptarB.setText("OK");
        aceptarB.setPreferredSize(new java.awt.Dimension(80, 40));
        aceptarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarBActionPerformed(evt);
            }
        });

        TxtOpciones.setText("Opciones:");
        TxtOpciones.setPreferredSize(new java.awt.Dimension(66, 40));

        opcionesB.setText("+");
        opcionesB.setPreferredSize(new java.awt.Dimension(66, 50));
        opcionesB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionesBActionPerformed(evt);
            }
        });

        seleccionBuscarP.add(tipoB);
        tipoB.setText("Tipo");
        tipoB.setPreferredSize(new java.awt.Dimension(120, 35));
        tipoB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoBActionPerformed(evt);
            }
        });

        seleccionBuscarP.add(categoriaB);
        categoriaB.setText("Categoría");
        categoriaB.setPreferredSize(new java.awt.Dimension(120, 35));
        categoriaB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoriaBActionPerformed(evt);
            }
        });

        lista_tiposB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tipo" }));
        lista_tiposB.setPreferredSize(new java.awt.Dimension(120, 35));
        lista_tiposB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lista_tiposBActionPerformed(evt);
            }
        });
        lista_tiposB.setVisible(false);

        lista_categoriasB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Categoria" }));
        lista_categoriasB.setPreferredSize(new java.awt.Dimension(120, 35));
        lista_categoriasB.setVisible(false);

        seleccionBuscarP.add(todoB);
        todoB.setSelected(true);
        todoB.setText("Todo");
        todoB.setPreferredSize(new java.awt.Dimension(120, 35));
        todoB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                todoBActionPerformed(evt);
            }
        });

        seleccionBuscarP.add(nombreB);
        nombreB.setText("Nombre");
        nombreB.setPreferredSize(new java.awt.Dimension(120, 35));
        nombreB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BuscarPLayout = new javax.swing.GroupLayout(BuscarP.getContentPane());
        BuscarP.getContentPane().setLayout(BuscarPLayout);
        BuscarPLayout.setHorizontalGroup(
            BuscarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BuscarPLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BuscarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BuscarPLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(BuscarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(opcionesB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(BuscarPLayout.createSequentialGroup()
                        .addGroup(BuscarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lista_tiposB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tipoB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 49, Short.MAX_VALUE)
                        .addGroup(BuscarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lista_categoriasB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(categoriaB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(BuscarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(input_nombreB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombreB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(BuscarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(buscarB, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                            .addComponent(todoB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(aceptarB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        BuscarPLayout.setVerticalGroup(
            BuscarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BuscarPLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BuscarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tipoB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(categoriaB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(todoB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(BuscarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lista_tiposB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(BuscarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lista_categoriasB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(input_nombreB, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(BuscarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(BuscarPLayout.createSequentialGroup()
                        .addComponent(TxtOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(opcionesB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(aceptarB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        CambiarColorP.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        CambiarColorP.setModal(true);
        CambiarColorP.setResizable(false);
        CambiarColorP.setSize(new java.awt.Dimension(375, 250));

        cancelarCC.setText("Cancelar");
        cancelarCC.setPreferredSize(new java.awt.Dimension(90, 30));
        cancelarCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarCCActionPerformed(evt);
            }
        });

        aceptarCC.setText("Aceptar");
        aceptarCC.setPreferredSize(new java.awt.Dimension(90, 30));
        aceptarCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarCCActionPerformed(evt);
            }
        });

        jLabel2.setText("Seleccione uno:");
        jLabel2.setPreferredSize(new java.awt.Dimension(90, 20));

        seleccionColorCC.add(defaultCC);
        defaultCC.setText("Default");
        defaultCC.setPreferredSize(new java.awt.Dimension(80, 30));
        defaultCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                defaultCCActionPerformed(evt);
            }
        });

        seleccionColorCC.add(azulCC);
        azulCC.setText("Azul");
        azulCC.setPreferredSize(new java.awt.Dimension(80, 30));

        seleccionColorCC.add(amarilloCC);
        amarilloCC.setText("Amarillo");
        amarilloCC.setPreferredSize(new java.awt.Dimension(80, 30));

        seleccionColorCC.add(blancoCC);
        blancoCC.setText("Blanco");
        blancoCC.setPreferredSize(new java.awt.Dimension(80, 30));
        blancoCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blancoCCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mostrarCCLayout = new javax.swing.GroupLayout(mostrarCC);
        mostrarCC.setLayout(mostrarCCLayout);
        mostrarCCLayout.setHorizontalGroup(
            mostrarCCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        mostrarCCLayout.setVerticalGroup(
            mostrarCCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout CambiarColorPLayout = new javax.swing.GroupLayout(CambiarColorP.getContentPane());
        CambiarColorP.getContentPane().setLayout(CambiarColorPLayout);
        CambiarColorPLayout.setHorizontalGroup(
            CambiarColorPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CambiarColorPLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(aceptarCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cancelarCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(CambiarColorPLayout.createSequentialGroup()
                .addGroup(CambiarColorPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CambiarColorPLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CambiarColorPLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(CambiarColorPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CambiarColorPLayout.createSequentialGroup()
                                .addComponent(defaultCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(azulCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(CambiarColorPLayout.createSequentialGroup()
                                .addComponent(amarilloCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(blancoCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(33, 33, 33)
                        .addComponent(mostrarCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(52, 58, Short.MAX_VALUE))
        );
        CambiarColorPLayout.setVerticalGroup(
            CambiarColorPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CambiarColorPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(CambiarColorPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CambiarColorPLayout.createSequentialGroup()
                        .addGroup(CambiarColorPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(azulCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(defaultCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(CambiarColorPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(amarilloCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(blancoCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                        .addGroup(CambiarColorPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cancelarCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(aceptarCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(CambiarColorPLayout.createSequentialGroup()
                        .addComponent(mostrarCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        CambiarColorP.getAccessibleContext().setAccessibleParent(this);

        NuevaCategoriaP.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        NuevaCategoriaP.setModal(true);
        NuevaCategoriaP.setResizable(false);
        NuevaCategoriaP.setSize(new java.awt.Dimension(350, 200));

        jLabel1.setText("Existentes:");
        jLabel1.setPreferredSize(new java.awt.Dimension(80, 25));

        existentesNC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Default", "Categoría1", "Categoría2" }));
        existentesNC.setPreferredSize(new java.awt.Dimension(100, 40));

        cancelarNC.setText("Cancelar");
        cancelarNC.setPreferredSize(new java.awt.Dimension(90, 30));
        cancelarNC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarNCActionPerformed(evt);
            }
        });

        nuevaNC.setPreferredSize(new java.awt.Dimension(120, 35));

        confirmarNC.setText("+");
        confirmarNC.setPreferredSize(new java.awt.Dimension(20, 20));
        confirmarNC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarNCActionPerformed(evt);
            }
        });

        jLabel3.setText("Añadir:");
        jLabel3.setPreferredSize(new java.awt.Dimension(80, 25));

        javax.swing.GroupLayout NuevaCategoriaPLayout = new javax.swing.GroupLayout(NuevaCategoriaP.getContentPane());
        NuevaCategoriaP.getContentPane().setLayout(NuevaCategoriaPLayout);
        NuevaCategoriaPLayout.setHorizontalGroup(
            NuevaCategoriaPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NuevaCategoriaPLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(NuevaCategoriaPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(NuevaCategoriaPLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cancelarNC, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(NuevaCategoriaPLayout.createSequentialGroup()
                        .addGroup(NuevaCategoriaPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(existentesNC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(NuevaCategoriaPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(NuevaCategoriaPLayout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(NuevaCategoriaPLayout.createSequentialGroup()
                                .addComponent(nuevaNC, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(confirmarNC, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        NuevaCategoriaPLayout.setVerticalGroup(
            NuevaCategoriaPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NuevaCategoriaPLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(NuevaCategoriaPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(NuevaCategoriaPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(existentesNC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(NuevaCategoriaPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nuevaNC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(confirmarNC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addComponent(cancelarNC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        AgregarP.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        AgregarP.setResizable(false);
        AgregarP.setSize(new java.awt.Dimension(400, 300));

        jLabel4.setText("Categoria:");
        jLabel4.setPreferredSize(new java.awt.Dimension(70, 30));

        aceptarS.setText("OK");
        aceptarS.setPreferredSize(new java.awt.Dimension(50, 50));
        aceptarS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarSActionPerformed(evt);
            }
        });

        tipoS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "otro", "img", "doc" }));
        tipoS.setPreferredSize(new java.awt.Dimension(200, 28));
        tipoS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoSActionPerformed(evt);
            }
        });

        nombreS.setPreferredSize(new java.awt.Dimension(200, 30));
        nombreS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreSActionPerformed(evt);
            }
        });

        seleccioneS.setText("C://");
        seleccioneS.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        seleccioneS.setPreferredSize(new java.awt.Dimension(200, 30));

        explorarS.setText("Explorar...");
        explorarS.setPreferredSize(new java.awt.Dimension(85, 30));
        explorarS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                explorarSActionPerformed(evt);
            }
        });

        categoriaS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Default" }));
        categoriaS.setPreferredSize(new java.awt.Dimension(200, 28));

        cancelarS.setText("Cancelar");
        cancelarS.setPreferredSize(new java.awt.Dimension(85, 30));
        cancelarS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarSActionPerformed(evt);
            }
        });

        jLabel5.setText("Tipo:");
        jLabel5.setPreferredSize(new java.awt.Dimension(70, 30));
        jLabel5.setRequestFocusEnabled(false);

        jLabel6.setText("Nombre:");
        jLabel6.setPreferredSize(new java.awt.Dimension(70, 30));

        jLabel7.setText("Seleccione:");
        jLabel7.setPreferredSize(new java.awt.Dimension(70, 30));

        javax.swing.GroupLayout AgregarPLayout = new javax.swing.GroupLayout(AgregarP.getContentPane());
        AgregarP.getContentPane().setLayout(AgregarPLayout);
        AgregarPLayout.setHorizontalGroup(
            AgregarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AgregarPLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AgregarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AgregarPLayout.createSequentialGroup()
                        .addComponent(aceptarS, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(AgregarPLayout.createSequentialGroup()
                        .addGroup(AgregarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(AgregarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(seleccioneS, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                            .addComponent(categoriaS, 0, 189, Short.MAX_VALUE))
                        .addGap(18, 18, 18))
                    .addGroup(AgregarPLayout.createSequentialGroup()
                        .addGroup(AgregarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(AgregarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombreS, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                            .addComponent(tipoS, 0, 189, Short.MAX_VALUE))
                        .addGap(18, 18, 18)))
                .addGroup(AgregarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(explorarS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cancelarS, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        AgregarPLayout.setVerticalGroup(
            AgregarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AgregarPLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AgregarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tipoS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(AgregarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(AgregarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seleccioneS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(explorarS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(AgregarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AgregarPLayout.createSequentialGroup()
                        .addGroup(AgregarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(categoriaS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(aceptarS, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE))
                    .addGroup(AgregarPLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cancelarS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        buscarI.setText("Buscar");
        buscarI.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        buscarI.setPreferredSize(new java.awt.Dimension(125, 30));
        buscarI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarIActionPerformed(evt);
            }
        });

        agregarI.setText("Agregar");
        agregarI.setPreferredSize(new java.awt.Dimension(125, 30));
        agregarI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarIActionPerformed(evt);
            }
        });

        cambiar_colorI.setText("Ajustes");
        cambiar_colorI.setPreferredSize(new java.awt.Dimension(125, 30));
        cambiar_colorI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiar_colorIActionPerformed(evt);
            }
        });

        nueva_categoriaI.setText("Categoría");
        nueva_categoriaI.setPreferredSize(new java.awt.Dimension(125, 30));
        nueva_categoriaI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nueva_categoriaIActionPerformed(evt);
            }
        });

        cancelarI.setText("Cancelar");
        cancelarI.setPreferredSize(new java.awt.Dimension(125, 30));
        cancelarI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarIActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout inicio_mostrarILayout = new javax.swing.GroupLayout(inicio_mostrarI);
        inicio_mostrarI.setLayout(inicio_mostrarILayout);
        inicio_mostrarILayout.setHorizontalGroup(
            inicio_mostrarILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 568, Short.MAX_VALUE)
        );
        inicio_mostrarILayout.setVerticalGroup(
            inicio_mostrarILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 236, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(inicio_mostrarI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelarI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buscarI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(agregarI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cambiar_colorI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(nueva_categoriaI, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscarI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(agregarI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cambiar_colorI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nueva_categoriaI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inicio_mostrarI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cancelarI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );

        getAccessibleContext().setAccessibleDescription("");
        getAccessibleContext().setAccessibleParent(this);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
//INICIO
    private void buscarIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarIActionPerformed
        BuscarP.setModal(true);
        BuscarP.setLocationRelativeTo(null);
        BuscarP.setTitle("Buscar");
        BuscarP.setVisible(true);
    }//GEN-LAST:event_buscarIActionPerformed

    private void agregarIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarIActionPerformed
        AgregarP.setModal(true);
        AgregarP.setLocationRelativeTo(null);
        AgregarP.setTitle("Agregar");
        AgregarP.setVisible(true);
    }//GEN-LAST:event_agregarIActionPerformed

    private void cambiar_colorIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambiar_colorIActionPerformed
        CambiarColorP.setModal(true);
        CambiarColorP.setLocationRelativeTo(null);
        CambiarColorP.setTitle("Ajustes de Color");
        CambiarColorP.setVisible(true);
    }//GEN-LAST:event_cambiar_colorIActionPerformed

    private void cancelarIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarIActionPerformed
        System.exit(0);
    }//GEN-LAST:event_cancelarIActionPerformed

    private void nueva_categoriaIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nueva_categoriaIActionPerformed
        NuevaCategoriaP.setModal(true);
        NuevaCategoriaP.setLocationRelativeTo(null);
        NuevaCategoriaP.setTitle("Nueva Categoria");
        NuevaCategoriaP.setVisible(true);
    }//GEN-LAST:event_nueva_categoriaIActionPerformed

    
    private void buscarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscarBActionPerformed

    private void aceptarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarBActionPerformed
        BuscarP.dispose();
    }//GEN-LAST:event_aceptarBActionPerformed

    private void opcionesBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionesBActionPerformed
        Opciones.getObj().setTitle("Opciones");
        Opciones.getObj().setVisible(true);
        Opciones.getObj().setLocationRelativeTo(null);
    }//GEN-LAST:event_opcionesBActionPerformed

    private void tipoBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoBActionPerformed
        if (tipoB.isSelected()) {
            lista_tiposB.setVisible(true);
            lista_categoriasB.setVisible(false);
            input_nombreB.setVisible(false);
        }
    }//GEN-LAST:event_tipoBActionPerformed

    private void categoriaBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoriaBActionPerformed
        if (categoriaB.isSelected()) {
            lista_categoriasB.setVisible(true);
            lista_tiposB.setVisible(false);
            input_nombreB.setVisible(false);
        }
    }//GEN-LAST:event_categoriaBActionPerformed

    private void lista_tiposBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lista_tiposBActionPerformed

    }//GEN-LAST:event_lista_tiposBActionPerformed

    private void todoBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_todoBActionPerformed
        if (todoB.isEnabled()) {    
            lista_tiposB.setVisible(true);
            lista_categoriasB.setVisible(true);
            input_nombreB.setVisible(true);
        }
    }//GEN-LAST:event_todoBActionPerformed

    
//CAMBIAR COLOR
    private void cancelarCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarCCActionPerformed
        CambiarColorP.dispose();
    }//GEN-LAST:event_cancelarCCActionPerformed

    private void aceptarCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarCCActionPerformed
        CambiarColorP.dispose();
    }//GEN-LAST:event_aceptarCCActionPerformed

    private void defaultCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_defaultCCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_defaultCCActionPerformed

    private void blancoCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blancoCCActionPerformed

    }//GEN-LAST:event_blancoCCActionPerformed

//BUSCAR
    private void input_nombreBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_nombreBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_nombreBActionPerformed

    private void nombreBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreBActionPerformed
        if (nombreB.isEnabled()) {    
            input_nombreB.setVisible(true);
            lista_tiposB.setVisible(false);
            lista_categoriasB.setVisible(false);        
        }
    }//GEN-LAST:event_nombreBActionPerformed

    private void cancelarNCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarNCActionPerformed
        NuevaCategoriaP.dispose();
    }//GEN-LAST:event_cancelarNCActionPerformed

    private void confirmarNCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarNCActionPerformed
        NuevaCategoriaP.dispose();
    }//GEN-LAST:event_confirmarNCActionPerformed

    private void aceptarSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarSActionPerformed
        AgregarP.dispose();
    }//GEN-LAST:event_aceptarSActionPerformed

    private void tipoSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipoSActionPerformed

    private void nombreSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreSActionPerformed

    private void explorarSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_explorarSActionPerformed
        // muestra el cuadro de diálogo de archivos, para que el usuario pueda elegir el archivo a abrir 
        JFileChooser selectorArchivos = new JFileChooser();
        selectorArchivos.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);

        // indica cual fue la accion de usuario sobre el jfilechooser
        int resultado = selectorArchivos.showOpenDialog(this);

    }//GEN-LAST:event_explorarSActionPerformed

    private void cancelarSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarSActionPerformed
        AgregarP.dispose();
    }//GEN-LAST:event_cancelarSActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog AgregarP;
    private javax.swing.JDialog BuscarP;
    private javax.swing.JDialog CambiarColorP;
    private javax.swing.JDialog NuevaCategoriaP;
    private javax.swing.JLabel TxtOpciones;
    private javax.swing.JButton aceptarB;
    private javax.swing.JButton aceptarCC;
    private javax.swing.JButton aceptarS;
    private javax.swing.JButton agregarI;
    private javax.swing.JRadioButton amarilloCC;
    private javax.swing.JRadioButton azulCC;
    private javax.swing.JRadioButton blancoCC;
    private javax.swing.JButton buscarB;
    private javax.swing.JButton buscarI;
    private javax.swing.JButton cambiar_colorI;
    private javax.swing.JButton cancelarCC;
    private javax.swing.JButton cancelarI;
    private javax.swing.JButton cancelarNC;
    private javax.swing.JButton cancelarS;
    private javax.swing.JRadioButton categoriaB;
    private javax.swing.JComboBox<String> categoriaS;
    private javax.swing.JButton confirmarNC;
    private javax.swing.JRadioButton defaultCC;
    private javax.swing.JComboBox<String> existentesNC;
    private javax.swing.JButton explorarS;
    private javax.swing.JPanel inicio_mostrarI;
    private javax.swing.JTextField input_nombreB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> lista_categoriasB;
    private javax.swing.JComboBox<String> lista_tiposB;
    private javax.swing.JPanel mostrarCC;
    private javax.swing.JRadioButton nombreB;
    private javax.swing.JTextField nombreS;
    private javax.swing.JTextField nuevaNC;
    private javax.swing.JButton nueva_categoriaI;
    private javax.swing.JButton opcionesB;
    private javax.swing.ButtonGroup seleccionBuscarP;
    private javax.swing.ButtonGroup seleccionColorCC;
    private javax.swing.JTextField seleccioneS;
    private javax.swing.JTable tablaB;
    private javax.swing.JRadioButton tipoB;
    private javax.swing.JComboBox<String> tipoS;
    private javax.swing.JRadioButton todoB;
    // End of variables declaration//GEN-END:variables
}
