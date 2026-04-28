/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan5;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan n: "); int n = sc.nextInt();
        System.out.print("Masukkan r: "); int r = sc.nextInt();
        if(n>=r){
            int pil;
            do{
                System.out.println("\n1.Pangkat  2.Permutasi  3.Kombinasi  4.Keluar");
                System.out.print("Pilih: "); pil = sc.nextInt();

                switch (pil) {
                    case 1:
                        System.out.println("Hasil: " + Math.pow(n, r));
                        break;
                    case 2:
                        System.out.println("Hasil: " + (faktorial(n) / faktorial(n - r)));
                        break;
                    case 3:
                        System.out.println("Hasil: " + (faktorial(n) / (faktorial(r) * faktorial(n - r))));
                        break;
                    case 4:
                        System.out.println("Keluar...");
                        break;
                    default:
                        System.out.println("Pilihan salah!");
                }
            }while(pil !=4); 
             sc.close();
        }else{
            System.out.println("nilai n harus lebih besar atau sama dari r");
        }
    }

    // Fungsi faktorial
    static long faktorial(int f) {
        return (f <= 1) ? 1 : f * faktorial(f - 1);
    }
}
