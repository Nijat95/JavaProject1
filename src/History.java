public class History {

    float quiz1Score;
    float quiz2Score;
    float finalExamScore;
    float presentationScore;
    String fullName;

    public History() {

    }

    public History(String name){
        this.fullName = name;
    }
    public History(float quiz1Score, float quiz2Score, float finalExamScore, float presentationScore){
        this.quiz1Score = quiz1Score;
        this.quiz2Score = quiz2Score;
        this.finalExamScore = finalExamScore;
        this.presentationScore = presentationScore;
    }

    //final score forumula; q1 = 0.2, q2 = 0.2;, exam = 0.3;; presentation 0.3
    public float finalScore(){
        float score = (float) ((quiz1Score * 0.2) + (quiz2Score * 0.2) + (finalExamScore * 0.3) + (presentationScore * 0.3));
        System.out.println("The final score is of " + fullName + " is " + score + "%");
        return score;
    }



    //method that returns the letter grade
    //A >=90; B <90; C < 80; F < 65
    public void letterGrade() {
        History h = new History();
        float score = h.finalScore();
        if(score >= 90) {
            System.out.println("The letter grade is A");
        }else if(score < 90 && score >= 80){
            System.out.println("The letter grade is B");
        }else if(score < 80 && score >= 70){
            System.out.println("The letter grade is C");
        }else if(score < 70 && score >= 65){
            System.out.println("The letter grade is F");
        }
    }

    public static void main(String[] args) {

        History student1 = new History(80.5f,84.8f,91.4f,100f);
        student1.fullName = "John Smith";
        student1.finalScore();
        student1.letterGrade();
        System.out.println("The presentation score of " + student1.fullName + " is " + student1.presentationScore);

        History student2 = new History(75.6f,79.8f,92.8f,90.9f);
        student2.fullName = "Harry Potter";
        student2.finalScore();
        student2.letterGrade();

    }

}
