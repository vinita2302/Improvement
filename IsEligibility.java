class IsEligibility{ 
int number=18; 
  public void iseligibility(){
  if(number>=18){
  System.out.println("You are eligible for the vote"); 
  } 
  else{
  System.out.println("Not eligible for the vote"); 
  } 
  
  
  }
class Voting{ 
public static void main(String[] args){
IsEligibility s=new IsEligibility(); 
s.iseligibility(); 
} 
}
