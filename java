*
– Elaborar um algoritmo para calcular e imprimir a expressão X = (A+B)/(A-B), sabendo-se que
A e B são números lidos do teclado.
Obs: Utlizar System.in (entrada) e System.out (saída).
 */
package listadeexercicios1;

import java.util.Scanner;

/**
 *
 * @author Monique e Julia
 */
public class Exer1 {
    public static void main(String[] args) {
        int varA, varB, varX;
        
        Scanner teclado = new java.util.Scanner(System.in);
        System.out.print("Digite a variável A: ");
        varA = teclado.nextInt();
        System.out.print("Digite a variável B: ");
        varB = teclado.nextInt();
        
        if ((varA - varB) != 0){
            varX = (varA + varB)/(varA - varB);
            System.out.println("O valor da expressão é: " + varX);
        }else{
            System.out.println("A divisão não pode ser feita, pois o denominador é nulo!.");
        }
    }
}
