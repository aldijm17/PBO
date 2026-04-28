/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author USER
 */
public class seleksinilai {
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in) );

        System.out.println("Masukkan angka : ");
        int nilai = Integer.parseInt(br.readLine());
         if(nilai > 85){
             if(nilai >100){
                 System.out.println("Nilai berlebihan");
             }
             System.out.println("A");
         }
         else if(nilai > 71){
             System.out.println("B");
         }else if(nilai > 60 ){
             System.out.println("C");
         }else if(nilai > 40 ){
             System.out.println("D");
         }else{
             System.out.println("E");
         }
    }
}