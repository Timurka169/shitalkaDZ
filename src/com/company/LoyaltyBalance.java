package com.company;

public class LoyaltyBalance {
    private int balance;

    public int getBalance() {
        return this.balance;
    }

    public void charge(int charge) {
        this.balance += charge; //прибавляет баланс
    } //+балланс

    public void spend(int spend)  {
        this.balance -= spend;
    }//-балланс

    public boolean activ_balance(int read_balance){ //проверка на активность баланса
        int balance1=this.balance
        balance1+=read_balance;
       if(balance1>0)
           return true;
           else
           return false;

    }


}
