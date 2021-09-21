package company;

public class Person {

    private String navn;
    private int alder;

    public Person(String navn, int alder) {
        this.navn = navn;
        this.alder = alder;
    }

    public void hasBirthday() {
        alder++;
    }

    public int getAlder() {
        return alder;
    }
    public String getNavn() {
        return navn;
    }

    @Override
    public String toString() {
        return "Navn: " +navn +", Alder:"+ alder;
    }
}
