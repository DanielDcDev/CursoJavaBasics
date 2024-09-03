package exercicios;

public class Triangulos extends javax.swing.JFrame {

    public Triangulos() {
        initComponents();
        painel.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        SliA = new javax.swing.JSlider();
        a = new javax.swing.JLabel();
        SliB = new javax.swing.JSlider();
        b = new javax.swing.JLabel();
        SliC = new javax.swing.JSlider();
        c = new javax.swing.JLabel();
        btnTrian = new javax.swing.JButton();
        painel = new javax.swing.JPanel();
        txtForma = new javax.swing.JLabel();
        txtTipo = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("segmento A");

        jLabel2.setText("Segmento B");

        jLabel3.setText("Segmento C");

        SliA.setMaximum(50);
        SliA.setValue(0);
        SliA.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SliAStateChanged(evt);
            }
        });

        a.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        a.setForeground(new java.awt.Color(51, 102, 255));
        a.setText("0");

        SliB.setMaximum(50);
        SliB.setValue(0);
        SliB.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SliBStateChanged(evt);
            }
        });

        b.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        b.setForeground(new java.awt.Color(51, 102, 255));
        b.setText("0");

        SliC.setMaximum(50);
        SliC.setValue(0);
        SliC.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SliCStateChanged(evt);
            }
        });

        c.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        c.setForeground(new java.awt.Color(51, 102, 255));
        c.setText("0");

        btnTrian.setText("Verificar");
        btnTrian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrianActionPerformed(evt);
            }
        });

        txtForma.setText("Forma ou nao ?");

        txtTipo.setText("Tipo de triangulo");

        javax.swing.GroupLayout painelLayout = new javax.swing.GroupLayout(painel);
        painel.setLayout(painelLayout);
        painelLayout.setHorizontalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelLayout.createSequentialGroup()
                .addContainerGap(110, Short.MAX_VALUE)
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtTipo)
                    .addComponent(txtForma))
                .addGap(122, 122, 122))
        );
        painelLayout.setVerticalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(txtForma)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTipo)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jLabel9.setText("Triangulos");

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SliB, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                            .addComponent(SliC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SliA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b)
                            .addComponent(a)
                            .addComponent(c)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(jLabel9)))
                .addGap(48, 48, 48))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(painel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnTrian)
                        .addGap(143, 143, 143))
                    .addComponent(btnVoltar, javax.swing.GroupLayout.Alignment.TRAILING)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SliA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SliB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SliC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTrian)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(painel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVoltar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        // TODO add your handling code here:
        Catalogo cat = new Catalogo();
        this.dispose();
        cat.setVisible(true);
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void SliAStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SliAStateChanged
        a.setText(Integer.toString(SliA.getValue()));
    }//GEN-LAST:event_SliAStateChanged
    private void SliBStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SliBStateChanged
        b.setText(Integer.toString(SliB.getValue()));
    }//GEN-LAST:event_SliBStateChanged
    private void SliCStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SliCStateChanged
        c.setText(Integer.toString(SliC.getValue()));
    }//GEN-LAST:event_SliCStateChanged

    private void btnTrianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrianActionPerformed
        
        int n1,n2,n3;
        n1 = SliA.getValue();
        n2 = SliB.getValue();
        n3 = SliC.getValue();
        
        
        if(n1<n2+n3&& n3<n1+n2){
            txtForma.setText("Forma um triangulo!");
            if (n1==n2 && n2==n3){
            txtTipo.setText("Equilatero");
            }else if(n1!=n2 && n2!=n3 && n1!=n3){
                txtTipo.setText("Escaleno");
            }else{
                txtTipo.setText("Isosceles");
            }
        }else {
            txtForma.setText("Nao forma um triangulo!");
            txtTipo.setText ("---");
        }       
        painel.setVisible(true);
    }//GEN-LAST:event_btnTrianActionPerformed

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
            java.util.logging.Logger.getLogger(Triangulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Triangulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Triangulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Triangulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Triangulos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSlider SliA;
    private javax.swing.JSlider SliB;
    private javax.swing.JSlider SliC;
    private javax.swing.JLabel a;
    private javax.swing.JLabel b;
    private javax.swing.JButton btnTrian;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel c;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel painel;
    private javax.swing.JLabel txtForma;
    private javax.swing.JLabel txtTipo;
    // End of variables declaration//GEN-END:variables
}
