class CheckSorted{
public static void main(String[] args){
int arr[]={12,10,5,6,18}; 
for(int i=0;i<arr.length;i++) {
if(arr[i]<arr[i+1]){
System.out.println("Array is not sorted");  
break; 
} }
System.out.println("Array is sorted"); 
} 
}