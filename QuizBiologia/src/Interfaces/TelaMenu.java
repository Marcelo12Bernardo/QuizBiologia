package Interfaces;


import javax.swing.JOptionPane;


public class TelaMenu extends javax.swing.JFrame {
    
    public TelaMenu() {
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

        lblIconeGame = new javax.swing.JLabel();
        btnJoga = new javax.swing.JButton();
        btnCreditos = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        btnOpcoes = new javax.swing.JButton();
        lblFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quiz");
        setBackground(new java.awt.Color(0, 0, 0));
        setMaximumSize(new java.awt.Dimension(530, 350));
        setMinimumSize(new java.awt.Dimension(530, 350));
        setPreferredSize(new java.awt.Dimension(530, 350));
        setResizable(false);
        getContentPane().setLayout(null);

        lblIconeGame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/iconeQuiz.png"))); // NOI18N
        getContentPane().add(lblIconeGame);
        lblIconeGame.setBounds(160, 10, 206, 86);

        btnJoga.setBackground(new java.awt.Color(153, 255, 255));
        btnJoga.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        btnJoga.setText("Jogar");
        btnJoga.setMaximumSize(new java.awt.Dimension(75, 25));
        btnJoga.setMinimumSize(new java.awt.Dimension(75, 25));
        btnJoga.setPreferredSize(new java.awt.Dimension(150, 35));
        btnJoga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJogaActionPerformed(evt);
            }
        });
        getContentPane().add(btnJoga);
        btnJoga.setBounds(190, 130, 150, 35);

        btnCreditos.setBackground(new java.awt.Color(153, 255, 255));
        btnCreditos.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        btnCreditos.setText("Creditos");
        btnCreditos.setMaximumSize(new java.awt.Dimension(75, 25));
        btnCreditos.setMinimumSize(new java.awt.Dimension(75, 25));
        btnCreditos.setPreferredSize(new java.awt.Dimension(150, 35));
        btnCreditos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreditosActionPerformed(evt);
            }
        });
        getContentPane().add(btnCreditos);
        btnCreditos.setBounds(190, 210, 150, 35);

        btnSair.setBackground(new java.awt.Color(153, 255, 255));
        btnSair.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        btnSair.setText("Sair");
        btnSair.setMaximumSize(new java.awt.Dimension(75, 25));
        btnSair.setMinimumSize(new java.awt.Dimension(75, 25));
        btnSair.setPreferredSize(new java.awt.Dimension(150, 35));
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        getContentPane().add(btnSair);
        btnSair.setBounds(190, 250, 150, 35);

        btnOpcoes.setBackground(new java.awt.Color(153, 255, 255));
        btnOpcoes.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        btnOpcoes.setText("Opções");
        btnOpcoes.setMaximumSize(new java.awt.Dimension(75, 25));
        btnOpcoes.setMinimumSize(new java.awt.Dimension(75, 25));
        btnOpcoes.setPreferredSize(new java.awt.Dimension(150, 35));
        btnOpcoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpcoesActionPerformed(evt);
            }
        });
        getContentPane().add(btnOpcoes);
        btnOpcoes.setBounds(190, 170, 150, 35);

        lblFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/fundoBranco.png"))); // NOI18N
        getContentPane().add(lblFundo);
        lblFundo.setBounds(0, 0, 530, 350);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnJogaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJogaActionPerformed
     //Cria a janela game.
      TelaJogo game2 = new TelaJogo();
      game2.setVisible(true);   
      TelaMenu.this.dispose(); 
    }//GEN-LAST:event_btnJogaActionPerformed

    private void btnCreditosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreditosActionPerformed
       TelaMenu.this.setVisible(false);
        JOptionPane.showMessageDialog(null,"*Programador:\nMarcelo Bernardo Prudencio\n"
               + "\n*Colaboradores:\n-------\n"
               + "\n*Designer grafico:\nMarcelo Bernardo Prudencio");
         TelaMenu.this.setVisible(true);
    }//GEN-LAST:event_btnCreditosActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
       TelaMenu.this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnOpcoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpcoesActionPerformed
     //Cria a janela game.
      TelaOpcoes op = new TelaOpcoes();
      op.setVisible(true);   
      TelaMenu.this.dispose(); 
    }//GEN-LAST:event_btnOpcoesActionPerformed

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new TelaMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreditos;
    private javax.swing.JButton btnJoga;
    private javax.swing.JButton btnOpcoes;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel lblFundo;
    private javax.swing.JLabel lblIconeGame;
    // End of variables declaration//GEN-END:variables
}
