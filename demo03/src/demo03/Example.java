package demo03;

class Hello{
    String title;										 
    int value;                                           
    public Hello(){
       title += "World";
    }
    public Hello(int value){
       this.value = value;
       title = "Hello";
       Hello();
    }
	private void Hello() {
		// TODO �Զ����ɵķ������
		
	}
	
}
class Example{
    public static void main(String[] args) {
       Hello c = new Hello(5);
       System.out.println(c.title);
    }
}
