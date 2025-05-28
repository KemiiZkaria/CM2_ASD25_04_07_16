public class TransaksiLayanan {
    Pasien pasien;
    Dokter dokter;
    int durasiLayanan, biaya;

    public TransaksiLayanan(Pasien pasien, Dokter dokter, int durasiLayanan) {
        this.pasien = pasien;
        this.dokter = dokter;
        this.durasiLayanan = durasiLayanan;
    }

    public void tampilDataTransaksi() {
        System.out.println(pasien.nama + "\t" + dokter.nama + "\t" + durasiLayanan + "\t" + biaya);
    }

    public void hitungBiaya(){
        this.biaya = durasiLayanan * 50000;
    }
}
