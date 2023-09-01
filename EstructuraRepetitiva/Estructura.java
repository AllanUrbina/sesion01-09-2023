import java.util.Scanner;
public class Estructura {

    public static void main(String[]args){
        Scanner lector =new Scanner(System.in);
        System.out.println("Hasta que tabla de multiplicar quiere ver");
        byte n=lector.nextByte();
        byte x=1, num=1;
      while(num <=n){ 
        while(x<=10){
            System.out.println(num +"x"+x+"="+num*x);
            x++;

        System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::");
        }
          
        x=1;
        num++;
            
        }
    
    
 }
}
