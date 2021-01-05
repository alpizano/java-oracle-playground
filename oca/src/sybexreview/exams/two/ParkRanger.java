package sybexreview.exams.two;

interface WalksOn4Legs{}
class SuperMammal {

}
abstract class Mammal extends SuperMammal{
    public int numberOfOffspring;
}

class Antelope extends Mammal implements WalksOn4Legs { }

public class ParkRanger {
    public void noteNewOffspring(Mammal mammal) {
    }

    public static void main(String[] args) {
        WalksOn4Legs walkson4legs = new Antelope();
        Antelope antelope = new Antelope();
        SuperMammal superMammal = new SuperMammal();

        // won't compile
        //new ParkRanger().noteNewOffspring(walkson4legs);
        //new ParkRanger().noteNewOffspring(new SuperMammal());

        // compiles
        new ParkRanger().noteNewOffspring(antelope);
        // throws runtime exception
        new ParkRanger().noteNewOffspring(null);
        // classcast exception at runtime
       // new ParkRanger().noteNewOffspring((Mammal)new Object());


    }
}
