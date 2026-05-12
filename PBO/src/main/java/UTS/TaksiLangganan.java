package UTS;

public class TaksiLangganan extends Taksi {

    public TaksiLangganan(String idTaksi, String platNomor, String namaSupir, double jumlahKilometer) {
        super(idTaksi, platNomor, namaSupir, "Langganan", jumlahKilometer, 12000, 2000);
    }

    @Override
    protected double hitungBiayaKilometer() {
        return jumlahKilometer <= 2 ? 0 : (jumlahKilometer - 2) * biayaPerKilometer;
    }
}
