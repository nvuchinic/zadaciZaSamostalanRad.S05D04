
public class TestTacka {
public static void main(String[] args) {
	Tacka t1=new Tacka(2,3);
	System.out.println(t1.toString());
	Tacka t2=new Tacka(1,1);
	System.out.println(t2.toString());
	System.out.print("Rastojanje izmedju ovih tacaka iznosi ");

	System.out.println(t1.rastojanje(t2));
}
}
