    public class DiagonalStar{
    public static void printSquareStar(int number){
        if(number < 5) System.out.println("Invalid Value");
        else{
            for (int row = 0; row <number; row++){
                for (int column=0; column<number; column++){
                    if(row==0 || row==number-1) System.out.print("*"); // top and bottom rows
                    else if(column==0) System.out.print("*"); // left column
                    else if(column==number-1) System.out.print("*"); // right column
                    else if(column==row) System.out.print("*"); // diagonal down to right
                    else if(column==number-1-row) System.out.print("*"); // diagonal down to left
                        // alternative to lines 7-11 // if(row==0 || row==number-1 || column==0 || column==number-1 || column==row || column==number-1-row) System.out.print("*");
                    else System.out.print(" ");  // empty space between numbers
                }
                System.out.println(""); // puts a return to the row
            }
        }
    }
}
