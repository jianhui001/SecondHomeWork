import javafx.scene.input.Mnemonic;

public class Hero implements Fight{

    private String name;
    private int life;
    private int attack;
    private int defend;
    private boolean isLive;

    public Hero(){

    }

    public Hero(String name){
        this.name=name;
        life=200;
        isLive=true;
        attack=60;
        defend=4;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public int getLife() {
        return life;
    }


    public void setLife(int life) {
        this.life = life;
    }

    public int getAttack() {
        return attack;
    }


    public void setAttack(int attack) {
        this.attack = attack;
    }


    public int getDefend() {
        return defend;
    }


    public void setDefend(int defend) {
        this.defend = defend;
    }

    public boolean isLive() {
        return isLive;
    }

    public void setLive(boolean isLive) {
        this.isLive = isLive;
    }

    @Override
    public void getRestoreLife(int life) {
     setLife(life);
    }

    @Override
    public int getLoseLife(int attack, int defend) {
        return attack-defend;
    }

    public void fight(Enemy e){
        if(!isLive||!e.isLive()){
            return;
        }
        System.out.println("[-]" + name + "挥舞着" + "杀向" + e.getType());
       e.injured(this);
    }

    public void injured(Enemy e){
        System.out.println("[-]" + name + ": 掉血了");
        int loseLife = e.getLoseLife(attack,defend);
        life -=loseLife;
        if(life<0){
            life=0;
            dead();
        }
        show();
    }

    public void dead() {
        System.out.println("[-]" + name + "没了");
        setLive(false);
    }

    public void show() {
        System.out.println(name + "生命值是：" + life + "\n攻击力:" + attack + "  防御力：" + defend);
    }
}
