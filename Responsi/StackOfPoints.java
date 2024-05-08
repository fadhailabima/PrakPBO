package Responsi;

class StackOfPoints extends Stack<Point> {
    public void cetak() {
        for (int i = elements.size() - 1; i >= 0; i--) {
            elements.get(i).cetak();
        }
    }
}