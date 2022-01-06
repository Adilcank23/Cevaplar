
package dizitop;
import java.util.Scanner;
public class Dizitop {

    public static void main(String[] args) {
   Scanner klavye=new Scanner(System.in);
  int[]dizi=new int[20];
  int top=0;
  for(int i=1;i<=dizi.length;i++){
   System.out.println("lütfen "+i+".elemanı giriniz:");
   int h=klavye.nextInt();
   dizi[i-1]=h;
           
  }
  for(int y=0;y<20;y++){
    top+=dizi[y];
  }
  double ort=(double)(top/20);
  System.out.println("girdiğiniz sayıların toplamı:"+top+" ortalaması ise "+ort);
    }
    
}
