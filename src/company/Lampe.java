package company;

public class Lampe {

    private boolean slukket;

    public Lampe(boolean slukket) {
        this.slukket = slukket;
    }
    public Lampe(){
        this.slukket=true;
    }

    public void trykPåKontakt() {
        if (slukket) {
            slukket = false;
        } else {
            slukket = true;
        }
    }

    public boolean isSlukket() {
        return slukket;
    }
}
