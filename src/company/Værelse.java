package company;

public class Værelse {
    public static void main(String[] args) {
        Lampe skrivebordslampe = new Lampe();
        Lampe sengelampe = new Lampe();
        Lampe loftslampe = new Lampe();
        Lampe lommelygte = new Lampe(false);
        //Vi tænder skrivebordslampen
        skrivebordslampe.trykPåKontakt();
        System.out.println("skrivebordslampen er slukket? " + skrivebordslampe.isSlukket());
        System.out.println("Sengelampen er slukket? " + sengelampe.isSlukket());
        System.out.println("loftslampen er slukket? " + loftslampe.isSlukket());
        System.out.println("lommelygten er slukket? " +lommelygte.isSlukket());
    //Vi tænder for sengelampen og slukker lommelygten
        sengelampe.trykPåKontakt();
        lommelygte.trykPåKontakt();
        System.out.println("skrivebordslampen er slukket? " + skrivebordslampe.isSlukket());
        System.out.println("Sengelampen er slukket? " + sengelampe.isSlukket());
        System.out.println("loftslampen er slukket? " + loftslampe.isSlukket());
        System.out.println("lommelygten er slukket? " +lommelygte.isSlukket());
//Vi slukker for sengelampen
        sengelampe.trykPåKontakt();
        System.out.println("skrivebordslampen er slukket? " + skrivebordslampe.isSlukket());
        System.out.println("Sengelampen er slukket? " + sengelampe.isSlukket());
        System.out.println("loftslampen er slukket? " + loftslampe.isSlukket());
//Vi tænder for loftslampen
        loftslampe.trykPåKontakt();
        System.out.println("skrivebordslampen er slukket? " + skrivebordslampe.isSlukket());
        System.out.println("Sengelampen er slukket? " + sengelampe.isSlukket());
        System.out.println("loftslampen er slukket? " + loftslampe.isSlukket());
//Vi slukker for lofts- og skrivebordslampen
        loftslampe.trykPåKontakt();
        skrivebordslampe.trykPåKontakt();
        System.out.println("Skrivebordslampen er slukket? " + skrivebordslampe.isSlukket());
        System.out.println("Sengelampen er slukket? " + sengelampe.isSlukket());
        System.out.println("Loftslampen er slukket? " + loftslampe.isSlukket());
    }
}
