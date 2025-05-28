public class NodeTransaksi {
    TransaksiLayanan data;
    NodeTransaksi next, prev;

    public NodeTransaksi(NodeTransaksi prev, TransaksiLayanan data, NodeTransaksi next) {
        this.next = null;
        this.prev = null;
        this.data = data;
    }
}
