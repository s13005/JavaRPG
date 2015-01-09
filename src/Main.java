import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner stdIn = new Scanner(System.in);

        System.out.println("「たくや」があらわれた");

        int action;
        int attack;
        int enemy = 30;
        int random;
        int random2;
        int random3;
        int player = 30;

        do {
            System.out.println("1:たたかう 2:にげる");

            action = stdIn.nextInt();
            random = rand.nextInt(6);
            random2  = rand.nextInt(4)+1;
            random3  = rand.nextInt(30);

            if (action == 1) {
                System.out.println("1:たいあたり 2:おうふくびんた");
                attack = stdIn.nextInt();
                if (attack == 1) {
                    enemy -= 2;
                    System.out.println("「たくや」に2のダメージ");
                    System.out.println("「たくや」のHPは" + enemy + "だ");
                } else if (attack == 2) {
                    enemy -= random;
                    System.out.println(random + "のダメージ");
                    System.out.println("「たくや」のHPは" + enemy + "だ");
                }
            }else if (action == 2) {
                break;
            }

            if (enemy <= 0) break;

            System.out.println();

            if (random3 > 0) {
                System.out.println("「たくや」のたいあたり");
                System.out.println(random2 + "ダメージ");
                player -= random2;
            } else if (random3 == 0) {
                System.out.println("「たくや」のつのドリル");
                System.out.println("プレイヤーに9999ダメージ");
                player -= 9999;
            }

            System.out.println("プレイヤーのHPは"+ player + "だ");
            System.out.println("----------------------------");

        }while (enemy > 0 && player > 0 && action != 2);

        if (enemy <= 0) {
            System.out.println("「たくや」はたおれた");
            System.out.println("「ティッシュ」をてにいれた!!");
        } else if (player <= 0){
            System.out.println("めのまえがまっくらになった");
        } else if (action == 2){
            System.out.println("「たくや」からにげた");
        }

    }
}