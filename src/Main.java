import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner stdIn = new Scanner(System.in);

        System.out.println("「あああああ」があらわれた");

        int action;
        int enemy = 20;
        int random;
        int random2;
        int player = 20;

        do {
            System.out.println("1:たたかう 2:にげる");

            action = stdIn.nextInt();
            random = rand.nextInt(6);
            random2  = rand.nextInt(4)+1;

            if (action == 1) {
                System.out.println("1:たいあたり 2:ランダム");
                action = stdIn.nextInt();
                if (action == 1) {
                    enemy -= 2;
                    System.out.println("2のダメージ");
                    System.out.println("「あああああ」のHPは" + enemy + "だ");
                } else if (action == 2) {
                    enemy -= random;
                    System.out.println(random + "のダメージ");
                    System.out.println("「あああああ」のHPは" + enemy + "だ");
                }
            }else if (action == 2) {
                break;
            }

            if (enemy <= 0) break;

            System.out.println("「あああああ」のこうげき");
            System.out.println(random2 + "ダメージ");
            player -= random2;
            System.out.println("自分のHPは"+ player + "だ");

        }while (enemy > 0 && player > 0 && action != 2);

        if (enemy <= 0) {
            System.out.println("「あああああ」はたおれた");
        } else if (player <= 0){
            System.out.println("めのまえがまっくらになった");
        } else if (action == 2){
            System.out.println("にげた");
        }

    }
}