package company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

//Personopgave
        Person person = new Person("Mads", 41);
        System.out.println(person.getNavn());
        System.out.println(person.getAlder());
        System.out.println(person);
        person.hasBirthday();
        System.out.println(person.getAlder());
        person.hasBirthday();
        System.out.println(person.getAlder());
        System.out.println(person);

//Terningopgave
        Dice dice = new Dice(-1);
        dice.rollDice();
        System.out.println(dice.getFaceValue());
        dice.rollDice();
        System.out.println(dice.getFaceValue());
        dice.rollDice();
        System.out.println(dice.getFaceValue());

 // ekstraOpgave
        Dice[] terningerArray = new Dice[5];
        int sumAfTerninger = 0;
        for (int  i = 0; i < terningerArray.length; i++) {
            Dice terning =new Dice(-1);
            terningerArray[i] = terning;
            terning.rollDice();
            int terningVærdi = terning.getFaceValue();
            sumAfTerninger = sumAfTerninger + terningVærdi;
        }
        System.out.println(Arrays.toString(terningerArray));
        System.out.println("sum af terninger " + sumAfTerninger);


//Lampeopgave
        Lampe lampe = new Lampe(true);
        Lampe nyLampe = new Lampe();
        System.out.println("er ny lampe slukket? " + nyLampe.isSlukket());
        System.out.println("er lampe slukket? " + lampe.isSlukket());
        lampe.trykPåKontakt();
        System.out.println("er lampe slukket? " + lampe.isSlukket());
        lampe.trykPåKontakt();
        System.out.println("er lampe slukket? " + lampe.isSlukket());
        nyLampe.trykPåKontakt();
        System.out.println("er ny lampe slukket? " + nyLampe.isSlukket());

//Kageopgave version 2
        Kage kage = new Kage(2);
        System.out.println("Gode Råd - En Sønderjysk klassiker");
        System.out.println(kage);
        System.out.printf("Vægt af dej %.2f gr. \n", kage.getWetWeight());
        System.out.printf("Når kagen er bagt vejer den %.2f gr. \n", kage.getDryWeight());
        System.out.printf("energi indhold er: %.2f KJ \n", kage.getTotalKJ());

    }
}
