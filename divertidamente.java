import java.util.Scanner;

public class divertidamente {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int alegria = 0, tristeza = 0;

        //Questão sobre amizades
        System.out.println("A Riley mudou de cidade. Ela fez novas amizades (true/false)? ");
        boolean amizade = teclado.nextBoolean();
        if (amizade == true){
            System.out.print("Quantas amizades a Riley fez na nova cidade? ");
            int amizades = teclado.nextInt();
            alegria += (10 * amizades);
        } else {
            tristeza += 30;
        }
        
        //Questão sobre as notas de provas
        System.out.println("Riley fez 3 provas");
        System.out.print("Informe a nota da primeira prova (0 a 10): ");
        int notaA1 = teclado.nextInt();
        System.out.print("Informe a nota da segunda prova (0 a 10): ");
        int notaA2 = teclado.nextInt();
        System.out.print("Informe a nota da terceira prova (0 a 10): ");
        int notaA3 = teclado.nextInt();
        int media = (notaA1 + notaA2 + notaA3 / 3);
        if (media >= 7) {
            alegria += 50;
        } else {
            tristeza += 50;
        }

        //Questão sobre os exercícios de programação
        System.out.println("Riley está estudando programação! E ela tem 10 algoritmos para fazer.");
        System.out.print("Quantos algoritmos ela conseguiu resolver? ");
        int algoritmos = teclado.nextInt();
        if (algoritmos == 0) {
            tristeza += 100;
        } else if (algoritmos > 0) {
            alegria += (10 * algoritmos);
            tristeza += ((10 - algoritmos) * 10);
        }

        //Resultado
        if (alegria > tristeza) {
            System.out.println("A mudança para a nova cidade foi uma experiência incrível para a Riley.");
        } else {
            System.out.println("A mudança para a nova cidade foi uma experiência desagradável para a Riley.");
        }

        teclado.close();
    }
}
