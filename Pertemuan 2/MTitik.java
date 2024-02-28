// File : MTitik.java          28/02/24
// Penulis : Fadhail Athaillah Bima
// Deskripsi : Kelas MTitik yang merupakan sebuah class untuk menguji class Titik sebelumnya

public class MTitik {
    public static void main(String[] args) {
        Point p1;
        Point p2;
        Point p3;

        p1 = new Point();
        p2 = new Point();
        p3 = new Point();

        p2.setX(1);
        p2.setY(2);
        p3.setX(5);
        p3.setY(6);

        System.out.printf("Number of Point objects: %d\n", Point.getPointCounter());

        System.out.printf("Coordinates of p1: (%.2f, %.2f)\n", p1.getX(), p1.getY());
        System.out.printf("Coordinates of p2: (%.2f, %.2f)\n", p2.getX(), p2.getY());
        System.out.printf("Coordinates of p3: (%.2f, %.2f)\n", p3.getX(), p3.getY());

        System.out.printf("Distance of p2 from origin: %.2f\n", p2.getDistanceFromOrigin());
        System.out.printf("Distance of p3 from origin: %.2f\n", p3.getDistanceFromOrigin());

        p2.reflectX();
        System.out.printf("Coordinates of p2 after reflection about X-axis: (%.2f, %.2f)\n", p2.getX(), p2.getY());

        p3.reflectY();
        System.out.printf("Coordinates of p3 after reflection about Y-axis: (%.2f, %.2f)\n", p3.getX(), p3.getY());

        Point p2ReflectX = p2.getReflectedX();
        Point p3ReflectY = p3.getReflectedY();
        System.out.printf("Coordinates of p2 after reflection about X-axis: (%.2f, %.2f)\n", p2ReflectX.getX(), p2ReflectX.getY());
        System.out.printf("Coordinates of p3 after reflection about Y-axis: (%.2f, %.2f)\n", p3ReflectY.getX(), p3ReflectY.getY());

        Line line1 = new Line(p2, p3);

        System.out.printf("Length of line: %.2f\n", line1.calculateLength());
        System.out.printf("Gradient of line: %.2f\n", line1.calculateGradient());

        Line lineReflectY = line1.getReflectedLineY();
        System.out.printf("Coordinates of start point of line reflected about Y-axis: (%.2f, %.2f)\n", lineReflectY.getStartPoint().getX(), lineReflectY.getStartPoint().getY());
        System.out.printf("Coordinates of end point of line reflected about Y-axis: (%.2f, %.2f)\n", lineReflectY.getEndPoint().getX(), lineReflectY.getEndPoint().getY());

        Line line2 = new Line(new Point(2, 2), new Point(2, 6));
        System.out.println("Is line1 perpendicular to line2? " + line1.isPerpendicular(line2));
    }
}
