import java.util.LinkedList;

public class School {

    public static void addStudents(LinkedList list1, Student student) {
        list1.add(student);
    }

    public static void listStudents(LinkedList list1){
        int i;
        for(i = 0 ; i<list1.size(); i++){
            System.out.println("List of Students: " + list1.get(i));
        }

    }

    public static String listStudentsLabel(LinkedList list1){
        int i;
        String a = "";
        for(i = 0 ; i<list1.size(); i++){
            a += list1.get(i).toString() + "\n";
        }

        return a;
    }
}
