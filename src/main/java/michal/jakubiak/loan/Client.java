package michal.jakubiak.loan;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Client {
    private String name;
    private String lastName;
    private BigDecimal earnings;
    private BigDecimal liabilities;
    private BigDecimal creditworthiness;

    private List<Loan> loanList;


    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", earnings=" + earnings +
                ", liabilities=" + liabilities +
                ", creditworthiness=" + creditworthiness +
                '}';
    }
}
