package stuudent3;
import java.util.Scanner;

class Course {
    String courseName;
    int marks;

    public void getCourseDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter course name: ");
        courseName = sc.nextLine();
        System.out.print("Enter marks: ");
        marks = sc.nextInt();
        sc.close();
    }

    public void displayCourseDetails() {
        System.out.println("Course: " + courseName + ", Marks: " + marks);
    }

    public static void main(String[] args) {
        Course c = new Course();
        c.getCourseDetails();
        c.displayCourseDetails();
    }
}