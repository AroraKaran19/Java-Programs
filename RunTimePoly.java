// 11. Write a Java program to implement run time polymorphism.

class A{
	void callme()
	{
	 System.out.println("Inside A CallMe Method");
	}
}

class B extends A{
	void callme()
	{
		System.out.println("Inside B CallMe Method");
	}
}

class C extends B{
	void callme()
	{
		System.out.println("Inside C CallMe Method");
	}
}

class RunTimePoly{
	public static void main(String args[])
	{
		A a = new A();
		B b = new B();
		C c = new C();
		A r;
		r=a;
		r.callme();
		r=b;
		r.callme();
		r=c;
		r.callme();
	}
}