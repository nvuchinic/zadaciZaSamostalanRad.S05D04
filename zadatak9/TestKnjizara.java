public class TestKnjizara {
public static void main(String[] args) {
	Autor a1=new Autor("Ivo Andric","i.andric@gmail.com","m");
	Autor a2=new Autor("mesa selimovic","m.selimovic@gmail.com","m");
	Autor a3=new Autor("mak dizdar","m.dizdar@gmail.com","m");

	Knjiga k1=new Knjiga("na drini cuprija",10,a1);
	//System.out.println(k1.toString());
	Knjiga k2=new Knjiga("travnicka hronika",20,a1);
	//Knjiga k3=new Knjiga("gospodjica",20,a1);
	Knjiga k3=new Knjiga("tvrdjava",30,a2);

	//System.out.println(k3.toString());
	//Knjiga k4=new Knjiga("znakovi pored puta",20,a1);
	Knjiga k4=new Knjiga("dervis i smrt",25,a2);

	//Knjiga k5=new Knjiga("prokleta avlija",20,a1);
	Knjiga k5=new Knjiga("kameni spavac",15,a3);

//	Knjiga k6=new Knjiga("alija djerzelez",20,a1);
	Knjiga k6=new Knjiga("modra rijeka",35,a3);

	Knjiga k7=new Knjiga("alija djerzelez",40,a1);

	Knjizara knj1=new Knjizara("Knjizara1");
	//System.out.println(knj1.toString());
	knj1.addKnjiga(k3);
	knj1.addKnjiga(k4);
	knj1.addKnjiga(k5);
	knj1.addKnjiga(k2);
	knj1.addKnjiga(k1);
	knj1.addKnjiga(k6);
	knj1.addKnjiga(k7);

	//System.out.println(knj1.toString());
	//System.out.println(knj1.brNaslova);
	//knj1.prodajKnjigu(k7);
	//knj1.prodajKnjigu(k7);

	System.out.println(knj1.toString());
	//System.out.println(knj1.brNaslova);
	
	//knj1.ispisiPoNazivu();
	//knj1.ispisiPoAutoru();
	knj1.ispisiPoCijeni();



}
}
