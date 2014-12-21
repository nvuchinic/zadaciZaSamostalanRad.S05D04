
public class TestPjesma {
public static void main(String[] args) {
	Autor a1=new Autor("Michael Jackson","m.jackson@gmail.com","m");
	Pjesma p1=new Pjesma("smooth criminal", 4.53,a1);
	System.out.println(p1.toString());
}
}
