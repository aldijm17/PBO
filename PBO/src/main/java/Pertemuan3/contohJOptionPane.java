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
public class contohJOptionPane {
    public static void main(String[] args){
        String name = "";
        name = JOptionPane.showInputDialog("Please Enter Your Name : ");
        String msg = "hello "+name+"!";
        JOptionPane.showMessageDialog(null, msg);
    }
}
