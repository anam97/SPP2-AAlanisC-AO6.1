/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.aalanisc.a06.pkg1;
import java.util.Scanner ;
/**
 *
 * @author anamartha
 */
public class SPP2AAlanisCA061 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero;
        numero = solicitarNumero();
        CalcularFactorial (numero) ;
        
    }

    

    private static int solicitarNumero() {
        int numero;
        System.out.println("Introduce un numero para calcular su factorial");
        Scanner T = new Scanner (System.in);
        numero = T.nextInt();
        if (numero < 1 || numero > 10) {
            System.out.println("ERROR , EL NUMERO ESTA FUERA DEL RANGO");
            solicitarNumero ( );
           } else {
            
        }
         return numero ;
        
    }
    
    private static void CalcularFactorial(int numero) {
        int factorial  , contador ;
        contador = 1 ;
        factorial = 1 ;
        
        do{
           contador ++ ;
           factorial  = factorial * (contador) ;
           
           
        } while (contador < (numero)) ;
        System.out.println("El factorial del numero es " + factorial);
    }
    
}
