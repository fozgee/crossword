/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eprojectsemii;

import data.HighScoreS;
import entities.HighScore;
import java.awt.GridLayout;
import java.awt.Label;
import java.util.List;

/**
 *
 * @author Fozg
 */
public class pnHighScore extends javax.swing.JPanel {

    /**
     * Creates new form pnHighScore
     */
    HighScoreS hss = new HighScoreS();

    public pnHighScore() {
        initComponents();



        this.setLayout(new GridLayout(10, 2));

    }

    public void DrawEasy() {
        for (int i = 0; i < 10; i++) {
            List<HighScore> easy = hss.GetTopEasy();
            Label name = new Label(easy.get(i).getName());

            this.add(name);
            name.setVisible(true);
            Label point = new Label(easy.get(i).getScore() + "");
            this.add(point);
            point.setVisible(true);
        }
    }

     public void DrawNormal() {
        for (int i = 0; i < 10; i++) {
            List<HighScore> easy = hss.GetTopNormal();
            Label name = new Label(easy.get(i).getName());

            this.add(name);
            name.setVisible(true);
            Label point = new Label(easy.get(i).getScore() + "");
            this.add(point);
            point.setVisible(true);
        }
    }
     
      public void DrawHard() {
        for (int i = 0; i < 10; i++) {
            List<HighScore> easy = hss.GetTopHard();
            Label name = new Label(easy.get(i).getName());

            this.add(name);
            name.setVisible(true);
            Label point = new Label(easy.get(i).getScore() + "");
            this.add(point);
            point.setVisible(true);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 121, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 299, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
