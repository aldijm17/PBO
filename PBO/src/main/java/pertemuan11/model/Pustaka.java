/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan11.model;

/**
 *
 * @author komputer depan
 */
public class Pustaka {
    private Anggota anggota;
    private Buku buku;
    private int tglPinjam;
    private int tglKembali;
    private int terlambat;
    private int denda;

    public Pustaka() {
    }

    public Pustaka(Anggota anggota, Buku buku, int tglPinjam, int tglKembali) {
        this.anggota = anggota;
        this.buku = buku;
        this.tglPinjam = tglPinjam;
        this.tglKembali = tglKembali;
    }

    public Anggota getAnggota() {
        return anggota;
    }

    public void setAnggota(Anggota anggota) {
        this.anggota = anggota;
    }

    public Buku getBuku() {
        return buku;
    }

    public void setBuku(Buku buku) {
        this.buku = buku;
    }

    public int getTglPinjam() {
        return tglPinjam;
    }

    public void setTglPinjam(int tglPinjam) {
        this.tglPinjam = tglPinjam;
    }

    public int getTglKembali() {
        return tglKembali;
    }

    public void setTglKembali(int tglKembali) {
        this.tglKembali = tglKembali;
    }

    public int getTerlambat() {
        terlambat = tglKembali - tglPinjam;
        return terlambat;
    }

    public void setTerlambat(int terlambat) {
        this.terlambat = terlambat;
    }

    public int getDenda() {
        denda = terlambat * 5000;
        return denda;
    }

    public void setDenda(int denda) {
        this.denda = denda;
    }
    
    
}
