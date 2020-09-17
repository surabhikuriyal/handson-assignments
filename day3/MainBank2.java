public class MainBank2 {
    public static void main(String args[]) {
        double amount = Double.parseDouble(args[0]);
        long sender = Long.parseLong(args[1]);
	    long receiver = Long.parseLong(args[2]);
	    
	    Account account1 = MainBank.getAccount(sender);
	    Account account2 = MainBank.getAccount(receiver);
	    if(account1 == null && account2 == null) 
            System.out.println("ENTER VALID ACCOUNT NUMBER");
        else{
		if(account1.getBalance() < amount) 
            System.out.println("YOU DONT HAVE SUFFICIENT AMOUNT !");
        else{
			account1.withdraw(amount);
			account2.deposit(amount);
			System.out.println("MONEY TRANSFERRED SUCCESSFULLY !");
		}	
	}
		
    }

    // pass the accountNO and get the Account from Accounts[] 
    public static Account getAccount(long accountNo) {
        Account[] accounts = AccountsDB.getAccounts();
	    for(Account acc : accounts){
		if(acc.getAccountNumber() == accountNo)
			return acc;
        }
	    return null;
        /*Account account = null;
        // get the account from accounts using the accountNo

        return account;*/
    }
}