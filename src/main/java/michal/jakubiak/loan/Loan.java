package michal.jakubiak.loan;

import java.math.BigDecimal;

public class Loan {
   // pożyczka (kwota pożyczona, oprocentowanie, prowizja, ilość rat, typ oprocenowania)
    private BigDecimal amount; // kwota pożyczki
    private BigDecimal interest; // oprocentowanie
    private BigDecimal commision; // prowizja
    private BigDecimal installment;
    private enum interestType {FIXED, VARIABLE;}
    private enum status {granted, denied, repaid, during;}


}
