public class Knjizara {
private String naziv;
private Knjiga[] knjige;
int brNaslova;

public Knjizara(String naziv){
	this.naziv=naziv;
	int vel=5;
	knjige=new Knjiga[vel];
	for(int i=0;i<knjige.length;i++){
		knjige[i]=new Knjiga();
	}
}

public String getNaziv() {
	return naziv;
}

public void setNaziv(String naziv) {
	this.naziv = naziv;
}

public int getBrNaslova() {
	return brNaslova;
}

public void setBrNaslova(int brNaslova) {
	this.brNaslova = brNaslova;
}



public   void addKnjiga(Knjiga k){
	
	for(int i=0;i<brNaslova;i++){
		
		if(knjige[i].equals(k)){
			knjige[i].setStanje(k.getStanje());
			return;
			}} 
		
			if(brNaslova==knjige.length){
				knjige=prosiriKnjige(knjige.length);}
			knjige[brNaslova]=k; 
		brNaslova++;
			}

public void prodajKnjigu(Knjiga knjiga){
	for(int i=0;i<brNaslova;i++){
		if(knjige[i].equals(knjiga)){
			knjige[i].setStanje(-1);
			if(knjige[i].getStanje()==0){
				knjige[i+1]=knjige[i];
				brNaslova--;
			}
		}
	}
}

public   Knjiga[] prosiriKnjige(int size){
	size=size*2;
	Knjiga[] temp=new Knjiga[size];
	for(int i=0;i<knjige.length;i++){
		temp[i]=knjige[i];
	}
	knjige=new Knjiga[size];
	knjige=temp;
	return knjige;
}


public String toString(){
	String knjizaraToString="";
	knjizaraToString="NAZIV KNJIZARE: "+"\n"+naziv+"\n_______________________________";
	for(int i=0;i<brNaslova;i++){
		knjizaraToString+="\n"+knjige[i].toString();
	}
	return knjizaraToString;
}

public void ispisiPoNazivu(){
	System.out.println("\n\n\nKNJIGE SORTIRANE PO NASLOVU:\n_____________________________\n_______________________________");
	Knjiga temp;
	for(int i=0; i < brNaslova-1; i++){

        for(int j=1; j < brNaslova-i; j++){
            if(knjige[j-1].getNaziv().compareTo(knjige[j].getNaziv())>0){
                temp=knjige[j-1];
                knjige[j-1] = knjige[j];
                knjige[j] = temp;
            }
        }
	}
	for(int i=0;i<brNaslova;i++){
		System.out.println("\n"+knjige[i].toString());
	}
}


public void ispisiPoAutoru(){
	Knjiga temp=new Knjiga();
	System.out.println("\n\n\nKNJIGE SORTIRANE PO AUTORU:\n___________________________\n____________________________");
	for(int i=0; i < brNaslova-1; i++){

        for(int j=1; j < brNaslova-i; j++){
            if(knjige[j-1].autor.getImePrezime().compareTo(knjige[j].autor.getImePrezime())>0){
                temp=knjige[j-1];
                knjige[j-1] = knjige[j];
                knjige[j] = temp;
            }
        }
	}
	
	for(int i=0;i<brNaslova;i++){
		System.out.println("\n"+knjige[i].toString());
	}
}

public void ispisiPoCijeni(){
	Knjiga temp=new Knjiga();
	System.out.println("\n\n\nKNJIGE SORTIRANE PO CIJENI:\n___________________________\n____________________________");
	for(int i=0; i < brNaslova-1; i++){

        for(int j=1; j < brNaslova-i; j++){
            if(knjige[j-1].getCijena()>(knjige[j].getCijena())){
                temp=knjige[j-1];
                knjige[j-1] = knjige[j];
                knjige[j] = temp;
            }
        }
	}
	
	for(int i=0;i<brNaslova;i++){
		System.out.println("\n"+knjige[i].toString());
	}
}

}
