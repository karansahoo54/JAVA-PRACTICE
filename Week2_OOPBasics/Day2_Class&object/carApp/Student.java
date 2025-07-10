public class Student {

    String name;
    int rollno;
    double marks;

    void dispalyInfo(){
        System.out.println("👨‍🎓 Name: " + name);
        System.out.println("🆔 Roll No: " + rollno);
        System.out.println("📊 Marks: " + marks);
    }

    public static void main(String[] args) {
        Student s1 = new Student();

        s1.name = "Rahul";
        s1.rollno = 101;
        s1.marks = 89.6;

        s1.dispalyInfo();
    }
}
