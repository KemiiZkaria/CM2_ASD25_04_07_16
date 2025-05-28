public class Dokter {
    String idDokter;
    String nama;
    
    Dokter() {
    }

    Dokter(String id, String nama) {
        idDokter = id;
        this.nama = nama;
    }

    void tampilDataDokter() {
        System.out.println(idDokter + "\t" + nama);
    }
}
