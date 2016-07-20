package codepractice;

import java.util.*;

public class LargesNumber {
    
    public static void main(String arg[])throws Exception{
        
        List<Integer> aa = new ArrayList<Integer>();; 
       
        aa.add(0,3);
        aa.add(1,30);
        aa.add(2,34);
        aa.add(3,5);
        aa.add(4,9);
        
        LargesNumber ln = new LargesNumber();
        
        System.out.println("O/p String is: "+ ln.largestNumber(aa));
        
    }
    
    public String largestNumber(List<Integer> a) {
        
        int i,temp,j,x,y;
        List<Integer>b = new ArrayList<Integer>(a);
        
        for(i=0; i< a.size();i++){
            for(j=i+1 ; j<a.size();j++){
                x=a.get(i);
                y=a.get(j);
                if(x>=10){
                    x=x/10;
                }
                if(y>=10){
                    y=y/10;
                }
                
                if(x<y){
                    temp=a.get(i);
                    a.add(i,a.get(j));
                    a.add(j,temp);
                    System.out.println(a.get(i)+a.get(j));
                }
            }            
        }
	   
        List<String> newList = new ArrayList<>(a.size()) ;
        for (Integer myInt : a) { 
        newList.add(String.valueOf(myInt)); 
        }
            
    
         String largest="";
        
         for(i=0;i<newList.size();i++){
             
             largest = largest+ newList.get(i);
         }
            
            
            
            return largest;
	}
    
}
