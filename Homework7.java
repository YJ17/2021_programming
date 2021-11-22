abstract class Printer {

    String model;
    int printedCount = 0;
    int availableCount;
    public abstract boolean print();

}

class InkjetPrinter extends Printer {

    public InkjetPrinter(String a, int b){
        super.model = a;
        super.availableCount = b;
    }

    public boolean print() {
        if(super.availableCount == 0){
            System.out.println(super.model + ": " + (super.printedCount + 1) + "매째 인쇄 실패 - 잉크 부족");
        }
        else if(super.availableCount >= 1){
            super.printedCount += 1;
            super.availableCount -= 1;

            return true;
        }
        return false;
    }

}

class LaserPrinter extends Printer {

    public LaserPrinter(String a, int b){
        super.model = a;
        super.availableCount = b;
    }

    public boolean print() {

        if(super.availableCount == 0){
            System.out.println(super.model + ": " + (super.printedCount + 1) + "매째 인쇄 실패 - 토너 부족");
        }
        else if(super.availableCount >= 1) {
            super.printedCount += 1;
            super.availableCount -= 1;

            return true;
        }
        return false;
    }

}


public class Homework7 {

    public static void main(String[] args){
        InkjetPrinter inkjet = new InkjetPrinter("Brother DCP-T720DW", 7500);
        LaserPrinter laser = new LaserPrinter("Canon MFC643Cdw", 1500);
        while (inkjet.print());
        while(laser.print());
    }

}
