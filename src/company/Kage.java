package company;

public class Kage {

    // ingredienser til 10 personer
    private double dlCream = 2.5;
    private double numberOfEggs = 1;
    private double grSugar = 100;
    private double grFlour = 150;
    private final double TSP_BUTTER = 1;

    // antal personer
    private final double NUMBER_OF_PERSONS = 10;
    private double wantedNumberOfPersons;
    private double scaleFactor;
    //vægt af ingredienser
    private double creamWeight = 100;
    private double eggWeight = 60;
    private double sugarWeight = 1;
    private double flourWeight = 1;
    private double butterWeight = 5;
    private double wetWeight;
    private double dryWeight;
    private final double BAKE_FACTOR = 0.9;
    //KJ per gr. er ingredienser
    private final double CREAM_KJ_PER_GR = 14.84;
    private final double EGG_KJ_PER_GR = 5.76;
    private final double SUGAR_KJ_PER_GR = 17;
    private final double FLOUR_KJ_PER_GR = 14.76;
    private final double BUTTER_KJ_PER_GR = 30.30;
    private double totalKJ;

    public Kage(double wantedNumberOfPersons) {
        this.wantedNumberOfPersons = wantedNumberOfPersons;
        this.scaleFactor = this.wantedNumberOfPersons / NUMBER_OF_PERSONS;
    }

    public double getWetWeight() {
        wetWeight = ((dlCream * creamWeight) + (numberOfEggs * eggWeight) +
                (grSugar * sugarWeight) + (grFlour * flourWeight)) * scaleFactor;
        return wetWeight;
    }

    public double getDryWeight() {
        dryWeight = wetWeight * BAKE_FACTOR;
        return dryWeight;
    }

    public double getTotalKJ() {
        double creamKJInCake = (dlCream * creamWeight * CREAM_KJ_PER_GR * scaleFactor);
        double eggsKJInCake = (numberOfEggs * eggWeight * EGG_KJ_PER_GR * scaleFactor);
        double sugarKJInCake = (grSugar * sugarWeight * SUGAR_KJ_PER_GR * scaleFactor);
        double flourKJInCake = (grFlour * flourWeight * FLOUR_KJ_PER_GR * scaleFactor);
        double butterKJInCake = (TSP_BUTTER * butterWeight * BUTTER_KJ_PER_GR);
        totalKJ = (creamKJInCake + eggsKJInCake + sugarKJInCake + flourKJInCake + butterKJInCake);
        return totalKJ;
    }

    @Override
    public String toString() {

        return "Til " + wantedNumberOfPersons + " personer, skal du bruge:\n" +
                "Fløde " + dlCream * scaleFactor + " dl \n" +
                "Æg " + numberOfEggs * scaleFactor + "\n" +
                "Sukker " + grSugar * scaleFactor + " gr.\n" +
                "Mel " + grFlour * scaleFactor + " gr.\n" +
                "Smør " + TSP_BUTTER + " tsk.\n";
    }
}


