import java.util.Scanner;

public class QuizApplication {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] questions = {
            "1. What is the capital of India?",
            "2. Which language is used for Android development?",
            "3. Which keyword is used to create an object in Java?"
        };

        String[] answers = {
            "Delhi",
            "Java",
            "new"
        };

        int score = 0;

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            System.out.print("Your Answer: ");
            String userAnswer = sc.nextLine();

            if (userAnswer.equalsIgnoreCase(answers[i])) {
                System.out.println("Correct Answer!");
                score++;
            } else {
                System.out.println("Wrong Answer!");
                System.out.println("Correct Answer: " + answers[i]);
            }

            System.out.println();
        }

        System.out.println("===== Quiz Completed =====");
        System.out.println("Your Score: " + score + " out of " + questions.length);

        sc.close();
    }
}