import java.util.Scanner;

class practical10 {
    String employeeName;
    double employeeSalary;

    void readEmployeeData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter employee name: ");
        employeeName = sc.nextLine();
        System.out.print("Enter employee salary: ");
        employeeSalary = sc.nextDouble();
    }

    void displayEmployeeData() {
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Employee Salary: " + employeeSalary);
    }

    public static void main(String[] args) {
        practical10 emp1 = new practical10();
        emp1.readEmployeeData();
        emp1.displayEmployeeData();

        System.out.println();

        practical10 emp2 = new practical10();
        emp2.readEmployeeData();
        emp2.displayEmployeeData();
    }
}
