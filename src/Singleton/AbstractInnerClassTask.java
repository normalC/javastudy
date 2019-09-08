class A{
	public abstract class AbstractInner{
	int x1;
	int x2;
	abstract void innerMthod();	
}

public class Inner extends AbstractInner{
			void innerMthod(){
			x1++;
			x2--;
			System.out.println("Inner.innerMthod");
	}	}
	public Inner aMethod(){return new Inner();}
}

public class AbstractInnerClassTask{
	public static void main(String[] args)
	{
		A a = new A();
		A.Inner k = a.aMethod();
		k.innerMthod();
		System.out.println("x1 = "+k.x1);
		System.out.println("x2 = "+k.x2);
	}
	
	
	
}