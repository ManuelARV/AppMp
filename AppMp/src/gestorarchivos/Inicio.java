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
public class Inicio extends javax.swing.JFrame {

    public Inicio() {
        initComponents();
    }
    
    private static Inicio obj = null;
    
    public static Inicio getObj() {
        if (obj == null) {
            obj = new Inicio();
        }     
        return obj;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buscarI = new javax.swing.JButton();
        subirI = new javax.swing.JButton();
        cambiar_colorI = new javax.swing.JButton();
        nueva_categoriaI = new javax.swing.JButton();
        cancelarI = new javax.swing.JButton();
        inicio_mostrarI = new javax.swing.JPanel();

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

        subirI.setText("Subir");
        subirI.setPreferredSize(new java.awt.Dimension(125, 30));
        subirI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subirIActionPerformed(evt);
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
            .addGap(0, 272, Short.MAX_VALUE)
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
                        .addComponent(subirI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(subirI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cambiar_colorI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nueva_categoriaI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inicio_mostrarI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cancelarI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscarIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarIActionPerformed
        Buscar.getObj().setTitle("Buscar");
        Buscar.getObj().setVisible(true);
        Buscar.getObj().setLocationRelativeTo(null);
    }//GEN-LAST:event_buscarIActionPerformed

    private void subirIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subirIActionPerformed
        Subir.getObj().setTitle("Subir");
        Subir.getObj().setVisible(true);
        Subir.getObj().setLocationRelativeTo(null);
    }//GEN-LAST:event_subirIActionPerformed

    private void cambiar_colorIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambiar_colorIActionPerformed
        CambiarColor.getObj().setTitle("Ajustes de Color");
        CambiarColor.getObj().setVisible(true);
        CambiarColor.getObj().setLocationRelativeTo(null);
    }//GEN-LAST:event_cambiar_colorIActionPerformed

    private void cancelarIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarIActionPerformed
        System.exit(0);
    }//GEN-LAST:event_cancelarIActionPerformed

    private void nueva_categoriaIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nueva_categoriaIActionPerformed
        NuevaCategoria.getObj().setTitle("Nueva Categoria");
        NuevaCategoria.getObj().setVisible(true);
        NuevaCategoria.getObj().setLocationRelativeTo(null);
    }//GEN-LAST:event_nueva_categoriaIActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscarI;
    private javax.swing.JButton cambiar_colorI;
    private javax.swing.JButton cancelarI;
    private javax.swing.JPanel inicio_mostrarI;
    private javax.swing.JButton nueva_categoriaI;
    private javax.swing.JButton subirI;
    // End of variables declaration//GEN-END:variables
}
