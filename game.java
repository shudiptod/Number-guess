/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numg;

import java.util.Random;

/**
 *
 * @author Shudipto Orin
 */
public class game extends javax.swing.JFrame {
    

    /**
     * Creates new form game
     */
    public game() {
        initComponents();
    }
    Random randomNum= new Random();
    int Number= randomNum.nextInt(100);        
    int tries =0;
    int guess=0;
    boolean win= false;
    
    
        

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JOptionPane = new javax.swing.JOptionPane();
        enter = new javax.swing.JButton();
        bOne = new javax.swing.JButton();
        bEight = new javax.swing.JButton();
        bTwo = new javax.swing.JButton();
        bNine = new javax.swing.JButton();
        bThree = new javax.swing.JButton();
        bZero = new javax.swing.JButton();
        bFour = new javax.swing.JButton();
        bFive = new javax.swing.JButton();
        bSix = new javax.swing.JButton();
        mainTextf = new javax.swing.JTextField();
        bSeven = new javax.swing.JButton();
        removeButton = new javax.swing.JButton();
        restart = new javax.swing.JButton();
        secTextf = new javax.swing.JTextField();
        levelUp = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        JOptionPane.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        JOptionPane.setIcon(new javax.swing.ImageIcon(getClass().getResource("/numg/background-black-colors-952670.jpg"))); // NOI18N
        JOptionPane.setOpaque(false);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        enter.setBackground(java.awt.Color.white);
        enter.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        enter.setForeground(java.awt.Color.green);
        enter.setText("ENTER");
        enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterActionPerformed(evt);
            }
        });
        getContentPane().add(enter, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 177, 75, -1));

        bOne.setBackground(new java.awt.Color(255, 255, 255));
        bOne.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bOne.setForeground(new java.awt.Color(0, 0, 204));
        bOne.setText("1");
        bOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bOneActionPerformed(evt);
            }
        });
        getContentPane().add(bOne, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 218, -1, 29));

        bEight.setBackground(new java.awt.Color(255, 255, 255));
        bEight.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bEight.setForeground(new java.awt.Color(0, 0, 204));
        bEight.setText("8");
        bEight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEightActionPerformed(evt);
            }
        });
        getContentPane().add(bEight, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 294, -1, -1));

        bTwo.setBackground(new java.awt.Color(255, 255, 255));
        bTwo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bTwo.setForeground(new java.awt.Color(0, 0, 204));
        bTwo.setText("2");
        bTwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTwoActionPerformed(evt);
            }
        });
        getContentPane().add(bTwo, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 218, -1, 29));

        bNine.setBackground(new java.awt.Color(255, 255, 255));
        bNine.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bNine.setForeground(new java.awt.Color(0, 0, 204));
        bNine.setText("9");
        bNine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bNineActionPerformed(evt);
            }
        });
        getContentPane().add(bNine, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 294, -1, -1));

        bThree.setBackground(new java.awt.Color(255, 255, 255));
        bThree.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bThree.setForeground(new java.awt.Color(0, 0, 204));
        bThree.setText("3");
        bThree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bThreeActionPerformed(evt);
            }
        });
        getContentPane().add(bThree, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 218, -1, 29));

        bZero.setBackground(new java.awt.Color(255, 255, 255));
        bZero.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bZero.setForeground(new java.awt.Color(0, 0, 204));
        bZero.setText("0");
        bZero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bZeroActionPerformed(evt);
            }
        });
        getContentPane().add(bZero, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 337, -1, -1));

        bFour.setBackground(new java.awt.Color(255, 255, 255));
        bFour.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bFour.setForeground(new java.awt.Color(0, 0, 204));
        bFour.setText("4");
        bFour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bFourActionPerformed(evt);
            }
        });
        getContentPane().add(bFour, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 258, -1, -1));

        bFive.setBackground(new java.awt.Color(255, 255, 255));
        bFive.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bFive.setForeground(new java.awt.Color(0, 0, 204));
        bFive.setText("5");
        bFive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bFiveActionPerformed(evt);
            }
        });
        getContentPane().add(bFive, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 258, -1, -1));

        bSix.setBackground(new java.awt.Color(255, 255, 255));
        bSix.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bSix.setForeground(new java.awt.Color(0, 0, 204));
        bSix.setText("6");
        bSix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSixActionPerformed(evt);
            }
        });
        getContentPane().add(bSix, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 258, -1, -1));

        mainTextf.setEditable(false);
        mainTextf.setBackground(new java.awt.Color(0, 0, 0));
        mainTextf.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        mainTextf.setForeground(new java.awt.Color(255, 255, 255));
        mainTextf.setCaretColor(new java.awt.Color(255, 0, 51));
        mainTextf.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(mainTextf, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 209, 56));

        bSeven.setBackground(new java.awt.Color(255, 255, 255));
        bSeven.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bSeven.setForeground(new java.awt.Color(0, 0, 204));
        bSeven.setText("7");
        bSeven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSevenActionPerformed(evt);
            }
        });
        getContentPane().add(bSeven, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 294, -1, -1));

        removeButton.setBackground(new java.awt.Color(255, 255, 255));
        removeButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        removeButton.setForeground(java.awt.Color.red);
        removeButton.setText("DELETE");
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(removeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 177, -1, -1));

        restart.setBackground(new java.awt.Color(255, 255, 255));
        restart.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        restart.setForeground(new java.awt.Color(153, 0, 0));
        restart.setText("RESTART");
        restart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restartActionPerformed(evt);
            }
        });
        getContentPane().add(restart, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, -1, -1));

        secTextf.setEditable(false);
        secTextf.setFont(new java.awt.Font("Bradley Hand ITC", 1, 18)); // NOI18N
        secTextf.setText("Let's Try your Luck");
        getContentPane().add(secTextf, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 11, 377, 50));

        levelUp.setBackground(new java.awt.Color(255, 255, 255));
        levelUp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        levelUp.setForeground(new java.awt.Color(255, 0, 0));
        levelUp.setText("LEVEL UP");
        levelUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                levelUpActionPerformed(evt);
            }
        });
        getContentPane().add(levelUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 110, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/numg/black-and-white-device-electronics-698808.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bOneActionPerformed
        guess=(guess*10)+1;
        mainTextf.setText(Integer.toString(guess));
    }//GEN-LAST:event_bOneActionPerformed

    private void bEightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEightActionPerformed
        guess=(guess*10)+8;
        mainTextf.setText(Integer.toString(guess));
    }//GEN-LAST:event_bEightActionPerformed

    private void bTwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTwoActionPerformed
        guess=(guess*10)+2;
        mainTextf.setText(Integer.toString(guess));
    }//GEN-LAST:event_bTwoActionPerformed

    private void bNineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bNineActionPerformed
        guess=(guess*10)+9;
        mainTextf.setText(Integer.toString(guess));
    }//GEN-LAST:event_bNineActionPerformed

    private void bThreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bThreeActionPerformed
        guess=(guess*10)+3;
        mainTextf.setText(Integer.toString(guess));
    }//GEN-LAST:event_bThreeActionPerformed

    private void bZeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bZeroActionPerformed
        guess=(guess*10)+0;
        mainTextf.setText(Integer.toString(guess));
    }//GEN-LAST:event_bZeroActionPerformed

    private void bFourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bFourActionPerformed
        guess=(guess*10)+4;
        mainTextf.setText(Integer.toString(guess));
    }//GEN-LAST:event_bFourActionPerformed

    private void bFiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bFiveActionPerformed
        guess=(guess*10)+5;
        mainTextf.setText(Integer.toString(guess));
    }//GEN-LAST:event_bFiveActionPerformed

    private void bSixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSixActionPerformed
        guess=(guess*10)+6;
        mainTextf.setText(Integer.toString(guess));
    }//GEN-LAST:event_bSixActionPerformed

    private void bSevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSevenActionPerformed
        guess=(guess*10)+7;
        mainTextf.setText(Integer.toString(guess));
    }//GEN-LAST:event_bSevenActionPerformed

    private void enterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterActionPerformed
        tries++;
        if(guess==Number)
        {
            win=true;
            if(tries>=10){
                
                JOptionPane.showMessageDialog(JOptionPane,("You Win At Last !!! \nThe Number is: "+Number+"\nYou Tried: "+tries+" Times !!!\nRestart or Level Up to play again\n"));
                guess=0;
                mainTextf.setText(null);
                tries=0;
                }
            else
            {
                JOptionPane.showMessageDialog(JOptionPane,("You Win !!! \nThe Number is: "+Number+"\nYou Tried: "+tries+" Times only !!!\nRestart or Level Up to play again\n"));
                guess=0;
                mainTextf.setText(null);
                tries=0;
            }
            
        }
        else if((Number+3)>guess && guess>Number)
            {
                secTextf.setText("              So close !!!");
                guess=0;
                mainTextf.setText(null);
            
            }
        else if( guess<Number && guess>(Number-3))
            {
                secTextf.setText("              So close !!!");
                guess=0;
                mainTextf.setText(null);
            }
        else if(guess>Number)
            {
                secTextf.setText("              Your Guess Is Too High !!!");
                guess=0;
                mainTextf.setText(null);
            }
        else if(guess<Number)
            {
                secTextf.setText("              Your Guess Is Too Low !!!");
                guess=0;
                mainTextf.setText(null);
            }
            
    }//GEN-LAST:event_enterActionPerformed

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
        guess=guess/10;
        mainTextf.setText(Integer.toString(guess));
    }//GEN-LAST:event_removeButtonActionPerformed

    private void restartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restartActionPerformed
        guess=0;
        tries=0;
        mainTextf.setText(null);
        Random rnum = new Random();
        Number= rnum.nextInt(100);     
        
    }//GEN-LAST:event_restartActionPerformed

    private void levelUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_levelUpActionPerformed
        guess=0;
        tries=0;
        mainTextf.setText(null);
        secTextf.setText("Level : HARD");
        Random rnum = new Random();
        Number= rnum.nextInt(1000);
    }//GEN-LAST:event_levelUpActionPerformed

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
            java.util.logging.Logger.getLogger(game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new game().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JOptionPane JOptionPane;
    private javax.swing.JButton bEight;
    private javax.swing.JButton bFive;
    private javax.swing.JButton bFour;
    private javax.swing.JButton bNine;
    private javax.swing.JButton bOne;
    private javax.swing.JButton bSeven;
    private javax.swing.JButton bSix;
    private javax.swing.JButton bThree;
    private javax.swing.JButton bTwo;
    private javax.swing.JButton bZero;
    private javax.swing.JButton enter;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton levelUp;
    private javax.swing.JTextField mainTextf;
    private javax.swing.JButton removeButton;
    private javax.swing.JButton restart;
    private javax.swing.JTextField secTextf;
    // End of variables declaration//GEN-END:variables
}
