package pertemuan11.view;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class FrmMahasiswa extends JFrame {
    // Deklarasi Komponen
    private JLabel lblTitle, lblNim, lblNama, lblJurusan;
    private JTextField txtNim, txtNama, txtJurusan;
    private JButton btnSimpan;
    private JTable tblMahasiswa;
    private JScrollPane scrollPane;

    public FrmMahasiswa() {
        // Pengaturan dasar JFrame
        setTitle("Form Mahasiswa");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 550);
        setLocationRelativeTo(null); // Agar window muncul di tengah layar
        initComponents();
    }

    private void initComponents() {
        // Panel utama dengan padding di sekelilingnya
        JPanel mainPanel = new JPanel();
        mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        mainPanel.setLayout(new BorderLayout(0, 20));

        // 1. Bagian Atas: Judul Form
        JPanel topPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        lblTitle = new JLabel("FORM MAHASISWA");
        lblTitle.setFont(new Font("SansSerif", Font.BOLD, 18));
        topPanel.add(lblTitle);
        mainPanel.add(topPanel, BorderLayout.NORTH);

        // 2. Bagian Tengah: Input Form dan Tombol Simpan
        JPanel centerPanel = new JPanel(new BorderLayout(20, 0));

        // Panel Input (Menggunakan GridBagLayout agar label dan textfield sejajar rapi)
        JPanel formPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(8, 5, 8, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        lblNim = new JLabel("NIM");
        txtNim = new JTextField(25);
        lblNama = new JLabel("Nama");
        txtNama = new JTextField(25);
        lblJurusan = new JLabel("Jurusan");
        txtJurusan = new JTextField(25);

        // Baris 1: NIM
        gbc.gridx = 0; gbc.gridy = 0; gbc.weightx = 0.1;
        formPanel.add(lblNim, gbc);
        gbc.gridx = 1; gbc.gridy = 0; gbc.weightx = 0.9;
        formPanel.add(txtNim, gbc);

        // Baris 2: Nama
        gbc.gridx = 0; gbc.gridy = 1; gbc.weightx = 0.1;
        formPanel.add(lblNama, gbc);
        gbc.gridx = 1; gbc.gridy = 1; gbc.weightx = 0.9;
        formPanel.add(txtNama, gbc);

        // Baris 3: Jurusan
        gbc.gridx = 0; gbc.gridy = 2; gbc.weightx = 0.1;
        formPanel.add(lblJurusan, gbc);
        gbc.gridx = 1; gbc.gridy = 2; gbc.weightx = 0.9;
        formPanel.add(txtJurusan, gbc);

        centerPanel.add(formPanel, BorderLayout.CENTER);

        // Panel Tombol Simpan (Disebelah kanan inputan)
        JPanel buttonPanel = new JPanel(new GridBagLayout());
        btnSimpan = new JButton("Simpan");
        // Mengatur ukuran tombol agar berbentuk kotak agak besar seperti di gambar
        btnSimpan.setPreferredSize(new Dimension(90, 70)); 
        buttonPanel.add(btnSimpan);
        
        centerPanel.add(buttonPanel, BorderLayout.EAST);
        mainPanel.add(centerPanel, BorderLayout.CENTER);

        // 3. Bagian Bawah: Tabel (JTable)
        String[] columnNames = {"Title 1", "Title 2", "Title 3", "Title 4"};
        // Membuat model tabel dengan 4 baris kosong default
        DefaultTableModel model = new DefaultTableModel(columnNames, 4); 
        tblMahasiswa = new JTable(model);
        scrollPane = new JScrollPane(tblMahasiswa);
        // Mengatur tinggi area tabel
        scrollPane.setPreferredSize(new Dimension(750, 220)); 
        
        mainPanel.add(scrollPane, BorderLayout.SOUTH);

        // Menambahkan panel utama ke dalam JFrame
        add(mainPanel);
    }

    public static void main(String[] args) {
        // Menjalankan Form
        SwingUtilities.invokeLater(() -> {
            new FrmMahasiswa().setVisible(true);
        });
    }
}