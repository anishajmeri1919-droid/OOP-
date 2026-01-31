class practical12 {
    int x;
    int y;

    practical12() {
        x = 5;
        y = 5;
    }

    practical12(int x, int y) {
        this.x = x;
        this.y = y;
    }

    practical12(practical12 p) {
        this.x = p.x;
        this.y = p.y;
    }

    void display() {
        System.out.println("Point: (" + x + ", " + y + ")");
    }

    public static void main(String[] args) {
        practical12 point1 = new practical12();
        System.out.print("Default Constructor: ");
        point1.display();

        practical12 point2 = new practical12(10, 20);
        System.out.print("Parameterized Constructor: ");
        point2.display();

        practical12 point3 = new practical12(point2);
        System.out.print("Copy Constructor: ");
        point3.display();
    }
}
