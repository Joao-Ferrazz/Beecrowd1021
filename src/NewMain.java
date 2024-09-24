import java.io.IOException;
import java.lang.Math;
import java.util.Scanner;

public class NewMain {

    public static void main(String[] args) throws IOException {
//Scanner para ler as variáveis
    Scanner scanner = new Scanner(System.in);
    
//Variáveis
    double dinheiro = scanner.nextDouble();
    
//Conversão do valor float para inteiro
    int dinheiro2 = (int) Math.round(dinheiro * 100);

//Fecho o scanner
    scanner.close();
    
//processamento
    int cem = dinheiro2 / 10000;
    dinheiro2 %= 10000;
    
    int cinquenta = dinheiro2 / 5000;
    dinheiro2 %= 5000;
    
    int vinte = dinheiro2 / 2000;
    dinheiro2 %= 2000;
    
    int dez = dinheiro2 / 1000;
    dinheiro2 %= 1000;
    
    int cinco = dinheiro2 / 500;
    dinheiro2 %= 500;
    
    int dois = dinheiro2 / 200;
    dinheiro2 %= 200;
    
    int um = dinheiro2 / 100;
    dinheiro2 %= 100;
    
    int cinquentacent = dinheiro2 / 50;
    dinheiro2 %= 50;
    
    int vintecinco = dinheiro2 / 25;
    dinheiro2 %= 25;
    
    int dezcent = dinheiro2 / 10;
    dinheiro2 %= 10;
    
    int cincocent = dinheiro2 / 5;
    dinheiro2 %= 5;
    
    int umcent = dinheiro2;
    
//Saída

    System.out.println("NOTAS:\n" + cem + " nota(s) de R$ 100.00");
    System.out.println(cinquenta + " nota(s) de R$ 50.00");
    System.out.println(vinte + " nota(s) de R$ 20.00");
    System.out.println(dez + " nota(s) de R$ 10.00");
    System.out.println(cinco + " nota(s) de R$ 5.00");
    System.out.println(dois + " nota(s) de R$ 2.00");
    System.out.println("MOEDAS:\n" + um + " moeda(s) de R$ 1.00");
    System.out.println(cinquentacent + " moeda(s) de R$ 0.50");
    System.out.println(vintecinco + " moeda(s) de R$ 0.25");
    System.out.println(dezcent + " moeda(s) de R$ 0.10");
    System.out.println(cincocent + " moeda(s) de R$ 0.05");
    System.out.println(umcent + " moeda(s) de R$ 0.01");
    
    }
    
}
