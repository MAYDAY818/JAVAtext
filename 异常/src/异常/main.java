package �쳣;

public class main {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
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
			System.out.println("�ӵ�Ϊ��");
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
			System.out.println("�ӵ�����");
		}
		
	}

}
