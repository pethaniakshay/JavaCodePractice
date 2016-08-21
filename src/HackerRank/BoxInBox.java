package HackerRank;

import java.util.Scanner;

public class BoxInBox {
    public static void main(String[] args){
        
        int z,i,j,n;
        
        System.out.println("Enter the n:");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        
        System.out.println();
        int t,f,m;
        
        //for(z=1; z<=n ; z++){
            t= (n*2)+1;
            m=3;
            for(i=1;i<=t;i++){
             f=3;
                for(j=1 ; j<=t ; j++){
                  
                    if(i==1 || j==1 ){
                        System.out.print("*");
                    }  
                    /*else if(j==f){
                        if(j<=m){
                            System.out.print("*");
                            f=f+2;
                            
                        }
                        else{
                            f=f+2;
                        }
                        
                    }*/
                     //if(i==m)
                     {
                        //if(j<=m)
                        
                        {
                       
                           System.out.print("*");
                            m=m+2;
                        } 
                    }
                    
                 //   else 
                    {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        //} 
    }    
}
