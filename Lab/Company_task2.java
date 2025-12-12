package Lab;

class Employee{
    private String name;
    private Info info;

    public Employee(String name, Info info){
        this.name = name;
        this.info = info;}

    public String getName(){return name;}
    public Info getInfo(){return info;}
}

class Info{
    private String title;
    private String salary;

    public Info(String title, String salary){
        this.title = title;
        this.salary = salary;}

    public String toString(){return title + " - " + salary + " Per Month";}
}

class Company{
    private String companyName;
    private Employee[] employees;
    private int count = 0;

    public Company(String companyName, int sizeFix){
        this.companyName =companyName;
        employees = new Employee[sizeFix];}

    public void addEmployee(Employee e){
        if(count<employees.length){
            employees[count]=e;
            count++;}
    }

    public void showEmployee(){
        System.out.println("Compaany Name:" + companyName);
        System.out.println("Employee(s): ");

        for(int i=0; i<count; i++){
            System.out.println(" => " + employees[i].getName() + ", " + employees[i].getInfo());}
    }
}

public class Company_task2 {
    public static void main(String[] args){
        Company cmp = new Company("CJF", 10);
        cmp.addEmployee(new Employee("Jack R.", new Info("Vice President","$80,000")));
        cmp.addEmployee(new Employee("Tyler D.", new Info("General Manager", "$55,000")));
        cmp.showEmployee();}
}
