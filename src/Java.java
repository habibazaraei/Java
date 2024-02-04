public class Java {
    public static void main(String[] args) {

        /* Declaring Variables */
        int age = 25;
        double salary = 50000.0;
        String name = "John";

        /* For Loop */
        for (int i = 0; i < 5; i++) {
            System.out.println("Iteration: " + i);
        }

        /* While Loop */
        int count = 0;
        while (count < 3) {
            System.out.println("Count: " + count);
            count++;
        }

        /* Do-While Loop */
        int num = 1;
        do {
            System.out.println("Number : " + num);
            num++;
        } while (num < +3);

        /* If Statments */
        int x = 10;
        if (x > 5) {
            System.out.println("x is greater than 5");
        }

        /* If-Else Statments */
        int number = 7;
        if (number % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        /* Nested If-Else */
        int ages = 18;
        if (ages >= 18) {
            if (ages < 21) {
                System.out.println("You're eligible but not for alcohol");
            } else {
                System.out.println("You're eligible for everything");
            }
        } else {
            System.out.println("You're not eligible");
        }

        /* Switch Case */
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            // ...
            default:
                System.out.println("Invalid day");
        }


    }
}
