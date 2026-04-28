/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan4;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/**
 *
 * @author USER
 */
public class elseifinput {
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in) );

        System.out.println("Masukkan angka : ");
        int angka = Integer.parseInt(br.readLine());
         if(angka > 0){
             System.out.println("Positif");
             if(angka % 2 == 0){
                 System.out.println("genap");
             }else{
                 System.out.println("ganjil");
             }
         }
         else if(angka == 0){
             System.out.println("Ini angka 0");
         }else{
             System.out.println("Negatif");
         }
    }
}
