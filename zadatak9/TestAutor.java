public class TestAutor {
public static void main(String[] args) {
	Autor a=new Autor("Mesa Selimovic", "m.selimovic@gmail.com","m");
	//System.out.println(a.toString());
	Knjiga k=new Knjiga("Most na Cupriji",20.00,a);
	//System.out.println(k.toString());
	k.setStanje(1);
	//System.out.println(k.toString());
	k.setStanje(1);
	System.out.println(k.toString());
	Knjiga k2=new Knjiga();
k2.copyKnjiga(k);
System.out.println(k2.toString());



}
}
