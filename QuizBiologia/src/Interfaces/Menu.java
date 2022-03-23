package Interfaces;


import javax.swing.JOptionPane;


public class Menu extends javax.swing.JFrame {
    public Menu() {
        initComponents();
        btnJoga.setFocusPainted(false);
        btnSair.setFocusPainted(false);
        btnCreditos.setFocusPainted(false);
        
        this.setLocationRelativeTo(null);
        this.setSize(500,300);
        
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        btnJoga = new javax.swing.JButton();
        btnCreditos = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quiz");
        setBackground(new java.awt.Color(0, 0, 0));
        setMaximumSize(new java.awt.Dimension(475, 200));
        setMinimumSize(new java.awt.Dimension(475, 200));
        setPreferredSize(new java.awt.Dimension(475, 200));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/fundoq.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(79, 11, 206, 86);

        btnJoga.setBackground(new java.awt.Color(153, 255, 255));
        btnJoga.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        btnJoga.setText("Jogar");
        btnJoga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJogaActionPerformed(evt);
            }
        });
        getContentPane().add(btnJoga);
        btnJoga.setBounds(40, 140, 80, 23);

        btnCreditos.setBackground(new java.awt.Color(153, 255, 255));
        btnCreditos.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        btnCreditos.setText("Creditos");
        btnCreditos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreditosActionPerformed(evt);
            }
        });
        getContentPane().add(btnCreditos);
        btnCreditos.setBounds(150, 140, 90, 23);

        btnSair.setBackground(new java.awt.Color(153, 255, 255));
        btnSair.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        btnSair.setText("sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        getContentPane().add(btnSair);
        btnSair.setBounds(270, 140, 70, 23);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/funfdoBranco.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 370, 300);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnJogaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJogaActionPerformed
     //Cria a janela game.
      Jogo game2 = new Jogo();
      game2.setVisible(true);   
      Menu.this.dispose(); 
    }//GEN-LAST:event_btnJogaActionPerformed

    private void btnCreditosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreditosActionPerformed
       Menu.this.setVisible(false);
        JOptionPane.showMessageDialog(null,"*Programador:\nMarcelo Bernardo Prudencio\n"
               + "\n*Colaboradores:\nMarcus Vinicios Dias\n"
               + "Ivanilso da Silva Conceiçao Filho\n"
               + "\n*Designer grafico:\nMarcelo Bernardo Prudencio");
         Menu.this.setVisible(true);
    }//GEN-LAST:event_btnCreditosActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
       Menu.this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreditos;
    private javax.swing.JButton btnJoga;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
