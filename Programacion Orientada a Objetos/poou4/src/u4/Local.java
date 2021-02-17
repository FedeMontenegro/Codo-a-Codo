package u4;

import java.util.List;
import java.util.Scanner;

public class Local {

    public Local() {
    }

    public boolean BuscarCliente(List<Cliente>clientes, String dato){
        
        int verificacion = 0;
        
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getNombre().equals(dato)) {
                verificacion = 1;
            }
        }
        if (verificacion > 0) {
            return true;
        }else{
            return false;
        }
    }
}