
package asal;

public class Asal {

    public static void main(String[] args) {
        int sayac=0;
for(int i=2;i<100;i++){
    sayac=0;
  for(int j=2;j<=i-1;j++){   
   if(i%j==0) {
  sayac=1;
   }}
 if(sayac==0)
 System.out.println(i); 
}
    
    }
    
}
