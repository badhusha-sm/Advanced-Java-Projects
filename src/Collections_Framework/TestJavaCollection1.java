package Collections_Framework;



import java.util.*;  
class TestJavaCollection1{  
public static void main(String args[]){  
	//Creating arraylist  
ArrayList<String> list=new ArrayList<String>();

list.add("Ravi");//Adding object in arraylist  
list.add("Vijay");  
list.add("Ravi");  
list.add("Ajay");  
//Traversing list through Iterator  
Iterator itr=list.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
}  
}  