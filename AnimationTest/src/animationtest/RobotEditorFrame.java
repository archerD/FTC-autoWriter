/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animationtest;

import javax.swing.*;

/**
 * @author thomas
 */
public class RobotEditorFrame extends javax.swing.JFrame {

    //to store the data generated by the editor frame
    private ProgramInfo data;
    private boolean done = false;
    //TODO: have the frame reload any previous settings

    public void setData(ProgramInfo data) {
        this.data = data;
    }

    public ProgramInfo getData() {
        return data;
    }

    /**
     * Creates new form RobotEditorFrame
     */
    public RobotEditorFrame() {
        initComponents();
        data = new ProgramInfo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        wheelDiameter = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        gearRatio1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        gearRatio2 = new javax.swing.JTextField();
        wheelDistance = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        doneButton = new javax.swing.JButton();
        hardware1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        hardware2 = new javax.swing.JTextField();
        reversed2 = new javax.swing.JCheckBox();
        reversed1 = new javax.swing.JCheckBox();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        software2 = new javax.swing.JTextField();
        software1 = new javax.swing.JTextField();
        gyroHardware = new javax.swing.JTextField();
        hasGyro = new javax.swing.JCheckBox();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
                jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
                jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        wheelDiameter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wheelDiameterActionPerformed(evt);
            }
        });

        jLabel1.setText("Wheel diameter");

        jLabel2.setText("In");

        gearRatio1.setText("1");
        gearRatio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gearRatio1ActionPerformed(evt);
            }
        });

        jLabel3.setText("To");

        jLabel4.setText("Gear Ratio(WIP)");

        gearRatio2.setText("1");
        gearRatio2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gearRatio2ActionPerformed(evt);
            }
        });

        wheelDistance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wheelDistanceActionPerformed(evt);
            }
        });

        jLabel5.setText("Wheel distance (How far apart the wheels are)");

        jLabel6.setText("In");

        doneButton.setText("Apply");
        doneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doneButtonActionPerformed(evt);
            }
        });

        hardware1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hardware1ActionPerformed(evt);
            }
        });

        jLabel8.setText("Hardware map name:");

        reversed2.setText("Reversed");
        reversed2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reversed2ActionPerformed(evt);
            }
        });

        reversed1.setText("Reversed");
        reversed1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reversed1ActionPerformed(evt);
            }
        });

        jLabel10.setText("Left");

        jLabel11.setText("Right");

        jLabel12.setText("Software map name:");

        software1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                software1ActionPerformed(evt);
            }
        });

        gyroHardware.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gyroHardwareActionPerformed(evt);
            }
        });

        hasGyro.setText("robot has gyro? Gyro name:");
        hasGyro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hasGyroActionPerformed(evt);
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
                                                .addComponent(gearRatio1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(7, 7, 7)
                                                .addComponent(jLabel3)
                                                .addGap(3, 3, 3)
                                                .addComponent(gearRatio2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(doneButton, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel4)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                        .addComponent(wheelDiameter, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                        .addComponent(jLabel2))
                                                                                .addComponent(jLabel1))
                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                        .addComponent(jLabel5))
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                        .addGap(5, 5, 5)
                                                                                        .addComponent(wheelDistance, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addGap(18, 18, 18)
                                                                                        .addComponent(jLabel6)))
                                                                        .addGap(0, 206, Short.MAX_VALUE))
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(hasGyro)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(gyroHardware, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(jLabel10)
                                                                                        .addComponent(jLabel11))
                                                                                .addGap(18, 18, 18)
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addGroup(layout.createSequentialGroup()
                                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                                        .addComponent(hardware2)
                                                                                                        .addComponent(hardware1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                .addGap(18, 18, 18)
                                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                        .addComponent(reversed1)
                                                                                                        .addComponent(reversed2)))
                                                                                        .addComponent(jLabel8))
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                                .addComponent(software2)
                                                                                                .addComponent(software1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                        .addComponent(jLabel12))))))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(wheelDiameter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2)
                                        .addComponent(wheelDistance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6)
                                        .addComponent(hasGyro)
                                        .addComponent(gyroHardware, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel12))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(36, 36, 36)
                                                .addComponent(reversed2))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(hardware1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(hardware2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel11)))
                                        .addComponent(jLabel10)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(software1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(reversed1))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(software2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(gearRatio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3)
                                        .addComponent(gearRatio2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(doneButton))
                                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void wheelDiameterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wheelDiameterActionPerformed
    }//GEN-LAST:event_wheelDiameterActionPerformed

    private void gearRatio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gearRatio1ActionPerformed
    }//GEN-LAST:event_gearRatio1ActionPerformed

    private void gearRatio2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gearRatio2ActionPerformed
    }//GEN-LAST:event_gearRatio2ActionPerformed

    private void wheelDistanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wheelDistanceActionPerformed
    }//GEN-LAST:event_wheelDistanceActionPerformed

    private void doneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doneButtonActionPerformed
        // TODO add your handling code here:
        data.distanceBetweenWheels = Double.parseDouble(wheelDistance.getText());
        data.wheelDiameter = Double.parseDouble(wheelDiameter.getText());
        data.gearRatio = Integer.parseInt(gearRatio1.getText()) / Integer.parseInt(gearRatio2.getText());
        data.clearMotors();
        if (software1.getText().length() > 0 && hardware1.getText().length() > 0) {
            data.getMotors().add(new ProgramInfo.ItemData(software1.getText(), hardware1.getText(), reversed1.isSelected(), true));
        }
        if (software2.getText().length() > 0 && hardware2.getText().length() > 0) {
            data.getMotors().add(new ProgramInfo.ItemData(software2.getText(), hardware2.getText(), reversed2.isSelected(), true));
        }

        if (hasGyro.isSelected() && gyroHardware.getText().length() > 0) {
            data.setGyro(new ProgramInfo.ItemData("gyro", gyroHardware.getText()));
        } else {
            data.setGyro(null);
        }

        MainFrame.info = data;
    }//GEN-LAST:event_doneButtonActionPerformed

    private void reversed2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reversed2ActionPerformed
    }//GEN-LAST:event_reversed2ActionPerformed

    private void reversed1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reversed1ActionPerformed
    }//GEN-LAST:event_reversed1ActionPerformed

    private void hardware1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hardware1ActionPerformed
    }//GEN-LAST:event_hardware1ActionPerformed

    private void software1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_software1ActionPerformed
    }//GEN-LAST:event_software1ActionPerformed

    private void gyroHardwareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gyroHardwareActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gyroHardwareActionPerformed

    private void hasGyroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hasGyroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hasGyroActionPerformed

    public static void REF() {
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
            java.util.logging.Logger.getLogger(RobotEditorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RobotEditorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RobotEditorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RobotEditorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ex) {

        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                javax.swing.JFrame ref = new RobotEditorFrame();


                ref.setResizable(false);
                ref.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

                ref.setVisible(true);


            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton doneButton;
    private javax.swing.JTextField gearRatio1;
    private javax.swing.JTextField gearRatio2;
    private javax.swing.JTextField gyroHardware;
    private javax.swing.JTextField hardware1;
    private javax.swing.JTextField hardware2;
    private javax.swing.JCheckBox hasGyro;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JCheckBox reversed1;
    private javax.swing.JCheckBox reversed2;
    private javax.swing.JTextField software1;
    private javax.swing.JTextField software2;
    private javax.swing.JTextField wheelDiameter;
    private javax.swing.JTextField wheelDistance;
    // End of variables declaration//GEN-END:variables
}
