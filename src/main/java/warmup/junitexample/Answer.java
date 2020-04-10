package warmup.junitexample;

public class Answer {
    private final Question question;
    private final String answer;
    public Answer(Question question, String answer){
        this.question = question;
        this.answer = answer;
    }

    public String getQuestionText(){
        return this.question.getQuestion();
    }

}
