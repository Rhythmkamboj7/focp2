class C {
	public static void main( String args[]){
		//B b= new B(); run
		//b.set(); run
		//b.fun1();run
		//B.display();run
		//A a= new B();
		//a.set(); run
		//a.get(); run 
		//a.fun1(); [ error cannot display the refernce elements of B]
		//a.display();
		//B b;
		//A a = new A();
		//b= (B) a;
		//b=a;
		//b.set();
		//b.get();
		//b.fun1();
		//b.display();
		A a;
		B b= new B();
		a=(A) b;
		a.set();
		a.get();

	}
}