// 游戏角色类
public class gameRole {
	public String name;
    public int hp;
    public int attack;
    public int defense;
    
    public gameRole(String name) {
        this.name = name;
        this.hp = 100;
        this.attack = 100;
        this.defense = 100;
        System.out.println("创立初始角色" + this.name + "，各种力量均为100");
    }
    
    // 恢复状态
    public void restart(memory mem) {
    	this.hp = mem.mem_hp;
        this.attack = mem.mem_attack;
        this.defense = mem.mem_defense;
        System.out.println("角色" + this.name + "恢复完毕");
    }
    
    
    public void beAttacked() {
    	this.hp = 0;
    	this.attack = 0;
    	this.defense = 0;
    	System.out.println("角色" + this.name + "受到攻击，各种力量均降为0");
    }
    
}
