//requirements:
//  add questions to quiz
//  run the quiz
//  grade the quiz

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
    //Class Variables
    private ArrayList<Question> questions = new ArrayList<Question>();
    private int numberOfQuestionsCorrect = 0;
    private Scanner scanner = new Scanner(System.in);

    //constructor
    public Quiz() {

    }

    //Methods
    //can pass in any thing that extends Question
    public void addQuestion(Question question) {
        this.questions.add(question);
    }

    public void runQuiz() {
        //loop through each question
        for (Question question : questions) {
            //ask the user the question
            System.out.println(question.getTheQuestion());
            //get user answer
            String usersAnswer = this.getUsersAnswers();
            //check answer
            boolean userGotQuestionCorrect = question.checkAnswer(usersAnswer);
            //increment numberOfQuestionsCorrect if answer correctly {
            if (userGotQuestionCorrect) {
                this.numberOfQuestionsCorrect++;
            }
        }

        //grade the quiz
        double percentageCorrect = ((double) this.numberOfQuestionsCorrect / this.questions.size()) * 100;
        System.out.println("User's Grade: " + percentageCorrect + "%");

    }

    private String getUsersAnswers() {
        String usersAnswer = scanner.nextLine();
        return usersAnswer;
    }
}
