/*
Faça um programa que leia e armazene as seguintes informações de 5 pessoas:

Ler uma String para o nome de cada Pessoa

Ler um double para o peso de cada Pessoa

Ler um double para a altura de cada Pessoa

Construa um vetor que armazena o IMC de cada pessoa

Mostre na tela o nome de cada pessoa, e seu IMC respectivo
 */
package programa2;
import java.util.Scanner;
public class Programa2 {

    public static void main(String[] args) {
        Scanner my_scan = new Scanner(System.in);
        
        //String nome;
        double peso;
        double altura;
        double IMC;
        
        double v[];
        v = new double[5];
        String d[];
        d = new String[5];
       
        //informações das pessoas e calculo IMC
        for(int i=0;i<5;i++){
        System.out.println("Digite o nome da pessoa " +(i+1)+": ");
        d[i] = my_scan.next();
        
        System.out.println("Digite o peso do(a) " +d[i]+ ": ");
        peso = my_scan.nextDouble();
        
        System.out.println("Digite o altura do(a) " +d[i]+ ": ");
        altura = my_scan.nextDouble();
        
        IMC = peso/(altura*altura);
        v[i] = IMC;
        }
        //Mostrar o IMC de cada pessoa
        for(int i=0;i<5;i++){
            System.out.println(" ");
            System.out.println("O IMC do(a) " +d[i]+ " e: "+v[i]);
        }
    }
    
}
