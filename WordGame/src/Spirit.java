public class Spirit extends Enemy {
    public Spirit(int t){
        switch (t){
            case 1:
                this.setType("双面宿傩");
                this.setLife(90);
                this.setAttack(7);
                this.setDefend(3);
                break;
            case 2:
                this.setType("最上幻境");
                this.setLife(60);
                this.setAttack(6);
                this.setDefend(3);
                break;
            case 3:
                this.setType("贞子");
                this.setLife(40);
                this.setAttack(4);
                this.setDefend(1);
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

    public void getRestoreLife(int life) {
        setLife(life);
    }
}
