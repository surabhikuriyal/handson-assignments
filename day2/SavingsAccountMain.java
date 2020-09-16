class SavingsAccountMain{
    public static void main(String args[]){
        SavingsAccount object1=new SavingsAccount(1122334455L,"Sam","Maharashtra","Mumbai",12345);
        SavingsAccount object2=new SavingsAccount(89674523455L,"Tina",10000.0,"Maharashtra","Mumbai");
        SavingsAccount object3=new SavingsAccount(88990986735L,"Sam","Maharashtra","Mumbai",67890);
        SavingsAccount object4=new SavingsAccount(11245776533L,"Sam",20000.0,"Maharashtra","Mumbai");
        SavingsAccount object5=new SavingsAccount(11277888888L,"Sam",30000.0,"Maharashtra","Mumbai");
        object1.deposit(10000.0);
        object1.display();
        object2.withdraw(2000.0);
        object2.display();
        object3.deposit(25000.0);
        object3.display();
        object4.deposit(5000.0);
        object4.display();
        object5.withdraw(1000.0);
        object5.display();
    }
}