public class Printer {

    private double toner = 100;
    private int pagesPrinted = 0;
    private int sheetsPrinted = 0;
    private boolean printBothSides = true;

    public void printPage(int numberOfPages, boolean printBothSides){
        if(printBothSides) {
            this.sheetsPrinted += (numberOfPages/2 + numberOfPages%2);
        } else {
            this.sheetsPrinted += numberOfPages;
        }

        this.toner -= numberOfPages * 0.5;

        System.out.println(numberOfPages + " pages printed! \nToner level: " + this.toner + "%");

        if(this.toner <=25){
            System.out.println("Consider refilling");
        }

        System.out.println("Total sheets printed: " + this.sheetsPrinted );

        if(this.sheetsPrinted >= 100) {
            System.out.println("Printer needs maintenance!");
        }
    }

    public void fillToner(){
        setToner(100);
        System.out.println("Toner refilled!");
    }

    public void setToner(int toner) {
        this.toner = toner;
    }

    public void setPagesPrinted(int pagesPrinted) {
        this.pagesPrinted = pagesPrinted;
    }

    public double getToner() {
        return toner;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public boolean printBothSides() {
        return printBothSides;
    }

    public int getSheetsPrinted() {
        return sheetsPrinted;
    }
}
