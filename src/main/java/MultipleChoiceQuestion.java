public class MultipleChoiceQuestion extends Question {
    //Class Variables

    //Constructor
    public MultipleChoiceQuestion(String question, String answer) {
        super(question, answer);
    }


    //Methods
    @Override
    public boolean checkAnswer(String answer) {
        //expect answer to come back as "A" or "B" always a string, not character
        //compare actual answer to user provided answer
        String actualAnswer = this.getTheAnswer();
        if (answer.toUpperCase().equals(actualAnswer.toUpperCase())) {
            return true;
        } else {
            return false;
        }
    }
}
