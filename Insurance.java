/**
 * Models an Insurance client
 */
public class Insurance
{
    private Person client;

    /**
     * Constructs an Insurance object with the given Person
     * @param p the Person for this Insurance
     */
    public Insurance(Person p)
    {
        client = p;
    }

    /**
     * @return the age of the insured person
     */
    public int clientAge()
    {
        return client.getAge();
    }

    /**
     * @return the gender of the insured person
     */
    public String clientGender()
    {
        return client.getGender();
    }

    /**
     * Increments the age, in case the person had a birthday
     */
    public void incrementAge()
    {
        client.birthday();
    }

    /**
     * @return the monthly premium for this Person
     */
    public double monthlyPremium()
    {
        if(client.getGender().equals("m"))
        {
            if(client.getAge() < 16)
            {
                return -1;
            }
            else if(client.getAge() < 25)
            {
                return 85.50;
            }
            else if(client.getAge() < 85)
            {
                return 55.00;
            }
            else
            {
                return 92.00;
            }
        }
        else if(client.getGender().equals("f"))
        {
            if(client.getAge() < 16)
            {
                return -1;
            }
            else if(client.getAge() < 25)
            {
                return 79.25;
            }
            else if(client.getAge() < 85)
            {
                return 45.00;
            }
            else
            {
                return 90.00;
            }
        }   
        return 0;
    }
}
