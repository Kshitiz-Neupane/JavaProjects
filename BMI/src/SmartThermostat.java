import java.util.Scanner;
public class SmartThermostat {
    public static void main(String[] args) {
        int currentTemp = 70;
        int targetTemp = 75;
        String mode;
        if (targetTemp > currentTemp) {
            mode = "Heating";
        } else if (targetTemp < currentTemp) {
            mode = "Cooling";
        } else {
            mode = "Standby";
        }
        System.out.println("Thermostat Mode: " + mode);
        while (currentTemp != targetTemp) {
            if (mode == "Heating") {
                currentTemp++;
                System.out.println("Heating up... Current Temp: " + currentTemp);
            } else if (mode == "Cooling") {
                currentTemp--;
                System.out.println("Cooling down... Current Temp: " + currentTemp);
            }
        }
        System.out.println("Target temperature reached.");
    }
}
