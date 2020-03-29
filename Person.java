public class Person{
    String firstName;
    String lastName;
    /**
     * 
     * @param firstName user's first name
     * @param lastName user's Last name
     */
    public Person(String firstName,String lastName)
    {
        this.firstName=firstName;
        this.lastName=lastName;
    }
    /**
     * 
     * @return User's Name
     */
    public String getFirstName() {
        return firstName;
    }
    /**
     * 
     * @return User's Last Name
     */
    public String getLastName() {
        return lastName;
    }
    @Override
    public String toString() {
        return firstName+" "+lastName;
    }
    
    
}