/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan3;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class penjumlahanJOP {
    public static void main(String[] args){
        String wlcm = "Penjumlahan";
        JOptionPane.showMessageDialog(null, wlcm);
        
        String A = JOptionPane.showInputDialog("A : ");
        String B = JOptionPane.showInputDialog("B : ");
        int a = Integer.parseInt(A);
        int b = Integer.parseInt(B);
        int hasil = a + b;
        String msg = "Hasilnya adalah (a+b) :"+hasil;
        JOptionPane.showMessageDialog(null, msg);
    }
}
