package specical;

public class SpecialException extends Exception {
	private static final long serialVersionUID = 1L;
	@Override
	public String getMessage() {
		return "SpecialException三角形构造失败";
	}
	@Override
	public void printStackTrace() {
		super.printStackTrace();
		
		System.out.println("三角形构造失败，异常类型："+this.getClass().getName());
	}
	@Override
	public String toString() {
		return "三角形构造异常，类型为："+this.getClass().getName();
	}

}
