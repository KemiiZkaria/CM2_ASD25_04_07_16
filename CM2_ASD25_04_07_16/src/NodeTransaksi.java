public class NodeTransaksi {
    TransaksiLayanan data;
    NodeTransaksi next, prev;

    public NodeTransaksi(NodeTransaksi prev, TransaksiLayanan data, NodeTransaksi next) {
        this.next = next;
        this.prev = prev;
        this.data = data;
    }
}
