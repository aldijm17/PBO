package UTS;

public class Taksi {
    protected String idTaksi;
    protected String platNomor;
    protected String namaSupir;
    protected String jenisPenumpang;
    protected double jumlahKilometer;
    protected double biayaAwal;
    protected double biayaPerKilometer;

    public Taksi(String idTaksi, String platNomor, String namaSupir, String jenisPenumpang,
                 double jumlahKilometer, double biayaAwal, double biayaPerKilometer) {
        this.idTaksi = idTaksi;
        this.platNomor = platNomor;
        this.namaSupir = namaSupir;
        this.jenisPenumpang = jenisPenumpang;
        this.jumlahKilometer = jumlahKilometer;
        this.biayaAwal = biayaAwal;
        this.biayaPerKilometer = biayaPerKilometer;
    }

    protected double hitungBiayaKilometer() {
        return jumlahKilometer * biayaPerKilometer;
    }

    public double hitungTotalBayar() {
        return biayaAwal + hitungBiayaKilometer();
    }

    public void tampilkanInfo() {
        System.out.println("=== Data Taksi ===");
        System.out.println("ID Taksi           : " + idTaksi);
        System.out.println("Plat Nomor         : " + platNomor);
        System.out.println("Nama Supir         : " + namaSupir);
        System.out.println("Jenis Penumpang    : " + jenisPenumpang);
        System.out.println("Jumlah Kilometer   : " + jumlahKilometer);
        System.out.println("Biaya Awal         : " + biayaAwal);
        System.out.println("Biaya Per Kilometer: " + biayaPerKilometer);
        System.out.println("Total Bayar        : " + hitungTotalBayar());
    }
}
