/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.UIManager;

/**
 *
 * @author Jeroen
 */
public class PersonalFrame extends javax.swing.JFrame {

    /**
     * Creates new form PersonalFrame
     */
    public PersonalFrame() {
        initComponents();
        jTabbedPane.setBackgroundAt(0, Color.GREEN);
        jTabbedPane.setBackgroundAt(1, Color.GREEN);
        jTabbedPane.setBackgroundAt(2, Color.YELLOW);
        jTabbedPane.setBackgroundAt(3, Color.GRAY);
        jTabbedPane.setBackgroundAt(4, Color.RED);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane = new javax.swing.JTabbedPane();
        jPanelHoses = new javax.swing.JPanel();
        jLabelImageDRitchie = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDRitchie = new javax.swing.JTextArea();
        jButtonDRitchieCheckOut = new javax.swing.JButton();
        jPanelJFNash = new javax.swing.JPanel();
        jLabelImageJFNash = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextAreaJFNash = new javax.swing.JTextArea();
        jButtonJFNashCheckOut = new javax.swing.JButton();
        jPanelEPowell = new javax.swing.JPanel();
        jLabelImageEPowell = new javax.swing.JLabel();
        jButtonEPowellReportProblem = new javax.swing.JButton();
        jButtonEPowellCheckIn = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextAreaEPowell = new javax.swing.JTextArea();
        jPanelMCauthon = new javax.swing.JPanel();
        jLabelImageMCauthon = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaMCauthon = new javax.swing.JTextArea();
        jButtonMCauthonCheckIn = new javax.swing.JButton();
        jButtonMCauthonReportProblem = new javax.swing.JButton();
        jPanelNAlgren = new javax.swing.JPanel();
        jLabelImageNAlgren = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextAreaNAlgren = new javax.swing.JTextArea();
        jButtonNAlgrenReportFixed = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItemEditLanguage = new javax.swing.JMenuItem();
        jMenuHelp = new javax.swing.JMenu();
        jMenuItemHelpAbout = new javax.swing.JMenuItem();
        jMenuItemHelpUpdate = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane.setTabPlacement(javax.swing.JTabbedPane.RIGHT);

        jLabelImageDRitchie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/DRitchie.jpg"))); // NOI18N
        jLabelImageDRitchie.setText("Profile Pic");
        jLabelImageDRitchie.setToolTipText("");

        jTextAreaDRitchie.setColumns(20);
        jTextAreaDRitchie.setRows(5);
        jScrollPane1.setViewportView(jTextAreaDRitchie);

        jButtonDRitchieCheckOut.setText("Check Out");

        javax.swing.GroupLayout jPanelHosesLayout = new javax.swing.GroupLayout(jPanelHoses);
        jPanelHoses.setLayout(jPanelHosesLayout);
        jPanelHosesLayout.setHorizontalGroup(
            jPanelHosesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHosesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelHosesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelImageDRitchie, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonDRitchieCheckOut))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelHosesLayout.setVerticalGroup(
            jPanelHosesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHosesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelHosesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelHosesLayout.createSequentialGroup()
                        .addComponent(jLabelImageDRitchie)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonDRitchieCheckOut)
                        .addGap(0, 68, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        jTabbedPane.addTab("D. Ritchie", jPanelHoses);

        jLabelImageJFNash.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/JFNash.jpg"))); // NOI18N
        jLabelImageJFNash.setText("Profile Pic");
        jLabelImageJFNash.setToolTipText("");

        jTextAreaJFNash.setColumns(20);
        jTextAreaJFNash.setRows(5);
        jScrollPane4.setViewportView(jTextAreaJFNash);

        jButtonJFNashCheckOut.setText("Check Out");

        javax.swing.GroupLayout jPanelJFNashLayout = new javax.swing.GroupLayout(jPanelJFNash);
        jPanelJFNash.setLayout(jPanelJFNashLayout);
        jPanelJFNashLayout.setHorizontalGroup(
            jPanelJFNashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelJFNashLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelJFNashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelImageJFNash, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonJFNashCheckOut))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelJFNashLayout.setVerticalGroup(
            jPanelJFNashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelJFNashLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelJFNashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4)
                    .addGroup(jPanelJFNashLayout.createSequentialGroup()
                        .addComponent(jLabelImageJFNash, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonJFNashCheckOut)
                        .addGap(0, 68, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jTabbedPane.addTab("J. F. Nash", jPanelJFNash);

        jLabelImageEPowell.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/EPowell.jpg"))); // NOI18N
        jLabelImageEPowell.setText("Profile Pic");
        jLabelImageEPowell.setToolTipText("");

        jButtonEPowellReportProblem.setText("Report Problem");

        jButtonEPowellCheckIn.setText("Check In");

        jTextAreaEPowell.setColumns(20);
        jTextAreaEPowell.setRows(5);
        jScrollPane5.setViewportView(jTextAreaEPowell);

        javax.swing.GroupLayout jPanelEPowellLayout = new javax.swing.GroupLayout(jPanelEPowell);
        jPanelEPowell.setLayout(jPanelEPowellLayout);
        jPanelEPowellLayout.setHorizontalGroup(
            jPanelEPowellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEPowellLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelEPowellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelImageEPowell, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonEPowellReportProblem)
                    .addComponent(jButtonEPowellCheckIn))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelEPowellLayout.setVerticalGroup(
            jPanelEPowellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEPowellLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelEPowellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5)
                    .addGroup(jPanelEPowellLayout.createSequentialGroup()
                        .addComponent(jLabelImageEPowell, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonEPowellCheckIn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonEPowellReportProblem)
                        .addGap(0, 34, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jTabbedPane.addTab("E. Powell", jPanelEPowell);

        jLabelImageMCauthon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MCauthon.jpg"))); // NOI18N
        jLabelImageMCauthon.setText("Profile Pic");
        jLabelImageMCauthon.setToolTipText("");

        jTextAreaMCauthon.setColumns(20);
        jTextAreaMCauthon.setRows(5);
        jScrollPane2.setViewportView(jTextAreaMCauthon);

        jButtonMCauthonCheckIn.setText("Check In");

        jButtonMCauthonReportProblem.setText("Report Problem");

        javax.swing.GroupLayout jPanelMCauthonLayout = new javax.swing.GroupLayout(jPanelMCauthon);
        jPanelMCauthon.setLayout(jPanelMCauthonLayout);
        jPanelMCauthonLayout.setHorizontalGroup(
            jPanelMCauthonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMCauthonLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelMCauthonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelImageMCauthon, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonMCauthonReportProblem)
                    .addComponent(jButtonMCauthonCheckIn))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelMCauthonLayout.setVerticalGroup(
            jPanelMCauthonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMCauthonLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelMCauthonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMCauthonLayout.createSequentialGroup()
                        .addComponent(jLabelImageMCauthon, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonMCauthonCheckIn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonMCauthonReportProblem)
                        .addGap(0, 34, Short.MAX_VALUE))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );

        jTabbedPane.addTab("M. Cauthon", jPanelMCauthon);

        jLabelImageNAlgren.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/NAlgren.jpg"))); // NOI18N
        jLabelImageNAlgren.setText("Profile Pic");
        jLabelImageNAlgren.setToolTipText("");

        jTextAreaNAlgren.setColumns(20);
        jTextAreaNAlgren.setRows(5);
        jScrollPane3.setViewportView(jTextAreaNAlgren);

        jButtonNAlgrenReportFixed.setText("Report Fixed");

        javax.swing.GroupLayout jPanelNAlgrenLayout = new javax.swing.GroupLayout(jPanelNAlgren);
        jPanelNAlgren.setLayout(jPanelNAlgrenLayout);
        jPanelNAlgrenLayout.setHorizontalGroup(
            jPanelNAlgrenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNAlgrenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelNAlgrenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelImageNAlgren, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNAlgrenReportFixed))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelNAlgrenLayout.setVerticalGroup(
            jPanelNAlgrenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNAlgrenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelNAlgrenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelNAlgrenLayout.createSequentialGroup()
                        .addComponent(jLabelImageNAlgren)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonNAlgrenReportFixed)
                        .addGap(0, 68, Short.MAX_VALUE))
                    .addComponent(jScrollPane3))
                .addContainerGap())
        );

        jTabbedPane.addTab("N. Algren", jPanelNAlgren);

        jMenu2.setText("Edit");

        jMenuItemEditLanguage.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemEditLanguage.setText("Language");
        jMenu2.add(jMenuItemEditLanguage);

        jMenuBar1.add(jMenu2);

        jMenuHelp.setText("Help");

        jMenuItemHelpAbout.setText("About");
        jMenuHelp.add(jMenuItemHelpAbout);

        jMenuItemHelpUpdate.setText("Update");
        jMenuHelp.add(jMenuItemHelpUpdate);

        jMenuBar1.add(jMenuHelp);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PersonalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PersonalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PersonalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PersonalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PersonalFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDRitchieCheckOut;
    private javax.swing.JButton jButtonEPowellCheckIn;
    private javax.swing.JButton jButtonEPowellReportProblem;
    private javax.swing.JButton jButtonJFNashCheckOut;
    private javax.swing.JButton jButtonMCauthonCheckIn;
    private javax.swing.JButton jButtonMCauthonReportProblem;
    private javax.swing.JButton jButtonNAlgrenReportFixed;
    private javax.swing.JLabel jLabelImageDRitchie;
    private javax.swing.JLabel jLabelImageEPowell;
    private javax.swing.JLabel jLabelImageJFNash;
    private javax.swing.JLabel jLabelImageMCauthon;
    private javax.swing.JLabel jLabelImageNAlgren;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuHelp;
    private javax.swing.JMenuItem jMenuItemEditLanguage;
    private javax.swing.JMenuItem jMenuItemHelpAbout;
    private javax.swing.JMenuItem jMenuItemHelpUpdate;
    private javax.swing.JPanel jPanelEPowell;
    private javax.swing.JPanel jPanelHoses;
    private javax.swing.JPanel jPanelJFNash;
    private javax.swing.JPanel jPanelMCauthon;
    private javax.swing.JPanel jPanelNAlgren;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane;
    private javax.swing.JTextArea jTextAreaDRitchie;
    private javax.swing.JTextArea jTextAreaEPowell;
    private javax.swing.JTextArea jTextAreaJFNash;
    private javax.swing.JTextArea jTextAreaMCauthon;
    private javax.swing.JTextArea jTextAreaNAlgren;
    // End of variables declaration//GEN-END:variables

    protected ImageIcon createProfilePicture(String imageName) {
        java.net.URL imgURL = getClass().getResource(imageName);
        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            System.err.println("Couldn't find file: " + imageName);
            return null;
        }
    }
}
