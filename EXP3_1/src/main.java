
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 角色初始化
		gameRole X = new gameRole("liyinghui");
		System.out.println("角色：" + X.name + " hp：" + X.hp + " attack：" + X.attack + " defense：" + X.defense);
		
		//备忘录初始化
		memory M = new memory();
		
		//角色存档
		M.save(X.name, X.hp, X.attack, X.defense);
		
		//角色受到攻击
		X.beAttacked();
		System.out.println("角色：" + X.name + " hp：" + X.hp + " attack：" + X.attack + " defense：" + X.defense);
		
		//角色恢复
		X.restart(M);
		System.out.println("角色：" + X.name + " hp：" + X.hp + " attack：" + X.attack + " defense：" + X.defense);
	}

}
