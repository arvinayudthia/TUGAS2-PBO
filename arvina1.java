public class arvina1{
	int a; double b;

	//construktor defauld
	public arvina1(){
	a = 50;
	b = 3.14;
	}
	//construktor parameter
	public arvina1(int x){
	a = x;
	}

public static void main(String[] args){
	arvina1 a1 = new arvina1();
	arvina1 a2 = new arvina1(30);
	
	System.out.println(a1.a);
	System.out.println(a1.b);
	System.out.println(a2.a);
	
}
}
