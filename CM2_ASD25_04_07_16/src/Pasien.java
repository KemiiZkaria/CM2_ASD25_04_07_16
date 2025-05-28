public class Pasien {
        String nama, nik, keluhan;

    public Pasien(String nama, String nik, String keluhan){
        this.nama = nama;
        this.nik = nik;
        this.keluhan = keluhan;
    }

    public void tampilData(){
        System.out.println(nama + "\t" + nik + "\t" + keluhan);
    }

}
