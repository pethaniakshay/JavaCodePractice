/*
This file is a practice of referencing and passing java object.
 */
package codepractice;

/**
 *
 * @author Akshay Pethani
 */
public class ObjectReferencingPractice {
    public static void main(String args[]){
        
        Container ob1 = new Container(1, "Akshay", "Pethani");
        ob1.display();
        
        Container ob2,ob3 = null;
       
        ob2=ob1;
        ob2.display();   
        System.out.println("Printing the object 1: "+ ob1 + " 2: "+ ob2);
        
        if(ob3 instanceof Container){
            
            System.out.println("Yes");
        }else
                 System.out.println("no");
            
    }  
}

class Container{
    String firstName="",lastName="";
    int srNo=0;
    
    Container(){}
    
    Container(int sn, String fn, String ln){
        firstName=fn;
        lastName=ln;
        srNo = sn;
    }
    
    public void display(){
        System.out.println("Sr No: " + srNo++ + "\nFirst Name: "+ firstName + "\nLast Name:" + lastName);
    }
    
}
