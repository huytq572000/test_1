import java.util.List;

public interface IStudent {
    public void inputData(List<Student> list);
    public void displayData(List<Student> list);
    public int getTotal(Student s);
    public int getTotalScience(Student s);
    public int getTotalHumanities(Student s);
    public void checkPass(Student s);
}
