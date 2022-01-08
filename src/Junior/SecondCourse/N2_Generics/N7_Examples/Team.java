package Junior.SecondCourse.N2_Generics.N7_Examples;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team <T extends Participant> {
    private String name;
    //private List<Participants> participants = new ArrayList<>();
    //список участников
    private List<T> participants = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addNewParticipants (T p ){
        //T что бы была возможность добавление ток определенной группы Студ, Школ..
        participants.add(p);
        System.out.printf("В команду %s был добавлен новый " +
                "участник, по имени %s \n", name, p.getName());
    }

    public void playWith(Team<T> team){
        String winnerName;
        Random random = new Random();
        int i = random.nextInt(2);
        if(i==0){
            winnerName=this.name;
        }
        else {
            winnerName=team.name;
        }
        System.out.println("Выиграла команда "+winnerName);
    }
    //public void playWith(Team<Student> team){ вот так грубо говоря

}
