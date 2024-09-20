import java.util.Random;
import java.util.Scanner;

public class JogoAdivinha {

    public static void main(String[] args) {

        Scanner lerTeclado = new Scanner(System.in);
        Random gerarNumero = new Random();

        int numeroEscolhido = gerarNumero.nextInt(100) + 1;
        
        System.out.println("Bem vindo ao jogo da adivinhação! Por favor, informe seu nome: ");
        String nome = lerTeclado.nextLine();
        
        System.out.println("OK " + nome + "! Você possui 10 tentativas para adivinhar um número aleatório entre 1 e 100.");

        int tentativas = 1; 
        boolean acertou = false;

        while (tentativas <= 10) {
            System.out.println("Tentativa " + tentativas + " de 10:");
            int chute = lerTeclado.nextInt();

            if (chute == numeroEscolhido) {
                acertou = true;
                break;
            } else if (chute < numeroEscolhido) {
                System.out.println("Você errou! O número escolhido é maior que este.");
            } else {
                System.out.println("Você errou! O número escolhido é menor que este.");
            }

            tentativas++;
        }

        if (acertou) {
            System.out.println("Parabéns " + nome + "! Você acertou o número em " + tentativas + " tentativas.");
        } else {
            System.out.println("Que pena " + nome + ", suas 10 tentativas acabaram! O número era " + numeroEscolhido + ".");
        }

        lerTeclado.close(); 
    }
}
