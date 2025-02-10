import java.util.Scanner;

public class Chapter2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Ex. 2.1

        System.out.print("Enter a degree in Celsius: ");
        double celsius = input.nextDouble();
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.printf("%.2f", fahrenheit);

         //Ex. 2.2
        System.out.print("Enter the radius and length of a cylinder: ");
        double radius = input.nextDouble();
        double length = input.nextDouble();
        double area = Math.PI * radius * radius;
        double volume = length * area;
        System.out.println("The volume is " + volume);
        System.out.println("The area is " + area);

        //Ex. 2.3
        System.out.print("Enter a value for feet: ");
        double feet = input.nextDouble();

        double meters = feet * 0.305; // Conversion factor
        System.out.println(feet + " feet is " + meters + " meters");

        //Ex. 2.4
        System.out.print("Enter a number in pounds: ");
        double pounds = input.nextDouble();

        double kilograms = pounds * 0.454; // Conversion factor
        System.out.println(pounds + " pounds is " + kilograms + " kilograms");

        //Ex.2.5
        System.out.print("Enter the subtotal and a gratuity rate: ");
        double subtotal = input.nextDouble();
        double gratuity = input.nextDouble();

        double gr = subtotal * gratuity / 100;
        double total = subtotal + gr;
        System.out.println("The gratuity is $" + gr + " and the total is $" + total);

        //Ex. 2.6
        System.out.print("Enter a number between 0 and 1000: ");
        int number = input.nextInt();
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += number % 10;
            number /= 10;
        }
        System.out.println("The sum of the digits is " + sum);

        //Ex. 2.7
        System.out.print("Enter the number of minutes: ");
        long minutes = input.nextLong();

        long minutesInDay = 24 * 60;
        long minutesInYear = 365 * minutesInDay;
        long years = minutes / minutesInYear;
        long remainingDays = (minutes % minutesInYear) / minutesInDay;
        System.out.println(minutes + " minutes is approximately " + years + " years and " + remainingDays + " days");

        //Ex. 2.9
        System.out.print("Enter v0, v1, and t: ");
        double v0 = input.nextDouble();
        double v1 = input.nextDouble();
        double t = input.nextDouble();

        double acceleration = (v1 - v0) / t;
        System.out.printf("The average acceleration is %.4f%n", acceleration);

        //Ex. 2.10
        System.out.print("Enter the amount of water in kilograms: ");
        double M = input.nextDouble();

        System.out.print("Enter the initial temperature: ");
        double initialTemperature = input.nextDouble();

        System.out.print("Enter the final temperature: ");
        double finalTemperature = input.nextDouble();

        double Q = M * (finalTemperature - initialTemperature) * 4184;

        System.out.printf("The energy needed is %.1f joules%n", Q);

        //Ex. 2.11
        int currentPopulation = 312032486;
        int secondsPerYear = 365 * 24 * 60 * 60;
        int birthsPerYear = secondsPerYear / 7;
        int deathsPerYear = secondsPerYear / 13;
        int immigrantsPerYear = secondsPerYear / 45;

        System.out.print("Enter the number of years: ");
        int years = input.nextInt();
        int futurePopulation = currentPopulation + (years * (birthsPerYear + immigrantsPerYear - deathsPerYear));

        System.out.println("The population in " + years + " years is " + futurePopulation);

        //Ex. 2.12
        System.out.print("Enter speed (m/s) and acceleration (m/s²): ");
        double v = input.nextDouble();
        double a = input.nextDouble();

        double l = (v * v) / (2 * a);

        System.out.printf("The minimum runway length for this airplane is %.3f meters\n", l);

        //Ex. 2.13
        double interestRate = 0.00417;

        System.out.print("Enter the monthly saving amount: ");
        double monthlySaving = input.nextDouble();

        double accountValue = 0;
        for (int i = 1; i <= 6; i++) {
            accountValue = (accountValue + monthlySaving) * (1 + interestRate);
        }

        System.out.printf("After the sixth month, the account value is $%.2f\n", accountValue);
    }
}
