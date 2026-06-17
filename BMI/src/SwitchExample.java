public class SwitchExample {
    public static void main(String[] args){

        int state = 2;

        switch(state) {

            case 1:
                System.out.println("Idle State");
                break;

            case 2:
                System.out.println("Running State");
                break;

            case 3:
                System.out.println("Stopped State");
                break;

            default:
                System.out.println("Unknown State");
        }
    }
}
