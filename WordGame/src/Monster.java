public class Monster extends Enemy {
    public Monster(int t) {
        switch (t) {
            case 1:
                this.setType("鬼舞辻无惨");
                this.setLife(80);
                this.setAttack(6);
                this.setDefend(3);
                break;
            case 2:
                this.setType("石矶");
                this.setLife(50);
                this.setAttack(3);
                this.setDefend(2);
                break;
            case 3:
                this.setType("流克");
                this.setLife(75);
                this.setAttack(3);
                this.setDefend(5);
                break;
            default:
                System.out.println("输入错误");
                break;
        }
        this.setLive(true);
    }

    public int getLoseLife(int attack,int defend) {
        return attack-defend;
    }

    public void getRestoreLife(int live) {
        setLife(live);
    }


}
