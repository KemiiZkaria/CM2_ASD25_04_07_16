public class TransaksiLayanan {
    Pasien pasien;
    Dokter dokter;

    public TransaksiLayanan(Pasien pasien, Dokter dokter) {
        this.pasien = pasien;
        this.dokter = dokter;
    }

    public void tampilDataTransaksi() {
        System.out.println("Pasien: " + pasien.nama + ", Dokter: " + dokter.nama);
    }
}
