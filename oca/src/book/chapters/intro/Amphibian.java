package book.chapters.intro;

public class Amphibian implements CanSwim {
    @Override
    public void isTrue() {
        System.out.println("true");
}
}

class Tadpole extends Amphibian {

}