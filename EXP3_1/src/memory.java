// 备忘录类
public class memory {
	public int mem_hp = 0;
	public int mem_attack = 0;
	public int mem_defense = 0;
	
	//备份函数
	public void save(String name, int hp, int attack, int defense) {
		this.mem_hp = hp;
		this.mem_attack = attack;
		this.mem_defense = defense;
		System.out.println("角色" + name + "存档完毕");
	}
	
}
