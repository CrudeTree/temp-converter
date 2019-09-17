package edu.cnm.deepdive;

import java.util.*;
import java.lang.Math;

public class TempConverter {

  private static Scanner input = new Scanner(System.in);

  public static void main(String[] args) {
      convert(input);
    }


  private static void convert(Scanner scanner) {
    String line;
    while (!(line  = scanner.nextLine().trim()).isEmpty()) {
      char finalChar = line.toUpperCase().charAt(line.length() - 1);
      if (finalChar == 'C') {
          double celsius = parseTemperature(line);
          System.out.printf("%.3fF%n", celsiusToFahrenheit(celsius));

      } else if (finalChar == 'F') {
          double fahrenheit = parseTemperature(line);
          System.out.printf("%.3fC%n", fahrenheitToCelsius(fahrenheit));
      }
    }
  }

    private static double parseTemperature(String line) {
        line = line.substring(0, line.length() - 1).trim();
        return Double.parseDouble(line);
    }

    public static double celsiusToFahrenheit(double celsius) {
    return 9 * celsius / 5 + 32;
  }

  public static double fahrenheitToCelsius(double fahrenheit) {
    return (fahrenheit - 32) * 5 / 9;
  }

}
