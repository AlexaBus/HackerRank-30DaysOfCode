public class Main {

    public static void main(String[] args) {
        Carpet carpet = new Carpet(1.5);
        Floor floor = new Floor(5.4, 4.5);
        Calculator calculator = new Calculator(floor, carpet);

        System.out.println(calculator.getTotalCost());

        ComplexNumber one = new ComplexNumber(1.0,1.0);
        ComplexNumber number = new ComplexNumber(2.5, -1.5);

        one.add(1,1);

        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        one.subtract(number);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        number.subtract(one);
        System.out.println("number.real= " + number.getReal());
        System.out.println("number.imaginary= " + number.getImaginary());

    }

}
