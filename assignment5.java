//main
package com.quizapplication;

public class Main {

    public static void main(String[] args) {
        Game game=new Game();
        game.initGame();
        game.play();
    }
}


//player
package com.quizapplication;
import java.util.Scanner;
    class Player {
    Scanner sc=new Scanner(System.in);
    String name;
    int score=0;

    public void getDetails(){

        System.out.println("name");
        name=sc.next();

    }

}
//Game
package com.quizapplication;
public class Game {

    Question[] questions=new Question[3];
    Player player=new Player();

    String[] questionsdata={"best ipl team","pm of india","main city in india"};
    String[] options1={"hyderbad","narashiman","nagpur"};
    String[] options2={"chennai","ramnath kovindh","banglore"};
    String[] options3={"pune","Modi","kolkata"};
    String[] options4={"kerla","srk","mumbai"};
    int[] answers={2,3,4};


    public void initGame()
    {
        for(int i=0;i<3;i++){
            questions[i]=new Question();
        }
        for(int i=0;i<3;i++)
        {

            questions[i].question=questionsdata[i];
            questions[i].option1=options1[i];
            questions[i].option2=options2[i];
            questions[i].option3=options3[i];
            questions[i].option4=options4[i];
            questions[i].correctAnswer=answers[i];
        }


    }
    public void play()
    {

        player.getDetails();
        for(int i=0;i<3;i++)
        {
            boolean status=questions[i].askQuestion();
            if(status==true)
            {
                System.out.println("amazing!");
                player.score=player.score+10;
            }
            else{
                System.out.println("try another one");
                player.score=player.score-10;
            }
        }

        System.out.println(player.name+" your score is "+player.score);

    }

}

//Questions
package com.quizapplication;
import java.util.Scanner;
    class Question {
    Scanner sc=new Scanner(System.in);
    String question,option1,option2,option3,option4;
    int correctAnswer,userAnswer;

    public boolean askQuestion()
    {
        System.out.println(question);
        System.out.println("1. "+option1);
        System.out.println("2. "+option2);
        System.out.println("3. "+option3);
        System.out.println("4. "+option4);
        System.out.println("select any one option");
        userAnswer=sc.nextInt();
        if(userAnswer==correctAnswer){
            return true;
        }
        return false;
    }

}


