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
public class Opciones extends javax.swing.JFrame {

    private Opciones() {
        initComponents();
    }
    
    private static Opciones obj = null;
    
    public static Opciones getObj() {
        if (obj == null) {
            obj = new Opciones();
        }     
        return obj;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        verO = new javax.swing.JButton();
        editarO = new javax.swing.JButton();
        descargarO = new javax.swing.JButton();
        eliminarO = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        aceptarO = new javax.swing.JButton();
        objetoO = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

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

        jLabel1.setText("Acciones para:");
        jLabel1.setPreferredSize(new java.awt.Dimension(120, 30));

        aceptarO.setText("Aceptar");
        aceptarO.setPreferredSize(new java.awt.Dimension(90, 30));
        aceptarO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarOActionPerformed(evt);
            }
        });

        objetoO.setText("://:");
        objetoO.setPreferredSize(new java.awt.Dimension(120, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(verO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(editarO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(descargarO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(eliminarO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(objetoO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addComponent(aceptarO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(verO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editarO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(descargarO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eliminarO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(objetoO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(aceptarO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aceptarOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarOActionPerformed
        dispose();
    }//GEN-LAST:event_aceptarOActionPerformed

    private void verOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verOActionPerformed
        Ver.getObj().setTitle("Ver");
        Ver.getObj().setVisible(true);
        Ver.getObj().setLocationRelativeTo(null);
    }//GEN-LAST:event_verOActionPerformed

    private void editarOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarOActionPerformed
        EditarCategoria.getObj().setTitle("Editar Categoria");
        EditarCategoria.getObj().setVisible(true);
        EditarCategoria.getObj().setLocationRelativeTo(null);
    }//GEN-LAST:event_editarOActionPerformed

    private void descargarOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descargarOActionPerformed
        
    }//GEN-LAST:event_descargarOActionPerformed

    private void eliminarOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarOActionPerformed
        Eliminar.getObj().setTitle("Eliminar");
        Eliminar.getObj().setVisible(true);
        Eliminar.getObj().setLocationRelativeTo(null);
    }//GEN-LAST:event_eliminarOActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptarO;
    private javax.swing.JButton descargarO;
    private javax.swing.JButton editarO;
    private javax.swing.JButton eliminarO;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel objetoO;
    private javax.swing.JButton verO;
    // End of variables declaration//GEN-END:variables
}
