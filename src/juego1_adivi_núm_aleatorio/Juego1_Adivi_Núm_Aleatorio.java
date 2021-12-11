/*Juego: Adivinar el número. La maquina génera un número aleatorio entre 0 - 100,
luego ir pidiendo números indicando "Es mayor" o "Es menor", según sea mayor
o menor con respecto a N. El proceso termina cuando el usuario acierta y 
se muestra el número de intentos*/
package juego1_adivi_núm_aleatorio;

import javax.swing.JOptionPane;

public class Juego1_Adivi_Núm_Aleatorio {

    public static void main(String[] args) {
        int numero, aleatorio, contador = 0;
        
        //Generar un número aleatorio entre 0 - 100
        aleatorio = (int)(Math.random ()*100);
        
        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Adivine el número aleatorio: "));
            
            if (aleatorio > numero){
                System.out.println("Digite un número mayor:");
            }
            else {
                System.out.println("Digite un número menor:"); 
            }
            contador ++; //Aumenta en uno el contador
        }
            while (numero != aleatorio);
            
            System.out.println("\nGenial!! Adivinaste el número en:" +contador+ "intentos");
        }
        }
    
