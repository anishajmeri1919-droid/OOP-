class practical16 {

    double calculateEMI(int principal, int time, float rate) {
        System.out.println("Home Loan EMI Calculation");
        System.out.println("Principal: " + principal);
        System.out.println("Time (Years): " + time);
        System.out.println("Rate: " + rate + "%");

        float monthlyRate = rate / (12 * 100);
        int months = time * 12;

        double emi = (principal * monthlyRate * Math.pow(1 + monthlyRate, months)) / 
                     (Math.pow(1 + monthlyRate, months) - 1);

        System.out.println("EMI: " + emi);
        System.out.println();
        return emi;
    }

    double calculateEMI(double principal, int time, double rate) {
        System.out.println("Vehicle Loan EMI Calculation");
        System.out.println("Principal: " + principal);
        System.out.println("Time (Years): " + time);
        System.out.println("Rate: " + rate + "%");

        double monthlyRate = rate / (12 * 100);
        int months = time * 12;

        double emi = (principal * monthlyRate * Math.pow(1 + monthlyRate, months)) / 
                     (Math.pow(1 + monthlyRate, months) - 1);

        System.out.println("EMI: " + emi);
        System.out.println();
        return emi;
    }

    double calculateEMI(int principal, int time) {
        System.out.println("Personal Loan EMI Calculation (10% Fixed Rate)");
        System.out.println("Principal: " + principal);
        System.out.println("Time (Years): " + time);
        System.out.println("Rate: 10%");

        float rate = 10;
        float monthlyRate = rate / (12 * 100);
        int months = time * 12;

        double emi = (principal * monthlyRate * Math.pow(1 + monthlyRate, months)) / 
                     (Math.pow(1 + monthlyRate, months) - 1);

        System.out.println("EMI: " + emi);
        System.out.println();
        return emi;
    }

    public static void main(String[] args) {
        practical16 loan = new practical16();

        loan.calculateEMI(1000000, 15, 8.5f);

        loan.calculateEMI(500000.0, 5, 9.5);

        loan.calculateEMI(200000, 3);
    }
}
