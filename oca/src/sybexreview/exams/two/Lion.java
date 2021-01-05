package sybexreview.exams.two;

public class Lion {
    // causes stack over flow error
    //Lion I = new Lion();
    Lion I;

    // also stack overflow error
//    public Lion() {
//        I = new Lion();
//    }

    public static void main(String[] args) {
        new Lion().roar();
    }

    public void roar() {
        Lion I = new Lion();
        if(this.I == I ) {
            System.out.println("roar");
        }
    }
}
