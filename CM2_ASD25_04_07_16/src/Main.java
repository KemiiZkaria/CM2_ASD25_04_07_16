import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int pilihan;
        Pasien pasien;
        Dokter dr = new Dokter();
        DLL dll = new DLL();

        Dokter d1 = new Dokter("dr01", "Wike Ratanca");
        Dokter d2 = new Dokter("dr02", "Santi Runica");
        Dokter d3 = new Dokter("dr03", "Aam Antica");
        Dokter d4 = new Dokter("dr04", "Slamet Sugito");

        dll.addDokterMain(d1);
        dll.addDokterMain(d2);
        dll.addDokterMain(d3);
        dll.addDokterMain(d4);

        do {
            System.out.println("\nSistem Antrian Klinik");
            System.out.println("1. Tambah Pasien ke Antrian");
            System.out.println("2. Lihat Antrian");
            System.out.println("3. Layani Pasien");
            System.out.println("4. Cek Sisa Antrian Pasien");
            System.out.println("5. Lihat Riwayat Transaksi");
            System.out.println("6. Sort Riwayat Transaksi");
            System.out.println("0. Keluar");
            System.out.println("=============================");
            System.out.print("Pilih Menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Input Nama Pasien : ");
                    String nama = sc.nextLine();
                    System.out.print("NIK               : ");
                    String nik = sc.nextLine();
                    System.out.print("Keluhan           : ");
                    String keluhan = sc.nextLine();
                    pasien = new Pasien(nama, nik, keluhan);
                    dll.addLast(pasien);
                    System.out.println("Pasien berhasil ditambahkan ke antrian.");
                    break;
                case 2:
                    dll.tampil();
                    break;
                case 3:
                    dll.layaniPasien();
                    break;
                case 4:
                    System.out.println("Sisa antrian pasien: " + dll.size);
                    break;
                case 5:
                    dll.tampilTransaksi();
                    break;
                case 6:
                    dll.sortTransaksiByNamaPasien();
                    break;
                default:
                    System.out.println("Pilihan Menu tidak Tersedia");
                    break;
            }
        } while (pilihan != 0);
    }
}