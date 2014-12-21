
public class Tacka {
private double x;
private double y;

/**
 * konstruktor metod za instanciranje klase, sa parametrima
 * @param x
 * @param y
 */
public Tacka(double x, double y){
	this.x=x;
	this.y=y;
}

public double getX() {
	return x;
}

public void setX(double x) {
	this.x = x;
}

public double getY() {
	return y;
}

public void setY(double y) {
	this.y = y;
}

/**
 * metod koj kreira i vraca string reprezentaciju objekta tipa Tacka
 */
public String toString(){
	String tackaToString="";
	tackaToString="("+x+","+y+")";
	return tackaToString;
}

/**
 * metoda koja mjeri i vraca vrijednost koja predstavlja rastojanje izmedju dva objekta tipa Tacka
 * @param druga
 * @return
 */
public double rastojanje(Tacka druga){
	double duz=Math.sqrt((Math.pow((this.x-druga.x),2)+Math.pow((this.y-druga.y),2)));
	return duz;
}

}
