public class DLL {
    NodePasien head, tail;
    Pasien pasien;
    Dokter dokter;
    int durasiLayanan, biaya, size;

    public boolean isEmpty(){
        return head == null;
    }
     public void addLast(Pasien input){
        if (isEmpty()) {
            NodePasien ndInput = new NodePasien(null, input, null);
            head = tail = ndInput;
        } else {
            NodePasien ndInput = new NodePasien(tail, input, null);
            tail.next = ndInput;
            tail = ndInput;
        }
        size++;
    }

    public void removeFirst(){
        if (isEmpty()) {
            System.out.println("Data Pasien kosong");
            return;
        } if (head == tail) {
            head = tail = null;
        }else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public void tampil(){
        if (isEmpty()) {
            System.out.println("Data Pasien kosong");
        } else{
            NodePasien temp= head;
            while (temp != null) {
                temp.data.tampilData();
                temp=temp.next;
            }
        }
    }

     public void sortingJenisAbjadASC(){
        if (isEmpty()) {
            System.out.println("Data hewan kosong");
        } else if (head == tail) {
            head.data.tampilData();
        } else {
            boolean swap;
            do {
                swap = false;
                NodePasien temp = head;
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
}
