package Interfaces;
import javax.swing.JOptionPane;
public class TelaJogo extends javax.swing.JFrame {
     
int cont=1;
int pontos=0; 
    public TelaJogo() {
        initComponents();
        jButton1.setFocusPainted(false);
        jButton2.setFocusPainted(false);
        jButton3.setFocusPainted(false);
        jButton4.setFocusPainted(false);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextArea1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(530, 350));
        setMinimumSize(new java.awt.Dimension(530, 350));
        setPreferredSize(new java.awt.Dimension(150, 35));
        setResizable(false);

        jTextArea1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jTextArea1.setText("A bactéria não possui:");

        jButton1.setBackground(new java.awt.Color(102, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jButton1.setText("Parede celular.");
        jButton1.setPreferredSize(new java.awt.Dimension(150, 35));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(102, 255, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jButton2.setText("Carioteca");
        jButton2.setPreferredSize(new java.awt.Dimension(150, 35));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(102, 255, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jButton3.setText("DNA.");
        jButton3.setPreferredSize(new java.awt.Dimension(150, 35));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(102, 255, 255));
        jButton4.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jButton4.setText("Membrana plasmática");
        jButton4.setPreferredSize(new java.awt.Dimension(150, 35));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel1.setText("Pontos:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel2.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(112, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jTextArea1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(3, 3, 3)
                .addComponent(jTextArea1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     //Verifica qual pergunta esta sendo feoita e de acordo com isso faz com que o bnt tenha a resposta
     //Certa ou errada.
     switch(cont){
        case 3:
        TelaJogo.this.jTextArea1.setText("4");
        TelaJogo.this.jButton1.setText("4");
        TelaJogo.this.jButton2.setText("sl2");
        TelaJogo.this.jButton3.setText("sl3");
        TelaJogo.this.jButton4.setText("sl4");
        cont=(cont+1);
        pontos=(pontos+5);
        TelaJogo.this.jLabel2.setText(""+pontos); 
            break; 
        case 7:
        TelaJogo.this.jTextArea1.setText("8");
        TelaJogo.this.jButton1.setText("8");
        TelaJogo.this.jButton2.setText("sl2");
        TelaJogo.this.jButton3.setText("sl3");
        TelaJogo.this.jButton4.setText("sl4");
        TelaJogo.this.setVisible(true);
        cont=(cont+1);
        pontos=(pontos+5);
        TelaJogo.this.jLabel2.setText(""+pontos); 
            break;
        default:
        RespostaErrada(); 
            break;
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       switch(cont){
        case 1:
        TelaJogo.this.jTextArea1.setText("Um organismo unicelular, sem núcleo \n diferenciado,\ncausador de infecção em ratos, provavelmente será:");
        TelaJogo.this.jButton1.setText("um fungo");
        TelaJogo.this.jButton2.setText("um vírus.");
        TelaJogo.this.jButton3.setText("uma alga");
        TelaJogo.this.jButton4.setText("uma bactéria."); 
        cont=(cont+1);
        pontos=(pontos+5);
        TelaJogo.this.jLabel2.setText(""+pontos); 
            break;
        case 4:
        TelaJogo.this.jTextArea1.setText("5");
        TelaJogo.this.jButton1.setText("sl1");
        TelaJogo.this.jButton2.setText("5");
        TelaJogo.this.jButton3.setText("sl3");
        TelaJogo.this.jButton4.setText("sl4");
        TelaJogo.this.setVisible(true);
         cont=(cont+1);
         pontos=(pontos+5);
         TelaJogo.this.jLabel2.setText(""+pontos); 
            break;
        case 8:
        TelaJogo.this.jTextArea1.setText("9");
        TelaJogo.this.jButton1.setText("sl1");
        TelaJogo.this.jButton2.setText("9");
        TelaJogo.this.jButton3.setText("sl3");
        TelaJogo.this.jButton4.setText("sl4");
        TelaJogo.this.setVisible(true);
        cont=(cont+1);
        pontos=(pontos+5);
        TelaJogo.this.jLabel2.setText(""+pontos); 
            break;
        case 10:
        TelaJogo.this.dispose();
        TelaVitoria tela = new TelaVitoria();
        tela.setVisible(true);
            break;
        default:
         RespostaErrada();
            break;
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       switch(cont){   
        case 2:    
        TelaJogo.this.jTextArea1.setText("Podemos classificar as bactérias como");
        TelaJogo.this.jButton1.setText("Eucariontes unicelulares.");
        TelaJogo.this.jButton2.setText("eucariontes pluricelulares.");
        TelaJogo.this.jButton3.setText("eucariontes coloniais.");
        TelaJogo.this.jButton4.setText("procariontes unicelulares");    
         cont=(cont+1);
         pontos=(pontos+5);
         TelaJogo.this.jLabel2.setText(""+pontos); 
            break;
        case 6:
        TelaJogo.this.jTextArea1.setText("7");
        TelaJogo.this.jButton1.setText("sl1");
        TelaJogo.this.jButton2.setText("sl2");
        TelaJogo.this.jButton3.setText("sl3");
        TelaJogo.this.jButton4.setText("7");
        TelaJogo.this.setVisible(true);
       cont=(cont+1);
       pontos=(pontos+5);
       TelaJogo.this.jLabel2.setText(""+pontos); 
            break;
        case 9:
        TelaJogo.this.jTextArea1.setText("10");
        TelaJogo.this.jButton1.setText("sl1");
        TelaJogo.this.jButton2.setText("sl2");
        TelaJogo.this.jButton3.setText("sl3");
        TelaJogo.this.jButton4.setText("10");
        TelaJogo.this.setVisible(true); 
         cont=(cont+1);
         pontos=(pontos+5);
         TelaJogo.this.jLabel2.setText(""+pontos); 
            break;
        default:
         RespostaErrada();   
         
            break;
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      switch(cont){
        case 5:
         TelaJogo.this.jTextArea1.setText("6");
            TelaJogo.this.jButton1.setText("sl1");
            TelaJogo.this.jButton2.setText("sl2");
            TelaJogo.this.jButton3.setText("6");
            TelaJogo.this.jButton4.setText("sl4");
            TelaJogo.this.setVisible(true);
         cont=(cont+1);
         pontos=(pontos+5);
         TelaJogo.this.jLabel2.setText(""+pontos); 
            break;
        default:
         RespostaErrada();
            break;
        }
      
      
    }//GEN-LAST:event_jButton3ActionPerformed

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
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jTextArea1;
    // End of variables declaration//GEN-END:variables
}
