package michal.jakubiak.loan;

public class LoanApplication {

    public static void main(String[] args) {

        new LoanApplication().application();


    }

    void application() {
        //     Frame frame = new Frame("LoanManager");
        //   UserInputManager userInputManager = new UserInputManager(frame.getField());
        UserInputManager consoleUserInputManager = new UserInputManager();
        System.out.println("Loans Manager application.");
        System.out.println("Write commend in console below:");
        System.out.println("Available commends: help, client, loan");
        //   Client client1 = new Client();
        // System.out.println(client1);

        boolean applicationLoop = true;
        while (applicationLoop) {
            UserInputCommand userInputCommand = consoleUserInputManager.nextCommand();
            CommandHandler commandHandler = new CommandHandler(userInputCommand);


        }
    }

}


