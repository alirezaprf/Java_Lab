import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Voting{
    int type;
    String question;
    ArrayList<Person> voters;
    HashMap<String,HashSet<Vote>> polls;
    /**
     * 
     * @param type type of Vote 0 or 1
     * 0 = one vote
     * 1 = multi votes
     * @param question the question !!
     */
    public Voting(int type,String question)
    {
        this.type=type;
        this.question=question;
        voters=new ArrayList<Person>();
        polls=new HashMap<String,HashSet<Vote>>();
    }
    /**
     * 
     * @return question
     */

    public String getQuestion()
    {
        return question;
    }


    public void createPoll(String poll)
    {
        polls.put(poll, new HashSet<>());
    }
     
    public ArrayList<Person> getVoters()
    {
        return voters;
    }

    public void printVotes()
    {
        System.out.println(polls.toString());
    }
    public HashMap<String,HashSet<Vote>> getPolls() {
        return polls;
    }


}