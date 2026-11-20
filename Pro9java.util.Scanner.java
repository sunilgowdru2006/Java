
import java.util.Scanner;

class Student {
    String name, course = "BCA";
    int rollno, m1, m2, m3, total;

    void setStudent() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name, rollno, m1, m2, m3:");
        name = sc.next();
        rollno = sc.nextInt();
        m1 = sc.nextInt();
        m2 = sc.nextInt();
        m3 = sc.nextInt();

        total = m1 + m2 + m3;
    }

    void display() {
        System.out.println(course + "\t" + rollno + "\t" +
                name + "\t" + m1 + "\t" + m2 + "\t" +
                m3 + "\t" + total);
    }
}

class Firstyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student s[] = new Student[10];

        int n, max = 0;
        String beststudent = "";

        System.out.println("Enter no of students:");
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            s[i] = new Student();
            s[i].setStudent();

            if (s[i].total > max) {
                max = s[i].total;
                beststudent = s[i].name;
            }
        }

        System.out.println("Course\tRollNo\tName\tM1\tM2\tM3\tTotal");

        for (int i = 0; i < n; i++) {
            s[i].display();
        }

        System.out.println("\nBest Student: " + beststudent);
        System.out.println("Marks: " + max);
    }
}
