/*
Problem : Super ASCII String Cost

A string S is said to be "Super ASCII", if it contains the character frequency equal to their ascii values.  
String will contain only lower case alphabets ('a'-'z') and the ascii values will starts from 1 
(i.e ascii value of 'a' is 1 and 'z' is 26).  
Now given a string S, you can perform operations, namely, add, delete and replace of any character present in the string. 
Every operation will consists of following costs 

add = 2 unit 
replace	= 1 unit 
delete = 3 unit 

Your task is to convert the string to super ascii with the minimum cost. 
While converting the string to super ascii, the final string should contain the same characters as in the input string. 

Input Format: 
First line starts with T i.e. number of test cases, and then T lines will follow each containing a string "S".

Output Format: 

Print the minimum cost of conversion for each string to a Super Ascii string.

Constraints:
1<=T<=100

1<=|S|<=300, S will contains only lower case alphabets ('a'-'z').


Sample Input and Output

SNo.	Input	Output
1       aaab    4
2       aabbbc  2

Explanation: 

For Case1: 
Need to retain a, b since these are unique characters in this string
Some of possible ways are 

Delete two a's and add one 'b'. Total cost = 8
Replace one a with b, and delete other 'a'. Total cost = 4.

For Case2: 
Need to retain a, b, c since these are unique characters in this string
Some of possible ways are 

Replace 'a' and 'b' with 'c'. Total cost = 2.
Delete one 'a' and one 'b' and then add two c's. Total cost = 10.
 */
package MockVita;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author Akshay Pethani
 */
public class SuperASCII {
        
    public static void main(String args[]){
        
        String sa= "abcdefghijklmnopqrstuvwxyz";
        String s;
        int i,tc,z,cost;   
        ArrayList<String>  list4 = new ArrayList<>();
        Scanner sc = new Scanner(System.in);     
        
        tc= sc.nextInt();
        for(i=0;i<tc;i++){
            list4.add(sc.next());
        }
        
        SuperASCII aso = new SuperASCII();
        
        for(z=0;z<list4.size();z++){
            s = list4.get(z);
            cost=aso.costCounter(s);
            System.out.println(cost);
        }
    
    }   
    
    public int costCounter(String s){

        String sa= "abcdefghijklmnopqrstuvwxyz";
  
        int i,j,            //loo counters
                flag,
                cost,           //cost to be return
                r,d,a,          // r=replace , d=delete, a=add
                ext,req;
        char c;                 
        ArrayList<Integer> list = new ArrayList<>(); //super ascii postion of string elements
        ArrayList<Integer> list2 = new ArrayList<>();//super ascii value of source string
        ArrayList<Integer> list3 = new ArrayList<>();//no of occurance of values oflist2
              
        c= s.charAt(0);
        list.add(sa.indexOf(c)+1);
       
        for( i=0 ; i< s.length();i++){
            flag=0;
            c= s.charAt(i);
            list2.add(i,sa.indexOf(c)+1);

               for(j=0;j<list.size();j++){

                    if((sa.indexOf(c)+1)==list.get(j))
                    {
                        flag=1;
                    }           
                }
                if(flag==0){
                    list.add(sa.indexOf(c)+1);
                }
            }

            for(i=0;i<list.size();i++){
                flag=0;
                for(j=0;j<list2.size();j++){
                     if(Objects.equals(list.get(i), list2.get(j))){
                         flag=flag+1;
                     }   
                }
                list3.add(flag);       
            }

            ext=0;req=0;
            for(i=0;i<list.size();i++){
                if(Objects.equals(list.get(i), list3.get(i))){}
                else if(list3.get(i)>list.get(i)){
                    ext =ext+ (list3.get(i)-list.get(i));
                }
                else if(list3.get(i)<list.get(i)){
                    req=(list.get(i)-list3.get(i))+req;
                }
            }
            r=0;d=0;a=0;
            if(ext>=req){
                d=ext-req;
                r=req;
            }
            else if(ext<req){
                r=ext;
                a=req-ext;
            }
            cost=(a*2)+(r*1)+(d*3);
                
            return cost;
    }  
}