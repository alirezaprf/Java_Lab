import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        
        VotingSystem sys=new VotingSystem();
        ArrayList<String> smt=new ArrayList<>();
        smt.add("#1");
        smt.add("#2");
        smt.add("#3");
        smt.add("#4");
        smt.add("#5");
        sys.createVoting("new question", 1,smt);
        Person p1 = new Person("first", "last1");
        ArrayList<String> votes=new ArrayList<>();
        votes.add("#3");
        votes.add("#2");
        sys.vote(0, p1, votes);
        sys.printListOfVotings();
        System.out.println("---------------------------------------------------------------");
        sys.printResult(0);
        

        
    
    }
}