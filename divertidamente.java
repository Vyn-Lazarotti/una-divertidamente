import java.util.Scanner;

public class divertidamente {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int alegria = 0;
        int tristeza = 0;
        
        System.out.println("A Riley mudou de cidade. Ela fez novas amizades (true/false)? ");
        boolean amizade = teclado.nextBoolean();
        if (amizade == true){
            System.out.println("Quantas amizades a Riley fez na nova cidade? ");
            int amizades = teclado.nextInt();
            alegria += 10 * amizades;
        } else {
            tristeza += 30;
        }
        
        
        System.out.println("Riley fez 3 provas");
        System.out.println("Informe a nota da primeira prova (0 a 10): ");
        int primeiraNota = teclado.nextInt();
        System.out.println("Informe a nota da segunda prova (0 a 10): ");
        int segundaNota = teclado.nextInt();
        System.out.println("Informe a nota da terceira prova (0 a 10): ");
        int terceiraNota = teclado.nextInt();
        int media = (primeiraNota + segundaNota + terceiraNota / 3);
        if (media >= 7) {
            alegria += 50;
        } else {
            tristeza += 50;
        }

        System.out.println("Riley está estudando programação! E ela tem 10 algoritmos para fazer.");
        System.out.println("Quantos algoritmos ela conseguiu resolver? ");
        int algoritmos = teclado.nextInt();
        if (algoritmos > 1) {
            //
            alegria += 10 * algoritmos;
        } else {
            tristeza += 10 * algoritmos;
        }

        if (alegria > tristeza) {
            System.out.println("A mudança para a nova cidade foi uma experiência incrível para a Riley.");
        } else {
            System.out.println("A mudança para a nova cidade foi uma experiência desagradável para a Riley.");
        }

        teclado.close();
    }
}
