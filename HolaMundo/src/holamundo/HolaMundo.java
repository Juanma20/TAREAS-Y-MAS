/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo;
import java.util.Scanner;
/**
 *
 * @author Juan
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner oScanner=new Scanner (System.in);
        int x = 10;
        int y = 20;
        int suma = x + y;
        System.out.println("Hola mundo");
        int valor= oScanner.nextInt();
        System.out.println(suma);
        System.out.println(valor);
        // TODO code application logic here
    }

}
