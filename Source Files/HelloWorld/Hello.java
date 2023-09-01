public class Hello {

        public static void main(String[] args){
                System.out.println("Hello Greg");

                int myFirstNumber = (10 + 5) +(2 * 10);
                int mySecondNumber = 12;
                int myThirdNumber = myFirstNumber * 2;
                int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;


                System.out.println(myTotal);
                int myLastOne = 1000 - myTotal;
                System.out.println(myLastOne);

                int myMinIntValue = Integer.MIN_VALUE;
                int myMaxIntValue = Integer.MAX_VALUE;
                System.out.println("Integer Minimum Value = " + myMinIntValue);
                System.out.println("Integer Maximum Value = " + myMaxIntValue);
                
                

                byte myMinByteValue = Byte.MIN_VALUE;
                byte myMaxByteValue = Byte.MAX_VALUE;
                System.out.println("Byte Minimum Value = " + myMinByteValue);
                System.out.println("Byte Maximum Value = " + myMaxByteValue);

                short myMinShortValue = Short.MIN_VALUE;
                short myMaxShortValue = Short.MAX_VALUE;
                System.out.println("Short Minimum Value = " + myMinShortValue);
                System.out.println("Short Maximum Value = " + myMaxShortValue);

                long myLongValue = 100;
                long myMinLongValue = Long.MIN_VALUE;
                long myMaxLongValue = Long.MAX_VALUE;
                System.out.println("Long Minimum Value = " + myMinLongValue);
                System.out.println("Long Maximum Value = " + myMaxLongValue);
                long bigLongLiteralValue = 2_147_483_647_234L;
                System.out.println(bigLongLiteralValue);

                short bigShortLiteralValue = 32767;

                myTotal = (myMinIntValue / 2);

                byte myNewByteValue = (byte)(myMinByteValue / 2);

                short myNewShortValue = (short) (myMinShortValue / 2);

                byte myByteChallenge = 10;
                short myShortChallenge = 20;
                int myIntChallenge = 50;

                long myLongChallenge = (50_000L + (10L*(myByteChallenge + myShortChallenge + myIntChallenge)));
                System.out.println(myLongChallenge);

                short shortTotal = (short) (1000 + 10 *
                        (myByteChallenge + myShortChallenge + myIntChallenge));




        }
}

