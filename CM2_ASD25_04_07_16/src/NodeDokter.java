public class NodeDokter {
    Dokter data;
    NodeDokter next, prev;

    public NodeDokter(NodeDokter prev, Dokter data, NodeDokter next) {
        this.next = null;
        this.prev = null;
        this.data = data;
    }
}
