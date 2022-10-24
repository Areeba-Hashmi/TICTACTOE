import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.YES_NO_OPTION;

public class TIC_TAC_TOE extends javax.swing.JFrame{

    private String startGame = "X";
    private int xCount=0;
    private int oCount=0;
    
     
    public TIC_TAC_TOE() {
        initComponents();
    }
    private void gameScore(){
        playerxxx.setText(String.valueOf(xCount));
        playerooo.setText(String.valueOf(oCount));
    }
      private void  choose_a_Player(){
          if(startGame.equalsIgnoreCase("X"))
          {
                  startGame =  "O"; 
          }
          else{
                  startGame = "X";
        }
   }
 private void WinningGame(){
     String b1 = txtbtn1.getText();
     String b2 = txtbtn2.getText();
     String b3 = txtbtn3.getText();
     
     String b4 = txtbtn4.getText();
     String b5 = txtbtn5.getText();
     String b6 = txtbtn6.getText();
   
     String b7 = txtbtn7.getText();
     String b8 = txtbtn8.getText();
     String b9 = txtbtn9.getText();          
        String TicTacToe = null;
     
     
     //Player X coding
     
     if(b1  ==  ("X")  &&   b2  == ("X")  && b3 ==  ("X")){
         JOptionPane.showMessageDialog(this, "Player X win", TicTacToe,  JOptionPane.INFORMATION_MESSAGE);
         xCount++;
         gameScore();
         txtbtn1.setBackground(Color.orange);
         txtbtn2.setBackground(Color.orange);
         txtbtn3.setBackground(Color.orange);
                 }
     if(b4  ==  ("X")  &&   b5  == ("X")  &&  b6 ==  ("X")){
         JOptionPane.showMessageDialog(this, "Player X win", TicTacToe, JOptionPane.INFORMATION_MESSAGE);
         xCount++;
         gameScore();
         txtbtn4.setBackground(Color.orange);
         txtbtn5.setBackground(Color.orange);
         txtbtn6.setBackground(Color.orange);
                 }
     if(b7  ==  ("X")  &&   b8  == ("X")  &&  b9  ==  ("X")){
         JOptionPane.showMessageDialog(this, "Player X win", TicTacToe, JOptionPane.INFORMATION_MESSAGE);
         xCount++;
         gameScore();
         txtbtn7.setBackground(Color.orange);
         txtbtn8.setBackground(Color.orange);
         txtbtn9.setBackground(Color.orange);
                 }
     if(b1  ==  ("X")  &&   b4  == ("X")  &&  b7 ==  ("X")){
         JOptionPane.showMessageDialog(this, "Player X win", TicTacToe, JOptionPane.INFORMATION_MESSAGE);
         xCount++;
         gameScore();
         txtbtn1.setBackground(Color.orange);
         txtbtn4.setBackground(Color.orange);
         txtbtn7.setBackground(Color.orange);
                 }
       if(b2  ==  ("X")  &&   b5 == ("X")  &&  b8 ==  ("X")){
         JOptionPane.showMessageDialog(this, "Player X win", TicTacToe, JOptionPane.INFORMATION_MESSAGE);
         xCount++;
         gameScore();
         txtbtn2.setBackground(Color.orange);   
         txtbtn5.setBackground(Color.orange);
         txtbtn8.setBackground(Color.orange);
                 }
         if(b3  ==  ("X")  &&   b6  == ("X")  &&  b9 ==  ("X")){
         JOptionPane.showMessageDialog(this, "Player X win", TicTacToe, JOptionPane.INFORMATION_MESSAGE);
         xCount++;
         gameScore();
         txtbtn3.setBackground(Color.orange);
         txtbtn6.setBackground(Color.orange);
         txtbtn9.setBackground(Color.orange);
                 }
          if(b1  ==  ("X")  &&   b5  == ("X")  &&  b9 ==  ("X")){
         JOptionPane.showMessageDialog(this, "Player X win", TicTacToe, JOptionPane.INFORMATION_MESSAGE);
         xCount++;
         gameScore();
         txtbtn1.setBackground(Color.orange);
         txtbtn5.setBackground(Color.orange);
         txtbtn9.setBackground(Color.orange);
                 }
          if(b3  ==  ("X")  &&   b5  == ("X")  &&  b7 ==  ("X")){
         JOptionPane.showMessageDialog(this, "Player X win", TicTacToe, JOptionPane.INFORMATION_MESSAGE);
         xCount++;
         gameScore();
         txtbtn3.setBackground(Color.orange);
         txtbtn5.setBackground(Color.orange);
         txtbtn7.setBackground(Color.orange);
                 }
          //PLAYER O CODING
          if(b1  ==  ("O")  &&   b2  == ("O")  &&  b3 ==  ("O")){
         JOptionPane.showMessageDialog(this, "Player O win", TicTacToe, JOptionPane.INFORMATION_MESSAGE);
         oCount++;
         gameScore();
         txtbtn1.setBackground(Color.RED);
         txtbtn2.setBackground(Color.RED);
         txtbtn3.setBackground(Color.RED);
                 }
          if(b4  ==  ("O")  &&   b5  == ("O")  &&  b6 ==  ("O")){
         JOptionPane.showMessageDialog(this, "Player O win", TicTacToe, JOptionPane.INFORMATION_MESSAGE);
         oCount++;
         gameScore();
         txtbtn4.setBackground(Color.RED);
         txtbtn5.setBackground(Color.RED);
         txtbtn6.setBackground(Color.RED);
                 }
            if(b7  ==  ("O")  &&   b8  == ("O")  &&  b9 ==  ("O")){
         JOptionPane.showMessageDialog(this, "Player O win", TicTacToe, JOptionPane.INFORMATION_MESSAGE);
         oCount++;
         gameScore();
         txtbtn7.setBackground(Color.RED);
         txtbtn8.setBackground(Color.RED);
         txtbtn9.setBackground(Color.RED);
                 }
            if(b1  ==  ("O")  &&   b4  == ("O")  &&  b7 ==  ("O")){
         JOptionPane.showMessageDialog(this, "Player O win", TicTacToe, JOptionPane.INFORMATION_MESSAGE);
         oCount++;
         gameScore();
         txtbtn1.setBackground(Color.RED);
         txtbtn4.setBackground(Color.RED);
         txtbtn7.setBackground(Color.RED);
                 }
            if(b2 ==  ("O")  &&   b5  == ("O")  &&  b8 ==  ("O")){
         JOptionPane.showMessageDialog(this, "Player O win", TicTacToe, JOptionPane.INFORMATION_MESSAGE);
         oCount++;
         gameScore();
         txtbtn2.setBackground(Color.RED);
         txtbtn5.setBackground(Color.RED);
         txtbtn8.setBackground(Color.RED);
                 }
            if(b3 ==  ("O")  &&   b6  == ("O")  &&  b9 ==  ("O")){
         JOptionPane.showMessageDialog(this, "Player O win", TicTacToe, JOptionPane.INFORMATION_MESSAGE);
         oCount++;
         gameScore();
         txtbtn3.setBackground(Color.RED);
         txtbtn6.setBackground(Color.RED);
         txtbtn9.setBackground(Color.RED);
                 }
            if(b1 ==  ("O")  &&   b5  == ("O")  &&  b9 ==  ("O")){
         JOptionPane.showMessageDialog(this, "Player O win", TicTacToe, JOptionPane.INFORMATION_MESSAGE);
         oCount++;
         gameScore();
         txtbtn1.setBackground(Color.RED);
         txtbtn5.setBackground(Color.RED);
         txtbtn9.setBackground(Color.RED);
                 }
            if(b3 ==  ("O")  &&   b5  == ("O")  &&  b7 ==  ("O")){
         JOptionPane.showMessageDialog(this, "Player O win", TicTacToe, JOptionPane.INFORMATION_MESSAGE);
         oCount++;
         gameScore();
         txtbtn3.setBackground(Color.RED);
         txtbtn5.setBackground(Color.RED);
         txtbtn7.setBackground(Color.RED);
                 }   
 }
 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtbtn8 = new javax.swing.JButton();
        txtbtn5 = new javax.swing.JButton();
        txtbtn2 = new javax.swing.JButton();
        txtbtn1 = new javax.swing.JButton();
        txtbtn7 = new javax.swing.JButton();
        txtbtn4 = new javax.swing.JButton();
        txtbtn6 = new javax.swing.JButton();
        txtbtn3 = new javax.swing.JButton();
        txtbtn9 = new javax.swing.JButton();
        txtexit = new javax.swing.JButton();
        txtreset = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        playero = new javax.swing.JLabel();
        playerx = new javax.swing.JLabel();
        playerooo = new javax.swing.JLabel();
        playerxxx = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TIC TAC TOE");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 0, 204));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("TIC TAC TOE GAME");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(334, 334, 334)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
        );

        txtbtn8.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtbtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn8ActionPerformed(evt);
            }
        });

        txtbtn5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtbtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn5ActionPerformed(evt);
            }
        });

        txtbtn2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn2ActionPerformed(evt);
            }
        });

        txtbtn1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn1ActionPerformed(evt);
            }
        });

        txtbtn7.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtbtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn7ActionPerformed(evt);
            }
        });

        txtbtn4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtbtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn4ActionPerformed(evt);
            }
        });

        txtbtn6.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtbtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn6ActionPerformed(evt);
            }
        });

        txtbtn3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtbtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn3ActionPerformed(evt);
            }
        });

        txtbtn9.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtbtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn9ActionPerformed(evt);
            }
        });

        txtexit.setBackground(new java.awt.Color(51, 153, 255));
        txtexit.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtexit.setText("EXIT");
        txtexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtexitActionPerformed(evt);
            }
        });

        txtreset.setBackground(new java.awt.Color(255, 102, 51));
        txtreset.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtreset.setText("RESET");
        txtreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtresetActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.gray, java.awt.Color.darkGray));

        playero.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        playero.setText("Player O :");

        playerx.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        playerx.setText("Player X :");

        playerooo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        playerooo.setForeground(new java.awt.Color(51, 153, 255));
        playerooo.setText("xxxxxxxx");

        playerxxx.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        playerxxx.setForeground(new java.awt.Color(51, 153, 255));
        playerxxx.setText("xxxxxxxx");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(playerx)
                    .addComponent(playero))
                .addGap(55, 55, 55)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playerxxx, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playerooo, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(playerxxx)
                    .addComponent(playerx, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(playero)
                    .addComponent(playerooo))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(txtreset, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(txtexit, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(120, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtreset, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtexit, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtexitActionPerformed
        JFrame frame = new JFrame("Exit"); 
        
        if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to Exit", 
                "Tic Tac Toe", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION)
    {  
        System.exit(0);
    }
    }//GEN-LAST:event_txtexitActionPerformed

    private void txtbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn1ActionPerformed

        txtbtn1.setText(startGame);
         if(startGame.equalsIgnoreCase("X"))
          {
                txtbtn1.setForeground(Color.red);
          }
          else{
                   txtbtn1.setForeground(Color.magenta);
        }
         choose_a_Player();
         WinningGame();
    }//GEN-LAST:event_txtbtn1ActionPerformed

    private void txtbtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn4ActionPerformed
        // TODO add your handling code here:
         txtbtn4.setText(startGame);
         if(startGame.equalsIgnoreCase("X"))
          {
                txtbtn4.setForeground(Color.red);
          }
          else{
                   txtbtn4.setForeground(Color.magenta);
        }
         choose_a_Player();
          WinningGame();
    }//GEN-LAST:event_txtbtn4ActionPerformed

    private void txtbtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn9ActionPerformed
        // TODO add your handling code here:
        txtbtn9.setText(startGame);
         if(startGame.equalsIgnoreCase("X"))
          {
                txtbtn9.setForeground(Color.red);
          }
          else{
                   txtbtn9.setForeground(Color.magenta);
        }
         choose_a_Player();
          WinningGame();
    }//GEN-LAST:event_txtbtn9ActionPerformed

    private void txtbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn2ActionPerformed
        // TODO add your handling code here:
        txtbtn2.setText(startGame);
         if(startGame.equalsIgnoreCase("X"))
          {
                txtbtn2.setForeground(Color.red);
          }
          else{
                   txtbtn2.setForeground(Color.magenta);
        }
         choose_a_Player();
          WinningGame();
    }//GEN-LAST:event_txtbtn2ActionPerformed

    private void txtbtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn3ActionPerformed

         txtbtn3.setText(startGame);
         if(startGame.equalsIgnoreCase("X"))
          {
                txtbtn3.setForeground(Color.red);
          }
          else{
                   txtbtn3.setForeground(Color.magenta);
        }
         choose_a_Player();
          WinningGame();
    }//GEN-LAST:event_txtbtn3ActionPerformed

    private void txtbtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn5ActionPerformed
        
        txtbtn5.setText(startGame);
         if(startGame.equalsIgnoreCase("X"))
          {
                txtbtn5.setForeground(Color.red);
          }
          else{
                   txtbtn5.setForeground(Color.magenta);
        }
         choose_a_Player();
          WinningGame();
    }//GEN-LAST:event_txtbtn5ActionPerformed

    private void txtbtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn6ActionPerformed
       
        txtbtn6.setText(startGame);
         if(startGame.equalsIgnoreCase("X"))
          {
                txtbtn6.setForeground(Color.red);
          }
          else{
                   txtbtn6.setForeground(Color.magenta);
        }
         choose_a_Player();
          WinningGame();
    }//GEN-LAST:event_txtbtn6ActionPerformed

    private void txtbtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn7ActionPerformed

        txtbtn7.setText(startGame);
         if(startGame.equalsIgnoreCase("X"))
          {
                txtbtn7.setForeground(Color.red);
          }
          else{
                   txtbtn7.setForeground(Color.magenta);
        }
         choose_a_Player();
          WinningGame();
    }//GEN-LAST:event_txtbtn7ActionPerformed

    private void txtbtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn8ActionPerformed

        txtbtn8.setText(startGame);
         if(startGame.equalsIgnoreCase("X"))
          {
                txtbtn8.setForeground(Color.red);
          }
          else{
                   txtbtn8.setForeground(Color.magenta);
        }
         choose_a_Player();
          WinningGame();
          
    }//GEN-LAST:event_txtbtn8ActionPerformed

    private void txtresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtresetActionPerformed

         txtbtn1.setText(null);
         txtbtn2.setText(null);
          txtbtn3.setText(null);
           txtbtn4.setText(null);
            txtbtn5.setText(null);
             txtbtn6.setText(null);
              txtbtn7.setText(null);
               txtbtn8.setText(null);
                txtbtn9.setText(null);
                
                txtbtn1.setBackground(Color.LIGHT_GRAY);
                txtbtn2.setBackground(Color.LIGHT_GRAY);
                txtbtn3.setBackground(Color.LIGHT_GRAY);
                txtbtn4.setBackground(Color.LIGHT_GRAY);
                txtbtn5.setBackground(Color.LIGHT_GRAY);
                txtbtn6.setBackground(Color.LIGHT_GRAY);
                txtbtn7.setBackground(Color.LIGHT_GRAY);
                txtbtn8.setBackground(Color.LIGHT_GRAY);
                txtbtn9.setBackground(Color.LIGHT_GRAY);
                
    
    }//GEN-LAST:event_txtresetActionPerformed

   
    public static void main(String args[]) {
        
  
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TIC_TAC_TOE().setVisible(true);
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel playero;
    private javax.swing.JLabel playerooo;
    private javax.swing.JLabel playerx;
    private javax.swing.JLabel playerxxx;
    private javax.swing.JButton txtbtn1;
    private javax.swing.JButton txtbtn2;
    private javax.swing.JButton txtbtn3;
    private javax.swing.JButton txtbtn4;
    private javax.swing.JButton txtbtn5;
    private javax.swing.JButton txtbtn6;
    private javax.swing.JButton txtbtn7;
    private javax.swing.JButton txtbtn8;
    private javax.swing.JButton txtbtn9;
    private javax.swing.JButton txtexit;
    private javax.swing.JButton txtreset;
    // End of variables declaration//GEN-END:variables
}
