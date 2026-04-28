package pertemuan4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class elseifbelanja {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Masukkan jumlah Pensil : ");
        int pensil = Integer.parseInt(br.readLine());
        System.out.print("Masukkan jumlah Pena   : ");
        int pena = Integer.parseInt(br.readLine());
        System.out.print("Masukkan Jumlah Buku   : ");
        int buku = Integer.parseInt(br.readLine());

        int tot_pensil = 1000 * pensil;
        int tot_pena = 2000 * pena;
        int tot_buku = 3000 * buku;

        int total = tot_pensil + tot_pena + tot_buku;
        
        // PERBAIKAN: Gunakan 2.0 agar dianggap sebagai double, bukan integer division
        double diskon = 0;
        int total_akhir;

        System.out.println("\n--- Rincian Belanja ---");
        System.out.println("Pensil (1000) x " + pensil + " : " + tot_pensil);
        System.out.println("Pena   (2000) x " + pena + "   : " + tot_pena);
        System.out.println("Buku   (3000) x " + buku + "   : " + tot_buku);
        System.out.println("Total Kotor           : " + total);

        if (total >= 20000) {
            diskon = total * 0.02; // Diskon 2%
            total_akhir = total - (int)diskon;
            System.out.println("Diskon (2%)           : " + (int)diskon);
            System.out.println("Total Akhir           : " + total_akhir);
        } else {
            System.out.println("Diskon                : 0 (Min. Belanja 20rb)");
            System.out.println("Total Akhir           : " + total);
        }
    }
}