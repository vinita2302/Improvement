class LargestElement{
public static void main(String[] args){
int arr[]={10,2,4,3,50,19};  
int max=0; 

for(int i=0;i<arr.length;i++){
if(arr[i]>max){
max=arr[i]; 
} 
}
System.out.println("maximum element is: "+max); 
} 
}
