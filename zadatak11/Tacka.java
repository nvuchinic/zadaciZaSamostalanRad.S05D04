
public class Tacka {
private double x;
private double y;

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

public String toString(){
	String tackaToString="";
	tackaToString="("+x+","+y+")";
	return tackaToString;
}

public double rastojanje(Tacka druga){
	double duz=Math.sqrt(Math.pow((this.x-this.y),2)+Math.pow((druga.x+druga.y),2));
	return duz;
}

}
