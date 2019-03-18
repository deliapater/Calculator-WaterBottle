public class Printer {
    private int paperLeft;
    private int toner;

    public Printer(int paperLeft, int toner) {
        this.paperLeft = paperLeft;
        this.toner = toner;
    }

    public int getPaperLeft(){
        return paperLeft;
    }

    public int getToner() {
        return toner;
    }

    public void print(int pages, int copies){
        if(paperLeft >= (pages * copies) && toner >= (pages * copies)) {
            this.paperLeft -= (pages * copies);
            this.toner -= (pages * copies);
        }
    }

    public void refill(){
        paperLeft = 100;
    }
}
