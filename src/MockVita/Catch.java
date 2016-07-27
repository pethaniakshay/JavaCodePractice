
package MockVita;

import java.util.Scanner;

public class Catch {
    
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter the test cases");
        
        int N = sc.nextInt();
        int z=0,tempt;
        int F,B,T,FD,BD,distance,flag,time;
        char fall;
        while(z<N)
        {
            z++;
            System.out.println("Enter F B T FD BD");
            F=sc.nextInt();
            B=sc.nextInt();
         
            T=sc.nextInt();
            FD=sc.nextInt();
            BD=sc.nextInt();
            distance=0;
            flag=0;
            time=0;
            tempt=0;
            
            while(true){
                
                if(flag==0){
                    distance= distance + F;
                    flag=1;
                    time = time + T*F;
                    
                    if(distance-B<(BD*-1))
                    {
                        tempt=((-1*BD)-distance);// problem in this enq only 
                        if(tempt<0)
                        {
                            tempt= tempt * -1;
                           tempt= tempt*T;
                        }
                        time = time + tempt;
                        //distance=distance + ((-1*BD)-distance);
      
                        fall='B';
                        break;
                    }
                    
                }
                else{
                    distance = distance + (B*-1);
                    flag=0;
                    time = time + T*B;
                    
                    
                    if(distance+F>FD){
                        tempt=(FD-distance)*T;
                        
                        if(tempt<0)
                        {
                            tempt= tempt * -1;
                        }
                        time = time + tempt;
                        //distance=distance + (FD-distance); 
                        
                        fall='F';
                        break;    
                    }
                }
              
            }
            
            
            System.out.println(time+ " " + fall);
            
           //z++; 
            
        }
        
        
        
    }
    
}
