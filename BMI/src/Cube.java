public class Cube {
    void findCube(){
        int n= 5;
        int cube= n*n*n;
        System.out.println("The cube of " +n+ " is: " +cube);
    }

    static void main(String[] args) {
        Cube obj = new Cube();

        obj.findCube();
    }


}
