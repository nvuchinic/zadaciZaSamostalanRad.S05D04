
public class Autor {
private String imePrezime;
private String email;
private String spol;

/**
 *  konstruktor metod za instanciranje klase, sa parametrima
 * @param imePrezime
 * @param email
 * @param spol
 */
public Autor(String imePrezime, String email, String spol){
	this.imePrezime=imePrezime;
	this.email=email;
	this.spol=spol;
}

/**
 * konstruktor metod za instanciranje klase, bez parametara(defaultni)
 * @param imePrezime
 * @param email
 * @param spol
 */
public Autor(){
	this.imePrezime="nekoImePrezime";
	this.email="nekiEmail";
	this.spol="n";
	
}
public void setImePrezime(String novoImePrezime){
	imePrezime=novoImePrezime;
	}
public String getImePrezime(){
	return imePrezime;
}

public void setEmail(String noviEmail){
	email=noviEmail;
}

public String getEmail(){
	return email;
}

public void setSpol(String noviSpol){
	spol=noviSpol;
}

public String getSpol(){
	return spol;
}


/**
 * metod koji kreira i vraca String reprezentaciju objekta tipa Autor
 */
public String toString(){
	String autorToString="";
	autorToString="\t\tIme i prezime: "+imePrezime+"\n\t\tEmail: "+email+"\n\t\tSpol: "+spol;
	return autorToString;
}

/**
 * metod koji vraca boolean vrijednost u ovisnosti da li su objekti tipa Autor koji se porede jednaki(jednaki su
 * ako imaju isto ime, email i spol);
 * @param drugi
 * @return
 */
public boolean equals(Autor drugi){
	boolean isti=false;
	if(this.imePrezime.equals(drugi.imePrezime)&&this.email.equals(drugi.email)&&this.spol.equals(drugi.spol))
return true;
	return isti;
}
}
