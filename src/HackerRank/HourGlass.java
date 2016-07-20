package HackerRank;

import java.util.*;

public class HourGlass {

    public static void main(String[] args) throws Exception{
        Scanner scan = new Scanner(System.in);
        int i,j,hgi,hgj,sum,tsum,c1,c2;
        i=j=hgi=hgj=sum=tsum=c1=c2=0;
        
        int[][] a = new int[6][6];
  
        
        for(i=0 ; i<6 ; i++){
            for(j=0 ; j<6 ; j++){
                a[i][j]= scan.nextInt();        
            }
        }
        
        for(i=0 ; i<4 ; i++){
            for(j=0 ; j<4 ; j++){
                hgi=i;
                hgj=j;
                tsum=0;
                for(c1=0 ; c1<3 ; c1++){
                    for(c2=0 ; c2<3 ; c2++){
                        if((c1==1 && c2 == 0) || (c1==1 && c2==2)){
                                     
                        }
                        else{
                            tsum=tsum+ a[hgi][hgj];
                        }
                        hgj++;
                    }
                    hgi++;
                    hgj=j;
                     if(tsum > sum){
                        sum = tsum;
                    }          
                }         
            }     
        }
        
        System.out.print(sum);     
    }
}
