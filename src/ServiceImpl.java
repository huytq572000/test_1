import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ServiceImpl implements Service {
    public static List<Student> list = new ArrayList<>();
    @Override
    public void inputData(List<Student> list) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());

        if(n >= 1 && n<=1000){
            for(int i = 1; i<=n;i++) {
                String divison = sc.next().toLowerCase();
                try {
                    int english = Integer.parseInt(sc.next());

                    if (english < 0 && english >= 100) {
                        throw new Exception("điểm phải nằm trong khoảng 0 - 100 ");
                    }
                    int math = Integer.parseInt(sc.next());
                    if (math < 0 && math >= 100) {
                        throw new Exception("điểm phải nằm trong khoảng 0 - 100 ");
                    }
                    int science = Integer.parseInt(sc.next());


                    if (science < 0 && science >= 100) {
                        throw new Exception("điểm phải nằm trong khoảng 0 - 100 ");
                    }

                    int japanese = Integer.parseInt(sc.next());


                    if (japanese < 0 && japanese >= 100) {
                        throw new Exception("điểm phải nằm trong khoảng 0 - 100 ");
                    }

                    int history = Integer.parseInt(sc.next());

                    if (history < 0 && history >= 100) {
                        throw new Exception("điểm phải nằm trong khoảng 0 - 100 ");
                    }
                    Student student = new Student(divison, english, math, science, japanese, history);
                    list.add(student);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }else{
            System.out.println("nhập lại số sinh viên trong khoảng từ 1 - 1000");
        }
    }

    @Override
    public void displayData(List<Student> list) {
        for (Student s : list){
            System.out.println(s);
        }
    }

    @Override
    public int getTotal(Student s) {
        int  total = s.getEnglish()+s.getMath()+s.getScience()+s.getJapanese()+s.getHistory();
        return total;
    }

    @Override
    public int getTotalScience(Student s) {
        int  totalScience = s.getMath()+s.getScience();
        return totalScience;
    }

    @Override
    public int getTotalHumanities(Student s) {
        int  totalHumanities = s.getJapanese()+s.getHistory();
        return totalHumanities;
    }

    @Override
    public int handle() {
        int count = 0;
        for(Student student : list){
            if(getTotal(student) >=350){
                if(student.getDivison().equals("s")){
                    if(getTotalScience(student) >= 160){
                        count++;
                    }
                }else if(student.getDivison().equals("l")){
                    if(getTotalHumanities(student) >= 160){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
