import java.util.List;
import java.util.Scanner;

public class StudentDTO implements IStudent{
    @Override
    public void inputData(List<Student> list) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());

        if(n >= 1 && n<=1000){
            for(int i = 1; i<=n;i++) {
                String divison = sc.next().toLowerCase();
                int english = Integer.parseInt(sc.next());
//                    try {
//                        if (english >= 0 && english <= 100) {
//                            break;
//                        } else {
//                            System.out.println("điểm phải nằm trong khoảng 0 - 100 ");
//                        }
//                    } catch (Exception e) {
//                        System.out.println("điểm phải là số nguyên, vui lòng nhập lại");
//                    }
                int math = Integer.parseInt(sc.next());
                do {
                    try {

                        if (math >= 0 && math <= 100) {
                            break;
                        } else {
                            System.out.println("điểm phải nằm trong khoảng 0 - 100 ");
                        }
                    } catch (Exception e) {
                        System.out.println("điểm phải là số nguyên, vui lòng nhập lại");
                    }
                } while (true);
                int science = Integer.parseInt(sc.next());
                do {
                    try {

                        if (science >= 0 && science <= 100) {
                            break;
                        } else {
                            System.out.println("điểm phải nằm trong khoảng 0 - 100 ");
                        }
                    } catch (Exception e) {
                        System.out.println("điểm phải là số nguyên, vui lòng nhập lại");
                    }
                } while (true);
                int japanese = Integer.parseInt(sc.next());
                do {
                    try {

                        if (japanese >= 0 && japanese <= 100) {
                            break;
                        } else {
                            System.out.println("điểm phải nằm trong khoảng 0 - 100 ");
                        }
                    } catch (Exception e) {
                        System.out.println("điểm phải là số nguyên, vui lòng nhập lại");
                    }
                } while (true);
                int history = Integer.parseInt(sc.next());
                do {
                    try {

                        if (history >= 0 && history <= 100) {
                            break;
                        } else {
                            System.out.println("điểm phải nằm trong khoảng 0 - 100 ");
                        }
                    } catch (Exception e) {
                        System.out.println("điểm phải là số nguyên, vui lòng nhập lại");
                    }
                } while (true);
                Student student = new Student(divison,english,math, science, japanese, history);
                list.add(student);
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
    public void checkPass(Student s) {

    }
}
