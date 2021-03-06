/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TextGenerationUsingGeneticAlgorithm.UserInterface;

import TextGenerationUsingGeneticAlgorithm.Population;
import java.awt.Color;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Vaishali Tripathi
 */
public class UserInterface extends javax.swing.JFrame {
    final static Logger logger = Logger.getLogger(UserInterface.class.getName());
    String best;

    public UserInterface() {
        initComponents();
        this.setVisible(true);
        this.setSize(700, 700);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        targetStringTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        numOfGenTxt = new javax.swing.JTextField();
        timeTxt = new javax.swing.JTextField();
        mutationRateTxt = new javax.swing.JTextField();
        startBtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        generatedStringTxt = new java.awt.TextField();
        jLabel8 = new javax.swing.JLabel();
        avgFitnessTxt = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        backGroundLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setText("Mutation Rate:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 160, 199, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setText("Number of Generations:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 350, 195, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setText("Enter the String: ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 110, 141, 20);

        targetStringTxt.setFont(new java.awt.Font("Segoe UI Light", 3, 16)); // NOI18N
        targetStringTxt.setText("Program Structures and Algorithms");
        targetStringTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                targetStringTxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                targetStringTxtFocusLost(evt);
            }
        });
        targetStringTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                targetStringTxtActionPerformed(evt);
            }
        });
        getContentPane().add(targetStringTxt);
        targetStringTxt.setBounds(160, 100, 503, 40);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setText("String Generated By Genetic Algorithm:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 210, 324, 20);

        numOfGenTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numOfGenTxtActionPerformed(evt);
            }
        });
        getContentPane().add(numOfGenTxt);
        numOfGenTxt.setBounds(300, 350, 274, 26);

        timeTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeTxtActionPerformed(evt);
            }
        });
        getContentPane().add(timeTxt);
        timeTxt.setBounds(300, 430, 274, 26);

        mutationRateTxt.setFont(new java.awt.Font("Segoe UI Light", 3, 16)); // NOI18N
        mutationRateTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mutationRateTxtActionPerformed(evt);
            }
        });
        getContentPane().add(mutationRateTxt);
        mutationRateTxt.setBounds(160, 158, 274, 30);

        startBtn.setText("Start");
        startBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startBtnActionPerformed(evt);
            }
        });
        getContentPane().add(startBtn);
        startBtn.setBounds(290, 290, 65, 29);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setText("Text Generation Using Genetic Algorithm");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(100, 30, 510, 40);

        generatedStringTxt.setEnabled(false);
        generatedStringTxt.setFont(new java.awt.Font("Segoe UI Light", 3, 16)); // NOI18N
        generatedStringTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generatedStringTxtActionPerformed(evt);
            }
        });
        getContentPane().add(generatedStringTxt);
        generatedStringTxt.setBounds(20, 240, 640, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel8.setText("Time Elapsed:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(20, 430, 232, 20);

        avgFitnessTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avgFitnessTxtActionPerformed(evt);
            }
        });
        getContentPane().add(avgFitnessTxt);
        avgFitnessTxt.setBounds(300, 390, 274, 26);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel10.setText("Number of Generations:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(20, 350, 195, 20);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setText("Average Fitness:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 390, 190, 20);

        backGroundLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TextGenerationUsingGeneticAlgorithm/UserInterface/NEWIMAGE123.png"))); // NOI18N
        backGroundLbl.setText("jLabel9");
        getContentPane().add(backGroundLbl);
        backGroundLbl.setBounds(0, 0, 700, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void targetStringTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_targetStringTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_targetStringTxtActionPerformed

    private void numOfGenTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numOfGenTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numOfGenTxtActionPerformed

    private void timeTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_timeTxtActionPerformed

    private void mutationRateTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mutationRateTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mutationRateTxtActionPerformed

    private void startBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startBtnActionPerformed
        // TODO add your handling code here:

        try {
            
    /*******************************************************************************
     * Validation for blank inputs
    *****************************************************************************/
        if((targetStringTxt.getText()=="") || mutationRateTxt.getText()==""){
            JOptionPane.showMessageDialog(rootPane, "Target String and mutation rate cannot be empty.");
            return;
        }

            int populationSize = 10000;
            float mutationRate = (float) 0.01;
            /*********************************
                Default string
            **********************************/
            String target = "Program Structures & Algorithms..!!";

            mutationRate = Float.valueOf(mutationRateTxt.getText());
            target = targetStringTxt.getText();

            /********************************************************************
                Creating the first population
            *********************************************************************/
            Population c = new Population(populationSize, target, mutationRate);
            double time1 = System.currentTimeMillis();
            
            /********************************************************************
            Stopper stops the program execution if the number of generations 
            reach 10,000
            *********************************************************************/
            int stopper = 0;
            while (!(c.isFinished()) && (stopper<10000)) {
            /********************************************************************
            Natural selection
            *********************************************************************/
                c.NaturalSelection();
            /********************************************************************
            Get the best chromosome
            *********************************************************************/
                best = c.getBest();
                generatedStringTxt.setText(c.getBest());
            /********************************************************************
            Logger: Apache log4j has been used here
            *********************************************************************/
                logger.info(best);
                stopper++;

            } 
            double time2 = System.currentTimeMillis();
            
            System.out.println("Number of generations: " + c.getGenerations());
            
            numOfGenTxt.setText(String.valueOf(c.getGenerations()));
            avgFitnessTxt.setText(String.valueOf(c.getAverageFitness()));
            
            /********************************************************************
            Benchmarking
            *********************************************************************/
            double t = time2 - time1;
            timeTxt.setText(String.valueOf(t) + "ms");
            System.out.println("Time Elapsed: " + t + " ms");
            
            /********************************************************************
                In case the generated string doesn't match the entered string,
                allow the user to try a different mutation rate
            *********************************************************************/
            if(!generatedStringTxt.getText().equals(target))
                JOptionPane.showMessageDialog(rootPane, "Text cannot be generated with this mutation rate.");
        }
            /********************************************************************
            Exception handling
            *********************************************************************/
        catch (NumberFormatException n) {
            if ((targetStringTxt.getText().equals("")) || mutationRateTxt.getText().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Target String and mutation rate cannot be empty.");
            } else if ((targetStringTxt.getText().length() == 1)) {
                JOptionPane.showMessageDialog(rootPane, "Please enter a string larger than 1 character.");
            } else {
                JOptionPane.showMessageDialog(rootPane, "Mutation should be a float value.");
            }
        }

    }//GEN-LAST:event_startBtnActionPerformed

    private void targetStringTxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_targetStringTxtFocusGained
        /********************************************************************
            User interface configuration
            *********************************************************************/
        targetStringTxt.setText("");
        generatedStringTxt.setText("");
        mutationRateTxt.setText("");
        numOfGenTxt.setText("");
        avgFitnessTxt.setText("");
        timeTxt.setText("");
        
    }//GEN-LAST:event_targetStringTxtFocusGained

    private void targetStringTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_targetStringTxtFocusLost
        // TODO add your handling code here:

    }//GEN-LAST:event_targetStringTxtFocusLost

    private void avgFitnessTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avgFitnessTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_avgFitnessTxtActionPerformed

    private void generatedStringTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generatedStringTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_generatedStringTxtActionPerformed

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
            java.util.logging.Logger.getLogger(UserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserInterface().setVisible(true);

            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField avgFitnessTxt;
    private javax.swing.JLabel backGroundLbl;
    private java.awt.TextField generatedStringTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField mutationRateTxt;
    private javax.swing.JTextField numOfGenTxt;
    private javax.swing.JButton startBtn;
    private javax.swing.JTextField targetStringTxt;
    private javax.swing.JTextField timeTxt;
    // End of variables declaration//GEN-END:variables
}
