package taskFour;

import java.util.Scanner;

public class TaskFour {
   private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the temperature: ");
                try {
                    double temperature = Double.parseDouble(sc.nextLine());
                    checkTemperature(temperature);
                    System.out.println("The device operates at a temperature " + temperature);
                } catch (TemperatureException e) {
                    System.out.println(e.getMessage());
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                } finally {
                    sc.close();
                }
            }

            private static void checkTemperature(double temperature) throws TemperatureException {

                if (temperature < -10 || temperature > 35) {
                    throw new TemperatureException("The device cannot operate outside the temperature regime (-10 +35)");
                }
            }
    }

