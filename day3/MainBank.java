public class MainBank {
    public static void main(String args[]) {
        //pass the accountNo and amount to deposit from CLA
        long accountNo = Long.parseLong(args[0]);
	    double amount = Double.parseDouble(args[1]);
        //get the Account using the accountNo by calling getAccount(...)
        Account account1 = MainBank.getAccount(accountNo);
        // if accountNo is wrong show the error message and must not perform any below
        // operation
        // show the account information before deposit
        //deposit the amount to that particular Account
        //show the account information after deposit
        if(account1 == null) 
		    System.out.println("ENTER VALID ACCOUNT NUMBER");
	    else{
            account1.accountInformation();
		    account1.deposit(amount);
		    account1.accountInformation();
        }
    }

    // pass the accountNO and get the Account from Accounts[] 
    public static Account getAccount(long accountNo) {
        Account[] accounts = AccountsDB.getAccounts();
	for(Account t : accounts)
		if(t.getAccountNumber() == accountNo)
			return t;
	return null;
        /*Account account = null;
        // get the account from accounts using the accountNo

        return account;*/
    }
}