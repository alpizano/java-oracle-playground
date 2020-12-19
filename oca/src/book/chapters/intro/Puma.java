package chapters.intro;

public abstract class Puma implements HasTail{
    // protected not allowed - can't implement method with less access modifier?
    public int getTailLength() {
        return 4;
    }

}
