package Interface;

interface Drawable {
	int salary = 100;
	void draw();  //by default abstarct method() // public abstract void draw();		
	void show();
}  

interface Shape{
	int salary = 200;
	void shape();  //by default abstarct method()  // public abstract void shape();	
	void show();
}

interface Demo extends Shape{	
}
	
	public class Interface20 implements Shape, Drawable{
		
		int salary = 900;
		
		public void show(){
			System.out.println("inside show()");
		}

		@Override
		public void draw() {
			// TODO Auto-generated method stub
			System.out.println("inside draw");
		}

		@Override
		public void shape() {
			// TODO Auto-generated method stub
			System.out.println("inside shape");	
		}
		
		public static void main(String args[]){
			Interface20 obj = new Interface20();
			obj.shape();
			obj.show();
			obj.draw();
			
			Shape d = new Interface20();
			System.out.println(d.salary);
			
			System.out.println("salary  "+ obj.salary);		
		}


}
