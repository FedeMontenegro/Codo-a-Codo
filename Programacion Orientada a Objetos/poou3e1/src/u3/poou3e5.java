package u3;

import java.util.*;

public class poou3e5 {

    List<Integer> numero = new ArrayList<Integer>();
    String cadena;

    public poou3e5() {
    }
    
    public void RegistroAleatorio(List<Integer>num){
        
        this.numero = num;
        int total = 10;
        
        System.out.println("Asignando registros...");
        for (int i = 0; i < total; i++) {
            num.add((int)(Math.random()*10));
        }
        System.out.println("Registros asignados.");
    }
    
    public void Busqueda(int n, List<Integer>numeros){
        
        String cadena = "";
        
        String aux = "";
        //En el caso de coincidencia, la posicion de los registros en el List son almacenados en la variable aux.
        for (int i = 0; i < numeros.size(); i++) {
            if (n==numeros.get(i)) {
                
                aux = aux.concat(Integer.toString(i)+", ");
            }
        }
        
        //Se verifica si aux tiene algun registro y se retorna la respuesta correspondiente en cada caso.
        if (aux.length()>0) {
            //Se elimina el último carácter de la cadena aux, ya que sería una coma ubicada erróneamente.
            aux = aux.substring(0, aux.length()-2);
            aux = aux.concat(".");
            cadena = "registro encontrado en la posicion/es " + aux;
            //return cadena;
            System.out.println(cadena);
        }else{
            cadena = "El registro solicitado no se encuentra disponible.";
            //return cadena;
            System.out.println(cadena);
        }
        
    }
    
    public void GetRegistros(){
        System.out.println("Mostrando registros...");
        for(int n:this.numero){
            System.out.println(n); 
        }
    }
    
    //El siguiente metodo corresponde al ejercicio 9 de la unidad 3 de poo.
    public int Mayor(List<Integer>num){
        this.numero = num;
        int mayor = 0;
        int contador;
        
        Iterator i = num.iterator();
        
        while(i.hasNext()){
            if (mayor<num.get((int) i.next())) {
                mayor = num.get((int) i.next());
            }
        }
        return mayor;
    }
    
    //El siguiente metodo corresponde al ejercicio 9 de la unidad 3 de poo.
    public int Menor(List<Integer>num){
        this.numero = num;
        int menor = 99999;
        int contador;
        
        Iterator i = num.iterator();
        
        while(i.hasNext()){
            if (menor>num.get((int) i.next())) {
                menor = num.get((int) i.next());
            }
        }
        return menor;
    }
    
    //Este metodo corresponde al ejercicio 10 de la unidad 3 de poo.
    public int Promedio(List<Integer>num){
        
        Iterator i = num.iterator();
        int suma = 0;
        int conteo = 0;
        int promedio;
        
        while(i.hasNext()){
            suma += (int)i.next();
            conteo++;
        }
        promedio = suma/conteo;
        return promedio;
    }
    
}
