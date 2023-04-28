import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        IStudent iStudent = new StudentDTO();
        List<Student> list = new ArrayList<>();
//        Student s = new Student();
        iStudent.inputData(list);
        iStudent.displayData(list);
        for (Student s1 : list) {
            System.out.println(iStudent.getTotal(s1));
            System.out.println(iStudent.getTotalScience(s1));
            System.out.println(iStudent.getTotalHumanities(s1));
        }

    }

}