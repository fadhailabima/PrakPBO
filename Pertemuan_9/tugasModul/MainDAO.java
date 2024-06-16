package Pertemuan_9.tugasModul;

public class MainDAO {
    public static void main(String args[]){
        Person person = new Person("Bima");
        DAOManager m = new DAOManager();
        m.setPersonDAO(new MySQLPersonDAO());
        try{
            m.getPersonDAO().savePerson(person);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}