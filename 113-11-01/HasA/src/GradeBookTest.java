public class GradeBookTest {
    public  static void main(String[] args){
        final int NUMBER_OF_STUDENT = 3;
        Student[] students = new Student[NUMBER_OF_STUDENT];
        students[0] = new Student("A111222001", "陳楷運");
        students[1] = new Student("A111200139", "李蓮華");
        students[2] = new Student("A112224011", "林志霖");

        GradeBook gradeBook = new GradeBook("Java程式設計", students, 3);
        gradeBook.processStudents();
        gradeBook.displayGradeReport();
    }
}
