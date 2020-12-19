package chapters.four;

public class Animal {
    private String species;
    private boolean canHop;
    private boolean canSwim;

    public Animal(String species, boolean canHop, boolean canSwim) {
        this.species = species;
        this.canHop = canHop;
        this.canSwim = canSwim;
    }

    public boolean isCanHop() {
        return canHop;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "species='" + species + '\'' +
                '}';
    }

    public boolean isCanSwim() {
        return canSwim;
    }


}
