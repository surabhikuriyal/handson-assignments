abstract class Person{
    private String name,dob,gender,state,city;
    private long phone,pin,accountNo;
    private double salary;
    private int grade;
    Person(String name,String dob,String gender,String state, String city, long phone, long pin, long accountNo, double salary,int grade){
        this.name=name;
        this.dob=dob;
        this.gender=gender;
        this.state=state;
        this.city=city;
        this.phone=phone;
        this.pin=pin;
        this.accountNo=accountNo;
        this.salary=salary;
        this.grade=grade;
    }
    abstract void Update();
    void testDisplay(){
        System.out.println("----INFORMATION----\nNAME : "+name+"\nDOB : "+dob+"\nGENDER : "+gender+"\nSTATE : "+state+"\nCITY : "+city+"\nPHONE NUMBER : "+phone+"\nPINCODE : "+pin+"ACCOUNT NUMBER : "+accountNo+"SALARY : "+salary+"\nGRADE : "+grade+"\n");
}
}