class EmployeeMain{
    public static void main(String args[]){
        Employee emp[]=new Employee[5];
        emp[0]=new Employee("Max","A10",65000);
        emp[1]=new Employee("Eric","B10",45000);
        emp[2]=new Employee("David","C10",35000);
        emp[3]=new Employee("John","D10",85000);
        emp[4]=new Employee("Joey","E10",70000);
        for(Employee e:emp){
            if(e.salary>50000){
                System.out.println("NAME : "+e.name+" ID : "+e.id+" SALARY : "+e.salary);
            }
        }

        Address[] addr=new Address[5];
        addr[0]=new Address("Uttarakhand","Dehradun","560021");
        addr[2]=new Address("Rajasthan","Jaipur","248001");
        for(Address e:addr){
            if(e!=null){
                System.out.println("STATE : "+e.state+" CITY : "+e.city+" PINCODE : "+e.pin);
            }
        }
    }
}