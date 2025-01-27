class Name{
String name="vinita"; 
int age=21; 

public void intro(){
System.out.println("Name :"+name+" "+"age :"+age); 
} 
}
class Intro{
public static void main(String[] args){
Name n=new Name(); 
n.intro(); 
}
}