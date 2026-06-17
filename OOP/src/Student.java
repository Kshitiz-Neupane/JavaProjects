public class Student {
    String name;
    int score;

    void checkPF(String name, int score){
        if(score>=35){
            System.out.println(name + " is pass and score is " + score);
        }
        else{
            System.out.println(name + " is fail and score is " + score);
        }
    }
}
