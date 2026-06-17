public class RestartExample {

    public static void main(String[] args) {

        String state = "RESTART";

        switch(state) {

            case "START":
                System.out.println("Program started");
                break;

            case "PAUSE":
                System.out.println("Program paused");
                break;

            case "STOP":
                System.out.println("Program stopped");
                break;

            case "RESTART":
                System.out.println("Program restarted");
                break;

            default:
                System.out.println("Unknown state");
        }

    }
}

