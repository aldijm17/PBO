/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS;

public class UTS {

    public static void main(String[] args) {
        String jenisPenumpang = "langganan";
        Taksi taksi;

        if ("langganan" == jenisPenumpang) {
            taksi = new TaksiLangganan("122112", "BA 1228 TP", "Aldi", 12);
        } else {
            taksi = new Taksi("122112", "BA 1228 TP", "Aldi", "Biasa", 12, 12000, 2000);
        }

        taksi.tampilkanInfo();
    }
}
