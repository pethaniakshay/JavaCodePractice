package INSLab.CeaserCipher;
import java.io.*;
import java.util.Scanner;

public class AdditiveCipher {
    
    public static void main(String[] args) throws Exception {
        
        int key,p;
        String plainText="",
                cipherText="",
                decryptedText="";
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the plain text: ");
        plainText = sc.next();
        
        System.out.println("Enter the Key: ");
        key=sc.nextInt();
       
        for (int i = 0;i < plainText.length(); i++){           

                cipherText += (char)( (((int)plainText.charAt(i)-97) + key)%26 +97);
        }
         
        System.out.println("Cipher Text is: "+cipherText);
        
        
        for (int i = 0;i < cipherText.length(); i++){
                  
            p= (((int)cipherText.charAt(i)-97)- key)%26;
            if(p<0){
                p= p+26;
            }
            
            decryptedText += (char)(p+97);             
        }
        System.out.println("Decrypted Text is: "+decryptedText);      
    }
}

