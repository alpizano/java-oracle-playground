package sybexreview.exams.one;

public class YearSwitch {
    static String year = "Senior";

    public static void main(String[] args) {
        // returns Congratulations
        switch(year) {
            case "Freshman":
            default:
            case "Sophmore":
            case "Junior":
                System.out.print("See you next year");
                break;
            case "Senior":
                System.out.print("Congratulations");
        }



    }

}
