public abstract class Question {
    //Class Variables
    private final String theQuestion;
    private final String theAnswer;

    //constructors
    public Question(String question, String answer) {
        this.theQuestion = question;
        this.theAnswer = answer;
    }

    //Getters
    public String getTheQuestion() {return this.theQuestion; }
    public String getTheAnswer() {return this.theAnswer; }



    //methods
    public abstract boolean checkAnswer(String answer);

}
