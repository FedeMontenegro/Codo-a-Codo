package poou3e1;

import java.util.*;
import u3.*;

public class Poou3e1 {


    public static void main(String[] args) {

        
        System.out.println(pesoMadera(TipoMadera.CAOBA));
        
    }
    
    static double pesoMadera(TipoMadera madera){
        
        int peso;
        int pesoRoble = 800;
        int pesoCaoba = 770;
        int pesoNogal = 820;
        int pesoCerezo = 790;
        double pesoPalet = 2.27;
        
        if(madera == TipoMadera.ROBLE){
            
            peso = (int)(pesoRoble/pesoPalet);
            return peso;
        }else if (madera == TipoMadera.CAOBA) {
            peso = (int)(pesoCaoba/pesoPalet);
            return peso;
        }else if (madera == TipoMadera.NOGAL) {
            peso = (int)(pesoNogal/pesoPalet);
            return peso;
        }else{
            peso = (int)(pesoCerezo/pesoPalet);
            return peso;
        }
    }
    
}