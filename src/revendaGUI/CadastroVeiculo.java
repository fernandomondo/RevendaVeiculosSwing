/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revendaGUI;

import javax.swing.ComboBoxModel;
import javax.swing.JFrame;
import revendaDAO.veiculoDAO;
import revendaModel.Carro;
import revendaModel.Marca;
import revendaModel.Modelo;
import revendaModel.Moto;
import revendaModel.Veiculo;

/**
 *
 * @author Faculdade
 */
public class CadastroVeiculo extends javax.swing.JFrame {
    private final JFrame pai;

    /**
     * Creates new form CadastroVeiculo
     */
    public CadastroVeiculo(JFrame pai) {
        this.pai = pai;
        initComponents();        
        pnlMoto.setVisible(false);
        
        revendaDAO.MarcaDAO marcaDAO = new revendaDAO.MarcaDAO();
        cmbMarca.removeAllItems();
        
        for (Marca m : marcaDAO.retornarTodas()) {
            cmbMarca.addItem(m);
        }
        
        revendaDAO.ModeloDAO modeloDAO = new revendaDAO.ModeloDAO();
        cmbModelo.removeAllItems();
        
        for(Modelo m : modeloDAO.retornarTodos()){
            cmbModelo.addItem(m);
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cmbMarca = new javax.swing.JComboBox();
        cmbModelo = new javax.swing.JComboBox();
        rbCarro = new javax.swing.JRadioButton();
        rbMoto = new javax.swing.JRadioButton();
        txtAno = new javax.swing.JFormattedTextField();
        txtPreco = new javax.swing.JFormattedTextField();
        ckbDisponivel = new javax.swing.JCheckBox();
        pnlMoto = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cmbCilindradas = new javax.swing.JComboBox();
        txtEstilo = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        pnlCarro = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cmbNumPortas = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtOpcionais = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jLabel1.setText("Marca:");

        jLabel2.setText("Modelo:");

        jLabel3.setText("Tipo:");

        jLabel4.setText("Preço:");

        jLabel5.setText("Ano:");

        cmbMarca.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cmbModelo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        buttonGroup1.add(rbCarro);
        rbCarro.setSelected(true);
        rbCarro.setText("Carro");
        rbCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbCarroActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbMoto);
        rbMoto.setText("Moto");
        rbMoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbMotoActionPerformed(evt);
            }
        });

        ckbDisponivel.setText("Disponível");

        pnlMoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel6.setText("Cilindradas");

        jLabel7.setText("Estilo");

        cmbCilindradas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "125", "250", "500" }));

        javax.swing.GroupLayout pnlMotoLayout = new javax.swing.GroupLayout(pnlMoto);
        pnlMoto.setLayout(pnlMotoLayout);
        pnlMotoLayout.setHorizontalGroup(
            pnlMotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMotoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlMotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlMotoLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbCilindradas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(207, Short.MAX_VALUE))
                    .addGroup(pnlMotoLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtEstilo, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(105, 105, 105))))
        );
        pnlMotoLayout.setVerticalGroup(
            pnlMotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMotoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlMotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cmbCilindradas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlMotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(txtEstilo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        pnlCarro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel8.setText("Número de portas:");

        jLabel9.setText("Opcionais:");

        cmbNumPortas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2 Portas", "4 Portas" }));

        txtOpcionais.setColumns(20);
        txtOpcionais.setRows(5);
        jScrollPane2.setViewportView(txtOpcionais);

        javax.swing.GroupLayout pnlCarroLayout = new javax.swing.GroupLayout(pnlCarro);
        pnlCarro.setLayout(pnlCarroLayout);
        pnlCarroLayout.setHorizontalGroup(
            pnlCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCarroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbNumPortas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlCarroLayout.setVerticalGroup(
            pnlCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCarroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cmbNumPortas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbCarro)
                        .addGap(18, 18, 18)
                        .addComponent(rbMoto))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(cmbMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ckbDisponivel)
                            .addComponent(txtAno, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(80, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnSalvar)
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(pnlMoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(77, 77, 77)
                    .addComponent(pnlCarro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(48, 48, 48)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(rbCarro)
                    .addComponent(rbMoto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 125, Short.MAX_VALUE)
                .addComponent(pnlMoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmbMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(cmbModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(ckbDisponivel)
                .addGap(14, 14, 14)
                .addComponent(btnSalvar)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(56, 56, 56)
                    .addComponent(pnlCarro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(271, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed

        
        //VeiculoControle v = new VeiculoControle();
       // v.cadastrarVeiculo((int) cmbNumPortas.getSelectedItem(),txtOpcionais.getText() )
       
        Veiculo veiculo;

        if (rbCarro.isSelected()) {
            Carro c1 = new Carro();
            veiculo = c1;
            c1.setNumPortas((int) cmbNumPortas.getSelectedItem());
            c1.setOpcionais(txtOpcionais.getText());
            veiculo.setTipo(1);
        } else {
            Moto m1 = new Moto();
            veiculo = m1;
            m1.setCilindradas((int) cmbCilindradas.getSelectedItem());
            m1.setEstilo(txtEstilo.getText());
            veiculo.setTipo(2);
        }
        
        veiculo.setMarca((Marca)cmbMarca.getSelectedItem());
        veiculo.setModelo((Modelo)cmbModelo.getSelectedItem());
        veiculo.setPreco(Float.parseFloat(txtPreco.getText()));
        veiculo.setAno(Integer.parseInt(txtAno.getText()));
        veiculo.setDisponivel(ckbDisponivel.isSelected());
        
        veiculoDAO.salvar(veiculo);  

    }//GEN-LAST:event_btnSalvarActionPerformed

    private void rbCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbCarroActionPerformed
       pnlMoto.setVisible(false);
       pnlCarro.setVisible(true);
    }//GEN-LAST:event_rbCarroActionPerformed

    private void rbMotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbMotoActionPerformed
       pnlCarro.setVisible(false);
       pnlMoto.setVisible(true);
    }//GEN-LAST:event_rbMotoActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
       pai.setEnabled(true);
       pai.requestFocus();
    }//GEN-LAST:event_formWindowClosed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox ckbDisponivel;
    private javax.swing.JComboBox cmbCilindradas;
    private javax.swing.JComboBox cmbMarca;
    private javax.swing.JComboBox cmbModelo;
    private javax.swing.JComboBox cmbNumPortas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel pnlCarro;
    private javax.swing.JPanel pnlMoto;
    private javax.swing.JRadioButton rbCarro;
    private javax.swing.JRadioButton rbMoto;
    private javax.swing.JFormattedTextField txtAno;
    private javax.swing.JTextField txtEstilo;
    private javax.swing.JTextArea txtOpcionais;
    private javax.swing.JFormattedTextField txtPreco;
    // End of variables declaration//GEN-END:variables
}