package Interfaces;
import javax.swing.JOptionPane;



public class TelaJogo extends javax.swing.JFrame {
    
    public void setPerguntas(String pergunta,String a,String b,String c,String d){
        TelaJogo.this.lblPergunta.setText(pergunta);
        TelaJogo.this.btnLetraA.setText(a);
        TelaJogo.this.btnLetraB.setText(b);
        TelaJogo.this.btnLetraC.setText(c);
        TelaJogo.this.btnLetraD.setText(d);
     };
    public void ConfiguraTela(int contador){
            switch(contador){
            case 1:
            setPerguntas("A célula procariótica é desprovida de um:","Núcleo","Citoplasma","Plasmídeo","Flagelos");
            break; 
            case 2:
            setPerguntas("A membrana plasmática é uma fina película de natureza:","Lipídica","Proteíca","Glicose","Carboidrata");
            break; 
            case 3:
            setPerguntas("As organelas microscópicas constituídas por moléculas de RNA associadas a certas proteínas são:","Ribossomos","Lisossomos","Citosol","Centríolos");
            break; 
            case 4:
            setPerguntas("O complexo Golgiense é responsável pela:","Obtenção de energia.","Digestão Intracelular.","Respiração Celular.","Divisão Celular.");
            break; 
            case 5:
            setPerguntas("Os lisossomos podem digerir:","Materiais vindo de fora da célula ou da própria célula","Proteínas","Lipídios","Toxinas");
            break; 
            case 6:
            setPerguntas("Qual é a função do Citoesqueleto?","Respiração Celular","Digestão Celular","Degradação de toxinas","Apoio e ancoragem às organelas membranosas");
            break; 
            case 7:
            setPerguntas("O Retículo Endoplasmático rugoso é sintetizado por","Organelas","Lipídios","Proteínas","Organelas");
            break; 
            case 8:
            setPerguntas("Onde ocorre grande parte das reações químicas do metabolismo celular?","Citosol","RNA","Plasma","Flagelos");
            break; 
            case 9:
            setPerguntas("O que são seres autótrofos?","Seres que se alimentam-se de restos","Seres que possuem DNA","Seres que não são capazes de sintetizar seu próprio alimento","Seres capazes de sintetizar seu próprio alimento");
            break; 
            case 10:
            setPerguntas("O que Mendel utilizava para fazer seus experimentos?","Ratos","Animais","Ervilhas","Azeitonas");
            break; 
            }
    
    };

    int pontos=0; 
    int cont=1;
    public TelaJogo() {
        initComponents();
        btnLetraA.setFocusPainted(false);
        btnLetraB.setFocusPainted(false);
        btnLetraC.setFocusPainted(false);
        btnLetraD.setFocusPainted(false);
        this.setLocationRelativeTo(null);
        
        //switch para setar as perguntas e respostas
        ConfiguraTela(cont);
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblFundo = new javax.swing.JLabel();
        btnLetraA = new javax.swing.JButton();
        lblPergunta = new javax.swing.JLabel();
        btnLetraB = new javax.swing.JButton();
        btnLetraC = new javax.swing.JButton();
        btnLetraD = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblPontos = new javax.swing.JLabel();

        lblFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/fundoBranco.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(530, 350));
        setMinimumSize(new java.awt.Dimension(530, 350));
        setPreferredSize(new java.awt.Dimension(150, 35));
        setResizable(false);

        btnLetraA.setBackground(new java.awt.Color(102, 255, 255));
        btnLetraA.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        btnLetraA.setText("Parede celular");
        btnLetraA.setPreferredSize(new java.awt.Dimension(170, 35));
        btnLetraA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLetraAActionPerformed(evt);
            }
        });

        lblPergunta.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        lblPergunta.setText("A bactéria não possui:");
        lblPergunta.setToolTipText("");

        btnLetraB.setBackground(new java.awt.Color(102, 255, 255));
        btnLetraB.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        btnLetraB.setText("Carioteca");
        btnLetraB.setPreferredSize(new java.awt.Dimension(170, 35));
        btnLetraB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLetraBActionPerformed(evt);
            }
        });

        btnLetraC.setBackground(new java.awt.Color(102, 255, 255));
        btnLetraC.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        btnLetraC.setText("DNA");
        btnLetraC.setPreferredSize(new java.awt.Dimension(170, 35));
        btnLetraC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLetraCActionPerformed(evt);
            }
        });

        btnLetraD.setBackground(new java.awt.Color(102, 255, 255));
        btnLetraD.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        btnLetraD.setText("Membrana plasmática");
        btnLetraD.setPreferredSize(new java.awt.Dimension(170, 35));
        btnLetraD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLetraDActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel1.setText("Pontos:");

        lblPontos.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        lblPontos.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLetraA, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLetraC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLetraD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLetraB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(71, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPontos, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblPergunta, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblPontos))
                .addGap(1, 1, 1)
                .addComponent(lblPergunta, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLetraA, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLetraB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLetraC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLetraD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLetraAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLetraAActionPerformed
        switch(cont)
        {
            case 3:
                RespostaCerta(); 
                break; 
            case 5:
                RespostaCerta(); 
                break; 
            case 8:
                RespostaCerta(); 
                break; 
            default:
                RespostaErrada(); 
                break;
        }
    }//GEN-LAST:event_btnLetraAActionPerformed

    private void btnLetraBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLetraBActionPerformed
        switch(cont)
        {
            case 1:
                RespostaCerta(); 
                break; 
            case 4:
                RespostaCerta(); 
                break; 
            default:
                RespostaErrada();
                break;
        }
    }//GEN-LAST:event_btnLetraBActionPerformed

    private void btnLetraDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLetraDActionPerformed
        switch(cont)
        {   
            case 2:
                RespostaCerta(); 
                break; 
            case 6:
                RespostaCerta(); 
                break; 
            case 9:
                RespostaCerta(); 
                break; 
            default:
                RespostaErrada();   
                break;
        }
    }//GEN-LAST:event_btnLetraDActionPerformed

    private void btnLetraCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLetraCActionPerformed
        switch(cont)
        {
            case 7:
                RespostaCerta(); 
                break; 
            case 10:
                RespostaCerta(); 
                break; 
            default:
                RespostaErrada();
                break;
        }
    }//GEN-LAST:event_btnLetraCActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaJogo().setVisible(true);
            }
        });
    }
    public void RespostaErrada(){
    new TelaDerrota().setVisible(true);
    TelaJogo.this.dispose();
    cont=1;
    }
    public void RespostaCerta(){
        pontos=(pontos+10);
        lblPontos.setText(""+pontos);
        if(pontos<100)
        {
            cont++;
            ConfiguraTela(cont);
        }else if(pontos==100){TelaJogo.this.dispose(); new TelaVitoria().setVisible(true);}
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLetraA;
    private javax.swing.JButton btnLetraB;
    private javax.swing.JButton btnLetraC;
    private javax.swing.JButton btnLetraD;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblFundo;
    private javax.swing.JLabel lblPergunta;
    private javax.swing.JLabel lblPontos;
    // End of variables declaration//GEN-END:variables
}
