import java.util.ArrayList;

public class VotingSystem{
    private ArrayList<Voting> votingList;
    /**
     * Constructor
     */
    public VotingSystem()
    {
        votingList=new ArrayList<Voting>();
    }
    /**
     * 
     * @param question question
     * @param type 0 or 1 defining multi voting function 
     * @param options polls
     */
    public void createVoting(String question,int type,ArrayList<String> options)
    {
        Voting voting=new Voting(type, question);
        votingList.add(voting);
        for (String key : options) {
            voting.createPoll(key);
        }
    }
    /**
     * 
     * @return votings List
     */
    public ArrayList<Voting> getVotingList()
    {
        return votingList;
    }

    /**
     * 
     * @param index index of vote which is < vote List size
     * @return if not Found Null
     * 
     */
    public Voting getVoting(int index)
    {
        if(index<votingList.size())
            return votingList.get(index);
        else  
            return null;
    }
    /**
     * 
     * @param index index of vote in voting List
     * @param person Voter
     * @param votes Voter's votes
     */
    public void vote(int index,Person person,ArrayList<String> votes)
    {
        votingList.get(index).vote(person, votes);
    }
    /**
     * print votes of Voting 
     * @param index index of vote in voting List
     */
    public void printResult(int index)
    {
        votingList.get(index).printVotes();
    }
    /**
     * @return Question of All Votings
     */
    public void printListOfVotings()
    {
        for (Voting voting : votingList) {
            System.out.println(voting.getQuestion());
        }
    }
}