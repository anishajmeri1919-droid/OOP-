class practical13 {
    double width;
    double height;

    practical13(double width, double height) {
        this.width = width;
        this.height = height;
    }

    double getArea() {
        return width * height;
    }

    double getPerimeter() {
        return 2 * (width + height);
    }

    void display() {
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getPerimeter());
    }

    public static void main(String[] args) {
        practical13 rect1 = new practical13(4, 40);
        practical13 rect2 = new practical13(3.5, 35.9);

        System.out.println("Rectangle 1:");
        rect1.display();

        System.out.println("\nRectangle 2:");
        rect2.display();

        System.out.println();
        if (rect1.getArea() > rect2.getArea()) {
            System.out.println("Rectangle 1 has a larger area");
        } else if (rect2.getArea() > rect1.getArea()) {
            System.out.println("Rectangle 2 has a larger area");
        } else {
            System.out.println("Both rectangles have the same area");
        }
    }
}
