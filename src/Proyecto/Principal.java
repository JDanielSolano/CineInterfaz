
package Proyecto;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Principal extends javax.swing.JFrame {

//    Inventario inventario = new Inventario();
    static int cont = 0;

    public void leer() { //Este metodo lee los datos del usuario del txt para el ingreso a las carteleras
        if (cont == 0) {
            BufferedReader br = null;
            try {
                String jTextArea1;
                br = new BufferedReader(new FileReader("./basededatos.txt"));
                while ((jTextArea1 = br.readLine()) != null) {
                    String nombre, apellido, email, direccion, tel;
                    int id;
                    nombre = jTextArea1;
                    apellido = br.readLine();
                    email = br.readLine();
                    direccion = br.readLine();
                    id = Integer.parseInt(br.readLine());
                    tel = br.readLine();

                    arbol.inserta(new Persona(nombre, apellido, email, direccion, id, tel));

                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (br != null) {
                        br.close();
                    }
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }
        cont++;
    }
  
    static Arbol arbol = new Arbol();

    public Principal() {
        leer();
        Sala1.pokelista.insertar();
        initComponents();
        setLocationRelativeTo(null);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        registarBtn = new javax.swing.JButton();
        ingresarBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jButton2.setText("Agregar");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(24, 98, 175));

        registarBtn.setBackground(new java.awt.Color(253, 190, 60));
        registarBtn.setToolTipText("");
        registarBtn.setLabel("REGISTRARSE");
        registarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registarBtnActionPerformed(evt);
            }
        });

        ingresarBtn.setBackground(new java.awt.Color(253, 190, 60));
        ingresarBtn.setText("INICIAR SESIÓN");
        ingresarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarBtnActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cartelera e info de la peliculas/logo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ingresarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(registarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(51, 51, 51))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ingresarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
Registrarse registrarse = new Registrarse();
    private void registarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registarBtnActionPerformed
        registrarse.show();
        this.dispose();
    }//GEN-LAST:event_registarBtnActionPerformed
    Ingresar ingresar = new Ingresar();
    private void ingresarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarBtnActionPerformed
        ingresar.show();
        this.dispose();
    }//GEN-LAST:event_ingresarBtnActionPerformed

  
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ingresarBtn;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton registarBtn;
    // End of variables declaration//GEN-END:variables
}
