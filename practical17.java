class practical17
{
    static int totalStudents;
    static String universityName;

    static
    {
        universityName = "ABC University";
        System.out.println("Static Block Executed");
    }

    {
        System.out.println("Instance Block Executed");
    }

    practical17()
    {
        totalStudents++;
        System.out.println("Constructor Executed");
    }

    static int getTotalStudents()
    {
        return totalStudents;
    }

    public static void main(String[] args)
    {
        System.out.println("250393107004");
        System.out.println("University Name: " + universityName);

        practical17 s1 = new practical17();
        practical17 s2 = new practical17();
        practical17 s3 = new practical17();

        System.out.println("Total Students: " + getTotalStudents());
    }
}