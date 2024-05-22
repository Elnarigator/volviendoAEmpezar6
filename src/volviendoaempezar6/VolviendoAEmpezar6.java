package volviendoaempezar6;

import java.util.Scanner;

public class VolviendoAEmpezar6 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        
        System.out.println("ingrese un numero");
        int num = leer.nextInt();
        
        if (num%2==0) {
            System.out.println("es par");
            
        }else{
            System.out.println("es impar");
    }

    }
    
}
