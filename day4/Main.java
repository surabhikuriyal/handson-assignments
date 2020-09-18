public class Main{
    public static void main(String args[]){
        Manager manager=new Manager("Mohan","12.09.1992","Male","Maharashtra","Pune",987979L,12345L,1000L,50000.0,1);
        Programmer programmer=new Programmer("Rohan","19.01.1990","Male","Maharashtra","Mumbai",998971L,12344L,1001L,60000.0,2);
        Admin admin=new Admin("Sita","10.09.1998","Female","Rajasthan","Jaipur",989972L,12345L,1002L,55000.0,1);
        Student student=new Student("Gita","11.12.1992","Female","Uttarakhand","Dehradun",998973L,12345L,1003L,15000,0);
        Customer customer=new Customer("Sohan","21.03.1994","Male","Odisha","Bbsr",989974L,12345L,1004L,20000,1);
        display(manager);
        display(programmer);
        display(admin);
        display(student);
        display(customer);
    }
    public static void display(Person obj){
        obj.testDisplay();
        obj.Update();
    }
}