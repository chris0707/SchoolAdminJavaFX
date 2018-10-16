import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.event.EventHandler;
import javax.swing.*;
import java.util.LinkedList;

public class GuiMain extends Application{

    Button button;
    Stage window;
    Scene scene1, adminScene, studentScene;


    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{

        window = primaryStage;

       /* button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                System.out.println("Student Added");
            }
        });

        //Or for a shorter version

        button.setOnAction(e -> {
            System.out.println("Student Added");
            System.out.println("Student asd");

        });
        */

       //Grid for main scene = scene1
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10,10,10,10));
        grid.setVgap(8);
        grid.setHgap(10);


        Button adminButton = new Button("Administrator");
        GridPane.setConstraints(adminButton, 0, 0);

        Button studentButton = new Button("Student");
        GridPane.setConstraints(studentButton, 1, 0);

        grid.getChildren().addAll(adminButton, studentButton);
        grid.setAlignment(Pos.CENTER);

        adminButton.setOnAction(e -> window.setScene(adminScene));
        studentButton.setOnAction(e -> window.setScene(studentScene));

        scene1 = new Scene(grid, 350, 250);


        //Grid for Admin scene
        GridPane grid1 = new GridPane();
        grid1.setPadding(new Insets(10,10,10,10));
        grid1.setVgap(8);
        grid1.setHgap(10);

        Button backButton = new Button("Return");
        GridPane.setConstraints(backButton, 0, 0);

        Label list1 = new Label("ID:");
        GridPane.setConstraints(list1,0,1);

        Label list2 = new Label("Level:");
        GridPane.setConstraints(list2,0,2);

        Label list3 = new Label("Name:");
        GridPane.setConstraints(list3,0,3);

        Label list4 = new Label("Department:");
        GridPane.setConstraints(list4,0,4);

        Label studentList = new Label("List of Students:");
        GridPane.setConstraints(studentList,3,0);

        TextField text1 = new TextField();
        text1.setPromptText("student ID");
        GridPane.setConstraints(text1, 1,1);

        TextField text2 = new TextField();
        text2.setPromptText("student level");
        GridPane.setConstraints(text2, 1,2);

        TextField text3 = new TextField();
        text3.setPromptText("full name");
        GridPane.setConstraints(text3, 1,3);

        TextField text4 = new TextField();
        text4.setPromptText("department");
        GridPane.setConstraints(text4, 1,4);




        Button addStudentButton  = new Button("Add a Student");
        GridPane.setConstraints(addStudentButton,0,5);

        Button listStudentButton = new Button("List all Students");
        GridPane.setConstraints(listStudentButton,0,6);

        backButton.setOnAction(e -> window.setScene(scene1));

        LinkedList linkedList = new LinkedList();
        Student student[] = new Student[5];
        student[0] = new Student();



            addStudentButton.setOnAction(e -> {
                try {
                int id = Integer.valueOf(text1.getText());
                int level = Integer.valueOf(text2.getText());
                String name = text3.getText();
                String department = text4.getText();

                if(name.isEmpty() || department.isEmpty()) {
                    System.out.println("Please fill in all fields(name and department).");

                }else{
                    student[1] = new Student(id, level, name, department);
                    School.addStudents(linkedList, student[1]);
                    System.out.println("Student added");
                }

            }catch (NumberFormatException ex){
                System.out.println("Please fill in all fields.");

            }


        });

        listStudentButton.setOnAction(e -> {
            String stu = "";

            School.listStudents(linkedList);

            stu = School.listStudentsLabel(linkedList);

            studentList.setText(stu);

        });


        grid1.getChildren().addAll(backButton, list1, list2, list3, list4, studentList, text1, text2, text3, text4, addStudentButton, listStudentButton);
        grid1.setAlignment(Pos.CENTER_LEFT);

        adminScene = new Scene(grid1, 700,300);


        //Grid for Student scene
        GridPane grid2 = new GridPane();
        grid2.setPadding(new Insets(10,10,10,10));
        grid2.setVgap(8);
        grid2.setHgap(10);

        Button backButton2 = new Button("Return");
        GridPane.setConstraints(backButton2, 0, 0);

        backButton2.setOnAction(e -> window.setScene(scene1));

        grid2.getChildren().addAll(backButton2);
        studentScene = new Scene(grid2, 350,250);


        //Grid for Adding a student
















        window.setScene(scene1);
        window.show();

    }

}