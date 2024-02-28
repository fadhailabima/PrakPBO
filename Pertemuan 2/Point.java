// File : Point.java          28/02/24
// Penulis : Fadhail Athaillah Bima
// Deskripsi : Kelas Titik yang merupakan sebuah titik dengan absis dan ordinat

public class Point {
    private double x;
    private double y;
    private static int pointCounter;

    public Point(double x, double y){
        this.x = x;
        this.y = y;
        pointCounter++;
    }

    public Point(){
        this(0, 0);
    }

    public void setX(double x){
        this.x = x;
    }

    public void setY(double y){
        this.y = y;
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public static int getPointCounter(){
        return pointCounter;
    }

    public double getDistanceFromOrigin() {
        return Math.sqrt(x * x + y * y);
    }

    public void reflectX() {
        y = -y;
    }

    public void reflectY() {
        x = -x;
    }

    public Point getReflectedX() {
        return new Point(this.x, -this.y);
    }

    public Point getReflectedY() {
        return new Point(-this.x, this.y);
    }
}
