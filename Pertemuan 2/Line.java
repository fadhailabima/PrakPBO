// File : Line.java          28/02/24
// Penulis : Fadhail Athaillah Bima
// Deskripsi : Kelas Garis yang merupakan sebuah Garis dengan (x1, y1) dan (x2, y2)

public class Line {
    private Point startPoint;
    private Point endPoint;

    public Line(Point startPoint, Point endPoint){
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    public Point getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(Point startPoint) {
        this.startPoint = startPoint;
    }

    public Point getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(Point endPoint) {
        this.endPoint = endPoint;
    }

    public double calculateLength(){
        double dx = endPoint.getX() - startPoint.getX();
        double dy = endPoint.getY() - startPoint.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }

    public double calculateGradient(){
        double dx = endPoint.getX() - startPoint.getX();
        double dy = endPoint.getY() - startPoint.getY();

        if (dx == 0){
            return 0;
        }
        else {
            return (dy / dx);
        }
    }

    public Line getReflectedLineY(){
        Point P1 = startPoint.getReflectedY();
        Point P2 = endPoint.getReflectedY();
        return new Line(P1,P2);
    }

    public boolean isPerpendicular(Line L) {
        double m1 = this.calculateGradient();
        double m2 = L.calculateGradient();
        
        if (Double.isInfinite(m1)) {
            return m2 == 0;
        } else if (Double.isInfinite(m2)) {
            return m1 == 0;
        }

        return m1 * m2 == -1;
    }
}
