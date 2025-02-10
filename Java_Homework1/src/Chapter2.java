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

        //Ex. 2.14
        System.out.print("Enter weight in pounds: ");
        double pounds = input.nextDouble();
        System.out.print("Enter height in inches: ");

        double height = input.nextDouble();
        double weightInPounds = pounds * 0.45359;
        double heightInMeters = height * 0.0254;

        double bmi = weightInPounds / (heightInMeters * heightInMeters);
        System.out.println("BMI is " + bmi);

        //Ex. 2.15
        System.out.print("Enter x1 and y1: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        System.out.print("Enter x2 and y2: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.println("The distance between the two points is " + distance);

        //Ex. 2.16
        System.out.print("Enter the length of the side: ");
        double s = input.nextDouble();

        double area = (3 * Math.sqrt(3) / 2) * (s * s);

        System.out.println("The area of the hexagon is " + area);

        //Ex. 2.17
        System.out.print("Enter the temperature in Fahrenheit (-58 to 41): ");
        double temperature = input.nextDouble();

        System.out.print("Enter the wind speed (>= 2) in miles per hour: ");
        double windSpeed = input.nextDouble();

        double windChill = 35.74 + 0.6215 * temperature
                - 35.75 * Math.pow(windSpeed, 0.16)
                + 0.4275 * temperature * Math.pow(windSpeed, 0.16);

        System.out.println("The wind chill index is " + windChill);

        //Ex. 2.18
        System.out.println("a   b   pow(a, b)");
        for (int a = 1, b = 2; a <= 5; a++, b++) {
            System.out.println(a + "   " + b + "   " + (int) Math.pow(a, b));
        }

        //Ex. 2.19
        System.out.print("Enter x1 y1 x2 y2 x3 y3: ");
        double x1 = input.nextDouble(), y1 = input.nextDouble();
        double x2 = input.nextDouble(), y2 = input.nextDouble();
        double x3 = input.nextDouble(), y3 = input.nextDouble();

        double side1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double side2 = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
        double side3 = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));

        double s = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

        System.out.println("The area of the triangle is " + area);

        //Ex. 2.20
        System.out.print("Enter balance and interest rate (e.g., 3 for 3%): ");
        double balance = input.nextDouble();
        double annualInterestRate = input.nextDouble();

        double interest = balance * (annualInterestRate / 1200);
        System.out.printf("The interest is %.5f\n", interest);

        //Ex. 2.21
        System.out.print("Enter investment amount: ");
        double investmentAmount = input.nextDouble();
        System.out.print("Enter annual interest rate in percentage: ");
        double annualInterestRate = input.nextDouble();
        System.out.print("Enter number of years: ");
        int years = input.nextInt();

        double monthlyInterestRate = annualInterestRate / 1200;
        double futureInvestmentValue = investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);

        System.out.printf("Future value is $%.2f\n", futureInvestmentValue);

        //Ex. 2.22
        System.out.print("Enter an amount in cents (e.g., 1156 for $11.56): ");
        int amount = input.nextInt();

        int dollars = amount / 100;
        int cents = amount % 100;

        System.out.println("Dollars: " + dollars);
        System.out.println("Cents: " + cents);

        //Ex. 2.23
        System.out.print("Enter the driving distance: ");
        double distance = input.nextDouble();
        System.out.print("Enter miles per gallon: ");
        double milesPerGallon = input.nextDouble();
        System.out.print("Enter price per gallon: ");
        double pricePerGallon = input.nextDouble();

        double cost = (distance / milesPerGallon) * pricePerGallon;

        System.out.printf("The cost of driving is $%.2f\n", cost);
    }
}
