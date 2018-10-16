public class Student {

    private int id;
    private int level;
    private String name;
    private String department;

    public Student(int id, int level, String name, String department){
        this.id = id;
        this.level = level;
        this.name = name;
        this.department = department;

    }

    public Student(){
        this(1,12,"Chris", "Developer");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String toString(){
        return "ID: " + id + "\tLevel: " + level + "\tName: " + name + "\tDepartment: " + department;
    }
}
