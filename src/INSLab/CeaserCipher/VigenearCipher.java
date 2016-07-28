
package INSLab.CeaserCipher;

import java.util.Scanner;


public class VigenearCipher {
    
   public static void main(String args[]){
       
       Scanner sc = new Scanner(System.in);
       String plainText;
       int i,j,p;
       String key;
       String cipherText="",decryptedText="";
       String postion="abcdefghijklmnopqrstuvwxyz";
       
       System.out.println("Enter the Plain Text:");
       plainText = sc.next();
      
       System.out.println("Enter the Key:");
       key = sc.next();
       
        j=0;
        for(i=0 ; i< plainText.length(); i++){
            if(j==key.length()-1){
              
                cipherText += (char)( (((int)plainText.charAt(i)-97) + (postion.indexOf(key.charAt(j))))%26 +97);
                  
                j=0;           
            }
            else{
                cipherText += (char)( (((int)plainText.charAt(i)-97) + (postion.indexOf(key.charAt(j))))%26 +97);
                
                j++;               
            }
        }
        
        System.out.println("Cipher Text is :"+ cipherText);
          
       j=0;
        for(i=0 ; i< cipherText.length(); i++){
         
            if(j==key.length()-1){

                p= (((int)cipherText.charAt(i)-97)-(postion.indexOf(key.charAt(j))) )%26;
                if(p<0){
                    p= p+26;
                }
                decryptedText += (char)(p+97);  
              
                j=0;        
            }
            else{
               

                p= (((int)cipherText.charAt(i)-97)-(postion.indexOf(key.charAt(j))) )%26;
                if(p<0){
                    p= p+26;
                }
                decryptedText += (char)(p+97);  
                
                j++;               
            }
        }     
        
        System.out.println("Decrypted Text is: "+decryptedText);   
       
        }
    
}
