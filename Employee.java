class Display{
int empId=101; 
String name="karan"; 

Void display details(){
System.out.println("Name :"+name+" "+"Employee id"+empId); 
} 
}
class Employee{
public static void main(String[] args){
Employee emp=new Employee(); 
emp.details(); 
}
}
