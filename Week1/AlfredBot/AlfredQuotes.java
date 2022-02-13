import java.util.Date;
public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name, String dayPeriod) {
        // YOUR CODE HERE
        String greeting = String.format("Good %s, %s. Lovely to see you.", dayPeriod, name);
        return greeting;
    }
    
    public String dateAnnouncement() {
        // YOUR CODE HERE
        Date date = new Date();
        return "Today's date is " + date;
    }
    
    public String respondBeforeAlexis(String conversation) {
        // YOUR CODE HERE
                int alexis = conversation.indexOf("Alexis");
                int alfred = conversation.indexOf("Alfred");
        
                if (alexis != -1) {
                    conversation = "Right away, sir. She certainly isn't sophisticated enough for that.";
                }   else if (alfred != -1) {
                        conversation = "At your service, As you wish, naturally.";
                }   else {
                        conversation = "Right. And with that I shall retire.";
                }
                return conversation;
            }
    
	// NINJA BONUS
	// See the specs to overload the guessGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
}

