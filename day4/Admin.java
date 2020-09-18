class Admin extends Person{
    private String name,dob,gender,state,city;
    private long phone,pin,accountNo;
    double salary, balance=0.0;
    private int grade;
    Admin(String name,String dob,String gender,String state, String city,long phone,long pin,long accountNo,double salary, int grade){
        super(name,dob,gender,state,city,phone,pin,accountNo,salary,grade);
    }
    void Update(){
        this.salary=this.salary*0.1;
        this.grade++;
        this.balance+=salary;
        System.out.println("----AFTER UPDATION----\nSALARY : Rs "+salary+"\nGRADE : "+grade+"\nBALANCE : Rs "+balance+"\n");
    }
}