package Interface;
import java.util.*;

public interface IColeccion {


    boolean EstaVacia();
    Object Extraer();
    Object Primero();
    boolean Agregar(List<Object>coleccion, Object object);
}
