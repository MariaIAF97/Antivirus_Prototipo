/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototipoantivirus;

/**
 *
 * @author Sergio Rodriguez
 */
public class Interfaz extends javax.swing.JFrame {

    /**
     * Creates new form Interfaz
     */
    public Interfaz() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sergio Rodriguez\\Documents\\Semestre 6\\Teoria de la computacion\\ensayo.png")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 11, 70, 97);

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel2.setText("Catch Defender");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(226, 11, 367, 85);

        jButton1.setBackground(new java.awt.Color(255, 153, 255));
        jButton1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jButton1.setText("Seleccionar Archivo");
        jButton1.setName("btnSeleccionar"); // NOI18N
        getContentPane().add(jButton1);
        jButton1.setBounds(10, 122, 180, 27);

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel3.setText("Contenido del Archivo");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(226, 126, 160, 19);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(218, 157, 164, 165);

        jButton2.setBackground(new java.awt.Color(255, 102, 255));
        jButton2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jButton2.setText("Analizar Archivo");
        jButton2.setName("btnAnalizar"); // NOI18N
        getContentPane().add(jButton2);
        jButton2.setBounds(228, 345, 141, 27);

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel4.setText("Resultados del Análisis");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(440, 126, 151, 19);

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel5.setText("¿Virus?");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(427, 166, 46, 19);

        jTextField2.setName("txtVirus"); // NOI18N
        getContentPane().add(jTextField2);
        jTextField2.setBounds(520, 170, 93, 20);

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel6.setText("Cantidad");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(427, 206, 70, 19);

        jTextField3.setName("txtCantidad"); // NOI18N
        getContentPane().add(jTextField3);
        jTextField3.setBounds(520, 210, 93, 20);

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel7.setText("Tipo Virus");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(454, 246, 61, 19);

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel8.setText("¿Usama?");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(427, 282, 70, 19);

        jTextField4.setName("txtUsama"); // NOI18N
        getContentPane().add(jTextField4);
        jTextField4.setBounds(520, 280, 93, 20);

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel9.setText("¿Amtrax?");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(427, 328, 64, 19);

        jTextField5.setName("txtAmtrax"); // NOI18N
        getContentPane().add(jTextField5);
        jTextField5.setBounds(520, 330, 93, 20);

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel10.setText("¿éBola?");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(427, 369, 60, 19);

        jTextField6.setName("txtEbola"); // NOI18N
        getContentPane().add(jTextField6);
        jTextField6.setBounds(520, 370, 93, 20);

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sergio Rodriguez\\Documents\\Semestre 6\\Teoria de la computacion\\fondo de creta extra fino.jpg")); // NOI18N
        getContentPane().add(jLabel11);
        jLabel11.setBounds(0, 0, 630, 110);

        jLabel12.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sergio Rodriguez\\Documents\\Semestre 6\\Teoria de la computacion\\fondo-abstracto-azul_1048-1511.jpg")); // NOI18N
        getContentPane().add(jLabel12);
        jLabel12.setBounds(0, 110, 626, 320);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
