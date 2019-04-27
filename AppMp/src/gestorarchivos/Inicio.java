/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestorarchivos;

import java.awt.Color;
import java.io.File;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Marina
 */
public class Inicio extends javax.swing.JFrame {
    
    ArrayList<Archivo> archivos = new ArrayList<>();
    
    public Inicio() {
        initComponents();  
        
        if (todoB.isSelected()) {
            input_nombreB.setVisible(true);
            lista_tiposB.setVisible(true);
            lista_categoriasB.setVisible(true); 
        }
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
        tipoS = new javax.swing.JTextField();
        direccionS = new javax.swing.JTextField();
        explorarS = new javax.swing.JButton();
        categoriaS = new javax.swing.JComboBox<>();
        cancelarS = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nombreS = new javax.swing.JTextField();
        OpcionesP = new javax.swing.JDialog();
        verO = new javax.swing.JButton();
        editarO = new javax.swing.JButton();
        descargarO = new javax.swing.JButton();
        eliminarO = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        aceptarO = new javax.swing.JButton();
        objetoO = new javax.swing.JLabel();
        VerP = new javax.swing.JDialog();
        nombreV = new javax.swing.JLabel();
        tipoV = new javax.swing.JLabel();
        categoriaV = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        aceptarV = new javax.swing.JButton();
        panel_muestraV = new javax.swing.JPanel();
        EditarCategoriaP = new javax.swing.JDialog();
        jLabel12 = new javax.swing.JLabel();
        objetoEC = new javax.swing.JLabel();
        categoriasEC = new javax.swing.JComboBox<>();
        aceptarEC = new javax.swing.JButton();
        EliminarP = new javax.swing.JDialog();
        aceptarV1 = new javax.swing.JButton();
        cancelarV = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        buscarI = new javax.swing.JButton();
        agregarI = new javax.swing.JButton();
        cambiar_colorI = new javax.swing.JButton();
        nueva_categoriaI = new javax.swing.JButton();
        cancelarI = new javax.swing.JButton();
        inicio_mostrarI = new javax.swing.JPanel();

        BuscarP.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        BuscarP.setModal(true);
        BuscarP.setPreferredSize(new java.awt.Dimension(645, 410));
        BuscarP.setResizable(false);
        BuscarP.setSize(new java.awt.Dimension(645, 410));

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

        lista_categoriasB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Default" }));
        lista_categoriasB.setPreferredSize(new java.awt.Dimension(120, 35));
        lista_categoriasB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lista_categoriasBActionPerformed(evt);
            }
        });
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
                    .addComponent(aceptarB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(BuscarPLayout.createSequentialGroup()
                        .addGroup(BuscarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(BuscarPLayout.createSequentialGroup()
                                .addGroup(BuscarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lista_tiposB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tipoB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 50, Short.MAX_VALUE)
                                .addGroup(BuscarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lista_categoriasB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(categoriaB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 50, Short.MAX_VALUE)
                                .addGroup(BuscarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(input_nombreB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nombreB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(BuscarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(BuscarPLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(BuscarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(buscarB, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                                    .addComponent(todoB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(BuscarPLayout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(BuscarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxtOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(opcionesB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
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

        BuscarP.getAccessibleContext().setAccessibleParent(this);

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
        defaultCC.setSelected(true);
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
        azulCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                azulCCActionPerformed(evt);
            }
        });

        seleccionColorCC.add(amarilloCC);
        amarilloCC.setText("Amarillo");
        amarilloCC.setPreferredSize(new java.awt.Dimension(80, 30));
        amarilloCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amarilloCCActionPerformed(evt);
            }
        });

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
                .addGap(58, 58, Short.MAX_VALUE))
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
                            .addComponent(blancoCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(mostrarCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(CambiarColorPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelarCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aceptarCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        CambiarColorP.getAccessibleContext().setAccessibleParent(this);

        NuevaCategoriaP.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        NuevaCategoriaP.setModal(true);
        NuevaCategoriaP.setResizable(false);
        NuevaCategoriaP.setSize(new java.awt.Dimension(350, 200));

        jLabel1.setText("Existentes:");
        jLabel1.setPreferredSize(new java.awt.Dimension(80, 25));

        existentesNC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Default" }));
        existentesNC.setPreferredSize(new java.awt.Dimension(100, 40));
        existentesNC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                existentesNCActionPerformed(evt);
            }
        });

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

        NuevaCategoriaP.getAccessibleContext().setAccessibleParent(this);

        AgregarP.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        AgregarP.setModal(true);
        AgregarP.setResizable(false);
        AgregarP.setSize(new java.awt.Dimension(400, 320));

        jLabel4.setText("Categoria:");
        jLabel4.setPreferredSize(new java.awt.Dimension(70, 30));

        aceptarS.setText("OK");
        aceptarS.setPreferredSize(new java.awt.Dimension(50, 50));
        aceptarS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarSActionPerformed(evt);
            }
        });

        tipoS.setPreferredSize(new java.awt.Dimension(200, 30));
        tipoS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoSActionPerformed(evt);
            }
        });

        direccionS.setText("C:/");
        direccionS.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        direccionS.setPreferredSize(new java.awt.Dimension(200, 30));
        direccionS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                direccionSActionPerformed(evt);
            }
        });

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

        jLabel7.setText("Directorio:");
        jLabel7.setPreferredSize(new java.awt.Dimension(70, 30));

        nombreS.setPreferredSize(new java.awt.Dimension(200, 30));
        nombreS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreSActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AgregarPLayout = new javax.swing.GroupLayout(AgregarP.getContentPane());
        AgregarP.getContentPane().setLayout(AgregarPLayout);
        AgregarPLayout.setHorizontalGroup(
            AgregarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AgregarPLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AgregarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AgregarPLayout.createSequentialGroup()
                        .addGroup(AgregarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(AgregarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombreS, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(tipoS, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)))
                    .addGroup(AgregarPLayout.createSequentialGroup()
                        .addComponent(aceptarS, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(AgregarPLayout.createSequentialGroup()
                        .addGroup(AgregarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(AgregarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(direccionS, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                            .addComponent(categoriaS, 0, 189, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
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
                .addGap(18, 18, 18)
                .addGroup(AgregarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(AgregarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(direccionS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(explorarS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(AgregarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(AgregarPLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(AgregarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(categoriaS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addComponent(aceptarS, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(AgregarPLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cancelarS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        AgregarP.getAccessibleContext().setAccessibleParent(this);

        OpcionesP.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        OpcionesP.setModal(true);
        OpcionesP.setPreferredSize(new java.awt.Dimension(250, 230));
        OpcionesP.setResizable(false);
        OpcionesP.setSize(new java.awt.Dimension(250, 230));

        verO.setText("Ver");
        verO.setPreferredSize(new java.awt.Dimension(100, 40));
        verO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verOActionPerformed(evt);
            }
        });

        editarO.setText("Editar");
        editarO.setPreferredSize(new java.awt.Dimension(100, 40));
        editarO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarOActionPerformed(evt);
            }
        });

        descargarO.setText("Descargar");
        descargarO.setPreferredSize(new java.awt.Dimension(100, 40));
        descargarO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descargarOActionPerformed(evt);
            }
        });

        eliminarO.setText("Eliminar");
        eliminarO.setPreferredSize(new java.awt.Dimension(100, 40));
        eliminarO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarOActionPerformed(evt);
            }
        });

        jLabel8.setText("Acciones para:");
        jLabel8.setPreferredSize(new java.awt.Dimension(120, 30));

        aceptarO.setText("Aceptar");
        aceptarO.setPreferredSize(new java.awt.Dimension(90, 30));
        aceptarO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarOActionPerformed(evt);
            }
        });

        objetoO.setText("://:");
        objetoO.setPreferredSize(new java.awt.Dimension(120, 30));

        javax.swing.GroupLayout OpcionesPLayout = new javax.swing.GroupLayout(OpcionesP.getContentPane());
        OpcionesP.getContentPane().setLayout(OpcionesPLayout);
        OpcionesPLayout.setHorizontalGroup(
            OpcionesPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OpcionesPLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(OpcionesPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(OpcionesPLayout.createSequentialGroup()
                        .addComponent(verO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(editarO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(OpcionesPLayout.createSequentialGroup()
                        .addComponent(descargarO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(eliminarO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(OpcionesPLayout.createSequentialGroup()
                        .addGroup(OpcionesPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(objetoO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addComponent(aceptarO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        OpcionesPLayout.setVerticalGroup(
            OpcionesPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OpcionesPLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(OpcionesPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(verO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editarO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(OpcionesPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(descargarO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eliminarO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(OpcionesPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(OpcionesPLayout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(objetoO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 26, Short.MAX_VALUE))
                    .addGroup(OpcionesPLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(aceptarO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        OpcionesP.getAccessibleContext().setAccessibleParent(BuscarP);

        VerP.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        VerP.setModal(true);
        VerP.setPreferredSize(new java.awt.Dimension(278, 385));
        VerP.setSize(new java.awt.Dimension(278, 385));

        nombreV.setText("://:");
        nombreV.setPreferredSize(new java.awt.Dimension(120, 40));

        tipoV.setText("://:");
        tipoV.setPreferredSize(new java.awt.Dimension(120, 40));

        categoriaV.setText("://:");
        categoriaV.setPreferredSize(new java.awt.Dimension(120, 40));

        jLabel9.setText("Nombre: ");
        jLabel9.setPreferredSize(new java.awt.Dimension(120, 40));

        jLabel10.setText("Tipo: ");
        jLabel10.setPreferredSize(new java.awt.Dimension(120, 40));

        jLabel11.setText("Categoría: ");
        jLabel11.setPreferredSize(new java.awt.Dimension(120, 40));

        aceptarV.setText("Aceptar");
        aceptarV.setPreferredSize(new java.awt.Dimension(80, 30));
        aceptarV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarVActionPerformed(evt);
            }
        });

        panel_muestraV.setPreferredSize(new java.awt.Dimension(258, 153));

        javax.swing.GroupLayout panel_muestraVLayout = new javax.swing.GroupLayout(panel_muestraV);
        panel_muestraV.setLayout(panel_muestraVLayout);
        panel_muestraVLayout.setHorizontalGroup(
            panel_muestraVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panel_muestraVLayout.setVerticalGroup(
            panel_muestraVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 153, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout VerPLayout = new javax.swing.GroupLayout(VerP.getContentPane());
        VerP.getContentPane().setLayout(VerPLayout);
        VerPLayout.setHorizontalGroup(
            VerPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VerPLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(VerPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_muestraV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, VerPLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(aceptarV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(VerPLayout.createSequentialGroup()
                        .addGroup(VerPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(VerPLayout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(categoriaV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(VerPLayout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tipoV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(VerPLayout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nombreV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 12, Short.MAX_VALUE)))
                .addContainerGap())
        );
        VerPLayout.setVerticalGroup(
            VerPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VerPLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(VerPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(VerPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tipoV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(VerPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(categoriaV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(panel_muestraV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(aceptarV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        VerP.getAccessibleContext().setAccessibleParent(OpcionesP);

        EditarCategoriaP.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        EditarCategoriaP.setModal(true);
        EditarCategoriaP.setPreferredSize(new java.awt.Dimension(248, 118));
        EditarCategoriaP.setResizable(false);
        EditarCategoriaP.setSize(new java.awt.Dimension(248, 118));

        jLabel12.setText("Editando para: ");
        jLabel12.setPreferredSize(new java.awt.Dimension(90, 25));

        objetoEC.setText("://:");
        objetoEC.setPreferredSize(new java.awt.Dimension(120, 25));

        categoriasEC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "viajes", "fotos", "nominas", "default" }));
        categoriasEC.setPreferredSize(new java.awt.Dimension(150, 35));

        aceptarEC.setText("OK");
        aceptarEC.setPreferredSize(new java.awt.Dimension(60, 60));
        aceptarEC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarECActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout EditarCategoriaPLayout = new javax.swing.GroupLayout(EditarCategoriaP.getContentPane());
        EditarCategoriaP.getContentPane().setLayout(EditarCategoriaPLayout);
        EditarCategoriaPLayout.setHorizontalGroup(
            EditarCategoriaPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EditarCategoriaPLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(EditarCategoriaPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EditarCategoriaPLayout.createSequentialGroup()
                        .addComponent(categoriasEC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(aceptarEC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(EditarCategoriaPLayout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(objetoEC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        EditarCategoriaPLayout.setVerticalGroup(
            EditarCategoriaPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EditarCategoriaPLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(EditarCategoriaPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(categoriasEC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aceptarEC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(EditarCategoriaPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(objetoEC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        EditarCategoriaP.getAccessibleContext().setAccessibleParent(OpcionesP);

        EliminarP.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        EliminarP.setModal(true);
        EliminarP.setPreferredSize(new java.awt.Dimension(233, 139));
        EliminarP.setResizable(false);
        EliminarP.setSize(new java.awt.Dimension(233, 139));

        aceptarV1.setText("✔");
        aceptarV1.setPreferredSize(new java.awt.Dimension(60, 60));
        aceptarV1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarV1ActionPerformed(evt);
            }
        });

        cancelarV.setText("✖");
        cancelarV.setPreferredSize(new java.awt.Dimension(60, 60));
        cancelarV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarVActionPerformed(evt);
            }
        });

        jTextField1.setPreferredSize(new java.awt.Dimension(90, 20));

        jLabel13.setText("¿Desea eliminar:");
        jLabel13.setPreferredSize(new java.awt.Dimension(99, 20));

        jLabel14.setText("?");
        jLabel14.setPreferredSize(new java.awt.Dimension(20, 20));

        javax.swing.GroupLayout EliminarPLayout = new javax.swing.GroupLayout(EliminarP.getContentPane());
        EliminarP.getContentPane().setLayout(EliminarPLayout);
        EliminarPLayout.setHorizontalGroup(
            EliminarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EliminarPLayout.createSequentialGroup()
                .addGroup(EliminarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(EliminarPLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(EliminarPLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(aceptarV1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cancelarV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        EliminarPLayout.setVerticalGroup(
            EliminarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EliminarPLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(EliminarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(EliminarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelarV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aceptarV1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        EliminarP.getAccessibleContext().setAccessibleParent(OpcionesP);

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
                .addComponent(inicio_mostrarI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        direccionS.setText("C:/");
        tipoS.setText(null);
        nombreS.setText(null);
        
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
        OpcionesP.setModal(true);
        OpcionesP.setLocationRelativeTo(null);
        OpcionesP.setTitle("Opciones");
        OpcionesP.setVisible(true);
    }//GEN-LAST:event_opcionesBActionPerformed

    private void tipoBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoBActionPerformed
        lista_categoriasB.setVisible(false);
        input_nombreB.setVisible(false);
        lista_tiposB.setVisible(true);
    }//GEN-LAST:event_tipoBActionPerformed

    private void categoriaBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoriaBActionPerformed
        lista_tiposB.setVisible(false);
        input_nombreB.setVisible(false);
        lista_categoriasB.setVisible(true);
    }//GEN-LAST:event_categoriaBActionPerformed

    private void lista_tiposBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lista_tiposBActionPerformed

    }//GEN-LAST:event_lista_tiposBActionPerformed

    private void todoBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_todoBActionPerformed
        lista_tiposB.setVisible(true);
        lista_categoriasB.setVisible(true);
        input_nombreB.setVisible(true);
    }//GEN-LAST:event_todoBActionPerformed

    
//CAMBIAR COLOR
    private void cancelarCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarCCActionPerformed
        CambiarColorP.dispose();
    }//GEN-LAST:event_cancelarCCActionPerformed

    private void aceptarCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarCCActionPerformed
        if (azulCC.isSelected()) {
            BuscarP.getContentPane().setBackground(Color.cyan);
            CambiarColorP.getContentPane().setBackground(Color.cyan);
            NuevaCategoriaP.getContentPane().setBackground(Color.cyan);
            AgregarP.getContentPane().setBackground(Color.cyan);
            OpcionesP.getContentPane().setBackground(Color.cyan);
            VerP.getContentPane().setBackground(Color.cyan);
            this.getContentPane().setBackground(Color.cyan);
            EditarCategoriaP.getContentPane().setBackground(Color.cyan);
            EliminarP.getContentPane().setBackground(Color.cyan);
        }
        else if (amarilloCC.isSelected()) {
            BuscarP.getContentPane().setBackground(Color.yellow);
            CambiarColorP.getContentPane().setBackground(Color.yellow);
            NuevaCategoriaP.getContentPane().setBackground(Color.yellow);
            AgregarP.getContentPane().setBackground(Color.yellow);
            OpcionesP.getContentPane().setBackground(Color.yellow);
            VerP.getContentPane().setBackground(Color.yellow);
            this.getContentPane().setBackground(Color.yellow);
            EditarCategoriaP.getContentPane().setBackground(Color.yellow);
            EliminarP.getContentPane().setBackground(Color.yellow);
        }
        else if (blancoCC.isSelected()) {
            BuscarP.getContentPane().setBackground(Color.white);
            CambiarColorP.getContentPane().setBackground(Color.white);
            NuevaCategoriaP.getContentPane().setBackground(Color.white);
            AgregarP.getContentPane().setBackground(Color.white);
            OpcionesP.getContentPane().setBackground(Color.white);
            VerP.getContentPane().setBackground(Color.white);
            this.getContentPane().setBackground(Color.white);
            EditarCategoriaP.getContentPane().setBackground(Color.white);
            EliminarP.getContentPane().setBackground(Color.white);
        }
        else if (defaultCC.isSelected()) {
            BuscarP.getContentPane().setBackground(null);
            CambiarColorP.getContentPane().setBackground(null);
            NuevaCategoriaP.getContentPane().setBackground(null);
            AgregarP.getContentPane().setBackground(null);
            OpcionesP.getContentPane().setBackground(null);
            VerP.getContentPane().setBackground(null);
            this.getContentPane().setBackground(null);
            EditarCategoriaP.getContentPane().setBackground(null);
            EliminarP.getContentPane().setBackground(null);
        }
        
        CambiarColorP.dispose();
    }//GEN-LAST:event_aceptarCCActionPerformed

    private void defaultCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_defaultCCActionPerformed
        mostrarCC.setBackground(null);
    }//GEN-LAST:event_defaultCCActionPerformed

    private void blancoCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blancoCCActionPerformed
        mostrarCC.setBackground(Color.white);
    }//GEN-LAST:event_blancoCCActionPerformed

//BUSCAR
    private void input_nombreBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_nombreBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_nombreBActionPerformed

    private void nombreBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreBActionPerformed
        lista_tiposB.setVisible(false);
        lista_categoriasB.setVisible(false);     
        input_nombreB.setVisible(true);
    }//GEN-LAST:event_nombreBActionPerformed

    private void cancelarNCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarNCActionPerformed
        NuevaCategoriaP.dispose();
    }//GEN-LAST:event_cancelarNCActionPerformed

    private void confirmarNCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarNCActionPerformed
        if ("".equals(nuevaNC.getText())) {
            JOptionPane.showMessageDialog(NuevaCategoriaP, "Error, no se ha podido realizar la operación.","ERROR", JOptionPane.ERROR_MESSAGE);
        }
        else {
            existentesNC.addItem(nuevaNC.getText());
            categoriaS.addItem(nuevaNC.getText());
            lista_categoriasB.addItem(nuevaNC.getText());
        }
        nuevaNC.setText(null);
        NuevaCategoriaP.dispose();
    }//GEN-LAST:event_confirmarNCActionPerformed

    private void aceptarSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarSActionPerformed
        if (("".equals(tipoS.getText())) && ("C:/".equals(direccionS.getText()))) {
            JOptionPane.showMessageDialog(AgregarP, "Error, no se ha podido realizar la operación.","ERROR", JOptionPane.ERROR_MESSAGE);
            AgregarP.dispose();
        }
        else {         
            File nuevoFichero = new File(direccionS.getText(), nombreS.getText());
            Archivo nuevoArchivo = new Archivo(categoriaS.getSelectedItem().toString(), tipoS.getText(), nombreS.getText(), nuevoFichero);
            archivos.add(nuevoArchivo);
            JOptionPane.showMessageDialog(AgregarP, "Se ha agregado correctamente el archivo","CORRECTO", JOptionPane.INFORMATION_MESSAGE);
            AgregarP.dispose();
        }
    }//GEN-LAST:event_aceptarSActionPerformed

    private void tipoSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipoSActionPerformed

    private void explorarSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_explorarSActionPerformed
        JFileChooser selectorDirectorios = new JFileChooser();
        selectorDirectorios.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        selectorDirectorios.setDialogTitle("Seleccionador de Archivos");
        selectorDirectorios.setAcceptAllFileFilterUsed(false);
        
        /*
        FileNameExtensionFilter filtroImagen = new FileNameExtensionFilter("JPG, PNG & GIF","jpg","png","gif");
        FileNameExtensionFilter filtroDoc = new FileNameExtensionFilter("TXT, DOC & PDF","txt","doc","pdf");
        FileNameExtensionFilter filtroVideo = new FileNameExtensionFilter("AVI, MP4 & MP3","avi","mp4","mp3");
        
        selectorDirectorios.setFileFilter(filtroImagen);
        selectorDirectorios.setFileFilter(filtroDoc);
        selectorDirectorios.setFileFilter(filtroVideo);
        */
      
        if (selectorDirectorios.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            File faux = selectorDirectorios.getSelectedFile();
            direccionS.setText(faux.getPath());
            nombreS.setText(faux.getName());
               
            int i = 0;
            char punto = '.';
            
            while (i<faux.getName().length()) {
                if (punto == faux.getName().charAt(i)) {
                    String tipoExtraido = faux.getName().substring(i+1);
                    tipoS.setText(tipoExtraido);
                    i++;
                }
                else {
                    i++;
                }
            } 
        }
    }//GEN-LAST:event_explorarSActionPerformed

    private void cancelarSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarSActionPerformed
        AgregarP.dispose();
    }//GEN-LAST:event_cancelarSActionPerformed

    private void verOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verOActionPerformed
        VerP.setModal(true);
        VerP.setLocationRelativeTo(null);
        VerP.setTitle("Ver");
        VerP.setVisible(true);
    }//GEN-LAST:event_verOActionPerformed

    private void editarOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarOActionPerformed
        EditarCategoriaP.setModal(true);
        EditarCategoriaP.setLocationRelativeTo(null);
        EditarCategoriaP.setTitle("Editar Categoria");
        EditarCategoriaP.setVisible(true);
    }//GEN-LAST:event_editarOActionPerformed

    private void descargarOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descargarOActionPerformed

    }//GEN-LAST:event_descargarOActionPerformed

    private void eliminarOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarOActionPerformed
        EliminarP.setModal(true);
        EliminarP.setLocationRelativeTo(null);
        EliminarP.setTitle("Eliminar");
        EliminarP.setVisible(true);
    }//GEN-LAST:event_eliminarOActionPerformed

    private void aceptarOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarOActionPerformed
        OpcionesP.dispose();
    }//GEN-LAST:event_aceptarOActionPerformed

    private void aceptarVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarVActionPerformed
        VerP.dispose();
    }//GEN-LAST:event_aceptarVActionPerformed

    private void aceptarECActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarECActionPerformed
        EditarCategoriaP.dispose();
    }//GEN-LAST:event_aceptarECActionPerformed

    private void aceptarV1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarV1ActionPerformed
        EliminarP.dispose();
        OpcionesP.dispose();
        BuscarP.dispose();
    }//GEN-LAST:event_aceptarV1ActionPerformed

    private void cancelarVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarVActionPerformed
        EliminarP.dispose();
        OpcionesP.dispose();
        BuscarP.dispose();
    }//GEN-LAST:event_cancelarVActionPerformed

    private void direccionSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_direccionSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_direccionSActionPerformed

    private void azulCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_azulCCActionPerformed
        mostrarCC.setBackground(Color.cyan);
    }//GEN-LAST:event_azulCCActionPerformed

    private void amarilloCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amarilloCCActionPerformed
        mostrarCC.setBackground(Color.yellow);
    }//GEN-LAST:event_amarilloCCActionPerformed

    private void existentesNCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_existentesNCActionPerformed
        
    }//GEN-LAST:event_existentesNCActionPerformed

    private void lista_categoriasBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lista_categoriasBActionPerformed
        
    }//GEN-LAST:event_lista_categoriasBActionPerformed

    private void nombreSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreSActionPerformed
    
        

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog AgregarP;
    private javax.swing.JDialog BuscarP;
    private javax.swing.JDialog CambiarColorP;
    private javax.swing.JDialog EditarCategoriaP;
    private javax.swing.JDialog EliminarP;
    private javax.swing.JDialog NuevaCategoriaP;
    private javax.swing.JDialog OpcionesP;
    private javax.swing.JLabel TxtOpciones;
    private javax.swing.JDialog VerP;
    private javax.swing.JButton aceptarB;
    private javax.swing.JButton aceptarCC;
    private javax.swing.JButton aceptarEC;
    private javax.swing.JButton aceptarO;
    private javax.swing.JButton aceptarS;
    private javax.swing.JButton aceptarV;
    private javax.swing.JButton aceptarV1;
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
    private javax.swing.JButton cancelarV;
    private javax.swing.JRadioButton categoriaB;
    private javax.swing.JComboBox<String> categoriaS;
    private javax.swing.JLabel categoriaV;
    private javax.swing.JComboBox<String> categoriasEC;
    private javax.swing.JButton confirmarNC;
    private javax.swing.JRadioButton defaultCC;
    private javax.swing.JButton descargarO;
    private javax.swing.JTextField direccionS;
    private javax.swing.JButton editarO;
    private javax.swing.JButton eliminarO;
    private javax.swing.JComboBox<String> existentesNC;
    private javax.swing.JButton explorarS;
    private javax.swing.JPanel inicio_mostrarI;
    private javax.swing.JTextField input_nombreB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JComboBox<String> lista_categoriasB;
    private javax.swing.JComboBox<String> lista_tiposB;
    private javax.swing.JPanel mostrarCC;
    private javax.swing.JRadioButton nombreB;
    private javax.swing.JTextField nombreS;
    private javax.swing.JLabel nombreV;
    private javax.swing.JTextField nuevaNC;
    private javax.swing.JButton nueva_categoriaI;
    private javax.swing.JLabel objetoEC;
    private javax.swing.JLabel objetoO;
    private javax.swing.JButton opcionesB;
    private javax.swing.JPanel panel_muestraV;
    private javax.swing.ButtonGroup seleccionBuscarP;
    private javax.swing.ButtonGroup seleccionColorCC;
    private javax.swing.JTable tablaB;
    private javax.swing.JRadioButton tipoB;
    private javax.swing.JTextField tipoS;
    private javax.swing.JLabel tipoV;
    private javax.swing.JRadioButton todoB;
    private javax.swing.JButton verO;
    // End of variables declaration//GEN-END:variables
}
