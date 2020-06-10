package ejercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.lang.Integer;

/**
 *
 * @author alejo
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<Integer>();
        int limite =  getInt();
        
        for(int i = 2;numeros.size() <= limite;i++){
            int divisores = 0;
            for(int j=i;j>0;j--){
                if (i%j == 0){
                    divisores++;
                }
            }
            if (divisores == 2){
                numeros.add(i);
            }
        } 
        
        System.out.println("Mostrando numeros");
        for (Integer num:numeros){
            System.out.println(String.format("%s",num));
        }
    }
    
    public static int getInt(){
        Scanner scan;
        scan = new Scanner(System.in);
        Integer numero = 9;
        while (true){
            System.out.println("Ingrese cantidad de numeros a mostrar");
            numero = scan.nextInt();
            if (numero != null && (numero > 0 && numero < 15 )){
                break;
            }else{
                System.err.println("¡Error! Numero invalido,Mayor que 0 menor que 15");
            }
        }
        return numero;
    }
    
}
