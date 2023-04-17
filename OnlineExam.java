import java.util.Scanner;

public class OnlineExam {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Set the number of questions in the exam
        int numOfQuestions = 5;

        // Create arrays to store the questions, options, and correct answers
        String[] questions = {"What is the capital of France?",
                              "What is the largest country in the world?",
                              "What is the smallest country in the world?",
                              "What is the tallest mammal in the world?",
                              "What is the fastest land animal in the world?"};

        String[][] options = {{"A. Paris", "B. London", "C. Berlin", "D. Madrid"},
                              {"A. Russia", "B. Canada", "C. China", "D. United States"},
                              {"A. Monaco", "B. Vatican City", "C. San Marino", "D. Nauru"},
                              {"A. Giraffe", "B. Elephant", "C. Rhino", "D. Hippopotamus"},
                              {"A. Cheetah", "B. Lion", "C. Jaguar", "D. Leopard"}};

        char[] correctAnswers = {'A', 'A', 'B', 'A', 'A'};

        // Create an array to store the user's answers
        char[] userAnswers = new char[numOfQuestions];

        // Ask the user to input their answers for each question
        for (int i = 0; i < numOfQuestions; i++) {
            System.out.println(questions[i]);
            for (int j = 0; j < 4; j++) {
                System.out.println(options[i][j]);
            }
            System.out.print("Enter your answer (A, B, C, or D): ");
            userAnswers[i] = input.nextLine().toUpperCase().charAt(0);
        }

        // Check the user's answers
        int numCorrect = 0;
        for (int i = 0; i < numOfQuestions; i++) {
            if (userAnswers[i] == correctAnswers[i]) {
                numCorrect++;
            }
        }

        // Calculate the user's score
        double score = (double) numCorrect / numOfQuestions * 100;

        // Display the user's score
        System.out.println("You got " + numCorrect + " out of " + numOfQuestions + " questions correct.");
        System.out.printf("Your score is %.2f%%", score);
    }
}
