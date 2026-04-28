/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan5;

/**
 *
 * @author USER
 */
public class bilanganPrima {
    public static void main(String[] args){
        int i;
        int j;
        for (i = 2; i <= 100; i++) { // Mulai dari 2 karena 0 dan 1 bukan prima
        boolean isPrima = true;
            
            // Cek apakah angka i bisa dibagi angka lain
            for (j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    isPrima = false; // Ketemu pembagi, berarti bukan prima
                    break;           // Hentikan pengecekan untuk angka i ini
                }
            }
            
            // Jika setelah dicek tetap true, maka cetak
            if (isPrima) {
                System.out.print(i + " ");
            }
        }
    }
}
