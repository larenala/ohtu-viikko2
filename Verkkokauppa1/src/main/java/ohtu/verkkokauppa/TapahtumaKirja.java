
package ohtu.verkkokauppa;

import java.util.ArrayList;

public interface TapahtumaKirja {

    ArrayList<String> getTapahtumat();

    void lisaaTapahtuma(String tapahtuma);
    
}
