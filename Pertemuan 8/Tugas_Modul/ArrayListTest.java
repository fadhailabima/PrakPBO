import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();

        strings.add("praktikum");
        strings.add("collection");
        strings.add("and generics");
        strings.remove("praktikum");
        
        for (String s : strings){

            System.out.println(s+" ");
        }
    }
}