public class Area {
    public void computeArea(double length, double breadth){
        double area = length*breadth;
        System.out.println("Area of rectangle is " + area);
    }

    public void computeArea(double length){
        double area1 = length*length;
        System.out.println("Area of square is " + area1);
    }
}
