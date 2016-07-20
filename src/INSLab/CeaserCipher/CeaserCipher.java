package INSLab.CeaserCipher;
import java.util.Scanner;
import java.io.*;

public class CeaserCipher {
    
    public static void main(String[] args) throws Exception {
        
        int key=3,p;
        String plainText, cipherText, decryptedText,textOfFile;
        Scanner sc = new Scanner(System.in);
        CeaserCipher cc= new CeaserCipher();
        
        System.out.println("Enter the plain text: ");
        plainText = sc.next();
        cipherText=cc.CeaserEncryption(plainText);
        System.out.println("Cipher Text is: "+cipherText);
        
        try{
            File file = new File("encryptedText.txt");
            if (!file.exists()) {
		file.createNewFile();
            }
            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            try (BufferedWriter bw = new BufferedWriter(fw)) {
                bw.write(cipherText);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
           
        try (BufferedReader br = new BufferedReader(new FileReader("encryptedText.txt")))
        {
            while ((textOfFile = br.readLine()) != null) {
		System.out.println(textOfFile);
                decryptedText=cc.CeaserDecryption(textOfFile);
                System.out.println("Decrypted Text is: "+decryptedText);
            }
	} catch (IOException | NullPointerException e) {
            e.printStackTrace();
	}  
    }
    
    public String CeaserEncryption(String plainText){
        
        String cipherText="";
        int key=3;
        
        for (int i = 0;i < plainText.length(); i++){           

                cipherText += (char)( (((int)plainText.charAt(i)-97) + key)%26 +97);
        } 
        return cipherText;
    }
    
    public String CeaserDecryption(String cipherText){
        String decryptedText="";
        int p,key=3;
        
        for (int i = 0;i < cipherText.length(); i++){
                  
            p= (((int)cipherText.charAt(i)-97)- key)%26;
            if(p<0){
                p= p+26;
            }
            
            decryptedText += (char)(p+97);             
        }
        return decryptedText;
    }    
}