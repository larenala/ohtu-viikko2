
package ohtu.verkkokauppa;


public interface Rahasailo {

    boolean tilisiirto(String nimi, int viitenumero, String tililta, String tilille, int summa);
    
}
