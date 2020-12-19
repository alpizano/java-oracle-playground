package intro;

public class Deer {
    public Deer() {
        System.out.print("Deer");
    }

    public Deer(int age) {
        System.out.print("DeerAge");
    }

    private boolean hasHorns() {
        return false;
    }

    public static void main(String[] args) {
       Deer deer = new Reindeer();
        System.out.println(","+deer.hasHorns());

    }
}

class Reindeer extends Deer {

    public Reindeer() {
        System.out.print("Reindeer");
    }

    public boolean hasHorns() {
        return true;
    }

}
