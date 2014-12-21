
public class Knjiga {
private String naziv;
private double cijena;
private int stanje=0;
Autor autor;

/**
 * konstruktor metod za instanciranje klase, sa parametrima
 * @param naziv
 * @param cijena
 * @param noviAutor
 */
public Knjiga(String naziv, double cijena, Autor noviAutor){
	this.naziv=naziv;
	this.cijena=cijena;
	this.stanje+=1;
	autor=new Autor();
	this.autor.setImePrezime(noviAutor.getImePrezime());
	this.autor.setEmail(noviAutor.getEmail());
	this.autor.setSpol(noviAutor.getSpol());
}

/**
 * konstruktor metod za instanciranje klase, bez parametara(defaultni)
 */
public Knjiga(){
	this.naziv="nekiAutor";
	this.cijena=0;
	//this.stanje+=1;
	autor=new Autor();
}

public void setNaziv(String noviNaziv){
	naziv=noviNaziv;
}

public String getNaziv(){
	return naziv;
}

public void setCijena(double novaCijena){
	cijena=novaCijena;
	}

public double getCijena(){
	return cijena;
}

public void setStanje(int novoStanje){
	stanje+=novoStanje;
	if(stanje<0){
		throw new IllegalArgumentException("Ne mozete imati manje od 0 knjiga na staju");
		}
	if(stanje>3){
		throw new IllegalArgumentException("Ne mozete imati vise od 3 knjige na stanju");
		}
}
//druga verzija gornjeg setera
/*public void setStanje(int novoStanje){
	stanje+=novoStanje;
	if(stanje<0){
		System.out.println("Ne mozete imati manje od 0 knjiga na stanju");
		stanje-=novoStanje;
		}
	if(stanje>3){
		System.out.println("Ne mozete imati vise od 3 knjige na stanju");
		stanje-=novoStanje;
		}
}*/


public int getStanje(){
	return stanje;
}

/**
 * metod koji kreira i vraca string reprezentaciju objekta tipa Knjiga
 */
public String toString(){
	String knjigaToString="";
	knjigaToString="Naziv djela: "+naziv+"\nCijena: "+cijena+"\nStanje: "+stanje+"\nPodaci o autoru: " 
			+"\n"+autor.toString()+"\n__________________________________";
	return knjigaToString;
}

/**
 * metod koji vraca boolean vrijednost u ovisnosti da li su objekti tipa Knjiga koji se porede jednaki,
 * (jednaki su ako su im jednaki naziv, cijena i autor)
 * @param druga
 * @return
 */
public boolean equals(Knjiga druga){
	boolean iste=false;
	if(this.naziv.equals(druga.naziv)&&this.cijena==druga.cijena&&this.autor.equals(druga.autor))
		iste =true;
	return iste;
}

}
