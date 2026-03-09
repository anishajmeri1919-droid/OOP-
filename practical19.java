import java.util.Scanner;

class practical19
{
    String collegeName;

    practical19(String name)
    {
        collegeName = name;
    }

    class Admission
    {
        String studentName;
        String course;

        void acceptDetails()
        {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter Student Name: ");
            studentName = sc.nextLine();

            System.out.print("Enter Course: ");
            course = sc.nextLine();
        }

        void displayDetails()
        {
            System.out.println("\nAdmission Details:");
            System.out.println("College Name: " + collegeName);
            System.out.println("Student Name: " + studentName);
            System.out.println("Course Name: " + course);
        }
    }

    public static void main(String[] args)
    {
        System.out.println("250393107004");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter College Name: ");
        String cname = sc.nextLine();

        practical19 c = new practical19(cname);

        practical19.Admission a = c.new Admission();

        a.acceptDetails();
        a.displayDetails();

        sc.close();
    }
}
