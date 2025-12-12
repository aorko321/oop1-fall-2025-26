package Lab;

class Student {
    private String name;
    private Contact contact;

    public Student (String name, Contact contact){
        this.name = name;
        this.contact = contact;}

    public String getName() {return name;}
    public Contact getContact() {return contact;}
}

class Contact {
    private String phone;
    private String mail;

    public Contact (String phone, String mail){
        this.phone = phone;
        this.mail = mail;}

    public String toString() {return phone + ", " + mail;}
}

class School {
    private String schoolName;
    private Student[] students;
    private int count =0 ;

    public School(String schoolName, int sizeFix) {
        this.schoolName = schoolName;
        students = new Student[sizeFix];}

    public void addStudent(Student s){
        if(count<students.length){
            students[count]=s;
            count++;}
    }

    public void showStudent(){
        System.out.println("School: " + schoolName);
        System.out.println("Student(s): ");
    
        for(int i=0; i<count; i++){
        System.out.println("- " + students[i].getName() + " | Contact: " + students[i].getContact());}
    }    
}

public class School_task1{
    public static void main(String[] args){
        School sch = new School("Bullsworth High",8);
        sch.addStudent(new Student("Patrick", new Contact("0123456789","pat@pnp.com")) );
        sch.addStudent(new Student("Paul", new Contact("9876543210","paul@dorcia.com")));
        sch.showStudent();}
}
    