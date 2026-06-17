public class Std {
    String grade;
    int score;

    Std(int score){
        this.score = score;
    }

    void checkpf(int score){
        if(score>= 90){
            System.out.println("A");
        } else if (score>=80) {
            System.out.println("B");
        }
        else{
        System.out.println("C");
        }
    }
}

