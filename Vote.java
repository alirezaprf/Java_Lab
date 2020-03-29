public class Vote{
    String date;
    Person person;


    /**
     * 
     * @param person Voter
     * @param date Date Of vote
     */
    public Vote(Person person,String date)
    {
        this.person=person;
        this.date=date;
    }




    /**
     * Checking By Date And person's toString Function
     */
    
    @Override
    public boolean equals(Object obj) {
        Vote v=(Vote)obj;
        return person.toString().equals(v.getPerson().toString()) &&
        date.equals(v.getDate());
    }
    /**
     * 
     * @return Date as String
     */
    public String getDate() {
        return date;
    }

    
    /**
     * 
     * @return Voter
     */
    public Person getPerson() {
        return person;
    }

    @Override
    public String toString() {
        return person.toString()+" on "+date;
    }


}