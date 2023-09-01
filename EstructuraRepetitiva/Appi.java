import java.util.Scanner;
public class Appi {
    public static void main(String[] args) throws Exception {
        System.out.println("Sentencias repetitivas");
        System.out.println("Sentencias While");
        Scanner lector =new Scanner(System.in);
       byte n=0;
       byte x=1;
       while(n<=0){
        System.out.println("No puede valores negativos ni 0");
        System.out.println("que tabla de multiplicar desea");
        n=lector.nextByte();
       
         while (x <= 10 ){
            System.out.println(n +"x"+x+"="+n*x);
            x++;
        
        } 
        System.out.println("Despues del while");
        System.out.println("Fin");
        // con while no siempre se conoce la cantidad de repeticiones
        // si es while es verdadero se repite 
        // ! operador not 
        // for si se conoce la cantidad de repeticiones

       lector.close();
       

    }
}
}
