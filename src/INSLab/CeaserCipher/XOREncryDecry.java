package INSLab.CeaserCipher;

import java.util.Scanner;
public class XOREncryDecry {

    
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int i,j;
        String cipherText="",decryptedText="";
             
        System.out.println("Enter the Plain Text: ");
        
        String plainText =sc.next();
        System.out.println("Enter the key: ");
        String key = sc.next();
               
        j=0;
        for(i=0 ; i< plainText.length(); i++){
            if(j==key.length()-1){
              cipherText=cipherText+(char) (plainText.charAt(i) ^ key.charAt(j));

              j=0;           
            }
            else{
                cipherText=cipherText+(char) (plainText.charAt(i) ^ key.charAt(j));

                j++;               
            }
        }
             
        System.out.println("Cipher Text is: "+ cipherText);     
        
           
        
        j=0;
        for(i=0 ; i< cipherText.length(); i++){
            if(j==key.length()-1){

              decryptedText=decryptedText+(char) (cipherText.charAt(i) ^ key.charAt(j));
              
                j=0;        
            }
            else{

                decryptedText=decryptedText+(char) (cipherText.charAt(i) ^ key.charAt(j));
                j++;               
            }
        }
        
        System.out.println("Decrypted Text is: "+decryptedText);       
        
    }
}
