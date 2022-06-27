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

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

/*
Elaborar um algoritmo para ler o valor do raio e calcular a área e o volume de uma esfera. O
cálculo da área de uma esfera é dado pela fórmula: A = 4 x Pi x R2. O cálculo do volume de uma esfera
é dado pela fórmula: V = 4/3 x Pi x R3.
Obs: Utlizar System.in (entrada) e System.out (saída).
 */
package listadeexercicios1;

import java.util.Scanner;
import static java.lang.Math.PI;
/**
 *
 * @author Cliente
 */
public class Exer2 {
    public static void main(String[] args) {
        double raio, area, volume;
        Scanner teclado = new java.util.Scanner(System.in);
        System.out.print("Digite o valor do raio: ");
        raio = teclado.nextDouble();
        
        area = 4 * PI * Math.pow(raio,2);
        volume = 4/3 * PI * Math.pow(raio,3);
        
        System.out.println("A área da esfera é " +  area + " e o volume é " + volume);
        
    }
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listadeexercicios1;

import javax.swing.JOptionPane;

/**
 *
 * @author Cliente
 */
public class Exer3 {
    public static void main(String[] args) {
        //Elaborar um algoritmo para ler o valor de um produto e imprimir esse valor, o valor do
        //desconto e um novo valor, tendo em vista que o desconto foi de 9%.
        //Obs: Utilizar JOptionPane para entrada (showInputDialog) e saída (showMessageDialog).
        
        String varP = JOptionPane.showInputDialog("Insira o valor do produto: ");
        double varP1 = Double.parseDouble(varP);
        
        double varD, novoV;
        varD = (varP1 * 9)/100;
        novoV = varP1 - varD;
        
        JOptionPane.showMessageDialog(null, "O valor do produto é: " +varP1 + "\nValor do desconto: " +varD + "\n Novo valor: " +novoV);
        
    }
}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listadeexercicios1;

import javax.swing.JOptionPane;

/**
 *
 * @author Cliente
 */
public class Exer4 {
    public static void main(String[] args) {
        //Sabe-se que, para iluminar de maneira correta os cômodos de uma casa, para cada m2,
        //deve-se usar 18W de potência. Elaborar um algoritmo que receba as duas dimensões de um cômodo
        //(em metros), calcule e mostre a sua área (em m2) e a potência de iluminação que deverá ser utilizada.
        //Utilizar JOptionPane para entrada (showInputDialog) e saída (showMessageDialog).
        
        String larg = JOptionPane.showInputDialog("Digite a largura em m: ");
        double larg1 = Double.parseDouble(larg);
        String comp = JOptionPane.showInputDialog("Digite o comprimento em m: ");
        double compr1 = Double.parseDouble(comp);
        
        double area, poten;
        area = larg1 * compr1;
        poten = area *18;
        JOptionPane.showMessageDialog(null, "A área é: " +area+ " m2. \n A potência de iluminação que deverá ser utilizada é de:  " +poten);
                
        
        
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        /*
 Elaborar um algoritmo para ler o nome de um funcionario, seu cargo e salário e fazer o
reajuste salarial de acordo com os criterios apresentados abaixo. Deve-se imprimir o nome, cargo,
salário antigo e novo do funcionário.
        Salario ≤ R$ 1.000,00                        -> 30% de reajuste
        R$ 1.000,00 < Salario ≤ 5.000,00             -> 20% de reajuste
        Salario > R$ 5.000,00 ́                      -> 10% de reajuste
 */
package listadeexercicios1;

import java.util.Scanner;

/**
 *
 * @author Cliente
 */
public class Exer5 {
    public static void main(String[] args) {
        Scanner teclado = new java.util.Scanner(System.in);
        System.out.println("Digite o nome do funcionário: ");
        String nome = teclado.nextLine();
        System.out.println("Cargo: ");
        String cargo = teclado.nextLine();
        System.out.println("Salário: ");
        Double sal = teclado.nextDouble();
        
        double reaj, novoSal;
        
        System.out.println("Nome: " + nome + "\nCargo: " + cargo + "\nSalário antigo: " + sal);
        
        if (sal <= 1000){
           reaj = (sal * 30)/100;
        }else if(sal > 1000 && sal <= 5000){
            reaj = (sal * 20)/100;
        }else{
            reaj = (sal * 10)/100;
        }
        novoSal = sal + reaj;
        System.out.println("O novo salário é: " + novoSal);
    }
}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listadeexercicios1;

import java.util.Scanner;

/**
 *
 * @author Cliente
 */
public class Exer6 {
    public static void main(String[] args) {
        Scanner teclado = new java.util.Scanner(System.in);
        System.out.println("Digite o valor do produto: ");
        double precoProduto = teclado.nextDouble();
        
        double percentAumen, novoPreco;
        
        if (precoProduto <= 50) {
            percentAumen = (precoProduto *5) /100; 
        }else if (precoProduto >50 && precoProduto <= 100){
            percentAumen = (precoProduto *10) /100;
        }else{
             percentAumen = (precoProduto *15) /100;   
                }
        novoPreco = precoProduto +percentAumen;
        System.out.println("Novo Preço após reajuste: " +novoPreco);
        
        if (novoPreco <=80) {
            System.out.println("Classificação: Barato");
        }
        
        else if (novoPreco >80 && novoPreco<=120) {
            System.out.println("Classificação: Normal");
        }
        else if (novoPreco >120 && novoPreco<=200) {
            System.out.println("Classificação: Caro");
        }
        else {
            System.out.println("Classificação: Muito Caro");
        }
        
    }
}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

/*
 Elaborar um algoritmo que receba dois números e execute as operações listadas a seguir,
de acordo com a escolha do usuário. Se a opção digitada for inválida, mostre uma mensagem de erro.
Lembre-se de que, na operação 4, o segundo número deve ser diferente de zero.
 */
package listadeexercicios1;

import javax.swing.JOptionPane;

/**
 *
 * @author Cliente
 */
public class Exer7 {
    public static void main(String[] args) {
        String num01 = JOptionPane.showInputDialog(null, "Digite o primeiro número: ");
        double num1 = Double.parseDouble(num01);
        String num02 = JOptionPane.showInputDialog(null, "Digite o segundo número: ");
        double num2 = Double.parseDouble(num02);
        
        String[] valoresAceitaveis = {"1","2","3","4"};
        String opcao = (String)JOptionPane.showInputDialog(null, 
                "Opção (1 - Média dos valores; 2 - Subtração do maior pelo menor; 3 - Multiplicação; 4 - Divisão do primeiro pelo segundo)", 
                "Operação", 0, null, valoresAceitaveis, valoresAceitaveis[0]);
        int opcaoInt = Integer.parseInt(opcao);
        
        switch (opcaoInt) {
            case 1: 
            double media = (num1 + num2) /2;
            JOptionPane.showMessageDialog(null, "A média entre os números é: " +media);
            break;
            
            case 2:
                double subtracao;
                if (num1 >num2){
                 subtracao = num1 - num2;   
                }else {
                    subtracao = num2 - num1;
                }
            JOptionPane.showMessageDialog(null, "Subtração do maior pelo menor: " +subtracao);
            break;
            case 3: 
                double produto = num1 *num2;
                JOptionPane.showMessageDialog(null, "O produto entre os números: " +produto);
                break;
                
            case 4:
                double divisao;
                if (num2 != 0){
                    divisao = num1 / num2; 
                    JOptionPane.showMessageDialog(null, "A divisão do primeiro pelo segundo número é: " +divisao);
                }else{
                    JOptionPane.showMessageDialog(null, "A divisão não pode ser feita, pois o denominador é nulo!");
                }
                break;
        }
                
        
        
    }
}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


/*
Elaborar um algoritmo para ler o nome, nota da primeira e segunda prova de um aluno.
Deve-se imprimir o nome, a média do aluno e uma das mensagens abaixo:
• “Aprovado“ se a média for maior ou igual a 6.0;
• “Reprovado“ se a média for menor do que 4.0;
• “Em Exame Final“ se a média for maior ou igual a 4.0 e menor do que 6.0.
Se o aluno estiver em Exame Final, faça a leitura da nota do Exame Final e se a média da primeira e
segunda prova e nota do Exame Final for maior ou igual a 6.0, imprimir a mensagem “Aprovado em
Exame Final“. Caso contrário, imprimir a mensagem “Reprovado em Exame Final“.
Obs: Utilizar JOptionPane para entrada (showInputDialog) e saída (showMessageDialog).
 */
package listadeexercicios1;

import javax.swing.JOptionPane;

/**
 *
 * @author Cliente
 */
public class Exer8 {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite seu nome: ");
        String primeiraProva = JOptionPane.showInputDialog("Digite a nota da 1º prova: ");
        double primeiraProva1 = Double.parseDouble(primeiraProva);
        String segundaProva = JOptionPane.showInputDialog("Digite a nota da 2º prova: ");
        double segundaProva1 = Double.parseDouble(segundaProva);
        
        double media = (primeiraProva1 + segundaProva1)/2;
        
        if (media >= 6){
            JOptionPane.showMessageDialog(null,"Aprovado!", "Resultado", 1);
        }else if(media < 4){
            JOptionPane.showMessageDialog(null,"Reprovado!", "Resultado", 1);
        }else{
            JOptionPane.showMessageDialog(null,"Em exame final.", "Resultado", 1);
            String notaExameFinal = JOptionPane.showInputDialog("Digite a nota do exame final: ");
            double notaExameFinal1 = Double.parseDouble(notaExameFinal);
            double mediaF = (media + notaExameFinal1)/2;
        
                if (mediaF >= 6){
                    JOptionPane.showMessageDialog(null,"Aprovado no exame final!", "Resultado", 1);
                }else if(media < 6){
                    JOptionPane.showMessageDialog(null,"Reprovado no exame final!", "Resultado", 1);
        }
        }
        
    }  
}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

/*
Elaborar um algoritmo para ler os coeficientes A, B e C de uma equação do segundo grau
levando-se em consideração os seguintes critérios:
• Se delta for negativo: imprimir a mensagem ”Não há solução real.”;
• Se delta for igual a zero: imprimir a mensagem “Duas raízes reais iguais.” e calcular e imprimir
a raiz da equação;
• Se delta for maior do que zero: imprimir a mensagem “Duas raízes reais diferentes.” e calcular
e imprimir as raízes da equação.
delta = B2 − 4AC
Fórmula = (−B ± √delta)/2A

Obs: Utilizar JOptionPane para entrada (showInputDialog) e saída (showMessageDialog).
 */
package listadeexercicios1;

import javax.swing.JOptionPane;
import static java.lang.Math.*;

/**
 *
 * @author Cliente
 */
public class Exer9 {
    public static void main(String[] args) {
        
        String a = JOptionPane.showInputDialog(null, "Digite o coeficiente A: ");
        double a1 = Double.parseDouble(a);
        String b = JOptionPane.showInputDialog(null, "Digite o coeficiente B: ");
        double b1 = Double.parseDouble(b);   
        String c = JOptionPane.showInputDialog(null, "Digite o coeficiente C: ");
        double c1 = Double.parseDouble(c);  
        
        double delta = Math.pow(b1, 2) - (4*a1*c1);
        double raiz1 = (-b1 - Math.sqrt(delta))/2*a1;
        double raiz2 = (-b1 + Math.sqrt(delta))/2*a1;
        
        if (delta < 0){
            JOptionPane.showMessageDialog(null, "Não há solução real.");
        }else if(delta == 0){
            JOptionPane.showMessageDialog(null, "Duas raízes reais iguais, que são: " + raiz1);
        }else{
            JOptionPane.showMessageDialog(null, "Duas raízes reais iguais, que são: " + raiz1 + " e " + raiz2);
        }        
    }
}
