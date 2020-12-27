package sybexreview.chapters.four;

public interface Animal {
    final static String NAME = "Animal";
    // all interface instance variables are final and static
    int age = 0;
    String word = "";

//    public  void layEggs() {
//        System.out.println();
//    }

    public static void main(String[] args) {

    }
}


class Lizard  {
    //class Lizard extends Animal {

    public void layEggs() {
        System.out.println("Lizard laying eggs");
    }
}
