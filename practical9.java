class practical9 {
    double width = 1;
    double height = 1;
    practical9() {
    }
    practical9(double width, double height) {
        this.width = width;
        this.height = height;
    }
    double getArea() {
        return width * height;
    }
    double getPerimeter() {
        return 2 * (width + height);
    }

    public static void main(String[] args) {
        practical9 rect1 = new practical9();
        System.out.println("Rectangle 1 - Area: " + rect1.getArea() + ", Perimeter: " + rect1.getPerimeter());

        practical9 rect2 = new practical9(5, 10);
        System.out.println("Rectangle 2 - Area: " + rect2.getArea() + ", Perimeter: " + rect2.getPerimeter());
    }
}
