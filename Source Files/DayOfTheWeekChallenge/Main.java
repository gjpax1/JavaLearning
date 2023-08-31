public class Main {
    public static void main(String[] args) {

        printDayOfTheWeek(0);
        printDayOfTheWeek(1);
        printDayOfTheWeek(2);
        printDayOfTheWeek(3);
        printDayOfTheWeek(4);
        printDayOfTheWeek(5);
        printDayOfTheWeek(6);
        printDayOfTheWeek(7);
        printDayOfTheWeek(8);
        printDayOfTheWeekIfThenElse(0);
        printDayOfTheWeekIfThenElse(1);
        printDayOfTheWeekIfThenElse(2);
        printDayOfTheWeekIfThenElse(3);
        printDayOfTheWeekIfThenElse(4);
        printDayOfTheWeekIfThenElse(5);
        printDayOfTheWeekIfThenElse(6);
        printDayOfTheWeekIfThenElse(7);
        printDayOfTheWeekIfThenElse(8);

    }
    public static void printDayOfTheWeek (int day) {
        switch (day) {
            case 1:
                System.out.println("The day of the week is Sunday");
                break;
            case 2:
                System.out.println("The day of the week is Monday");
                break;
            case 3:
                System.out.println("The day of the week is Tuesday");
                break;
            case 4:
                System.out.println("The day of the week is Wednesday");
                break;
            case 5:
                System.out.println("The day of the week is Thursday");
                break;
            case 6:
                System.out.println("The day of the week is Friday");
                break;
            case 7:
                System.out.println("The day of the week is Saturday");
                break;
            default:
                System.out.println("Invalid day");

        }

    }

    public static void  printDayOfTheWeekIfThenElse(int day) {
        if (day == 1) {
            System.out.println("The day of the week is Sunday");
        } else if (day ==2) {
            System.out.println("The day of the week is Monday");
        } else if (day ==3) {
            System.out.println("The day of the week is Tuesday");
        } else if (day ==4) {
            System.out.println("The day of the week is Wednesday");
        } else if (day ==5) {
            System.out.println("The day of the week is Thursday");
        } else if (day ==6) {
            System.out.println("The day of the week is Friday");
        } else if (day ==7) {
            System.out.println("The day of the week is Saturday");
        } else {
            System.out.println("Invalid day");


        }
    }

}