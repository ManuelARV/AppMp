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
public class Error extends javax.swing.JFrame {

    private Error() {
        initComponents();
    }
    
    private static Error obj = null;
    
    public static Error getObj() {
        if (obj == null) {
            obj = new Error();
        }     
        return obj;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        aceptarERR = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("Error, no se ha podido realizar la operación.");
        jLabel1.setPreferredSize(new java.awt.Dimension(210, 77));

        aceptarERR.setText("OK");
        aceptarERR.setPreferredSize(new java.awt.Dimension(60, 30));
        aceptarERR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarERRActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(aceptarERR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(aceptarERR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aceptarERRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarERRActionPerformed
        Inicio.getObj().setVisible(true);
        Inicio.getObj().setLocationRelativeTo(null);
        Inicio.getObj().dispose();
        CambiarColor.getObj().dispose();
        Subir.getObj().dispose();
        NuevaCategoria.getObj().dispose();
        Buscar.getObj().dispose();
        Opciones.getObj().dispose();
        EditarCategoria.getObj().dispose();
        Ver.getObj().dispose();
        Eliminar.getObj().dispose();
        dispose();
    }//GEN-LAST:event_aceptarERRActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptarERR;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
