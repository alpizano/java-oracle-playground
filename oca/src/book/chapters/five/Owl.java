package book.chapters.five;

public class Owl implements Nocturnal {
    public boolean isBlind() {
        return false;
    }

    public static void main(String[] args) {
        //Owl owl = new Owl();
        Nocturnal nocturnal = new Owl();
        System.out.println(nocturnal.isBlind());
    }
}
