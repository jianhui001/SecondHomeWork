import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {

        Hero p;
        List<Enemy> enemys = new ArrayList<Enemy>();

        public Game(String name){
            p =new Hero(name);
            enemys.add(new Spirit(1));
            enemys.add(new Spirit(2));
            enemys.add(new Spirit(3));

            enemys.add(new Monster(1));
            enemys.add(new Monster(2));
            enemys.add(new Monster(3));

        }

    public void end() {
        System.out.println("Game Over!!!");
    }

    public static int getNumber(int a,int b) {
        //求任意两个数之间的随机数（int）
        return (int) (Math.random() * (b - a) + a);
    }

        public void start(){

            while(true) {
                int ran = getNumber(0, enemys.size());
                p.fight(enemys.get(ran));
                if (!p.isLive()) {
                    System.out.println("恢复一下");
                    p.getRestoreLife(100);
                    p.setLive(true);
                    end();
                    break;
                }

                // 如果当前对手死亡
                 else if (!enemys.get(ran).isLive()) {
                     // 将此对手移除集合
                     enemys.remove(enemys.get(ran));
                 }

                    // 判断集合大小 如果小于等于0 证明所有的对手都死亡了
                if (enemys.size() <= 0) {
                        end();
                        break;
                    }


                 else{
                     try {
                         System.out.println("-----------正在寻找对手--------------");
                         Thread.sleep(2000);
                     } catch (InterruptedException e) {
                         e.printStackTrace();
                     }
                 }
            }

        }


}
