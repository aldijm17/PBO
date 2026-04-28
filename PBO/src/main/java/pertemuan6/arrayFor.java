package pertemuan6;
import java.util.Scanner;
public class arrayFor {
    public static void main(String[] args) {
        int batas_awal;
        int batas_akhir;
        int lulus = 0;
        int tidak_lulus = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan batas awal: ");
        batas_awal = input.nextInt();
        System.out.print("Masukkan batas akhir: ");
        batas_akhir = input.nextInt();
 
        int ukuran = (batas_akhir - batas_awal) + 1;
        int[] angka = new int[ukuran];
        System.out.println("--- Input Isi Array ---");
        for (int i = 0; i < ukuran; i++) {

            int labelUrutan = batas_awal + i;
            System.out.print("Masukkan angka ke-" + labelUrutan + ": ");
            angka[i] = input.nextInt();
            if(angka[i] >= 70){
                System.out.println("Nilai " + angka[i] + " adalah Lulus");
                lulus++;
            } else {
                System.out.println("Nilai " + angka[i] + " adalah Tidak Lulus");
                tidak_lulus++;
            }
        }
        int terbesar = angka[0];
        int terkecil = angka[0];
        for (int i = 1; i < ukuran; i++) {
            if (angka[i] > terbesar) {
                terbesar = angka[i];
            }
            if (angka[i] < terkecil) {
                terkecil = angka[i];
            }
        }
        System.out.println("Jumlah Mahasiswa Lulus: " + lulus);
        System.out.println("Jumlah Mahasiswa Tidak Lulus: " + tidak_lulus);
        System.out.println("nilai terbesar: " + terbesar);
        System.out.println("nilai terkecil: " + terkecil);
        for (int i = batas_awal; i < batas_akhir; i++) {
            System.out.print(angka[i]+" ");
        }
    }
}
