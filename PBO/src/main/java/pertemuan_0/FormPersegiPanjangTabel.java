package pertemuan_0; // Sesuaikan dengan nama package di NetBeans kamu

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FormPersegiPanjangTabel extends JFrame {

    // Deklarasi Komponen UI
    private JPanel mainPanel;
    private JLabel lblPanjang, lblLebar;
    private JTextField txtPanjang, txtLebar;
    private JButton btnHitung, btnUpdate, btnDelete, btnClear;
    private JTable tabelData;
    private DefaultTableModel tableModel;
    private JScrollPane scrollPane;
    
    private int selectedRowIndex = -1;

    public FormPersegiPanjangTabel() {
        // Pengaturan dasar Window/JFrame
        setTitle("Form Persegi Panjang - BENINGGGGGGGG");
        setSize(550, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); 

        // 1. Inisialisasi Panel Utama
        mainPanel = new JPanel();
        mainPanel.setLayout(null);
        mainPanel.setBackground(new Color(255, 240, 245)); // Lavender Blush (Pink sangat muda untuk background)

        // 2. Label dan Input PANJANG
        lblPanjang = new JLabel("Panjang");
        lblPanjang.setFont(new Font("Segoe UI", Font.BOLD, 14));
        lblPanjang.setForeground(new Color(139, 10, 80)); // Deep Pink Tua untuk teks label
        lblPanjang.setBounds(40, 30, 80, 25);
        mainPanel.add(lblPanjang);

        txtPanjang = new JTextField();
        txtPanjang.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        txtPanjang.setBounds(140, 30, 350, 25);
        mainPanel.add(txtPanjang);

        // 3. Label dan Input LEBAR
        lblLebar = new JLabel("Lebar");
        lblLebar.setFont(new Font("Segoe UI", Font.BOLD, 14));
        lblLebar.setForeground(new Color(139, 10, 80));
        lblLebar.setBounds(40, 70, 80, 25);
        mainPanel.add(lblLebar);

        txtLebar = new JTextField();
        txtLebar.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        txtLebar.setBounds(140, 70, 350, 25);
        mainPanel.add(txtLebar);

        // --- DEFINISI WARNA TOMBOL PINK ---
        Color warnaTombolPink = new Color(255, 105, 180); // Hot Pink
        Color warnaTeksTombol = Color.WHITE;
        Font fontTombol = new Font("Segoe UI", Font.BOLD, 12);

        // 4. Tombol Aksi (Hitung, Update, Delete, Clear)
        btnHitung = new JButton("Hitung");
        btnHitung.setFont(fontTombol);
        btnHitung.setBackground(warnaTombolPink);
        btnHitung.setForeground(warnaTeksTombol);
        btnHitung.setBounds(40, 120, 100, 30);
        mainPanel.add(btnHitung);

        btnUpdate = new JButton("Update");
        btnUpdate.setFont(fontTombol);
        btnUpdate.setBackground(warnaTombolPink);
        btnUpdate.setForeground(warnaTeksTombol);
        btnUpdate.setBounds(155, 120, 100, 30);
        mainPanel.add(btnUpdate);

        btnDelete = new JButton("Delete");
        btnDelete.setFont(fontTombol);
        btnDelete.setBackground(warnaTombolPink);
        btnDelete.setForeground(warnaTeksTombol);
        btnDelete.setBounds(270, 120, 100, 30);
        mainPanel.add(btnDelete);

        btnClear = new JButton("Clear");
        btnClear.setFont(fontTombol);
        btnClear.setBackground(warnaTombolPink);
        btnClear.setForeground(warnaTeksTombol);
        btnClear.setBounds(385, 120, 100, 30);
        mainPanel.add(btnClear);

        // 5. Inisialisasi JTable dan Modifikasi Warna Tabel Tema Pink
        String[] kolom = {"Panjang", "Lebar", "Luas", "Keliling"};
        tableModel = new DefaultTableModel(kolom, 0);
        tabelData = new JTable(tableModel);
        
        // Kustomisasi Warna Sel di Dalam Tabel
        tabelData.setBackground(new Color(255, 228, 225)); // Misty Rose (Pink pastel lembut untuk background baris)
        tabelData.setForeground(new Color(74, 4, 41));     // Warna teks cokelat kemerahan gelap agar kontras
        tabelData.setGridColor(new Color(255, 182, 193));   // Light Pink untuk garis kisi pembatas tabel
        tabelData.setShowGrid(true);

        // Kustomisasi Warna Saat Baris Tabel Diklik
        tabelData.setSelectionBackground(new Color(255, 20, 147)); // Deep Pink menyala saat dipilih
        tabelData.setSelectionForeground(Color.WHITE);

        // Kustomisasi Warna Header Tabel (Panjang, Lebar, Luas, Keliling)
        JTableHeader header = tabelData.getTableHeader();
        header.setFont(new Font("Segoe UI", Font.BOLD, 12));
        header.setBackground(new Color(219, 112, 147)); // Pale Violet Red (Pink Medium untuk Header)
        header.setForeground(Color.WHITE);             // Teks Header warna putih

        // Membungkus JTable dengan JScrollPane
        scrollPane = new JScrollPane(tabelData);
        scrollPane.setBounds(40, 170, 450, 250);
        mainPanel.add(scrollPane);

        // Menambahkan panel utama ke dalam JFrame
        add(mainPanel);

        // --- HUBUNGKAN LOGIKA TOMBOL & AKSI ---
        btnHitung.addActionListener(e -> aksiHitung());
        btnUpdate.addActionListener(e -> aksiUpdate());
        btnDelete.addActionListener(e -> aksiDelete());
        btnClear.addActionListener(e -> aksiClear());

        tabelData.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                selectedRowIndex = tabelData.getSelectedRow();
                if (selectedRowIndex != -1) {
                    txtPanjang.setText(tableModel.getValueAt(selectedRowIndex, 0).toString());
                    txtLebar.setText(tableModel.getValueAt(selectedRowIndex, 1).toString());
                }
            }
        });
    }

    private void aksiHitung() {
        try {
            double panjang = Double.parseDouble(txtPanjang.getText());
            double lebar = Double.parseDouble(txtLebar.getText());

            double luas = panjang * lebar;
            double keliling = 2 * (panjang + lebar);

            Object[] dataBaru = {panjang, lebar, luas, keliling};
            tableModel.addRow(dataBaru);

            aksiClear(); 
        } catch (NumberFormatException ex) {
            tampilkanPesanError();
        }
    }

    private void aksiUpdate() {
        if (selectedRowIndex == -1) {
            JOptionPane.showMessageDialog(this, "Pilih baris pada tabel terlebih dahulu untuk di-update!", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {
            double panjang = Double.parseDouble(txtPanjang.getText());
            double lebar = Double.parseDouble(txtLebar.getText());

            double luas = panjang * lebar;
            double keliling = 2 * (panjang + lebar);

            tableModel.setValueAt(panjang, selectedRowIndex, 0);
            tableModel.setValueAt(lebar, selectedRowIndex, 1);
            tableModel.setValueAt(luas, selectedRowIndex, 2);
            tableModel.setValueAt(keliling, selectedRowIndex, 3);

            aksiClear();
        } catch (NumberFormatException ex) {
            tampilkanPesanError();
        }
    }

    private void aksiDelete() {
        if (selectedRowIndex == -1) {
            JOptionPane.showMessageDialog(this, "Pilih baris pada tabel terlebih dahulu untuk dihapus!", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }

        tableModel.removeRow(selectedRowIndex);
        aksiClear();
    }

    private void aksiClear() {
        txtPanjang.setText("");
        txtLebar.setText("");
        tabelData.clearSelection();
        selectedRowIndex = -1; 
        txtPanjang.requestFocus(); 
    }

    private void tampilkanPesanError() {
        JOptionPane.showMessageDialog(this, 
                "Masukkan format angka yang valid pada kolom Panjang dan Lebar!", 
                "Error Input", 
                JOptionPane.ERROR_MESSAGE);
    }

    public static void main(String[] args) {
        // Penting: Menggunakan Look and Feel bawaan Java (Metal/Nimbus) atau CrossPlatform 
        // agar pengaturan modifikasi warna background JButton/JTable tidak tertimpa/dihilangkan oleh OS.
        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        SwingUtilities.invokeLater(() -> {
            new FormPersegiPanjangTabel().setVisible(true);
        });
    }
}