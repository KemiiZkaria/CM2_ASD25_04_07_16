public class NodePasien {
    Pasien data;
    NodePasien next, prev;

    public NodePasien(NodePasien prev, Pasien data, NodePasien next) {
        this.next = null;
        this.prev = null;
        this.data = data;
    }
}
