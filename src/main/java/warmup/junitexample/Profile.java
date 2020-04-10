package warmup.junitexample;

public class Profile {
    private final String name;
    private int score;
  //  private Map<String, Answer> answers = new HashMap<>();


    public Profile(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

   // public void addAnswer(Answer answer){
     //   answers.put(answer.getQuestionText(), answer);
  //  }
//    public boolean matches(Criteria criteria){
//        score=0;
//
//        boolean kill = false;
//        boolean anyMatches = false;
//        for(Criteria criterion: criteria){
//            Answer answer = answers.get(
//                    criterion.getAnswer().getQuestionText());
//        }
//    }
}
