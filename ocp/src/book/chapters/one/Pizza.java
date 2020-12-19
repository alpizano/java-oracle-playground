package chapters.one;

public enum Pizza {
    PEPPERONNI(7.99) {
        @Override
        public void printStuff() {
            System.out.println("I'm a pepperonni pizza!");
        }
    },
    SAUSAGE(10.00){
        @Override
        public void printStuff() {
            System.out.println("I'm a sausage pizza!");
        }
    },
    PINEAPPLE(15.00) {
        @Override
        public void printStuff() {
            System.out.println(("I'm a pineapple pizza!"));
        }
    },
    CHEESE(20.00) {
        @Override
        public void printStuff() {
            System.out.println("I'm a cheese pizza!");
        }
    };

    private double price;

    // Needs private constructor
    private Pizza(double price) {
        this.price=price;
    }

    public void printPrice() {
        System.out.println(price);
    }

    public abstract void printStuff();

    public static void main(String[] args) {
        Pizza.PEPPERONNI.printPrice();
        Pizza.SAUSAGE.printPrice();

        PEPPERONNI.printStuff();
    }
}


