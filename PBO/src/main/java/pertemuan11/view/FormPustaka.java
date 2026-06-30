package pertemuan11.view;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import pertemuan11.controller.PustakaController;

/**
 * @author komputer depan
 * Optimized & Beautified Version
 */
public class FormPustaka extends javax.swing.JFrame {

    private PustakaController controller;

    public FormPustaka() {
        initComponents();
        customStyle(); // Menerapkan kustomisasi warna dan font modern
        
        controller = new PustakaController(this);
        controller.clearView();
        controller.viewData();
        controller.isiCbxBuku();
        controller.isiCbxAnggota();
    }
    
    private void customStyle() {
        // Palet Warna Modern
        Color bgColor = new Color(245, 246, 250);      // Light grey background
        Color primaryColor = new Color(44, 62, 80);    // Dark Slate untuk teks utama/header
        Color accentColor = new Color(52, 152, 219);   // Blue untuk tombol utama
        Color dangerColor = new Color(231, 76, 60);    // Red untuk delete
        Color successColor = new Color(46, 204, 113);  // Green untuk insert
        
        // Background Form
        this.getContentPane().setBackground(bgColor);
        
        // Gaya Header Judul
        jLabel1.setFont(new Font("Segoe UI", Font.BOLD, 26));
        jLabel1.setForeground(primaryColor);
        
        // Gaya Label Input
        Font labelFont = new Font("Segoe UI", Font.BOLD, 13);
        jLabel2.setFont(labelFont); jLabel2.setForeground(primaryColor);
        jLabel3.setFont(labelFont); jLabel3.setForeground(primaryColor);
        jLabel4.setFont(labelFont); jLabel4.setForeground(primaryColor);
        jLabel5.setFont(labelFont); jLabel5.setForeground(primaryColor);
        
        // Gaya Input Field & ComboBox
        Font inputFont = new Font("Segoe UI", Font.PLAIN, 13);
        cbxAnggota.setFont(inputFont);
        cbxBuku.setFont(inputFont);
        txtTglPinjam.setFont(inputFont);
        txtKembali.setFont(inputFont);
        
        // Gaya Tombol-Tombol (Menghapus teks HTML vertikal)
        Font btnFont = new Font("Segoe UI", Font.BOLD, 12);
        
        btnInsert.setText("INSERT");
        btnInsert.setFont(btnFont);
        btnInsert.setBackground(successColor);
        btnInsert.setForeground(Color.BLACK);
        
        btnUpdate.setText("UPDATE");
        btnUpdate.setFont(btnFont);
        btnUpdate.setBackground(accentColor);
        btnUpdate.setForeground(Color.BLACK);
        
        btnDelete.setText("DELETE");
        btnDelete.setFont(btnFont);
        btnDelete.setBackground(dangerColor);
        btnDelete.setForeground(Color.BLACK);
        
        btnCancel.setText("CANCEL");
        btnCancel.setFont(btnFont);
        btnCancel.setBackground(new Color(149, 165, 166));
        btnCancel.setForeground(Color.BLACK);
        
        btnExit.setText("EXIT");
        btnExit.setFont(btnFont);
        btnExit.setBackground(primaryColor);
        btnExit.setForeground(Color.BLACK);
        
        // Gaya Tabel
        tblPustaka.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        tblPustaka.setRowHeight(25);
        tblPustaka.setSelectionBackground(new Color(52, 152, 219, 100));
        
        JTableHeader header = tblPustaka.getTableHeader();
        header.setFont(new Font("Segoe UI", Font.BOLD, 13));
        header.setBackground(primaryColor);
        header.setForeground(Color.BLACK);
    }

    // Getters
    public JButton getBtnCancel() { return btnCancel; }
    public JButton getBtnDelete() { return btnDelete; }
    public JButton getBtnExit() { return btnExit; }
    public JButton getBtnInsert() { return btnInsert; }
    public JButton getBtnUpdate() { return btnUpdate; }
    public JComboBox<String> getCbxAnggota() { return cbxAnggota; }
    public JComboBox<String> getCbxBuku() { return cbxBuku; }
    public JTable getTblPustaka() { return tblPustaka; }
    public JTextField getTxtKembali() { return txtKembali; }
    public JTextField getTxtTglPinjam() { return txtTglPinjam; }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbxAnggota = new javax.swing.JComboBox<>();
        cbxBuku = new javax.swing.JComboBox<>();
        txtTglPinjam = new javax.swing.JTextField();
        txtKembali = new javax.swing.JTextField();
        btnInsert = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPustaka = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistem Informasi Pustaka");

        jLabel1.setText("Form Pustaka");

        jLabel2.setText("Anggota");

        jLabel3.setText("Buku");

        jLabel4.setText("Tanggal Pinjam");

        jLabel5.setText("Tanggal Kembali");

        // Action Listeners
        btnInsert.addActionListener(e -> { controller.insert(); controller.viewData(); controller.clearView(); });
        btnUpdate.addActionListener(e -> { controller.update(); controller.viewData(); controller.clearView(); });
        btnDelete.addActionListener(e -> { controller.delete(); controller.viewData(); controller.clearView(); });
        btnCancel.addActionListener(e -> controller.clearView());
        btnExit.addActionListener(e -> dispose());

        tblPustaka.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] { "Anggota", "Buku", "Tanggal Pinjam", "Tanggal Kembali", "Terlambat", "Denda" }
        ));
        tblPustaka.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                controller.getPustaka();
            }
        });
        jScrollPane1.setViewportView(tblPustaka);

        // Menggunakan Layout GroupLayout yang telah disesuaikan agar Tombol berada di posisi horizontal yang rapi
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbxAnggota, 0, 310, Short.MAX_VALUE)
                            .addComponent(cbxBuku, 0, 310, Short.MAX_VALUE)
                            .addComponent(txtTglPinjam)
                            .addComponent(txtKembali)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbxAnggota, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbxBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTglPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null); // Center form di layar monitor
    }// </editor-fold>                        

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(FormPustaka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> new FormPustaka().setVisible(true));
    }

    // Variables declaration
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cbxAnggota;
    private javax.swing.JComboBox<String> cbxBuku;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPustaka;
    private javax.swing.JTextField txtKembali;
    private javax.swing.JTextField txtTglPinjam;
}