package ie.atu.week6;

import java.util.InputMismatchException;
import java.util.Scanner;

    public class UsingTryCatch {
        public static void main(String[] args) {
           int execpt = 1;

            while (execpt == 1)
            {
                System.out.println("Please Enter a Number Between 0 - 9:");
                Scanner myscan = new Scanner(System.in);
                    try {

                        int myNum = myscan.nextInt();
                        if (myNum <= 9 && myNum >= 0) {
                            System.out.println("You Entered " + myNum);
                            execpt = 0;
                        } else {
                            System.out.println("Not a Valid Number");
                        }

                    } catch (InputMismatchException e) {
                        System.out.println("Error Recieved");

                    }
                }

        }
    }

