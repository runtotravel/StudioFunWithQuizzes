public class CheckBoxQuestion extends Question {

    //Class variables

    //constructors

    public CheckBoxQuestion(String question, String answer) {
        super(question, answer);
    }

    //Method

    @Override
    public boolean checkAnswer(String answer) {
        //answer could be A, B, C
        //answer could be a, b, c
        String actualAnswer = this.getTheAnswer();
        if (answer.toUpperCase().equals(actualAnswer.toUpperCase())) {
            return true;
        } else {
            return false;
        }
    }
}
