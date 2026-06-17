public class Main {
    static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "Kshitiz";
        student1.score = 78;

        student1.checkPF(student1.name,student1.score);

        Student student2 = new Student();
        student2.name = "Atul Ghalan Lama";
        student2.score = 95;

        student2.checkPF(student2.name,student2.score);
    }
}



