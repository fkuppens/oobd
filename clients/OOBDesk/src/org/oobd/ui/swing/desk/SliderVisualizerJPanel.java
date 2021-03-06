/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * TextVisualizerJPanel.java
 *
 * Created on 22.09.2012, 17:28:38
 */
package org.oobd.ui.swing.desk;

import java.awt.Graphics;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import org.oobd.base.*;
import org.oobd.base.support.OnionNoEntryException;
import org.oobd.base.visualizer.*;
import org.oobd.base.support.Onion;

/**
 *
 * @author steffen
 */
public class SliderVisualizerJPanel extends VisualizerJPanel implements IFvisualizer, ChangeListener {

    /** Creates new form TextVisualizerJPanel */
    public SliderVisualizerJPanel() {
        super();
        initComponents();
        valueSlider.addChangeListener(this);
    }

    @Override
    public void paintComponent(Graphics g) {
        if (value != null) {
            functionName.setText("<html>" + value.getToolTip() + "</html>");
            if (!valueSlider.getValueIsAdjusting()) {
                valueSlider.setValue(safeInt(value.toString()));
            }
        }
        if (value.getUpdateFlag(4)) {

            backImageLabel.setIcon(myIcons[OOBDConstants.VE_BACK + 1]);
        } else {
            backImageLabel.setIcon(myIcons[0]);
        }

        if (value.getUpdateFlag(1)) {
            updateImageLabel.setIcon(myIcons[OOBDConstants.VE_UPDATE + 1]);
        } else {
            updateImageLabel.setIcon(myIcons[0]);
        }

        if (value.getUpdateFlag(2)) {
            timerImageLabel.setIcon(myIcons[OOBDConstants.VE_TIMER + 1]);
        } else {
            timerImageLabel.setIcon(myIcons[0]);
        }

        if (value.getUpdateFlag(3)) {
            logImageLabel.setIcon(myIcons[OOBDConstants.VE_LOG + 1]);
        } else {
            logImageLabel.setIcon(myIcons[0]);
        }

        if (value.getUpdateFlag(0)) {
            forwardImageLabel.setIcon(myIcons[OOBDConstants.VE_MENU + 1]);
        } else {
            forwardImageLabel.setIcon(myIcons[0]);
        }


        super.paintComponent(g);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        valueSlider = new javax.swing.JSlider();
        jPanel1 = new javax.swing.JPanel();
        functionName = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        backImageLabel = new javax.swing.JLabel();
        updateImageLabel = new javax.swing.JLabel();
        timerImageLabel = new javax.swing.JLabel();
        logImageLabel = new javax.swing.JLabel();
        forwardImageLabel = new javax.swing.JLabel();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));

        setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        setName("Form"); // NOI18N
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.PAGE_AXIS));

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(org.oobd.ui.swing.desk.swing.class).getContext().getResourceMap(SliderVisualizerJPanel.class);
        valueSlider.setFont(resourceMap.getFont("valueSlider.font")); // NOI18N
        valueSlider.setName("valueSlider"); // NOI18N
        add(valueSlider);

        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.setMinimumSize(new java.awt.Dimension(14, 20));
        jPanel1.setName("jPanel1"); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(14, 20));
        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));

        functionName.setFont(resourceMap.getFont("titleLable.font")); // NOI18N
        functionName.setForeground(resourceMap.getColor("titleLable.foreground")); // NOI18N
        functionName.setText(resourceMap.getString("titleLable.text")); // NOI18N
        functionName.setName("titleLable"); // NOI18N
        jPanel1.add(functionName);

        filler1.setName("filler1"); // NOI18N
        jPanel1.add(filler1);

        backImageLabel.setIcon(resourceMap.getIcon("backImageLabel.icon")); // NOI18N
        backImageLabel.setName("backImageLabel"); // NOI18N
        jPanel1.add(backImageLabel);

        updateImageLabel.setName("updateImageLabel"); // NOI18N
        jPanel1.add(updateImageLabel);

        timerImageLabel.setName("timerImageLabel"); // NOI18N
        jPanel1.add(timerImageLabel);

        logImageLabel.setName("logImageLabel"); // NOI18N
        jPanel1.add(logImageLabel);

        forwardImageLabel.setName("forwardImageLabel"); // NOI18N
        jPanel1.add(forwardImageLabel);

        filler2.setName("filler2"); // NOI18N
        jPanel1.add(filler2);

        add(jPanel1);

        filler3.setName("filler3"); // NOI18N
        add(filler3);
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backImageLabel;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.JLabel forwardImageLabel;
    private javax.swing.JLabel functionName;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logImageLabel;
    private javax.swing.JLabel timerImageLabel;
    private javax.swing.JLabel updateImageLabel;
    private javax.swing.JSlider valueSlider;
    // End of variables declaration//GEN-END:variables

    public void initValue(Visualizer viz, Onion onion) {
        functionName.setText(onion.getOnionString("tooltip"));
        try {
            valueSlider.setMaximum(safeInt(onion.getOnionObject("opts/max")));
        } catch (OnionNoEntryException ex) {
            valueSlider.setMaximum(0);
        }
        try {
            valueSlider.setMinimum(safeInt(onion.getOnionObject("opts/min")));
        } catch (OnionNoEntryException ex) {
            valueSlider.setMinimum(0);
        }
        this.value = viz;
    }

    
    @Override
    public void stateChanged(ChangeEvent e) {
        JSlider source = (JSlider) e.getSource();
        if (!source.getValueIsAdjusting()) {
            int fps = (int) source.getValue();
            getVisualizer().inputNewValue(new Integer(fps).toString());
            getVisualizer().updateRequest(OOBDConstants.UR_USER);


        }
    }
}
