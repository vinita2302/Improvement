class SecondLargestElement{
public static void main(String[] args){
int arr[]={10,2,4,3,50,19};  
int largest=0;  
int secondlargest=0; 

for(int i=0;i<arr.length;i++){
if(arr[i]>largest){ 
secondlargest=largest;
largest=arr[i]; 
}  
is(secondlargest<arr[i]&&arr[i]!=largest){
secondlargest=arr[i]; 
}
System.out.println("secondlargest element is: "+secondlargest); 
} 
}
