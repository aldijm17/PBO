/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author USER
 */
public class aritmatikaBufferedReader {
    public static void main(String[]args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in) );
        
 
        System.out.print("Nilai r : ");
        int r = Integer.parseInt(br.readLine());
        
        System.out.print("Nilai w : ");
        int w = Integer.parseInt(br.readLine());
        
        System.out.print("Nilai c : ");
        int c = Integer.parseInt(br.readLine());
        
        System.out.print("Nilai u : ");
        int u = Integer.parseInt(br.readLine());
        
        System.out.print("Nilai t : ");
        int t = Integer.parseInt(br.readLine());
        
       int p = r * w - c / 3;
       int q = p + u * 5 - r;
       int s = t - 2 * c + 5; 
       
       System.out.println("Nilai P adalah " + p);
       System.out.println("Nilai Q adalah " + q);
       System.out.println("Nilai S adalah " + s);
        
    }
}
