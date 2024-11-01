import java.util.Scanner;

public class GradeBook {
    private String courseName;
    private Student[] students;
    private double[] grades;
    private int number0fStudents;

    public GradeBook(String courseName, Student[] students,int number0fStudents) {
        this.courseName = courseName;
        this.students = students;
        this.number0fStudents = number0fStudents;
        this.grades= new double[number0fStudents];
        displayMessage();
    }

    public void displayMessage() {
        System.out.printf("歡迎使用 %s 成績系統\n", courseName);
    }

    public void processStudents() {
        Scanner input = new Scanner(System.in);
            System.out.println("輸入學生成績: ");
            for (int i = 0; i < number0fStudents; i++) {
                students[i].printData();
                System.out.print("的成績: ");
                grades[i] = input.nextDouble();
            }


    }

    public double getMaximun() {
        double max = grades[0];
        for (int i = 1; i < number0fStudents; i++) {
            if (grades[i] > max) {
                max = grades[i];
            }
        }
        return max;
    }

    public double getMinimun() {
        double min = grades[0];
        for (int i = 1; i < number0fStudents; i++) {
            if (grades[i] < min) {
                min = grades[i];
            }
        }
        return min;
    }

    public double getAverage() {
        double sum = 0;
        for (int i = 0; i < number0fStudents; i++) {
            sum += grades[i];
        }
        return sum / number0fStudents;
    }

    public void displayGradeReport() {
        System.out.println("成績報告");
        System.out.println("學號\t姓名\t成績");
        System.out.println("--------------------------");
        for (int i = 0; i < number0fStudents; i++) {
            students[i].printData();
            System.out.printf(" %.1f\n", grades[i]);
        }
        System.out.println("--------------------------");
        System.out.printf("最高分: %.2f\n", getMaximun());
        System.out.printf("最低分: %.2f\n", getMinimun());
        System.out.printf("平均分: %.2f\n", getAverage());
    }

}
