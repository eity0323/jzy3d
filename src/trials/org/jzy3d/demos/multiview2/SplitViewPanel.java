/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * SplitViewPanel.java
 *
 * Created on Oct 21, 2010, 12:18:27 PM
 */

package org.jzy3d.demos.multiview2;

import java.awt.BorderLayout;

import org.jzy3d.plot3d.rendering.canvas.CanvasSwing;


/**
 *
 * @author joseph
 */
public class SplitViewPanel extends javax.swing.JPanel {

    /** Creates new form SplitViewPanel */
    public SplitViewPanel(CanvasSwing canvas1, CanvasSwing canvas2) {
        initComponents();
        jPanel1.add(canvas1, BorderLayout.CENTER);
        jPanel2.add(canvas2, BorderLayout.CENTER);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jSplitPane1 = new javax.swing.JSplitPane();
    jPanel1 = new javax.swing.JPanel();
    jPanel2 = new javax.swing.JPanel();

    jSplitPane1.setDividerSize(0);
    jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);
    jSplitPane1.setResizeWeight(0.5);

    jPanel1.setLayout(new java.awt.BorderLayout());
    jSplitPane1.setTopComponent(jPanel1);

    jPanel2.setLayout(new java.awt.BorderLayout());
    jSplitPane1.setRightComponent(jPanel2);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
    );
  }// </editor-fold>//GEN-END:initComponents


  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JSplitPane jSplitPane1;
  // End of variables declaration//GEN-END:variables

}