public class Student {
    public static void main(String[] args) {


        Student student = new Student();
        System.out.println(student.name);
        System.out.println(student.classes);

    }
    private String name = "Quan";
    private String classes = "abc";

    public Student(String name, String classes) {
        this.name = name;
        this.classes = classes;
    }

    public Student() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }
}
