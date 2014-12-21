
public class Pjesma {
private String naziv;
private double trajanje;
private Autor autor;


/**
 * konstruktor metod za instanciranje klase, sa parametrima
 * @param naziv
 * @param trajanje
 * @param noviAutor
 */
public Pjesma(String naziv, double trajanje, Autor noviAutor){
	this.naziv=naziv;
	this.trajanje =trajanje;
	autor=new Autor();
	this.autor.setImePrezime(noviAutor.getImePrezime());
	this.autor.setEmail(noviAutor.getEmail());
	this.autor.setSpol(noviAutor.getSpol());
}

public String getNaziv() {
	return naziv;
}

public void setNaziv(String naziv) {
	this.naziv = naziv;
}

public double getTrajanje() {
	return trajanje;
}

public void setTrajanje(double trajanje) {
	this.trajanje = trajanje;
}

/**
 * metod koji kreira i vraca string reprezentaciju objekta tipa Pjesma
 */
public String toString(){
	String pjesmaToString="";
	pjesmaToString="Naziv: "+naziv+"\nTrajanje: "+trajanje+" minuta"+"\nPodaci o autoru: "+"\n"+autor.toString();
	return pjesmaToString;
}



}
