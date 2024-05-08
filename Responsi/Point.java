package Responsi;

class Point {
    private double x, y;
    
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public void translate(double dx, double dy) {
        this.x += dx;
        this.y += dy;
    }
    
    public void cetak() {
        System.out.println("(" + x + ", " + y + ")");
    }
}