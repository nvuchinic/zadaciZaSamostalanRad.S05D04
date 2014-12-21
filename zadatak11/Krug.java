
public class Krug {
private Tacka centar;
private double radius;

/**
 * konstruktor metod za instanciranje klase, sa parametrima
 * @param centar
 * @param radius
 */
public Krug(Tacka centar, double radius){
	this.centar=new Tacka(centar.getX(),centar.getY());
	this.radius=radius;
}

public double getRadius() {
	return radius;
}

public void setRadius(double radius) {
	this.radius = radius;
}

/**
 * metod koji kreira i vraca string reprezentaciju objekta tipa Krug
 */
public String toString(){
	String krugToString="";
	krugToString="Krug ima centar sa koordinatama "+centar.toString()+", a radijus mu iznosi "+radius;
	return krugToString;
}

/**
 * metoda koja provjerava gdje se tacno nalazi objekt tipa Tacka proslijedjen kao parametar u odnosu na objekt
 * tipa Krug(da li je u krugu, van kruga ili dodiruje krug)
 * @param druga
 * @return
 */
public int isInside(Tacka druga){
	double razmak=this.centar.rastojanje(druga);
	System.out.println(razmak);
	if(razmak>radius)
		return -1;
	else if(razmak<radius)
		return 1;
	else return 0;

	
	
}

}
