public class Krug {
private Tacka centar;
private double radius;

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

public String toString(){
	String krugToString="";
	krugToString="Krug ima centar sa koordinatama "+centar.toString()+", a radijus mu iznosi "+radius;
	return krugToString;
}

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
