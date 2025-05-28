import java.util.Scanner;

public class DLL {
    NodePasien headPasien, TailPasien;
    NodeDokter headDokter, TailDokter;
    NodeTransaksi headTransaksi, TailTransaksi;
    Pasien pasien;
    Dokter dokter;
    int durasiLayanan, biaya, size;

    public boolean isEmpty(){
        return headPasien == null;
    }
     public void addLast(Pasien input){
        if (isEmpty()) {
            NodePasien ndInput = new NodePasien(null, input, null);
            headPasien = TailPasien = ndInput;
        } else {
            NodePasien ndInput = new NodePasien(TailPasien, input, null);
            TailPasien.next = ndInput;
            TailPasien = ndInput;
        }
        size++;
    }

    public void removeFirst(){
        if (isEmpty()) {
            System.out.println("Data Pasien kosong");
            return;
        } if (headPasien == TailPasien) {
            headPasien = TailPasien = null;
        }else {
            headPasien = headPasien.next;
            headPasien.prev = null;
            size--;
        }
    }

    public void tampil(){
        if (isEmpty()) {
            System.out.println("Data Pasien kosong");
        } else{
            NodePasien temp= headPasien;
            System.out.println("--- Antrian Pasien ---");
            while (temp != null) {
                temp.data.tampilData();
                temp=temp.next;
            }
        }
    }

     public void sortPasienNamaDesc(){
        if (isEmpty()) {
            System.out.println("Data pasien kosong");
        } else if (headPasien == TailPasien) {
            headPasien.data.tampilData();
        } else {
            boolean swap;
            do {
                swap = false;
                NodePasien temp = headPasien;
                while (temp.next != null) {
                    if (temp.data.nama.compareToIgnoreCase(temp.next.data.nama) < 0) {
                        Pasien temp2 = temp.data;
                        temp.data = temp.next.data;
                        temp.next.data = temp2;
                        swap = true;
                    }
                    temp = temp.next;
                }
            } while (swap);
            tampil();
        }
    }

    public void addDokterMain(Dokter input){
        if (isEmpty()) {
            NodeDokter ndInput = new NodeDokter(null, input, null);
            headDokter = TailDokter = ndInput;
        } else {
            NodeDokter ndInput = new NodeDokter(TailDokter, input, null);
            TailDokter.next = ndInput;
            TailDokter = ndInput;
        }
    }

    public void tampilDokter(){
        NodeDokter temp= headDokter;
        while (temp != null) {
            temp.data.tampilDataDokter();
            temp=temp.next;
        }
    }

    public void addTransaksi(TransaksiLayanan input){
        if (isEmpty()) {
            NodeTransaksi ndInput = new NodeTransaksi(null, input, null);
            headTransaksi = TailTransaksi = ndInput;
        } else {
            NodeTransaksi ndInput = new NodeTransaksi(TailTransaksi, input, null);
            TailTransaksi.next = ndInput;
            TailTransaksi = ndInput;
        }
    }

    public void tampilTransaksi(){
        if (isEmpty()) {
            System.out.println("Data Transaksi kosong");
        } else{
            NodeTransaksi temp= headTransaksi;
            while (temp != null) {
                temp.data.tampilDataTransaksi();
                temp=temp.next;
            }
        }
    }

    public void layaniPasien() {
    if (isEmpty()) {
        System.out.println("Antrian kosong.");
        return;
    }

    tampilDokter();
    Scanner sc = new Scanner(System.in);
    System.out.print("Pilih ID Dokter untuk melayani: ");
    String id = sc.nextLine();

    NodeDokter current = headDokter;
    Dokter dokterTerpilih = null;
    while (current != null) {
        if (current.data.idDokter.equalsIgnoreCase(id)) {
            dokterTerpilih = current.data;
            break;
        }
        current = current.next;
    }

    if (dokterTerpilih == null) {
        System.out.println("Dokter tidak ditemukan.");
        return;
    }

    Pasien pasienDilayani = headPasien.data;
    TransaksiLayanan transaksi = new TransaksiLayanan(pasienDilayani, dokterTerpilih);
    addTransaksi(transaksi);

    removeFirst();
    System.out.println("Pasien telah dilayani oleh " + dokterTerpilih.nama);
}

}
