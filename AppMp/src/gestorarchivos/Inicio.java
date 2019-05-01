/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestorarchivos;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Marina
 */
public class Inicio extends javax.swing.JFrame {
    
    ArrayList<Archivo> archivos = new ArrayList<>();
    Archivo archivoSeleccionado;
    
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
        aceptarB = new javax.swing.JButton();
        TxtOpciones = new javax.swing.JLabel();
        opcionesB = new javax.swing.JButton();
        tipoB = new javax.swing.JRadioButton();
        categoriaB = new javax.swing.JRadioButton();
        lista_tiposB = new javax.swing.JComboBox<>();
        lista_categoriasB = new javax.swing.JComboBox<>();
        todoB = new javax.swing.JRadioButton();
        nombreB = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        mostrarArchivosB = new javax.swing.JTextArea();
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
        direccionS = new javax.swing.JTextField();
        explorarS = new javax.swing.JButton();
        categoriaS = new javax.swing.JComboBox<>();
        cancelarS = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nombreS = new javax.swing.JTextField();
        tipoS = new javax.swing.JComboBox<>();
        OpcionesP = new javax.swing.JDialog();
        verO = new javax.swing.JButton();
        editarO = new javax.swing.JButton();
        eliminarO = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        aceptarO = new javax.swing.JButton();
        objetoO = new javax.swing.JTextField();
        VerP = new javax.swing.JDialog();
        aceptarV = new javax.swing.JButton();
        panelVisualizar = new javax.swing.JLabel();
        visualizarV = new javax.swing.JButton();
        EditarCategoriaP = new javax.swing.JDialog();
        jLabel12 = new javax.swing.JLabel();
        categoriasEC = new javax.swing.JComboBox<>();
        aceptarEC = new javax.swing.JButton();
        objetoEC = new javax.swing.JTextField();
        EliminarP = new javax.swing.JDialog();
        aceptarV1 = new javax.swing.JButton();
        cancelarV = new javax.swing.JButton();
        objetoEliminar = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        SeleccionarArchivoP = new javax.swing.JDialog();
        jLabel15 = new javax.swing.JLabel();
        archivoSelecSA = new javax.swing.JComboBox<>();
        aceptarSA = new javax.swing.JButton();
        buscarI = new javax.swing.JButton();
        agregarI = new javax.swing.JButton();
        cambiar_colorI = new javax.swing.JButton();
        nueva_categoriaI = new javax.swing.JButton();
        cancelarI = new javax.swing.JButton();
        inicio_mostrarI = new javax.swing.JPanel();

        BuscarP.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        BuscarP.setModal(true);
        BuscarP.setPreferredSize(new java.awt.Dimension(645, 430));
        BuscarP.setResizable(false);
        BuscarP.setSize(new java.awt.Dimension(645, 430));

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

        lista_tiposB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Imagen", "Documento", "Video y Audio", "Otros" }));
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

        mostrarArchivosB.setEditable(false);
        mostrarArchivosB.setColumns(20);
        mostrarArchivosB.setRows(5);
        jScrollPane2.setViewportView(mostrarArchivosB);
        mostrarArchivosB.getAccessibleContext().setAccessibleParent(BuscarP);

        javax.swing.GroupLayout BuscarPLayout = new javax.swing.GroupLayout(BuscarP.getContentPane());
        BuscarP.getContentPane().setLayout(BuscarPLayout);
        BuscarPLayout.setHorizontalGroup(
            BuscarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BuscarPLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BuscarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
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
                            .addComponent(nombreB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2))
                .addGroup(BuscarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BuscarPLayout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(aceptarB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BuscarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(BuscarPLayout.createSequentialGroup()
                            .addGap(30, 30, 30)
                            .addGroup(BuscarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(buscarB, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                                .addComponent(todoB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(BuscarPLayout.createSequentialGroup()
                            .addGap(50, 50, 50)
                            .addGroup(BuscarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(TxtOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(opcionesB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
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
                .addGroup(BuscarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BuscarPLayout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(TxtOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(opcionesB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(aceptarB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BuscarPLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
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

        tipoS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Imagen", "Documento", "Video y Audio", "Otros" }));
        tipoS.setPreferredSize(new java.awt.Dimension(200, 28));

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
                            .addComponent(tipoS, 0, 1, Short.MAX_VALUE)))
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
                            .addComponent(categoriaS, 0, 1, Short.MAX_VALUE))))
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
        OpcionesP.setPreferredSize(new java.awt.Dimension(250, 250));
        OpcionesP.setResizable(false);
        OpcionesP.setSize(new java.awt.Dimension(250, 250));

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

        objetoO.setEditable(false);
        objetoO.setPreferredSize(new java.awt.Dimension(32, 120));

        javax.swing.GroupLayout OpcionesPLayout = new javax.swing.GroupLayout(OpcionesP.getContentPane());
        OpcionesP.getContentPane().setLayout(OpcionesPLayout);
        OpcionesPLayout.setHorizontalGroup(
            OpcionesPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OpcionesPLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(eliminarO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
            .addGroup(OpcionesPLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(OpcionesPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(OpcionesPLayout.createSequentialGroup()
                        .addComponent(verO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(editarO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(OpcionesPLayout.createSequentialGroup()
                        .addComponent(objetoO, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addComponent(aceptarO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(OpcionesPLayout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
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
                .addComponent(eliminarO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(OpcionesPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(OpcionesPLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(objetoO, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 32, Short.MAX_VALUE))
                    .addGroup(OpcionesPLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(aceptarO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        OpcionesP.getAccessibleContext().setAccessibleParent(BuscarP);

        VerP.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        VerP.setModal(true);
        VerP.setPreferredSize(new java.awt.Dimension(400, 480));
        VerP.setResizable(false);
        VerP.setSize(new java.awt.Dimension(400, 480));

        aceptarV.setText("Aceptar");
        aceptarV.setPreferredSize(new java.awt.Dimension(80, 30));
        aceptarV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarVActionPerformed(evt);
            }
        });

        visualizarV.setText("Visualizar");
        visualizarV.setPreferredSize(new java.awt.Dimension(120, 35));
        visualizarV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visualizarVActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout VerPLayout = new javax.swing.GroupLayout(VerP.getContentPane());
        VerP.getContentPane().setLayout(VerPLayout);
        VerPLayout.setHorizontalGroup(
            VerPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VerPLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(VerPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelVisualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(VerPLayout.createSequentialGroup()
                        .addComponent(visualizarV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 180, Short.MAX_VALUE)
                        .addComponent(aceptarV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        VerPLayout.setVerticalGroup(
            VerPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VerPLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(panelVisualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(VerPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(aceptarV, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(visualizarV, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        VerP.getAccessibleContext().setAccessibleParent(OpcionesP);

        EditarCategoriaP.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        EditarCategoriaP.setModal(true);
        EditarCategoriaP.setPreferredSize(new java.awt.Dimension(260, 155));
        EditarCategoriaP.setResizable(false);
        EditarCategoriaP.setSize(new java.awt.Dimension(260, 155));

        jLabel12.setText("Editando para: ");
        jLabel12.setPreferredSize(new java.awt.Dimension(90, 25));

        categoriasEC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Default" }));
        categoriasEC.setPreferredSize(new java.awt.Dimension(150, 35));
        categoriasEC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoriasECActionPerformed(evt);
            }
        });

        aceptarEC.setText("OK");
        aceptarEC.setPreferredSize(new java.awt.Dimension(60, 60));
        aceptarEC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarECActionPerformed(evt);
            }
        });

        objetoEC.setEditable(false);
        objetoEC.setPreferredSize(new java.awt.Dimension(90, 25));
        objetoEC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                objetoECActionPerformed(evt);
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
                        .addComponent(aceptarEC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 12, Short.MAX_VALUE))
                    .addGroup(EditarCategoriaPLayout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(objetoEC, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        EditarCategoriaPLayout.setVerticalGroup(
            EditarCategoriaPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EditarCategoriaPLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(EditarCategoriaPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(categoriasEC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aceptarEC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(EditarCategoriaPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(objetoEC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
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

        objetoEliminar.setEditable(false);
        objetoEliminar.setPreferredSize(new java.awt.Dimension(90, 20));
        objetoEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                objetoEliminarActionPerformed(evt);
            }
        });

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
                        .addComponent(objetoEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(objetoEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(EliminarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelarV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aceptarV1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        EliminarP.getAccessibleContext().setAccessibleParent(OpcionesP);

        SeleccionarArchivoP.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        SeleccionarArchivoP.setModal(true);
        SeleccionarArchivoP.setResizable(false);
        SeleccionarArchivoP.setSize(new java.awt.Dimension(342, 145));

        jLabel15.setText("Seleccione el archivo que desea editar: ");

        archivoSelecSA.setPreferredSize(new java.awt.Dimension(130, 40));
        archivoSelecSA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                archivoSelecSAActionPerformed(evt);
            }
        });

        aceptarSA.setText("Aceptar");
        aceptarSA.setPreferredSize(new java.awt.Dimension(90, 40));
        aceptarSA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarSAActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SeleccionarArchivoPLayout = new javax.swing.GroupLayout(SeleccionarArchivoP.getContentPane());
        SeleccionarArchivoP.getContentPane().setLayout(SeleccionarArchivoPLayout);
        SeleccionarArchivoPLayout.setHorizontalGroup(
            SeleccionarArchivoPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SeleccionarArchivoPLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(SeleccionarArchivoPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(SeleccionarArchivoPLayout.createSequentialGroup()
                        .addComponent(archivoSelecSA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(aceptarSA, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))))
        );
        SeleccionarArchivoPLayout.setVerticalGroup(
            SeleccionarArchivoPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SeleccionarArchivoPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(SeleccionarArchivoPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(archivoSelecSA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aceptarSA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        SeleccionarArchivoP.getAccessibleContext().setAccessibleParent(BuscarP);

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
        mostrarArchivosB.setText(null);
    }//GEN-LAST:event_buscarIActionPerformed

    private void agregarIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarIActionPerformed
        AgregarP.setModal(true);
        AgregarP.setLocationRelativeTo(null);
        AgregarP.setTitle("Agregar");
        AgregarP.setVisible(true);
        direccionS.setText("C:/");
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
        if (tipoB.isSelected()) {
            mostrarArchivosB.setText(null);
            if (archivos.isEmpty()) {
                mostrarArchivosB.setText("Todavía no se han agregado archivos al sistema.");
            }
            else {
                for (Archivo archivoT : archivos) {
                    if (archivoT.getTipo().equals(lista_tiposB.getSelectedItem().toString())) { 
                        mostrarArchivosB.append(archivoT.toString());
                        mostrarArchivosB.append("\n");
                    }
                }
                if ("".equals(mostrarArchivosB.getText())) {
                    mostrarArchivosB.setText("No se ha encontrado ningún archivo coincidente."); 
                }
            }
        }
        else if (categoriaB.isSelected()) {
            mostrarArchivosB.setText(null);
            if (archivos.isEmpty()) {
                mostrarArchivosB.setText("Todavía no se han agregado archivos al sistema.");
            }
            else {               
                for (Archivo archivoC : archivos) {
                    if (archivoC.getCategoria().equals(lista_categoriasB.getSelectedItem().toString())) {
                        mostrarArchivosB.append(archivoC.toString());
                        mostrarArchivosB.append("\n");
                    }
                }
                if ("".equals(mostrarArchivosB.getText())) {
                    mostrarArchivosB.setText("No se ha encontrado ningún archivo coincidente."); 
                }
            }
        }
        else if (nombreB.isSelected()) {
            mostrarArchivosB.setText(null);
            if (archivos.isEmpty()) {
                mostrarArchivosB.setText("Todavía no se han agregado archivos al sistema.");
            }
            else {
                for (Archivo archivoN : archivos) {
                    if (archivoN.getNombre().equals(input_nombreB.getText())) {
                        mostrarArchivosB.append(archivoN.toString());
                        mostrarArchivosB.append("\n");
                    }
                }
                if ("".equals(mostrarArchivosB.getText())) {
                    mostrarArchivosB.setText("No se ha encontrado ningún archivo coincidente."); 
                }
            }
            input_nombreB.setText(null);
        }
        else {
            mostrarArchivosB.setText(null);
            if (archivos.isEmpty()) {
                mostrarArchivosB.setText("Todavía no se han agregado archivos al sistema.");
            }
            else {
                for (Archivo archivoTodo : archivos) {
                    mostrarArchivosB.append(archivoTodo.toString()); 
                    mostrarArchivosB.append("\n");
                }
            }
        }
    }//GEN-LAST:event_buscarBActionPerformed

    private void aceptarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarBActionPerformed
        BuscarP.dispose();
    }//GEN-LAST:event_aceptarBActionPerformed

    private void opcionesBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionesBActionPerformed
        if (archivos.isEmpty() == false) {
            SeleccionarArchivoP.setModal(true);
            SeleccionarArchivoP.setLocationRelativeTo(null);
            SeleccionarArchivoP.setTitle("Seleccionador de Archivos");
            SeleccionarArchivoP.setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(BuscarP, "Error, no hay ningún archivo agregado al sistema.","ERROR", JOptionPane.ERROR_MESSAGE);
        }
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
            categoriasEC.addItem(nuevaNC.getText());
            JOptionPane.showMessageDialog(NuevaCategoriaP, "Se ha creado la nueva categoría correctamente.","CORRECTO", JOptionPane.INFORMATION_MESSAGE);
        }
        nuevaNC.setText(null);
        NuevaCategoriaP.dispose();
    }//GEN-LAST:event_confirmarNCActionPerformed

    private void aceptarSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarSActionPerformed
        if (("C:/".equals(direccionS.getText()))) {
            JOptionPane.showMessageDialog(AgregarP, "Error, no se ha podido realizar la operación.","ERROR", JOptionPane.ERROR_MESSAGE);
            AgregarP.dispose();
        }
        else {         
            File nuevoFichero = new File(direccionS.getText(), nombreS.getText());
            Archivo nuevoArchivo = new Archivo(categoriaS.getSelectedItem().toString(), tipoS.getSelectedItem().toString(), nombreS.getText(), nuevoFichero);
            archivos.add(nuevoArchivo);
            archivoSelecSA.addItem(nuevoArchivo.getNombre()); 
            JOptionPane.showMessageDialog(AgregarP, "Se ha agregado el archivo correctamente","CORRECTO", JOptionPane.INFORMATION_MESSAGE);
            AgregarP.dispose();
        }
    }//GEN-LAST:event_aceptarSActionPerformed

    private void explorarSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_explorarSActionPerformed
        JFileChooser selectorDirectorios = new JFileChooser();
        selectorDirectorios.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        selectorDirectorios.setDialogTitle("Seleccionador de Archivos");
        selectorDirectorios.setAcceptAllFileFilterUsed(false);
            
        FileNameExtensionFilter filtroImagen = new FileNameExtensionFilter("JPG, PNG & GIF","jpg","png","gif");
        FileNameExtensionFilter filtroDoc = new FileNameExtensionFilter("TXT, DOC & PDF","txt","doc","pdf");
        FileNameExtensionFilter filtroVideo = new FileNameExtensionFilter("AVI, MP4 & MP3","avi","mp4","mp3");
 
        if (null != tipoS.getSelectedItem().toString()) switch (tipoS.getSelectedItem().toString()) {
            case "Imagen":
                selectorDirectorios.setFileFilter(filtroImagen);
                break;
            case "Documento":
                selectorDirectorios.setFileFilter(filtroDoc);
                break;
            case "Video y Audio":
                selectorDirectorios.setFileFilter(filtroVideo);
                break;
            case "Otros":
                selectorDirectorios.setFileFilter(null);
                break;
            default:
                break;
        }
            
        if (selectorDirectorios.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            File faux = selectorDirectorios.getSelectedFile();
            direccionS.setText(faux.getAbsolutePath());
            nombreS.setText(faux.getName());  
        }
    }//GEN-LAST:event_explorarSActionPerformed

    private void cancelarSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarSActionPerformed
        AgregarP.dispose();
    }//GEN-LAST:event_cancelarSActionPerformed

    private void verOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verOActionPerformed
        if ("Imagen".equals(archivoSeleccionado.getTipo())) {    
            VerP.setModal(true);
            VerP.setLocationRelativeTo(null);
            VerP.setTitle("Visualizador");
            VerP.setVisible(true);
        }
        else {
            JOptionPane.showMessageDialog(AgregarP, "Error, no se puede visualizar el archivo porque no es una imagen.","ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_verOActionPerformed

    private void editarOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarOActionPerformed
        EditarCategoriaP.setModal(true);
        EditarCategoriaP.setLocationRelativeTo(null);
        EditarCategoriaP.setTitle("Editar Categoria");
        EditarCategoriaP.setVisible(true);
    }//GEN-LAST:event_editarOActionPerformed

    private void eliminarOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarOActionPerformed
        EliminarP.setModal(true);
        EliminarP.setLocationRelativeTo(null);
        EliminarP.setTitle("Eliminar");
        EliminarP.setVisible(true);
    }//GEN-LAST:event_eliminarOActionPerformed

    private void aceptarOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarOActionPerformed
        OpcionesP.dispose();
        SeleccionarArchivoP.dispose();
    }//GEN-LAST:event_aceptarOActionPerformed

    private void aceptarVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarVActionPerformed
        panelVisualizar.setIcon(null);
        VerP.dispose();
    }//GEN-LAST:event_aceptarVActionPerformed

    private void aceptarECActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarECActionPerformed
        archivoSeleccionado.setCategoria(categoriasEC.getSelectedItem().toString());
        EditarCategoriaP.dispose();
    }//GEN-LAST:event_aceptarECActionPerformed

    private void aceptarV1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarV1ActionPerformed
        archivos.remove(archivoSeleccionado);
        archivoSelecSA.removeItem(archivoSeleccionado.getNombre());
        JOptionPane.showMessageDialog(AgregarP, "Se ha eliminado el archivo correctamente.","CORRECTO", JOptionPane.INFORMATION_MESSAGE);
        EliminarP.dispose();
        OpcionesP.dispose();
        BuscarP.dispose();
        SeleccionarArchivoP.dispose();
    }//GEN-LAST:event_aceptarV1ActionPerformed

    private void cancelarVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarVActionPerformed
        EliminarP.dispose();
        OpcionesP.dispose();
        BuscarP.dispose();
        SeleccionarArchivoP.dispose();
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

    private void categoriasECActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoriasECActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_categoriasECActionPerformed

    private void aceptarSAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarSAActionPerformed
        OpcionesP.setModal(true);
        OpcionesP.setLocationRelativeTo(null);
        OpcionesP.setTitle("Opciones");
        OpcionesP.setVisible(true);
    }//GEN-LAST:event_aceptarSAActionPerformed

    private void archivoSelecSAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_archivoSelecSAActionPerformed
        //algoritmo que encuentra el archivo seleccionado para efectuar las opciones sobre él
        for (Archivo archivo : archivos) {
            if (archivo.getNombre().equals(archivoSelecSA.getSelectedItem().toString())) {
                archivoSeleccionado = archivo;
                objetoO.setText(archivoSeleccionado.getNombre());

                //Editar la categoría
                objetoEC.setText(archivoSeleccionado.getNombre());
                
                //Eliminar el archivo
                objetoEliminar.setText(archivoSeleccionado.getNombre());
                
            }       
        }   
    }//GEN-LAST:event_archivoSelecSAActionPerformed

    private void objetoECActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_objetoECActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_objetoECActionPerformed

    private void objetoEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_objetoEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_objetoEliminarActionPerformed

    private void visualizarVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visualizarVActionPerformed
        ImageIcon imagen = new ImageIcon(archivoSeleccionado.getFichero().getParent());
        imagen = new ImageIcon(imagen.getImage().getScaledInstance(panelVisualizar.getWidth(), panelVisualizar.getHeight(), BufferedImage.SCALE_SMOOTH));
        panelVisualizar.setIcon(imagen);
    }//GEN-LAST:event_visualizarVActionPerformed
    
        

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog AgregarP;
    private javax.swing.JDialog BuscarP;
    private javax.swing.JDialog CambiarColorP;
    private javax.swing.JDialog EditarCategoriaP;
    private javax.swing.JDialog EliminarP;
    private javax.swing.JDialog NuevaCategoriaP;
    private javax.swing.JDialog OpcionesP;
    private javax.swing.JDialog SeleccionarArchivoP;
    private javax.swing.JLabel TxtOpciones;
    private javax.swing.JDialog VerP;
    private javax.swing.JButton aceptarB;
    private javax.swing.JButton aceptarCC;
    private javax.swing.JButton aceptarEC;
    private javax.swing.JButton aceptarO;
    private javax.swing.JButton aceptarS;
    private javax.swing.JButton aceptarSA;
    private javax.swing.JButton aceptarV;
    private javax.swing.JButton aceptarV1;
    private javax.swing.JButton agregarI;
    private javax.swing.JRadioButton amarilloCC;
    private javax.swing.JComboBox<String> archivoSelecSA;
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
    private javax.swing.JComboBox<String> categoriasEC;
    private javax.swing.JButton confirmarNC;
    private javax.swing.JRadioButton defaultCC;
    private javax.swing.JTextField direccionS;
    private javax.swing.JButton editarO;
    private javax.swing.JButton eliminarO;
    private javax.swing.JComboBox<String> existentesNC;
    private javax.swing.JButton explorarS;
    private javax.swing.JPanel inicio_mostrarI;
    private javax.swing.JTextField input_nombreB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> lista_categoriasB;
    private javax.swing.JComboBox<String> lista_tiposB;
    private javax.swing.JTextArea mostrarArchivosB;
    private javax.swing.JPanel mostrarCC;
    private javax.swing.JRadioButton nombreB;
    private javax.swing.JTextField nombreS;
    private javax.swing.JTextField nuevaNC;
    private javax.swing.JButton nueva_categoriaI;
    private javax.swing.JTextField objetoEC;
    private javax.swing.JTextField objetoEliminar;
    private javax.swing.JTextField objetoO;
    private javax.swing.JButton opcionesB;
    private javax.swing.JLabel panelVisualizar;
    private javax.swing.ButtonGroup seleccionBuscarP;
    private javax.swing.ButtonGroup seleccionColorCC;
    private javax.swing.JRadioButton tipoB;
    private javax.swing.JComboBox<String> tipoS;
    private javax.swing.JRadioButton todoB;
    private javax.swing.JButton verO;
    private javax.swing.JButton visualizarV;
    // End of variables declaration//GEN-END:variables
}
