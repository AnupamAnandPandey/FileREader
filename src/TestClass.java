
public class TestClass {
public static void main(String[] args){
	String x= "xyz";
	String y=x;
	System.out.println(y);
	x=x.concat("abc");
	y=x;
	System.out.println(x);
	System.out.println(y);
	int z=10;
	int a=z;
	z=30;
	a=z;
	System.out.println(a);
	System.out.println(z);
	
	
}
}
