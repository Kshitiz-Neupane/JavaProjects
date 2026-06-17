public class SUB {
    void subnum(int a, int b){
        int result = a-b;
        System.out.println("Subtraction is " + result);
    }

    static void main(String[] args) {
        SUB ks = new SUB();

        ks.subnum(100,66);
        ks.subnum(20,50);
        ks.subnum(23,58);
    }
}

