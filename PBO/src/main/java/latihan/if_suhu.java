/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan;

/**
 *
 * @author USER
 */
public class if_suhu {
    public static void main(String[] args){
        int suhu = 28;
        if (suhu < 20) {
            System.out.println("Dingin, pakai jaket.");
        } else if (suhu >= 20 && suhu <= 26) {
            System.out.println("Suhu nyaman.");
        } else {
            System.out.println("Panas, nyalakan AC.");
        }
    }
    
}
