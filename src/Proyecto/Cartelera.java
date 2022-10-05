
package Proyecto;


public class Cartelera extends javax.swing.JFrame {

  
    public Cartelera() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    
    //Esta clase abre la ventana de la pelicula seleccionada

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        deadBtn = new javax.swing.JButton();
        panteraBtn = new javax.swing.JButton();
        aniquiBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        readyBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        increiblesBtn = new javax.swing.JButton();
        pasajeroBtn = new javax.swing.JButton();
        atrasBtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        deadBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cartelera e info de la peliculas/deadpool.jpg"))); // NOI18N
        deadBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deadBtnActionPerformed(evt);
            }
        });

        panteraBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cartelera e info de la peliculas/black.jpg"))); // NOI18N
        panteraBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panteraBtnActionPerformed(evt);
            }
        });

        aniquiBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cartelera e info de la peliculas/aniquilacion.jpn.jpg"))); // NOI18N
        aniquiBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aniquiBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Stylus BT", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("READY PLAYER ONE");

        jLabel2.setFont(new java.awt.Font("Stylus BT", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("EL PASAJERO");

        jLabel3.setFont(new java.awt.Font("Stylus BT", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ANIQUILACIÓN");

        jLabel4.setFont(new java.awt.Font("Stylus BT", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("PANTERA NEGRA");

        readyBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cartelera e info de la peliculas/ready_1.png"))); // NOI18N
        readyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                readyBtnActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Stylus BT", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("DEADPOOL 2");

        increiblesBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cartelera e info de la peliculas/increibles.png"))); // NOI18N
        increiblesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                increiblesBtnActionPerformed(evt);
            }
        });

        pasajeroBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cartelera e info de la peliculas/pasajero.jpg"))); // NOI18N
        pasajeroBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pasajeroBtnActionPerformed(evt);
            }
        });

        atrasBtn.setBackground(new java.awt.Color(253, 190, 60));
        atrasBtn.setText("Atras");
        atrasBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasBtnActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Stylus BT", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("LOS INCREÍBLES");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 19, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deadBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panteraBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pasajeroBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(readyBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(aniquiBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(increiblesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(atrasBtn)
                .addGap(31, 31, 31))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(atrasBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panteraBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aniquiBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pasajeroBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(deadBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(readyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(increiblesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void increiblesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_increiblesBtnActionPerformed
        Increibles sobrevivir = new Increibles();
        sobrevivir.show();
        this.dispose();
    }//GEN-LAST:event_increiblesBtnActionPerformed

    private void readyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_readyBtnActionPerformed
        PlayerOne eradeHielo = new PlayerOne();
        eradeHielo.show();
        this.dispose();
    }//GEN-LAST:event_readyBtnActionPerformed

    private void panteraBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panteraBtnActionPerformed
        Pantera pan = new Pantera();
        pan.show();
        this.dispose();
    }//GEN-LAST:event_panteraBtnActionPerformed

    private void pasajeroBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pasajeroBtnActionPerformed
        Pasajero pasajero = new Pasajero();
        pasajero.show();
        this.dispose();
    }//GEN-LAST:event_pasajeroBtnActionPerformed

    private void aniquiBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aniquiBtnActionPerformed
        Aniquilacion aniquilacion = new Aniquilacion();
        aniquilacion.show();
        this.dispose();
    }//GEN-LAST:event_aniquiBtnActionPerformed

    private void deadBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deadBtnActionPerformed
        Deadpool cazafantasmas = new Deadpool();
        cazafantasmas.show();
        this.dispose();
    }//GEN-LAST:event_deadBtnActionPerformed

    private void atrasBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasBtnActionPerformed
        Principal principal = new Principal();
        principal.show();
        this.hide();
    }//GEN-LAST:event_atrasBtnActionPerformed

  
    public static void main(String args[]) {
 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cartelera().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aniquiBtn;
    private javax.swing.JButton atrasBtn;
    private javax.swing.JButton deadBtn;
    private javax.swing.JButton increiblesBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton panteraBtn;
    private javax.swing.JButton pasajeroBtn;
    private javax.swing.JButton readyBtn;
    // End of variables declaration//GEN-END:variables
}
