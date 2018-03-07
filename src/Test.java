import java.util.Arrays;

public class Test {

    public void init(){
        Undervisere andras = new Undervisere("Andras", "11223344");
        Kursus parkour = new Kursus("Parkour for Begyndere", "En urban sportsgren");
        Lokale na005 = new Lokale("na005");
        Elever michael = new Elever("Michael", "Hansen", "Semester 2", 24);
        Skole easj = new Skole("EASJ");

        System.out.println("Elevens navn: " + michael.getElevFornavn() + " " + michael.getElevEfternavn()
                + "\nKursus: " + parkour.getKursusNavn()
                + "\nKursus info: " + parkour.getKursusInfo()
                + "\nUnderviser: " + andras.getUnderviserNavn()
                + "\nLokale: " + na005.getLokalenr());


    }
}
