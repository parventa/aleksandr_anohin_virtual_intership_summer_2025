package org.my.app.inheritance;

import java.math.BigDecimal;

public class Currency {

    private BigDecimal moneyAmountInTheBankAccount;

    public Currency(BigDecimal moneyAmountInTheBankAccount) {
        this.moneyAmountInTheBankAccount = moneyAmountInTheBankAccount;
    }

    public BigDecimal transferMoney(BigDecimal amount) {
        moneyAmountInTheBankAccount = moneyAmountInTheBankAccount.subtract(amount);
        return moneyAmountInTheBankAccount;

    }

    public void setMoneyAmount(BigDecimal moneyAmount) {
        this.moneyAmountInTheBankAccount = moneyAmount;
    }

}
