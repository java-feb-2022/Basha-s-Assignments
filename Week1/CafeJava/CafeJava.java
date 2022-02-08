public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app.
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";

        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double dripCoffee = 2.7;
        double lattePrice = 4.2;
        double cappucinoPrice = 2.5;

        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";

        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = true;
        boolean isReadyOrder4 = true;

        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:

        // Cindhuri
        System.out.println(generalGreeting + customer1 + "."); // Displays "Welcome to Cafe Java, Cindhuri"
        if (isReadyOrder1) {
            // ** Your customer interaction print statements will go here ** //
            System.out.println(customer1 + readyMessage + ".");
        } else {
            System.out.println(displayTotalMessage + mochaPrice + pendingMessage + ".");
        }

        // Sam
        System.out.println(generalGreeting + customer2 + ".");
        if (isReadyOrder2) {
            System.out.println(customer2 + readyMessage + "." + " " + displayTotalMessage + lattePrice * 2 + ".");
        } else {
            System.out.println(customer2 + pendingMessage + ".");
        }

        // Jimmy
        System.out.println(generalGreeting + customer3 + ".");
        if (isReadyOrder3) {
            System.out.println(
                    customer3 + readyMessage + "." + " " + displayTotalMessage + (lattePrice - dripCoffee) + ".");
        } else {
            System.out.println(customer3 + pendingMessage + ".");
        }

        // Noah
        System.out.println(generalGreeting + customer4 + ".");
        if (isReadyOrder4) {
            System.out.println(customer4 + readyMessage + "." + " " + displayTotalMessage + cappucinoPrice + ".");
        } else {
            System.out.println(customer4 + pendingMessage + ".");
        }
    }
}
