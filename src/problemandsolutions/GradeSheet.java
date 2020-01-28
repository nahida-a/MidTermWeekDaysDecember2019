package problemandsolutions;

public class GradeSheet {
    // Write a Java program that determines a student’s grade.
    //The program will read three types of scores(quiz, mid-term, and final scores) and determine the grade based on
    // the following rules:
    //- if the average score >=90% =>grade=A
    //- if the average score >= 70% and <90% => grade=B
    //- if the average score>=50% and <70% =>grade=C
    //- if the average score<50% =>grade=F
    //
    //See the example output below:
    //
    //Quiz score: 80
    //
    //Mid-term score: 68
    //
    //Final score: 90
    //
    //Your grade is B.


    public static void main(String[] args) {
        double quiz, midTerm, finalTerm,score;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter score of the Quiz- ");
        quiz=sc.nextDouble();
        System.out.print("Enter score of the Mid Term- ");
        midTerm=sc.nextDouble();
        System.out.print("Enter score of the Final Term- ");
        finalTerm=sc.nextDouble();
        score=(quiz+midTerm+finalTerm)/3;
        if(score>=90){
            System.out.println("Grade is A");
        }
        else if(score>=70){
            System.out.println("Grade is B");
        }
        else if(score>=50){
            System.out.println("Grade is C");
        }
        else{
            System.out.println("Grade is F");
        }
    }

}

