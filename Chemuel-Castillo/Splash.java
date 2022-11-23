/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package signUpLogInUI;


public class Splash extends javax.swing.JFrame {

    public Splash() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel17 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1.png"))); // NOI18N
        getContentPane().add(jLabel17, java.awt.BorderLayout.PAGE_START);

        jProgressBar1.setBackground(new java.awt.Color(0, 153, 102));
        jProgressBar1.setForeground(new java.awt.Color(0, 204, 255));
        jProgressBar1.setPreferredSize(new java.awt.Dimension(146, 15));
        getContentPane().add(jProgressBar1, java.awt.BorderLayout.PAGE_END);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        
        final Splash scr = new Splash();
        
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                scr.setVisible(true);
            }
        });
        Login scr2 = new Login();
        try{
            for(int i=0;i<=100;i++){
                Thread.sleep(80);
                scr.jProgressBar1.setValue(i);
            }
            new Splash().setVisible(false);
        }catch(Exception e){
            
        }
        new Login().setVisible(false);
        scr2.setVisible(true);
        scr.dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel17;
    private javax.swing.JProgressBar jProgressBar1;
    // End of variables declaration//GEN-END:variables
}
