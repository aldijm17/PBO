/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 *
 * @author USER
 */
public class penjumlahan {
    public static void main(String[]args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in) );
        
 
        System.out.print("Nilai A : ");
        int a = Integer.parseInt(br.readLine());
        
        System.out.print("Nilai b : ");
        int b = Integer.parseInt(br.readLine());
        
        int hasil = a+b;
        
        System.out.println("Hasil penjumlahan: " + hasil);
        
    }
}
