public class LoopArray {
    static void main(String[] args) {
        double[] marks = {48, 58, 68, 78, 88, 98};
        double sum=0;
        for (int i=0; i<=5; ++i){
            sum = sum +marks[i];
        }
        System.out.println("The sum of your marks is "+ sum);

    }
}
