
import java.time.LocalDate;
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

    /**
     * Creates a new Choice
     * @param poll New Choice
     */
    public void createPoll(String poll)
    {
        polls.put(poll, new HashSet<>());
    }
    /**
     * 
     * @param person the voter
     * @param votes the voter's Votes
     */
    public void vote(Person person,ArrayList<String> votes)
    {
        /**
         * if type is 0 only 1 vote is accepted
         */
        if(voters.contains(person) && type==0)
            return;

            
        voters.add(person);
        LocalDate ld=LocalDate.now();

        JalaliCalendar date=new JalaliCalendar(ld);

        String Date=date.toString();


        for (String key : votes) {
            polls.get(key).add(new Vote(person, Date));
        }

    }


    /**
     * 
     * @return get Voters
     */
    public ArrayList<Person> getVoters()
    {
        return voters;
    }
    /**
     *  prints Polls with defualt Function of toString
     */
    public void printVotes()
    {
        System.out.println(polls.toString());
    }

    /**
     * 
     * @return polls
     */

    public HashMap<String,HashSet<Vote>> getPolls() {
        return polls;
    }


}