package Responsi;

class QueueOfPoints extends Queue<Point> {
    public void cetak() {
        for (Point point : elements) {
            point.cetak();
        }
    }
}