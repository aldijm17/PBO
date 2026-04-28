/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan;

/**
 *
 * @author USER
 */
public class case_nilai {
    public static void main(String[] args){
        char nilaiHuruf = 'A';
        switch (nilaiHuruf) {
        case 'A':
            System.out.println("Luar biasa! Pertahankan.");
            break;
        case 'B':
            System.out.println("Bagus! Tingkatkan sedikit lagi.");
            break;
        case 'C':
            System.out.println("Cukup. Perbanyak belajar.");
            break;
        case 'D':
            System.out.println("Anda tidak lulus. Silakan ikut remidi.");
            break;
        default:
            System.out.println("Data nilai tidak valid.");
        }
    }
}
