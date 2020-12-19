package chapters.one;



enum Season {
    WINTER("Low"), SPRING("Medium"), SUMMER("High"), FALL("Medium");
    private String expectedVisitors;

    Season(String expectedVisitors) {
        this.expectedVisitors = expectedVisitors;
    }

    public void printExpectedVisitors() {
        System.out.println(expectedVisitors);
    }
}

public class Enums {

    public static void main(String[] args) {
        Season.WINTER.printExpectedVisitors();
    }


}
