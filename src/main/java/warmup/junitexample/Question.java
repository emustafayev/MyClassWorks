package warmup.junitexample;

public class Question {
    private final String question;
    private final String range;


    public Question(String question, String range) {
        this.question = question;
        this.range = range;
    }

    public String getQuestion() {
        return question;
    }
}
