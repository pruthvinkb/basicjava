
public class ClassMethods {
	static int value=3;//global variable in static 
	int num=45;//global
	void run() {
		System.out.println("non static run method");
	}
	static void exute() {
		System.out.println("static excute method");
	}
public static void main(String[] args) {
   
	int num=3;//local variable(have high perfence then global)
	System.out.println("Local variable n"+num);
	ClassMethods.exute();
	System.out.println("golabl satic value"+value);
	System.out.println("non staic value" + num);
	
	//object cration
	ClassMethods ms=new ClassMethods();//object refence variable(ms->lower case)
	ms.run();
	System.out.println("non static num"+ms.num);
	
	
}
}
