public class QuestionService {
//    the below is just array of references and not the actual object
    Question[] questions = new Question[5];

//    creating constructor
    public QuestionService(){
        questions[0] = new Question(
                1,
                "What is my favourite movie?",
                "Cars",
                "Cars2",
                "Cars3",
                "Martian",
                "Cars"
        );
        questions[1] = new Question(
                2,
                "Who said 'I am Iron Man'?",
                "Thor",
                "Captain America",
                "Tony Stark",
                "Loki",
                "Tony Stark"
        );

        questions[2] = new Question(
                3,
                "Which movie has the dialogue 'Why so serious?'",
                "Batman Begins",
                "Joker",
                "The Dark Knight",
                "Avengers",
                "The Dark Knight"
        );

        questions[3] = new Question(
                4,
                "Which car is Lightning McQueen's best friend?",
                "Jackson Storm",
                "Mater",
                "Doc Hudson",
                "Sally",
                "Mater"
        );

        questions[4] = new Question(
                5,
                "Which movie features blue alien creatures called Na'vi?",
                "Interstellar",
                "Avatar",
                "Gravity",
                "Dune",
                "Avatar"
        );
    }


    public void displayQuestions(){
        for(Question q: questions){
            System.out.println(q);
        }

    }
}