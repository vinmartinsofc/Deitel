package Deitel.ChapterIV;

public class StudentTest {
    public static void main(String[] args) {

        Student student1 = new Student("Jane Green", 93.5);
        Student student2 = new Student("John Blue", 72.75);

        System.out.printf("%s's average is: %.2f %n", student1.getName(), student1.getAverage());
        System.out.printf("%s's average is: %.2f %n", student2.getName(), student2.getAverage());


    }
}
