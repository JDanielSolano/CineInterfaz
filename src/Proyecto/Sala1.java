package Proyecto;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

public class Sala1 extends javax.swing.JFrame {

    int posiciones[] = new int[4]; //cantidad de asientos permitididos
    int cont = 0;   
    int total = 0; //total de precio entradas

    public Sala1() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        asiento1 = new javax.swing.JButton();
        asiento4 = new javax.swing.JButton();
        asiento2 = new javax.swing.JButton();
        asiento3 = new javax.swing.JButton();
        asiento8 = new javax.swing.JButton();
        asiento7 = new javax.swing.JButton();
        asiento6 = new javax.swing.JButton();
        asiento5 = new javax.swing.JButton();
        asiento12 = new javax.swing.JButton();
        asiento11 = new javax.swing.JButton();
        asiento10 = new javax.swing.JButton();
        asiento9 = new javax.swing.JButton();
        asiento20 = new javax.swing.JButton();
        asiento19 = new javax.swing.JButton();
        asiento18 = new javax.swing.JButton();
        asiento17 = new javax.swing.JButton();
        asiento13 = new javax.swing.JButton();
        asiento14 = new javax.swing.JButton();
        asiento16 = new javax.swing.JButton();
        asiento15 = new javax.swing.JButton();
        asiento21 = new javax.swing.JButton();
        asiento22 = new javax.swing.JButton();
        asiento24 = new javax.swing.JButton();
        asiento23 = new javax.swing.JButton();
        atras = new javax.swing.JButton();
        pagar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cartelera e info de la peliculas/SeatScreen2.png"))); // NOI18N

        asiento1.setForeground(new java.awt.Color(240, 240, 240));
        asiento1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cartelera e info de la peliculas/gris.png"))); // NOI18N
        asiento1.setBorder(null);
        asiento1.setBorderPainted(false);
        asiento1.setContentAreaFilled(false);
        asiento1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asiento1ActionPerformed(evt);
            }
        });

        asiento4.setForeground(new java.awt.Color(240, 240, 240));
        asiento4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cartelera e info de la peliculas/gris.png"))); // NOI18N
        asiento4.setBorder(null);
        asiento4.setBorderPainted(false);
        asiento4.setContentAreaFilled(false);
        asiento4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asiento4ActionPerformed(evt);
            }
        });

        asiento2.setForeground(new java.awt.Color(240, 240, 240));
        asiento2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cartelera e info de la peliculas/gris.png"))); // NOI18N
        asiento2.setBorder(null);
        asiento2.setBorderPainted(false);
        asiento2.setContentAreaFilled(false);
        asiento2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asiento2ActionPerformed(evt);
            }
        });

        asiento3.setForeground(new java.awt.Color(240, 240, 240));
        asiento3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cartelera e info de la peliculas/gris.png"))); // NOI18N
        asiento3.setBorder(null);
        asiento3.setBorderPainted(false);
        asiento3.setContentAreaFilled(false);
        asiento3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asiento3ActionPerformed(evt);
            }
        });

        asiento8.setForeground(new java.awt.Color(240, 240, 240));
        asiento8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cartelera e info de la peliculas/gris.png"))); // NOI18N
        asiento8.setBorder(null);
        asiento8.setBorderPainted(false);
        asiento8.setContentAreaFilled(false);
        asiento8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asiento8ActionPerformed(evt);
            }
        });

        asiento7.setForeground(new java.awt.Color(240, 240, 240));
        asiento7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cartelera e info de la peliculas/gris.png"))); // NOI18N
        asiento7.setBorder(null);
        asiento7.setBorderPainted(false);
        asiento7.setContentAreaFilled(false);
        asiento7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asiento7ActionPerformed(evt);
            }
        });

        asiento6.setForeground(new java.awt.Color(240, 240, 240));
        asiento6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cartelera e info de la peliculas/gris.png"))); // NOI18N
        asiento6.setBorder(null);
        asiento6.setBorderPainted(false);
        asiento6.setContentAreaFilled(false);
        asiento6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asiento6ActionPerformed(evt);
            }
        });

        asiento5.setForeground(new java.awt.Color(240, 240, 240));
        asiento5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cartelera e info de la peliculas/gris.png"))); // NOI18N
        asiento5.setBorder(null);
        asiento5.setBorderPainted(false);
        asiento5.setContentAreaFilled(false);
        asiento5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asiento5ActionPerformed(evt);
            }
        });

        asiento12.setForeground(new java.awt.Color(240, 240, 240));
        asiento12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cartelera e info de la peliculas/gris.png"))); // NOI18N
        asiento12.setBorder(null);
        asiento12.setBorderPainted(false);
        asiento12.setContentAreaFilled(false);
        asiento12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asiento12ActionPerformed(evt);
            }
        });

        asiento11.setForeground(new java.awt.Color(240, 240, 240));
        asiento11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cartelera e info de la peliculas/gris.png"))); // NOI18N
        asiento11.setBorder(null);
        asiento11.setBorderPainted(false);
        asiento11.setContentAreaFilled(false);
        asiento11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asiento11ActionPerformed(evt);
            }
        });

        asiento10.setForeground(new java.awt.Color(240, 240, 240));
        asiento10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cartelera e info de la peliculas/gris.png"))); // NOI18N
        asiento10.setBorder(null);
        asiento10.setBorderPainted(false);
        asiento10.setContentAreaFilled(false);
        asiento10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asiento10ActionPerformed(evt);
            }
        });

        asiento9.setForeground(new java.awt.Color(240, 240, 240));
        asiento9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cartelera e info de la peliculas/gris.png"))); // NOI18N
        asiento9.setBorder(null);
        asiento9.setBorderPainted(false);
        asiento9.setContentAreaFilled(false);
        asiento9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asiento9ActionPerformed(evt);
            }
        });

        asiento20.setForeground(new java.awt.Color(240, 240, 240));
        asiento20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cartelera e info de la peliculas/azul.png"))); // NOI18N
        asiento20.setBorder(null);
        asiento20.setBorderPainted(false);
        asiento20.setContentAreaFilled(false);
        asiento20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asiento20ActionPerformed(evt);
            }
        });

        asiento19.setForeground(new java.awt.Color(240, 240, 240));
        asiento19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cartelera e info de la peliculas/gris.png"))); // NOI18N
        asiento19.setBorder(null);
        asiento19.setBorderPainted(false);
        asiento19.setContentAreaFilled(false);
        asiento19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asiento19ActionPerformed(evt);
            }
        });

        asiento18.setForeground(new java.awt.Color(240, 240, 240));
        asiento18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cartelera e info de la peliculas/gris.png"))); // NOI18N
        asiento18.setBorder(null);
        asiento18.setBorderPainted(false);
        asiento18.setContentAreaFilled(false);
        asiento18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asiento18ActionPerformed(evt);
            }
        });

        asiento17.setForeground(new java.awt.Color(240, 240, 240));
        asiento17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cartelera e info de la peliculas/gris.png"))); // NOI18N
        asiento17.setBorder(null);
        asiento17.setBorderPainted(false);
        asiento17.setContentAreaFilled(false);
        asiento17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asiento17ActionPerformed(evt);
            }
        });

        asiento13.setForeground(new java.awt.Color(240, 240, 240));
        asiento13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cartelera e info de la peliculas/gris.png"))); // NOI18N
        asiento13.setBorder(null);
        asiento13.setBorderPainted(false);
        asiento13.setContentAreaFilled(false);
        asiento13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asiento13ActionPerformed(evt);
            }
        });

        asiento14.setForeground(new java.awt.Color(240, 240, 240));
        asiento14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cartelera e info de la peliculas/gris.png"))); // NOI18N
        asiento14.setBorder(null);
        asiento14.setBorderPainted(false);
        asiento14.setContentAreaFilled(false);
        asiento14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asiento14ActionPerformed(evt);
            }
        });

        asiento16.setForeground(new java.awt.Color(240, 240, 240));
        asiento16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cartelera e info de la peliculas/gris.png"))); // NOI18N
        asiento16.setBorder(null);
        asiento16.setBorderPainted(false);
        asiento16.setContentAreaFilled(false);
        asiento16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asiento16ActionPerformed(evt);
            }
        });

        asiento15.setForeground(new java.awt.Color(240, 240, 240));
        asiento15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cartelera e info de la peliculas/gris.png"))); // NOI18N
        asiento15.setBorder(null);
        asiento15.setBorderPainted(false);
        asiento15.setContentAreaFilled(false);
        asiento15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asiento15ActionPerformed(evt);
            }
        });

        asiento21.setForeground(new java.awt.Color(240, 240, 240));
        asiento21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cartelera e info de la peliculas/azul.png"))); // NOI18N
        asiento21.setBorder(null);
        asiento21.setBorderPainted(false);
        asiento21.setContentAreaFilled(false);
        asiento21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asiento21ActionPerformed(evt);
            }
        });

        asiento22.setForeground(new java.awt.Color(240, 240, 240));
        asiento22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cartelera e info de la peliculas/gris.png"))); // NOI18N
        asiento22.setBorder(null);
        asiento22.setBorderPainted(false);
        asiento22.setContentAreaFilled(false);
        asiento22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asiento22ActionPerformed(evt);
            }
        });

        asiento24.setForeground(new java.awt.Color(240, 240, 240));
        asiento24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cartelera e info de la peliculas/gris.png"))); // NOI18N
        asiento24.setBorder(null);
        asiento24.setBorderPainted(false);
        asiento24.setContentAreaFilled(false);
        asiento24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asiento24ActionPerformed(evt);
            }
        });

        asiento23.setForeground(new java.awt.Color(240, 240, 240));
        asiento23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cartelera e info de la peliculas/gris.png"))); // NOI18N
        asiento23.setBorder(null);
        asiento23.setBorderPainted(false);
        asiento23.setContentAreaFilled(false);
        asiento23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asiento23ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(asiento9, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(asiento10, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(asiento11, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(asiento12, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(asiento2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(asiento3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(asiento4, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(94, 94, 94)
                                        .addComponent(asiento5, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(asiento6, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(asiento7, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(asiento8, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(asiento13, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(asiento14, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(asiento15, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(asiento16, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(asiento17, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(asiento18, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(asiento19, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(asiento20, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(asiento21, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(asiento22, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(asiento23, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(asiento24, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(asiento1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(697, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(asiento5, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(asiento2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(asiento4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(asiento3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(asiento6, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(asiento7, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(asiento8, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(asiento15, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(asiento16, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(asiento14, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(asiento13, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(asiento9, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(asiento10, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(asiento11, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(asiento12, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(asiento17, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(asiento18, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(asiento19, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(asiento20, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(asiento21, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(asiento22, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(asiento23, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(asiento24, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 12, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(117, 117, 117)
                    .addComponent(asiento1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(200, Short.MAX_VALUE)))
        );

        atras.setBackground(new java.awt.Color(253, 190, 60));
        atras.setText("Atrás");
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });

        pagar.setBackground(new java.awt.Color(24, 98, 175));
        pagar.setForeground(new java.awt.Color(255, 255, 255));
        pagar.setText("Pagar");
        pagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pagarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(atras)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pagar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(atras)
                    .addComponent(pagar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    static Listas pokelista = new Listas(); //Crea objeto para los asientos de la sala.

    public void validar(Listas pokelista) { //Este metodo sirve para validar los asientos ocupados de cada sala
        posiciones[0] = 0;
        posiciones[1] = 0;
        posiciones[2] = 0;
        posiciones[3] = 0;
        this.pokelista = pokelista;

        if (!pokelista.existe(1)) { //Llama el metodo que valida la existencia de los asientos. Si el asiento existe lo marca en rojo.
            asiento1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cartelera e info de la peliculas/rojo.png")));
        }
        if (!pokelista.existe(2)) {
            asiento2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cartelera e info de la peliculas/rojo.png")));
        }
        if (!pokelista.existe(3)) {
            asiento3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cartelera e info de la peliculas/rojo.png")));
        }
        if (!pokelista.existe(4)) {
            asiento4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cartelera e info de la peliculas/rojo.png")));
        }
        if (!pokelista.existe(5)) {
            asiento5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cartelera e info de la peliculas/rojo.png")));
        }
        if (!pokelista.existe(6)) {
            asiento6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cartelera e info de la peliculas/rojo.png")));
        }
        if (!pokelista.existe(7)) {
            asiento7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cartelera e info de la peliculas/rojo.png")));
        }
        if (!pokelista.existe(8)) {
            asiento9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cartelera e info de la peliculas/rojo.png")));
        }
        if (!pokelista.existe(10)) {
            asiento10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cartelera e info de la peliculas/rojo.png")));
        }
        if (!pokelista.existe(11)) {
            asiento11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cartelera e info de la peliculas/rojo.png")));
        }
        if (!pokelista.existe(12)) {
            asiento12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cartelera e info de la peliculas/rojo.png")));
        }
        if (!pokelista.existe(13)) {
            asiento13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cartelera e info de la peliculas/rojo.png")));
        }
        if (!pokelista.existe(14)) {
            asiento14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cartelera e info de la peliculas/rojo.png")));
        }
        if (!pokelista.existe(15)) {
            asiento15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cartelera e info de la peliculas/rojo.png")));
        }
        if (!pokelista.existe(16)) {
            asiento16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cartelera e info de la peliculas/rojo.png")));
        }
        if (!pokelista.existe(17)) {
            asiento17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cartelera e info de la peliculas/rojo.png")));
        }
        if (!pokelista.existe(18)) {
            asiento18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cartelera e info de la peliculas/rojo.png")));
        }
        if (!pokelista.existe(19)) {
            asiento19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cartelera e info de la peliculas/rojo.png")));
        }
        if (!pokelista.existe(20)) {
            asiento20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cartelera e info de la peliculas/rojo.png")));
        }
        if (!pokelista.existe(20)) {
            asiento20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cartelera e info de la peliculas/rojo.png")));
        }
        if (!pokelista.existe(21)) {
            asiento21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cartelera e info de la peliculas/rojo.png")));
        }
        if (!pokelista.existe(22)) {
            asiento22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cartelera e info de la peliculas/rojo.png")));
        }
        if (!pokelista.existe(23)) {
            asiento23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cartelera e info de la peliculas/rojo.png")));
        }
        if (!pokelista.existe(24)) {
            asiento24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cartelera e info de la peliculas/rojo.png")));
        }
    }


    private void asiento1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asiento1ActionPerformed
        try {
            if (pokelista.existe(1)) { //Este metodo sirve para seleccionar un asiento o liberar un asiento
                if (cont < 4) { //Permite que el usuario solo pueda seleccionar 4 asientos.
                    posiciones[cont] = 1;
                    cont++;
                    total = total + 2300; //Se cobra el monto de la entrada al usuario
                    asiento1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cartelera e info de la peliculas/verde.png"))); //Al seleccionar el asiento se pone en verde
                    pokelista.cambiar(1); //Llama el metodo que pone el estado del asiento como ocupado
                } else {
                    JOptionPane.showMessageDialog(null, "No puede seleccionar mas de 4 asientos");
                }
            } else { //Esta parte es utilizada en caso de que el usuario deseleccione un asiento
                cont--;
                posiciones[cont] = 0;
                total = total - 2300; //Resta el monto del asiento deseleccionado
                asiento1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cartelera e info de la peliculas/gris.png"))); //Pone el asiento en gris al deseleccionarlo
                pokelista.cambiarv(1); //Llama el metodo que pone el estado del asiento como desocupado
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Lo sentimos, este asiento esta ocupado");
        }
    }//GEN-LAST:event_asiento1ActionPerformed

    private void asiento4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asiento4ActionPerformed
        try {
            if (pokelista.existe(4)) {
                if (cont < 4) {
                    posiciones[cont] = 4;
                    cont++;
                    total = total + 2300;
                    asiento4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cartelera e info de la peliculas/verde.png")));
                    pokelista.cambiar(4);
                } else {
                    JOptionPane.showMessageDialog(null, "No puede seleccionar mas de 4 asientos");
                }
            } else {
                cont--;
                posiciones[cont] = 0;
                total = total - 2300;
                asiento4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cartelera e info de la peliculas/gris.png")));
                pokelista.cambiarv(4);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Lo sentimos, este asiento esta ocupado");
        }
    }//GEN-LAST:event_asiento4ActionPerformed

    private void asiento2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asiento2ActionPerformed
        try {
            if (pokelista.existe(2)) {
                if (cont < 4) {
                    posiciones[cont] = 2;
                    cont++;
                    total = total + 2300;
                    asiento2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cartelera e info de la peliculas/verde.png")));
                    pokelista.cambiar(2);
                } else {
                    JOptionPane.showMessageDialog(null, "No puede seleccionar mas de 4 asientos");
                }
            } else {
                cont--;
                posiciones[cont] = 0;
                total = total - 2300;
                asiento2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cartelera e info de la peliculas/gris.png")));
                pokelista.cambiarv(2);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Lo sentimos, este asiento esta ocupado");
        }

    }//GEN-LAST:event_asiento2ActionPerformed

    private void asiento3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asiento3ActionPerformed
        try {
            if (pokelista.existe(3)) {
                if (cont < 4) {
                    posiciones[cont] = 3;
                    cont++;
                    total = total + 2300;
                    asiento3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cartelera e info de la peliculas/verde.png")));
                    pokelista.cambiar(3);
                } else {
                    JOptionPane.showMessageDialog(null, "No puede seleccionar mas de 4 asientos");
                }
            } else {
                cont--;
                posiciones[cont] = 0;
                asiento3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cartelera e info de la peliculas/gris.png")));
                pokelista.cambiarv(3);
                total = total - 2300;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Lo sentimos, este asiento esta ocupado");
        }
    }//GEN-LAST:event_asiento3ActionPerformed

    private void asiento8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asiento8ActionPerformed
        try {
            if (pokelista.existe(8)) {
                if (cont < 4) {
                    posiciones[cont] = 8;
                    cont++;
                    total = total + 2300;
                    asiento8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cartelera e info de la peliculas/verde.png")));
                    pokelista.cambiar(8);
                } else {
                    JOptionPane.showMessageDialog(null, "No puede seleccionar mas de 4 asientos");
                }
            } else {
                cont--;
                posiciones[cont] = 0;
                total = total - 2300;
                asiento8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cartelera e info de la peliculas/gris.png")));
                pokelista.cambiarv(8);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Lo sentimos, este asiento esta ocupado");
        }
    }//GEN-LAST:event_asiento8ActionPerformed

    private void asiento7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asiento7ActionPerformed
        try {
            if (pokelista.existe(7)) {
                if (cont < 4) {
                    posiciones[cont] = 7;
                    cont++;
                    total = total + 2300;
                    asiento7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cartelera e info de la peliculas/verde.png")));
                    pokelista.cambiar(7);
                } else {
                    JOptionPane.showMessageDialog(null, "No puede seleccionar mas de 4 asientos");
                }
            } else {
                cont--;
                posiciones[cont] = 0;
                total = total - 2300;
                asiento7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cartelera e info de la peliculas/gris.png")));
                pokelista.cambiarv(7);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Lo sentimos, este asiento esta ocupado");
        }
    }//GEN-LAST:event_asiento7ActionPerformed

    private void asiento6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asiento6ActionPerformed
        try {
            if (pokelista.existe(6)) {
                if (cont < 4) {
                    posiciones[cont] = 6;
                    cont++;
                    total = total + 2300;
                    asiento6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cartelera e info de la peliculas/verde.png")));
                    pokelista.cambiar(6);
                } else {
                    JOptionPane.showMessageDialog(null, "No puede seleccionar mas de 4 asientos");
                }
            } else {
                cont--;
                posiciones[cont] = 0;
                total = total - 2300;
                asiento6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cartelera e info de la peliculas/gris.png")));
                pokelista.cambiarv(6);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Lo sentimos, este asiento esta ocupado");
        }
    }//GEN-LAST:event_asiento6ActionPerformed

    private void asiento5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asiento5ActionPerformed
        try {
            if (pokelista.existe(5)) {
                if (cont < 4) {
                    posiciones[cont] = 5;
                    cont++;
                    total = total + 2300;
                    asiento5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cartelera e info de la peliculas/verde.png")));
                    pokelista.cambiar(5);
                } else {
                    JOptionPane.showMessageDialog(null, "No puede seleccionar mas de 4 asientos");
                }
            } else {
                cont--;
                posiciones[cont] = 0;
                total = total - 2300;
                asiento5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cartelera e info de la peliculas/gris.png")));
                pokelista.cambiarv(5);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Lo sentimos, este asiento esta ocupado");
        }
    }//GEN-LAST:event_asiento5ActionPerformed

    private void asiento12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asiento12ActionPerformed
        try {
            if (pokelista.existe(12)) {
                if (cont < 4) {
                    posiciones[cont] = 12;
                    cont++;
                    total = total + 2300;
                    asiento12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cartelera e info de la peliculas/verde.png")));
                    pokelista.cambiar(12);
                } else {
                    JOptionPane.showMessageDialog(null, "No puede seleccionar mas de 4 asientos");
                }
            } else {
                cont--;
                posiciones[cont] = 0;
                total = total - 2300;
                asiento12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cartelera e info de la peliculas/gris.png")));
                pokelista.cambiarv(12);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Lo sentimos, este asiento esta ocupado");
        }
    }//GEN-LAST:event_asiento12ActionPerformed

    private void asiento11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asiento11ActionPerformed
        try {
            if (pokelista.existe(11)) {
                if (cont < 4) {
                    posiciones[cont] = 11;
                    cont++;
                    total = total + 2300;
                    asiento11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cartelera e info de la peliculas/verde.png")));
                    pokelista.cambiar(11);
                } else {
                    JOptionPane.showMessageDialog(null, "No puede seleccionar mas de 4 asientos");
                }
            } else {
                cont--;
                posiciones[cont] = 0;
                total = total - 2300;
                asiento11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cartelera e info de la peliculas/gris.png")));
                pokelista.cambiarv(11);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Lo sentimos, este asiento esta ocupado");
        }
    }//GEN-LAST:event_asiento11ActionPerformed

    private void asiento10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asiento10ActionPerformed
        try {
            if (pokelista.existe(10)) {
                if (cont < 4) {
                    posiciones[cont] = 10;
                    cont++;
                    total = total + 2300;
                    asiento10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cartelera e info de la peliculas/verde.png")));
                    pokelista.cambiar(10);
                } else {
                    JOptionPane.showMessageDialog(null, "No puede seleccionar mas de 4 asientos");
                }
            } else {
                cont--;
                posiciones[cont] = 0;
                total = total - 2300;
                asiento10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cartelera e info de la peliculas/gris.png")));
                pokelista.cambiarv(10);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Lo sentimos, este asiento esta ocupado");
        }
    }//GEN-LAST:event_asiento10ActionPerformed

    private void asiento9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asiento9ActionPerformed
        try {
            if (pokelista.existe(9)) {
                if (cont < 4) {
                    posiciones[cont] = 9;
                    cont++;
                    total = total + 2300;
                    asiento9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cartelera e info de la peliculas/verde.png")));
                    pokelista.cambiar(9);
                } else {
                    JOptionPane.showMessageDialog(null, "No puede seleccionar mas de 4 asientos");
                }
            } else {
                cont--;
                posiciones[cont] = 0;
                total = total - 2300;
                asiento9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cartelera e info de la peliculas/gris.png")));
                pokelista.cambiarv(9);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Lo sentimos, este asiento esta ocupado");
        }
    }//GEN-LAST:event_asiento9ActionPerformed

    private void asiento20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asiento20ActionPerformed
        try {
            if (pokelista.existe(20)) {
                if (cont < 4) {
                    posiciones[cont] = 20;
                    cont++;
                    total = total + 2300;
                    JOptionPane.showMessageDialog(null, "¡Esta seleccionando un espacio para discapacitados que no tiene asiento!");
                    asiento20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cartelera e info de la peliculas/vd.png")));
                    pokelista.cambiar(20);
                } else {
                    JOptionPane.showMessageDialog(null, "No puede seleccionar mas de 4 asientos");
                }
            } else {
                cont--;
                posiciones[cont] = 0;
                total = total - 2300;
                asiento20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cartelera e info de la peliculas/azul.png")));
                pokelista.cambiarv(20);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Lo sentimos, este asiento esta ocupado");
        }
    }//GEN-LAST:event_asiento20ActionPerformed

    private void asiento19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asiento19ActionPerformed
        try {
            if (pokelista.existe(19)) {
                if (cont < 4) {
                    posiciones[cont] = 19;
                    cont++;
                    total = total + 2300;
                    asiento19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cartelera e info de la peliculas/verde.png")));
                    pokelista.cambiar(19);
                } else {
                    JOptionPane.showMessageDialog(null, "No puede seleccionar mas de 4 asientos");
                }
            } else {
                cont--;
                posiciones[cont] = 0;
                total = total - 2300;
                asiento19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cartelera e info de la peliculas/gris.png")));
                pokelista.cambiarv(19);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Lo sentimos, este asiento esta ocupado");
        }
    }//GEN-LAST:event_asiento19ActionPerformed

    private void asiento18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asiento18ActionPerformed
        try {
            if (pokelista.existe(18)) {
                if (cont < 4) {
                    posiciones[cont] = 18;
                    cont++;
                    total = total + 2300;
                    asiento18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cartelera e info de la peliculas/verde.png")));
                    pokelista.cambiar(18);
                } else {
                    JOptionPane.showMessageDialog(null, "No puede seleccionar mas de 4 asientos");
                }
            } else {
                cont--;
                posiciones[cont] = 0;
                total = total - 2300;
                asiento18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cartelera e info de la peliculas/gris.png")));
                pokelista.cambiarv(18);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Lo sentimos, este asiento esta ocupado");
        }
    }//GEN-LAST:event_asiento18ActionPerformed

    private void asiento17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asiento17ActionPerformed
        try {
            if (pokelista.existe(17)) {
                if (cont < 4) {
                    posiciones[cont] = 17;
                    cont++;
                    total = total + 2300;
                    asiento17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cartelera e info de la peliculas/verde.png")));
                    pokelista.cambiar(17);
                } else {
                    JOptionPane.showMessageDialog(null, "No puede seleccionar mas de 4 asientos");
                }
            } else {
                cont--;
                posiciones[cont] = 0;
                total = total - 2300;
                asiento17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cartelera e info de la peliculas/gris.png")));
                pokelista.cambiarv(17);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Lo sentimos, este asiento esta ocupado");
        }
    }//GEN-LAST:event_asiento17ActionPerformed

    private void asiento13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asiento13ActionPerformed
        try {
            if (pokelista.existe(13)) {
                if (cont < 4) {
                    posiciones[cont] = 13;
                    cont++;
                    total = total + 2300;
                    asiento13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cartelera e info de la peliculas/verde.png")));
                    pokelista.cambiar(13);
                } else {
                    JOptionPane.showMessageDialog(null, "No puede seleccionar mas de 4 asientos");
                }
            } else {
                cont--;
                posiciones[cont] = 0;
                total = total - 2300;
                asiento13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cartelera e info de la peliculas/gris.png")));
                pokelista.cambiarv(13);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Lo sentimos, este asiento esta ocupado");
        }
    }//GEN-LAST:event_asiento13ActionPerformed

    private void asiento14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asiento14ActionPerformed
        try {
            if (pokelista.existe(14)) {
                if (cont < 4) {
                    posiciones[cont] = 14;
                    cont++;
                    total = total + 2300;
                    asiento14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cartelera e info de la peliculas/verde.png")));
                    pokelista.cambiar(14);
                } else {
                    JOptionPane.showMessageDialog(null, "No puede seleccionar mas de 4 asientos");
                }
            } else {
                cont--;
                posiciones[cont] = 0;
                total = total - 2300;
                asiento14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cartelera e info de la peliculas/gris.png")));
                pokelista.cambiarv(14);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Lo sentimos, este asiento esta ocupado");
        }
    }//GEN-LAST:event_asiento14ActionPerformed

    private void asiento16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asiento16ActionPerformed
        try {
            if (pokelista.existe(16)) {
                if (cont < 4) {
                    posiciones[cont] = 16;
                    cont++;
                    total = total + 2300;
                    asiento16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cartelera e info de la peliculas/verde.png")));
                    pokelista.cambiar(16);
                } else {
                    JOptionPane.showMessageDialog(null, "No puede seleccionar mas de 4 asientos");
                }
            } else {
                cont--;
                posiciones[cont] = 0;
                total = total - 2300;
                asiento16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cartelera e info de la peliculas/gris.png")));
                pokelista.cambiarv(16);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Lo sentimos, este asiento esta ocupado");
        }
    }//GEN-LAST:event_asiento16ActionPerformed

    private void asiento15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asiento15ActionPerformed
        try {
            if (pokelista.existe(15)) {
                if (cont < 4) {
                    posiciones[cont] = 15;
                    cont++;
                    total = total + 2300;
                    asiento15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cartelera e info de la peliculas/verde.png")));
                    pokelista.cambiar(15);
                } else {
                    JOptionPane.showMessageDialog(null, "No puede seleccionar mas de 4 asientos");
                }
            } else {
                cont--;
                posiciones[cont] = 0;
                total = total - 2300;
                asiento15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cartelera e info de la peliculas/gris.png")));
                pokelista.cambiarv(15);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Lo sentimos, este asiento esta ocupado");
        }
    }//GEN-LAST:event_asiento15ActionPerformed

    private void asiento21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asiento21ActionPerformed
        try {
            if (pokelista.existe(21)) {
                if (cont < 4) {
                    posiciones[cont] = 21;
                    cont++;
                    total = total + 2300;
                    JOptionPane.showMessageDialog(null, "¡Esta seleccionando un espacio para discapacitados que no tiene asiento!");
                    asiento21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cartelera e info de la peliculas/vd.png")));
                    pokelista.cambiar(21);
                } else {
                    JOptionPane.showMessageDialog(null, "No puede seleccionar mas de 4 asientos");
                }
            } else {
                cont--;
                posiciones[cont] = 0;
                total = total - 2300;
                asiento21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cartelera e info de la peliculas/azul.png")));
                pokelista.cambiarv(21);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Lo sentimos, este asiento esta ocupado");
        }
    }//GEN-LAST:event_asiento21ActionPerformed

    private void asiento22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asiento22ActionPerformed
        try {
            if (pokelista.existe(22)) {
                if (cont < 4) {
                    posiciones[cont] = 22;
                    cont++;
                    total = total + 2300;
                    asiento22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cartelera e info de la peliculas/verde.png")));
                    pokelista.cambiar(22);
                } else {
                    JOptionPane.showMessageDialog(null, "No puede seleccionar mas de 4 asientos");
                }
            } else {
                cont--;
                posiciones[cont] = 0;
                total = total - 2300;
                asiento22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cartelera e info de la peliculas/gris.png")));
                pokelista.cambiarv(22);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Lo sentimos, este asiento esta ocupado");
        }
    }//GEN-LAST:event_asiento22ActionPerformed

    private void asiento24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asiento24ActionPerformed
        try {
            if (pokelista.existe(24)) {
                if (cont < 4) {
                    posiciones[cont] = 24;
                    cont++;
                    total = total + 2300;
                    asiento24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cartelera e info de la peliculas/verde.png")));
                    pokelista.cambiar(24);
                } else {
                    JOptionPane.showMessageDialog(null, "No puede seleccionar mas de 4 asientos");
                }
            } else {
                cont--;
                posiciones[cont] = 0;
                total = total - 2300;
                asiento24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cartelera e info de la peliculas/gris.png")));
                pokelista.cambiarv(24);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Lo sentimos, este asiento esta ocupado");
        }
    }//GEN-LAST:event_asiento24ActionPerformed

    private void asiento23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asiento23ActionPerformed
        try {
            if (pokelista.existe(23)) {
                if (cont < 4) {
                    posiciones[cont] = 23;
                    cont++;
                    total = total + 2300;
                    asiento23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cartelera e info de la peliculas/verde.png"))); //
                    pokelista.cambiar(23);
                } else {
                    JOptionPane.showMessageDialog(null, "No puede seleccionar mas de 4 asientos");
                }
            } else {
                cont--;
                posiciones[cont] = 0;
                total = total - 2300;
                asiento23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cartelera e info de la peliculas/gris.png")));
                pokelista.cambiarv(23);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Lo sentimos, este asiento esta ocupado");
        }
    }//GEN-LAST:event_asiento23ActionPerformed
    Cartelera cartelera = new Cartelera();
    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
        pokelista.cambiarv(posiciones[0]); //Este metodo deselecciona los asientos que allá seleccionado el cliente en caso de que haya decidido salir.
        pokelista.cambiarv(posiciones[1]);
        pokelista.cambiarv(posiciones[2]);
        pokelista.cambiarv(posiciones[3]);
        cartelera.show();
        this.dispose();
    }//GEN-LAST:event_atrasActionPerformed
  
    static Cola cola = new Cola(); //crea objeto de la cola
    
    private void pagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pagarActionPerformed
        if (total != 0) {  //Este metodo le indicara al cliente el total que debe cancelar o en su defecto que no selecciono ningun asiento
            JOptionPane.showMessageDialog(null, "El total a cancelar por las entradas que selecciono es de: ₡" + total);
            cartelera.show();
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "No ha seleccionado asientos");
        }
        if (total > 0) { //encola el monto final de la compra y el nombre del cliente.
            cola.Encola(new NodoCola(Ingresar.nombre, (total / 2300)));
            JOptionPane.showMessageDialog(null, cola);
        }
    }//GEN-LAST:event_pagarActionPerformed
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
            java.util.logging.Logger.getLogger(Sala1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sala1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sala1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sala1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sala1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton asiento1;
    private javax.swing.JButton asiento10;
    private javax.swing.JButton asiento11;
    private javax.swing.JButton asiento12;
    private javax.swing.JButton asiento13;
    private javax.swing.JButton asiento14;
    private javax.swing.JButton asiento15;
    private javax.swing.JButton asiento16;
    private javax.swing.JButton asiento17;
    private javax.swing.JButton asiento18;
    private javax.swing.JButton asiento19;
    private javax.swing.JButton asiento2;
    private javax.swing.JButton asiento20;
    private javax.swing.JButton asiento21;
    private javax.swing.JButton asiento22;
    private javax.swing.JButton asiento23;
    private javax.swing.JButton asiento24;
    private javax.swing.JButton asiento3;
    private javax.swing.JButton asiento4;
    private javax.swing.JButton asiento5;
    private javax.swing.JButton asiento6;
    private javax.swing.JButton asiento7;
    private javax.swing.JButton asiento8;
    private javax.swing.JButton asiento9;
    private javax.swing.JButton atras;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton pagar;
    // End of variables declaration//GEN-END:variables
}
