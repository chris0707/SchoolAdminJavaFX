import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    static Scanner sc, choice;

    public static int choiceMenu(){
        choice = new Scanner(System.in);

        System.out.println("1. Add a student");
        System.out.println("2. List all students");
        System.out.println("3. Exit program");



        return choice.nextInt();
}

    public static void main(String[] args){

        int a = 0, b;
        String c, d;

        LinkedList list1 = new LinkedList();
        Student student[] = new Student[5];
        student[0] = new Student();
        sc = new Scanner(System.in);
        //choice = new Scanner(System.in);
        while (true) {
            a = choiceMenu();
            switch (a) {
                case 1:
                    System.out.println("Add a student: ID, LEVEL, NAME, and DEPARTMENT: ");
                    student[1] = new Student(sc.nextInt(), sc.nextInt(), sc.next(), sc.next());
                    School.addStudents(list1, student[1]);

                    //School.addStudents(list1, new Student(sc.nextInt(), sc.nextInt(), sc.next(), sc.next()));
                    break;

                case 2:
                    System.out.println("Student List: ");
                    School.listStudents(list1);
                    break;

                case 3:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid input");

            }
        }

    }
}
