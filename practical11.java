class practical11 {
    int hours;
    int minutes;

    void setTime(int h, int m) {
        hours = h;
        minutes = m;
    }

    void displayTime() {
        System.out.println("Time: " + hours + " hours and " + minutes + " minutes");
    }

    void addTime(practical11 t1, practical11 t2) {
        hours = t1.hours + t2.hours;
        minutes = t1.minutes + t2.minutes;

        if (minutes >= 60) {
            hours += minutes / 60;
            minutes = minutes % 60;
        }
    }

    public static void main(String[] args) {
        practical11 time1 = new practical11();
        time1.setTime(5, 30);
        System.out.print("Time 1: ");
        time1.displayTime();

        practical11 time2 = new practical11();
        time2.setTime(3, 45);
        System.out.print("Time 2: ");
        time2.displayTime();

        practical11 time3 = new practical11();
        time3.addTime(time1, time2);
        System.out.print("Sum of Time 1 and Time 2: ");
        time3.displayTime();
    }
}
