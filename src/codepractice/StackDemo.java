/*
 Stack implementation in this code is completely implemented by my own assumptions, experienace and experiments.
 This is only the demo for learning purpose only.
 */
package codepractice;

public class StackDemo {
    
    static StackDemo top= new StackDemo();
    
    public static void main(String args[]){
        
        StackNode s = new StackNode();
        
        s.push(3);
        s.push(4);
        s.push(8);
        s.push(5);
         s.display();
         System.out.println("After pop");
        s.pop();
        s.display();       
    }    
}

class StackNode{
   int i;
   StackNode prev=null;
   StackNode pointer =null,top=null;
 
   public void display(){
       pointer=top;
       while(pointer!=null){
           System.out.println(pointer.i);
           pointer=pointer.prev;
       }   
   }
   
   public void push(int i){
       
       if(top == null){
           top = new StackNode();
           top.i=i;
       }
       else{
           pointer = new StackNode();
           pointer.i=i;
           pointer.prev=top;
           top=pointer;
           pointer=null;
       }       
   }
   
   public int pop(){
       int pops = top.i;
       top= top.prev;
       return pops; 
   } 
}