import java.util.ArrayList;

public class Game {
    ArrayList<Team> team;
    ArrayList<Character> turnOrder;
    ArrayList<String> combatLog;
    String messages;

    public Game(){
        team = new ArrayList<Team>();

    }

    public void start(){

    }

    public void generateTurnOrder(){

    }

    public void nextTurn(){

    }

    public boolean checkCondition(){

    }

    public String combatLog(){

    }


    Race HUMAN = new Race("Human",3,3,3,3, 10, 10);
    Race ELF = new Race("Elf",1,4,4,3, 5 ,20);
    Race DWARF = new Race("Dwarf",4,2,2,4,50,5);
}
