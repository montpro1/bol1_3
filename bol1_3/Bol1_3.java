
package bol1_3;

import java.util.Scanner;



public class Bol1_3 {

   
    public static void main(String[] args) {
         Scanner xd= new Scanner(System.in);
         float euros,cambio;
          System.out.println("teclea aqui los euros que quieres convertir en dolares");
         euros=xd.nextFloat();
         System.out.println("aqui pon el cambio");
         cambio=xd.nextFloat();
         
                 
                 
         float dolares=euros*cambio;
         System.out.println(euros+" euros son "+dolares+ " 1dolares");
         
         
         
       
        // TODO code application logic here
    }
    
}
