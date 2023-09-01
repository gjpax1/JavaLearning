import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner anything = new Scanner(System.in);

        System.out.println("Enter your year of birth:");
        boolean hasNextInt = anything.hasNextInt();


        if (hasNextInt) {
            int yearOfBirth = anything.nextInt();
            anything.nextLine(); //handle next line character (enter key)

            System.out.println("Enter your name: ");
            String name = anything.nextLine();

            int age = 2022 - yearOfBirth;

            if ((age >= 0) && (age <= 100)) {
                System.out.println("Your name is " + name + ", and you are " + age + " years old.");
            } else {
                System.out.println("Invalid year of birth");
            }

        } else {
            System.out.println("Unable to parse year of birth");
        }

        anything.close();
    }
}