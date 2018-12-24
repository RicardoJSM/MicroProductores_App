public class User{

    //declare instance variables
    private String firstName;
    private String lastName;
    private long cardNumber;
    private String address;
    private static long userCount;
    private long userID;

    //default constructor
    public User(){
        firstName = null;
        lastName = null;
        cardNumber = -1;
        address = null;
        userID = 0;
        userCount++;
    }

    //overloaded constructor
    public User(String firstName, String lastName, long cardNumber, String address){
        setFirstName(firstName);
        setLastName(lastName);
        setCardNumber(cardNumber);
        setAddress(address);
        userCount++;
    }

    //set first name method
    public void setFirstName(String userInput){
        //validate that user input is not null or an empty string
        if(userInput.equals("") || userInput == null){
            throw new IllegalArgumentException("User's first name is empty.");
        }

        else{
            firstName = userInput;
        }
    }

    //set last name method
    public void setLastName(String userInput){
        //validate that user input is not null or an empty string
        if(userInput.equals("") || userInput == null){
            throw new IllegalArgumentException("User's last name is empty.");
        }

        else{
            lastName = userInput;
        }
    }

    //set card number method
    public void setCardNumber(long userInput){
        //**TEMPORARY VERIFICATION (HAVE TO LOOK INTO HOW TO PROPERLY VERIFY CREDIT CARDS)
        if(userInput <= 0){
            throw new IllegalArgumentException("Credit card number is invalid.");
        }

        else{
            cardNumber = userInput;
        }
    }

    //set address method
    public void setAddress(String userInput){
        //validate that user input is not null or an empty string
        if(userInput.equals("") || userInput == null){
            throw new IllegalArgumentException("Address is empty.");
        }

        else{
            address = userInput;
        }
    }

    public void setUserID(){
        if(this.userCount >= 0) {
            this.userID = this.userCount;
        }

        else{
            throw new IllegalArgumentException("User ID could not be assigned.");
        }
    }

    //get first name method
    public String getFirstName(){
        return firstName;
    }

    //get last name method
    public String getLastName(){
        return lastName;
    }

    //get card number method
    public long getCardNumber(){
        return cardNumber;
    }

    //get address method
    public String getAddress(){
        return address;
    }

    //get user ID method
    public long getUserId(){
        return userID;
    }

    //equals method that compares first and last name as well as the user's ID
    public boolean equals(Object other){
        if(other instanceof User){
            User otherUser = (User) other;

            return otherUser.firstName.equals(firstName) && otherUser.lastName.equals(lastName) &&
                    otherUser.userID == userID;
        }

        else{
            return false;
        }
    }

    //toString method
    public String toString(){
        return ("Name: " + getFirstName() + " " + getLastName() + "\nUser ID: " + getUserId() +
                "\nAddress: " + getAddress() + "\nCredit Card Number: " + getCardNumber());
    }
}
