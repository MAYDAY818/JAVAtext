package 异常;

public class main {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Gun G = new Gun();
		try {
			G.Shooting();
			G.Shooting();
			G.Shooting();
			G.Shooting();
			G.Shooting();
			G.Shooting();
			G.Shooting();
			
		}catch(empty e) {
			System.out.println("子弹为空");
		}
		
		try {
			G.Loading();
			G.Loading();
			G.Loading();
			G.Loading();
			G.Loading();
			G.Loading();
			G.Loading();
			
		}catch(full e) {
			System.out.println("子弹已满");
		}
		
	}

}
