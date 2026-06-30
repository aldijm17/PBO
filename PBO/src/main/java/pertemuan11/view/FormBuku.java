package pertemuan11.view;

import pertemuan11.controller.BukuController;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 * @author Aldi Julse Makruf
 */
public class FormBuku extends javax.swing.JFrame {

    private BukuController controller;

    public FormBuku() {
        initComponents();
        controller = new BukuController(this);
        controller.viewData(); // Memuat data awal saat aplikasi dijalankan
    }

    private void initComponents() {
        // Inisialisasi Komponen Komplit
        jLabelHeader = new javax.swing.JLabel("FORM BUKU");
        txtjudulLabel = new javax.swing.JLabel("Judul");
        txtcodeLabel = new javax.swing.JLabel("Kode");
        txtpengarangLabel = new javax.swing.JLabel("Pengarang");
        txttahunLabel = new javax.swing.JLabel("Tahun");
        txtpenerbitLabel = new javax.swing.JLabel("Penerbit");

        txtJudul = new javax.swing.JTextField();
        txtKode = new javax.swing.JTextField();
        txtPengarang = new javax.swing.JTextField();
        txtTahun = new javax.swing.JTextField();
        txtPenerbit = new javax.swing.JTextField();

        btnInsert = new javax.swing.JButton("Insert");
        btnUpdate = new javax.swing.JButton("Update");
        btnDelete = new javax.swing.JButton("Delete");
        btnCancel = new javax.swing.JButton("Cancel");
        btnExit = new javax.swing.JButton("Exit");

        tblBuku = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane(tblBuku);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        jLabelHeader.setFont(new java.awt.Font("Segoe UI", 1, 14));

        // Pengaturan Model Kolom JTable dengan Kolom Penerbit
        tblBuku.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] { "Judul", "Kode", "Pengarang", "Tahun", "Penerbit" }
        ));

        // Registrasi Event Listener Menuju Metode Controller
        btnInsert.addActionListener(evt -> controller.insert());
        btnUpdate.addActionListener(evt -> controller.update());
        btnDelete.addActionListener(evt -> controller.delete());
        btnCancel.addActionListener(evt -> controller.clearView());
        btnExit.addActionListener(evt -> System.exit(0));
        tblBuku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                controller.actionClickTabel();
            }
        });

        // Konstruksi Layout Presisi (GroupLayout) Meniru Gambar Mockup
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtjudulLabel)
                            .addComponent(txtcodeLabel)
                            .addComponent(txtpengarangLabel)
                            .addComponent(txttahunLabel)
                            .addComponent(txtpenerbitLabel))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtJudul)
                            .addComponent(txtKode)
                            .addComponent(txtPengarang)
                            .addComponent(txtTahun)
                            .addComponent(txtPenerbit))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnInsert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE))))
                .addGap(40, 40, 40))
            .addGroup(layout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addComponent(jLabelHeader)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelHeader)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtjudulLabel)
                    .addComponent(txtJudul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInsert))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcodeLabel)
                    .addComponent(txtKode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtpengarangLabel)
                    .addComponent(txtPengarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttahunLabel)
                    .addComponent(txtTahun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtpenerbitLabel)
                    .addComponent(txtPenerbit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExit))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }

    // --- METODE GETTER AKSESIBEL UNTUK CONTROLLER ---
    public JTable getTblBuku() { return tblBuku; }
    public JTextField getTxtJudul() { return txtJudul; }
    public JTextField getTxtKode() { return txtKode; }
    public JTextField getTxtPengarang() { return txtPengarang; }
    public JTextField getTxtTahun() { return txtTahun; }
    public JTextField getTxtPenerbit() { return txtPenerbit; }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(FormBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> new FormBuku().setVisible(true));
    }

    // Deklarasi Komponen
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabelHeader;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblBuku;
    private javax.swing.JTextField txtJudul;
    private javax.swing.JTextField txtKode;
    private javax.swing.JTextField txtPengarang;
    private javax.swing.JTextField txtTahun;
    private javax.swing.JTextField txtPenerbit;
    private javax.swing.JLabel txtcodeLabel;
    private javax.swing.JLabel txtjudulLabel;
    private javax.swing.JLabel txtpenerbitLabel;
    private javax.swing.JLabel txtpengarangLabel;
    private javax.swing.JLabel txttahunLabel;
}