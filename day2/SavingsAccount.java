class SavingsAccount{
    long accno,pin;
    double balance;
    String name,ifsc,state,city;
    SavingsAccount(long accno,String name, String state, String city, long pin){
        this.accno=accno;
        this.name=name;
        this.state=state;
        this.city=city;
        this.pin=pin;
        ifsc="HSBC001";
        balance=0.0;
    }
    SavingsAccount(long accno,String name, double balance, String state, String city){
        this.accno=accno;
        this.name=name;
        this.balance=balance;
        this.state=state;
        this.city=city;
        ifsc="HSBC001";
    }
    void withdraw(double amount){
        if(balance==0)
            System.out.println("Amount cannot be withdrawn, Your Balance is Rs "+balance);
        else if(amount>balance)
            System.out.println("Amount cannot be withdrawn, Your Balance is less than the Amount you entered");
        else
             balance=balance-amount;
        System.out.println("After withdrawing Rs "+amount+", the total amount is : Rs "+balance);
    }
    void deposit(double amount){
        balance=balance+amount;
        System.out.println("After depositing Rs "+amount+", the total amount is : Rs "+balance);
    }
    void display(){
        System.out.println("SAVINGS ACCOUNT DETAILS :\nNAME : "+name+"\n STATE : "+state+"\nCITY : "+city+"\nTOTAL AMOUNT : Rs"+balance);
    }
}