public class Enemy implements Fight{
    private String type;
    private int life;
    private int attack;
    private boolean isLive;
    private int defend;

    public String getType() {
        return type;
    }

    public void setType(String type){
        this.type=type;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getLife() {
        return life;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public boolean isLive() {
        return isLive;
    }

    public void setLive(boolean isLive) {
        this.isLive = isLive;
    }

    public int getDefend() {
        return defend;
    }


    public void setDefend(int defend) {
        this.defend = defend;
    }

    @Override
    public int getLoseLife(int attack, int defend) {
        return 0;
    }

    @Override
    public void getRestoreLife(int life) {
    }

    public void injured(Hero p){
        if(!isLive||!p.isLive()){
            return;
        }
        System.out.println("[#]"+type + ":受伤");
        int loseLife = p.getLoseLife(attack,defend);
        life -=loseLife;
        if(life<0){
            life=0;
            dead(p);
        }
        else{
            show();
            kill(p);
        }
    }

    public void kill(Hero p) {
        System.out.println("[#]"+type + "还击" + p.getName());
        p.injured(this);
    }

    public void dead(Hero p) {
        System.out.println("[-]" + type + "没了");
        isLive = false;
    }

    public void show() {
        System.out.println("[#]"+type + "生命值是：" + life + "  是否活着:" + isLive);
    }
}
