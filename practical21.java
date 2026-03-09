class practical21
{
    double calculateVolume(double side)
    {
        return side * side * side;
    }

    double calculateVolume(double length, double width, double height)
    {
        return length * width * height;
    }

    double calculateVolume(double radius, boolean sphere)
    {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }

    public static void main(String[] args)
    {
        System.out.println("250393107004");
        practical21 vc = new practical21();

        double cubeVolume = vc.calculateVolume(4);
        double rectangularVolume = vc.calculateVolume(4, 5, 6);
        double sphereVolume = vc.calculateVolume(3, true);

        System.out.println("Cube Volume: " + cubeVolume);
        System.out.println("Rectangular Cube Volume: " + rectangularVolume);
        System.out.println("Sphere Volume: " + sphereVolume);
    }
}