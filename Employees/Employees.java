import java.util.Scanner;
class Employee{
int empid,salary;
String name,address;
Employee(int empid,String name,String address,int salary){
this.empid=empid;
this.name=name;
this.address=address;
this.salary=salary;
}
Employee(){}
}
class Teacher extends Employee
{
String department;
String subject;
Teacher(int empid,String name,String address,int salary,String department,String subject)
{
super(empid,name,address,salary);//initializing parent class constructor
this.department=department;
this.subject=subject;
}
Teacher(){
super();
}


//Function to display all teachers
void displayTeacher(Teacher[] teachers){
String format = "%-10s %-10s %-10s %-10s %-10s %-15s";
System.out.format(format,"empid","Name","Address","Salary","Department","Subject");
System.out.println();
System.out.format(format,"-----","-----","-------","------","----------","---------");
System.out.println();
for(Teacher t:teachers){
System.out.format(format,t.empid,t.name,t.address,t.salary,t.department,t.subject);
System.out.println();
}
}
}
class Employees{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter the number of employees:");
int eCount = sc.nextInt();
Teacher[] teachers = new Teacher[eCount];
for(int i=0;i<eCount;i++)
{
System.out.print("Enter Empid         :");
int empid = sc.nextInt();
sc.nextLine();
System.out.print("Enter Name          :");
String name = sc.nextLine();
System.out.print("Enter Address       :");
String address = sc.nextLine();
System.out.print("Enter Salary        :");
int salary = sc.nextInt();
sc.nextLine();
System.out.print("Enter Department    :");
String department =sc.nextLine();
System.out.print("Enter Subject       :");
String subject = sc.nextLine();
teachers[i] = new Teacher(empid,name,address,salary,department,subject);
}
Teacher t1 = new Teacher();
t1.displayTeacher(teachers);
}
}



























