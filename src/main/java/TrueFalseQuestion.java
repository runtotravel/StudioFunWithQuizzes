public class TrueFalseQuestion extends Question{

    //Class variables

    //constructors

    public TrueFalseQuestion(String question, String answer) {
        super(question, answer);
    }

    //Method

    @Override
    public boolean checkAnswer(String answer) {
        //answer could be true or false
        //answer could be TRUE or false


        if (answer.toUpperCase().equals(this.getTheAnswer().toUpperCase())) {
            return true;
        } else {
            return false;
        }
    }
}
