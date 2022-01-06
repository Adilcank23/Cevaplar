
package ortalama;
import java.util.Scanner;
public class Ortalama {

    public static void main(String[] args) {
Scanner klavye=new Scanner(System.in);
int sayac=0;
int top=0;
boolean a=true;
while(a==true){
    System.out.println("lütfen sayıları giriniz(0 toplamayı bitirir): ");
 int b=klavye.nextInt();
if(b==0){
break;    
}
 top+=b;
sayac++;
}
System.out.println("girdiğiniz sayıların toplamı:"+top+" ortalaması ise:"+(top/sayac)+"'tır");
    

    }
    
}
