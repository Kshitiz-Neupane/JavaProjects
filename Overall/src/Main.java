import java.util.Scanner;
class Main{
    static void main(String[] args) {

        Scanner k = new Scanner(System.in);

        System.out.println("1. Turn On Fan");
        System.out.println("2. Turn On Light");

        System.out.println("3. Turn Off Fan");
        System.out.println("4. Turn Off Light");

        System.out.println("5. Change Fan Speed");
        System.out.println("6. Change Light brightness");

        System.out.println("Choose options from 1-4");
        int choice= k.nextInt();

        Fan fan = new Fan();
        Light light = new Light();
        if(choice==1){
            fan.turnOn();
        } else if (choice==2) {
            light.turnOn();
        } else if (choice==3) {
            fan.turnOff();
        } else if (choice==4) {
            light.turnOff();
        } else if (choice==5) {
            fan.changespeed();
        } else if (choice==6) {
            light.changebrightness();
        } else{
            System.out.println("Invalid choice");
        }
    }
}