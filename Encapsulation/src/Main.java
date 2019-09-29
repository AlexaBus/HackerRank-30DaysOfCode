public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.printPage(160,true);
        printer.fillToner();

        printer.printPage(10, false);

        printer.printPage(17,true);

        System.out.println(Math.random());




    }

}
