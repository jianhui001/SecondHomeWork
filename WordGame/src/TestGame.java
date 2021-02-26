import java.util.Scanner;

public class TestGame {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入玩家姓名：");
        String name = s.next();
        Game g = new Game(name);
        System.out.println("是否开始游戏？[Y][N]");
        String f = s.next();
        if (f.equals("Y") || f.equals("y")) {
            g.start();
        } else {
            System.out.println("结束");
        }

    }
}
