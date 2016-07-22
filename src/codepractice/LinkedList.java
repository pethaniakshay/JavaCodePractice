/*
 The Linked list implementation in this code is completely implemented by my own assumptions and experienace 
 */
package codepractice;

import java.util.Scanner;

public class LinkedList {
    
    static Node First =new Node();
    static Node current,last;
    
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int i=0;
        System.out.println("Enter Any number: ");
        while(i<6){
            
            
            i++;
            LinkedList.insert(sc.nextInt());
            
        }
        
        System.out.println("Elements of Linked List:");
        LinkedList.displayList();
           
    }   
    
    static void displayList(){
        current = First;
        while(current.next!=null){
            current.display();
            current=current.next;
          
        }
    }
    
    static void insert(int data){
        
        if(First.next == null){
    
            First.n=data;
            First.next= new Node();
            current=First.next;
        }
        else{
            current.n=data;
            current.next= new Node();
            current=current.next;               
        }
    }
    
    void insertLast(){
        
    }
}

class Node{
    
    int n=0;
    Node previous=null ,next=null;
    static int counter=0;
    
    Node(){
        counter++;
       
    }
    
    Node(int sn){
      
        n = sn;
        counter++;
    }
    
    public void display(){
        System.out.println(n);
    }   
}