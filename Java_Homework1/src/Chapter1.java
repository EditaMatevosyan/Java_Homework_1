public class Chapter1 {
    public static void main(String[] args) {
        // 1.1 
        System.out.println("Welcome to Java");
        System.out.println("Welcome to Computer Science");
        System.out.println("Programming is fun");

        // 1.2 
        for (int i = 0; i < 5; i++) {
            System.out.println("Welcome to Java");
        }

        // 1.3 
        System.out.println("    J     A    V     V    A");
        System.out.println("    J    A A    V   V    A A");
        System.out.println("J   J   AAAAA    V V    AAAAA");
        System.out.println(" J J   A     A    V    A     A");

        // 1.4 
        System.out.println("a   a^2  a^3");
        System.out.println("1   1    1");
        System.out.println("2   4    8");
        System.out.println("3   9    27");
        System.out.println("4   16   64");

        // 1.5 
        System.out.println((9.5 * 4.5 - 2.5 * 3) / (45.5 - 3.5));

        // 1.6 
        System.out.println(1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9);

        // 1.7 
        System.out.println(4.0 * (1 - 1.0 / 3 + 1.0 / 5 - 1.0 / 7 + 1.0 / 9 - 1.0 / 11));
        System.out.println(4.0 * (1 - 1.0 / 3 + 1.0 / 5 - 1.0 / 7 + 1.0 / 9 - 1.0 / 11 + 1.0 / 13));

        // 1.8 
        double radius = 5.5;
        double pi = 3.14159;
        System.out.println("Perimeter: " + (2 * radius * pi));
        System.out.println("Area: " + (radius * radius * pi));

        // 1.9 
        double width = 4.5, height = 7.9;
        System.out.println("Perimeter: " + (2 * (width + height)));
        System.out.println("Area: " + (width * height));

        // 1.10 
        double kilometers = 14;
        double miles = kilometers / 1.6;
        double hours = (45.0 + 30.0 / 60) / 60; // Convert minutes and seconds to hours
        System.out.println("Average speed in miles per hour: " + (miles / hours));

        // 1.11 
        int currentPopulation = 312032486;
        int secondsPerYear = 365 * 24 * 60 * 60; // Total seconds in a year
        int birthsPerYear = secondsPerYear / 7;
        int deathsPerYear = secondsPerYear / 13;
        int immigrantsPerYear = secondsPerYear / 45;

        System.out.println("Population Projection:");
        for (int year = 1; year <= 5; year++) {
            currentPopulation += birthsPerYear - deathsPerYear + immigrantsPerYear;
            System.out.println("Year " + year + ": " + currentPopulation);
        }

        // 1.12 
        double m = 24;
        double km = m * 1.6;
        double totalSeconds = 3600 + 40 * 60 + 35; // Convert hours, minutes, and seconds to total seconds
        double h = totalSeconds / 3600; // Convert to hours
        double averageSpeed = km / h;

        System.out.println("\nAverage speed in km/h: " + averageSpeed);

        // 1.13 
        double a = 3.4, b = 50.2, e = 44.5;
        double c = 2.1, d = 0.55, f = 5.9;
        double denominator = a * d - b * c;

        if (denominator != 0) {
            double x = (e * d - b * f) / denominator;
            double y = (a * f - e * c) / denominator;

            System.out.println("\nSolution for the system of equations:");
            System.out.println("x = " + x);
            System.out.println("y = " + y);
        } else {
            System.out.println("\nThe system has no solution (denominator is zero).");
        }
    }
}
