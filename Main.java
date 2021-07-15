public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape pentagon = new Pentagon();
        ShapeNamePrinter printer = new ShapeNamePrinter();
        printer.printShape(circle);
        printer.printShape(pentagon);
    }
}
