package Code_Soft;

import java.util.ArrayList;
import java.util.Scanner;

class Quiz {
    private ArrayList<Question> questions;
    private int score;

    public Quiz() {
        questions = new ArrayList<>();
        score = 0;
    }

    public void addQuestion(String question, String[] options, int correctAnswerIndex) {
        questions.add(new Question(question, options, correctAnswerIndex));
    }

    public void displayQuestion(Question question) {
        System.out.println(question.getQuestion());
        String[] options = question.getOptions();
        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + ". " + options[i]);
        }
    }

    public void startQuiz() {
        Scanner scanner = new Scanner(System.in);
        for (Question question : questions) {
            displayQuestion(question);
            System.out.print("Your answer (enter option number): ");
            int userAnswerIndex = scanner.nextInt();
            if (userAnswerIndex >= 1 && userAnswerIndex <= question.getOptions().length) {
                if (userAnswerIndex == question.getCorrectAnswerIndex() + 1) {
                    System.out.println("Correct!");
                    score++;
                } else {
                    System.out.println("Incorrect!");
                }
            } else {
                System.out.println("Invalid option.");
            }
            try {
                Thread.sleep(1000); // Add a delay between questions
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        scanner.close();
    }

    public int getScore() {
        return score;
    }

    public static void main(String[] args) {
        Quiz quiz = new Quiz();
        quiz.addQuestion(" JDK stands for", new String[]{"Java development kit", "Java deployment kit ", "JavaScript deployment kit", "None of these"}, 0);
       
        quiz.addQuestion("What is the entry point of a program in Java?", new String[]{"main class", "Last line of code", "The first line of code", "main() method"}, 3);

        quiz.addQuestion("  Which class in Java is used to take input from the user?", new String[]{"Input", "Scanner ", "Applier", "None of these"}, 1);
        
        quiz.addQuestion(" Method used to take a string as input in Java?", new String[]{"next()", "nextLine() ", "Both A and B.", "None of these"}, 2);
        
        quiz.addQuestion("What is type casting in Java?", new String[]{"It is converting type of a variable from one type to another", "Casting variable to the class ", "Creating a new variable.", "All of these"}, 0);
        quiz.startQuiz();
        System.out.println("Your score: " + quiz.getScore() + "/" + quiz.questions.size());
    }
}

class Question {
    private String question;
    private String[] options;
    private int correctAnswerIndex;

    public Question(String question, String[] options, int correctAnswerIndex) {
        this.question = question;
        this.options = options;
        this.correctAnswerIndex = correctAnswerIndex;
    }

    public String getQuestion() {
        return question;
    }

    public String[] getOptions() {
        return options;
    }

    public int getCorrectAnswerIndex() {
        return correctAnswerIndex;
    }
}





