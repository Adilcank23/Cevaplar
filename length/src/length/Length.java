
package length;
import java.util.Scanner;
public class Length {

public static void main(String[] args) {
Scanner klavye=new Scanner(System.in);
System.out.println("Lütfen bir kelime giriniz:");
String s=klavye.nextLine();
 s=s+(char)0;
int k=0;
while(s.charAt(k)!=(char)0)
k++;

System.out.println("girdiğiniz kelime "+k+" harflidr");
    }

    
}
