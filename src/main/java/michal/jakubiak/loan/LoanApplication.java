package michal.jakubiak.loan;

public class LoanApplication {

    public static void main(String[] args) {

        new LoanApplication().application();


    }

    void application()
    {
        Frame frame = new Frame("LoanMenager");
        new UserInputMenager(frame.getField());
        System.out.println("App start...");
        Client client1 = new Client();
        System.out.println(client1);
    }

}
