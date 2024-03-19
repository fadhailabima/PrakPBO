package Pertemuan_4.Pertemuan_4_TugasTakeHome.org.main;

import Pertemuan_4.Pertemuan_4_TugasTakeHome.org.child.*;

public class Main {
    public static void main(String[] args) {
        Student Hafiz = new Student("Hafiz", 21, "Medan", "240602");
        Student Derva = new Student("Derva", 22, "Karawang", "240603");
        Student Ivan = new Student("Ivan", 21, "Medan", "240604");

        Lecture Khadijah = new Lecture("Khadijah", 40, "Jakarta", "240501");
        Lecture Priyo = new Lecture("Priyo", 42, "Semarang", "240502");
        Lecture Aris = new Lecture("Aris", 50, "Kudus", "240503");

        Course PBO = new Course("PAIK123", "PBO");
        Course MBD = new Course("PAIK124", "MBD");
        Course ASA = new Course("PAIK125", "ASA");
        Course GKV = new Course("PAIK126", "GKV");
        Course STI = new Course("PAIK127", "STI");
        Course RPL = new Course("PAIK128", "RPL");
        

        // Method Class Student
        System.out.println("=======Student Data=========");
        Hafiz.getDetails();
        System.out.println("----------------------------");
        Derva.getDetails();
        System.out.println("----------------------------");
        Ivan.getDetails();
        System.out.println("");
        
        Hafiz.enrollCourse(PBO);
        Hafiz.enrollCourse(MBD);
        Hafiz.enrollCourse(ASA);
        Hafiz.viewEnrolledCourse();
        System.out.println("");

        Derva.enrollCourse(ASA);
        Derva.enrollCourse(STI);
        Derva.enrollCourse(RPL);
        Derva.viewEnrolledCourse();
        System.out.println("");

        Ivan.enrollCourse(MBD);
        Ivan.enrollCourse(GKV);
        Ivan.enrollCourse(STI);
        Ivan.viewEnrolledCourse();
        System.out.println("\n");
            
        // Method Class Lecture  
        System.out.println("=======Lecture Data=========");
        Khadijah.getDetails();
        System.out.println("----------------------------");
        Priyo.getDetails();
        System.out.println("----------------------------");
        Aris.getDetails();
        System.out.println("");

        Khadijah.teachCourse(PBO);
        Khadijah.teachCourse(MBD);
        Khadijah.viewTaughtCourses();
        System.out.println("");

        Priyo.teachCourse(ASA);
        Priyo.teachCourse(GKV);
        Priyo.viewTaughtCourses();
        System.out.println("");

        Aris.teachCourse(STI);
        Aris.teachCourse(RPL);
        Aris.viewTaughtCourses();
        System.out.println("\n");
        
        // Method Class Course
        GKV.addStudent(Hafiz);
        RPL.addStudent(Derva);
        PBO.addStudent(Ivan);

        GKV.removeStudent(Hafiz);
        RPL.removeStudent(Derva);
        PBO.removeStudent(Ivan);

        System.out.println("========Course Data=========");
        PBO.getDetails();
        System.out.println("----------------------------");
        MBD.getDetails();
        System.out.println("----------------------------");
        ASA.getDetails();
        System.out.println("----------------------------");
        GKV.getDetails();
        System.out.println("----------------------------");
        STI.getDetails();
        System.out.println("----------------------------");
        RPL.getDetails();
        System.out.println("");

        PBO.viewEnrolledStudents();
        MBD.viewEnrolledStudents();
        ASA.viewEnrolledStudents();
        GKV.viewEnrolledStudents();
        STI.viewEnrolledStudents();
        RPL.viewEnrolledStudents();
    }
}
