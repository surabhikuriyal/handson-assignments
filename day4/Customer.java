class Customer extends Person{
    private String name,dob,gender,state,city;
    private long phone,pin,accountNo;
    double salary, balance=0.0;
    private int grade;
    Customer(String name,String dob,String gender,String state, String city,long phone,long pin,long accountNo,double salary, int grade){
        super(name,dob,gender,state,city,phone,pin,accountNo,salary,grade);
    }
    void Update(){
        System.out.println("----AFTER UPDATION----\n");
    }
}