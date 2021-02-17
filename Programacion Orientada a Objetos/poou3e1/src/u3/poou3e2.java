package u3;


public class poou3e2 {

    private String palabraUno;
    private String palabraDos;

    public poou3e2() {
    }

    public String getPalabraUno() {
        return palabraUno;
    }

    public String getPalabraDos() {
        return palabraDos;
    }

    public void setPalabraUno(String palabraUno) {
        this.palabraUno = palabraUno;
    }

    public void setPalabraDos(String palabraDos) {
        this.palabraDos = palabraDos;
    }
    
    public void CompararLetras(String p1, String p2){
        
        int mayor = 0;
        int menor = 0;
        int i = 0;
        
        if (p1.length()>=p2.length()) {
            while (i < p2.length()) {
                System.out.println("Letra " + i + " igual en ambas palabras?");
                if (p1.substring(i, i+1).equals(p2.substring(i, i+1))) {
                    System.out.println(true);
                }else{
                    System.out.println(false);
                }
                i++;
            }
            while(i<p1.length()){
                System.out.println("La palabra " + p2 + " no contiene letra " + i);
                i++;
            }
        }else if (p1.length()<=p2.length()) {
            
            while (i < p1.length()) {
                System.out.println("Letra " + i + " igual en ambas palabras?");
                if (p1.substring(i, i+1).equals(p2.substring(i, i+1))) {
                    System.out.println(true);
                }else{
                    System.out.println(false);
                }
                i++;
            }
            while(i<p2.length()){
                System.out.println("La palabra " + p1 + " no contiene letra " + i);
                i++;
            }
        }else{
            System.out.println("Las palabras son iguales.");
        }
   
}
    public void CompararLetrasMejorado(String p1, String p2){
        
        int mayor;
        int menor;
        String palabra;
        
        if (p1.length()>p2.length()) {
            mayor = p1.length();
            menor = p2.length();
            palabra = p2;
        }else{
            mayor = p2.length();
            menor = p1.length();
            palabra = p1;
        }
        
        for (int i = 0; i < mayor; i++) {
                
            if(i < menor){
            System.out.println("Letra " + i + " igual en ambas palabras?");
            System.out.println(p1.substring(i, i+1).equals(p2.substring(i, i+1)));
            }else{
                System.out.println("La palabra " + palabra + " no contiene letra " + i);
            }
        }
        
    }
}
