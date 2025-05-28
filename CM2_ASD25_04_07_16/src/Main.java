import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int pilihan;
        TransaksiLayanan trs= new TransaksiLayanan();
        Pasien pasien;
        Dokter dr = new Dokter();
        DLL dll = new DLL();

        Dokter d1 = new Dokter("dr01", "Wike Ratanca");
        Dokter d2 = new Dokter("dr02", "Santi Runica");
        Dokter d3 = new Dokter("dr03", "Aam Antica");
        Dokter d4 = new Dokter("dr04", "Slamet Sugito");


        do {
            System.out.println("Sistem Antrian Klinik");
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
                String nama=sc.nextLine();
                System.out.print("NIK               : ");
                String nik=sc.nextLine();
                System.out.print("Keluhan           : ");
                String keluhan=sc.nextLine();
                    pasien = new Pasien(nama, nik , keluhan);
                    break;
                case 2:
                    break;
                case 3:
                    
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                default:
                System.out.println("Pilihan Menu tidak Tersedia");
                    break;
            }
        } while (pilihan != 0);
    }
}