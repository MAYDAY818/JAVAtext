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
		// TODO 自动生成的方法存根
		
	}
	
}
class Example{
    public static void main(String[] args) {
       Hello c = new Hello(5);
       System.out.println(c.title);
    }
}
