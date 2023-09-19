package michal.jakubiak.loan;

import java.util.List;

public class UserInputCommand {
    public void setCommand(String command) {
        this.command = command;
    }

    private String command;

    public String getAction() {
        return action;
    }

    public List<String> getParam() {
        return param;
    }

    private String action;
    private List<String> param;

    public UserInputCommand(String txt)
    {
        if(txt!=null) {
            String[] array = txt.split("\\s");
            this.command = array[0];
            if (array.length>1)   action = array[1];
        }
    }

    public String getCommand() {
        return command;
    }

    @Override
    public String toString() {
        return "UserInputCommand{" +
                "command='" + command + '\'' +
                ", action='" + action + '\'' +
                ", param=" + param +
                '}';
    }
}
