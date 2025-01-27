class Calculator{
int a=5; 
int b=8; 

public void sum(){
System.out.println("sum is: "+" "+a+b); 
} 
public void sub(){
System.out.println("sum is: "+" "+a-b);  
} 
public void mul(){ 
System.out.println("sum is: "+" "+a*b);  
} 
public void div(){
System.out.println("sum is: "+" "+a/b);  
} 
} 
class Calculate{ 
public static void main(String[] args){
Calculator ob=new Calculator(); 
ob.sum(); 
ob.sub(); 
ob.mul(); 
ob.div(); 
}
}