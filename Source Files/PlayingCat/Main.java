public class Main {
    public static void main(String[] args) {
        int value = 3;
        if (value == 1) {
            System.out.println("Value was 1");
            
        } else if (value == 2) {
            System.out.println("Value was 2");
            
        } else {
            System.out.println("Value was not 1 or 2");
        }

        int switchValue = 6;

        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.printf("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("was a 3, 4, or 5");
                System.out.println("Actually it was a " + switchValue);
                break;
            default:
                System.out.println("Was not 1, 2, 3, 4, or 5");
                //break;
        }

        char testGrade = 'F';

        switch (testGrade) {
            case 'A':
                System.out.println("You got an A!");
                break;
            case 'B':
                System.out.println("You got an B!");
                break;
            case 'C':
                System.out.println("You got an C!");
                break;
            case 'D':
                System.out.println("You got an D!");
                break;
            case 'F':
                System.out.println("You Failed!");
                break;
            default:
                System.out.println("No grade found");
                break;

        }

        String month = "July";
        switch (month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;
            case "july":
                System.out.println("Jul");
                break;
            default:
                System.out.println("Not sure");
        }






    }
}