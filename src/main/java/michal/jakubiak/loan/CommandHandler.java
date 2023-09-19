package michal.jakubiak.loan;

import java.util.List;

public class CommandHandler {
    private String command;
    private String action;
    private List<String> param;

    public CommandHandler(UserInputCommand userInputCommand) {
        this.command = userInputCommand.getCommand();
        this.action = userInputCommand.getAction();
        this.param = userInputCommand.getParam();

        switch (this.command) {
            case "help":
                System.out.println("Showing help system....");
                break;
            case "client":
                System.out.println("Showing clients information's...");
                break;
            case "loan" :
                System.out.println("Showing loans information...");
                break;
            default:
                System.out.println("Command not recognized");
        }

    }
}
