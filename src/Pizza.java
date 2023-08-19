import java.util.ArrayList;
import java.util.List;

public class Pizza {
    public static void main(String[] args) {


        String nombre;
        double precio;
        List<String> Lis_ingredientes = new ArrayList<>();
            Lis_ingredientes.add("Masa de pizza");
            Lis_ingredientes.add("Salsa de tomate");
            Lis_ingredientes.add("Queso rallado");
            Lis_ingredientes.add("Aceitunas negras");
            Lis_ingredientes.add("Cebolla picada");
            Lis_ingredientes.add("Salchicha");
            Lis_ingredientes.add("Champiñones");
            Lis_ingredientes.add("Pimiento");
/* La lista de Strings no pueden ser constantes debido a que se pueden modificar dinámicamente solo a
variables tales como "final double pi=3.1415926536;"
 */
        System.out.println(Lis_ingredientes);

    }}

