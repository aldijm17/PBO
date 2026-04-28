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
public class JOptionPaneMybio {
    public static void main(String[] args){
        String name = "";
        String nim = "";
        String prodi = "";
        String kuotes = "";
        String wlcm = "BIO DATA";
        JOptionPane.showMessageDialog(null, wlcm);
        
        name = JOptionPane.showInputDialog("Nama : ");
        nim = JOptionPane.showInputDialog("NIM : ");
        prodi = JOptionPane.showInputDialog("Program Studi : ");
        kuotes = JOptionPane.showInputDialog("Kuotes nya kakak : ");
        String msg = "hello "+name+" nim kamu "+nim+". oh jadi kamu dari prodi "+prodi+",ya? kuotes?"+kuotes;
        JOptionPane.showMessageDialog(null, msg);
    }
}
