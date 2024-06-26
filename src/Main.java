import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> marcas= new ArrayList<>();
        marcas.add("marca1");
        marcas.add("marca2");
        marcas.add("marca3");
        marcas.add("marca4");
        marcas.add("marca5");
        marcas.add("marca6");
        marcas.add("marca7");
        marcas.add("marca8");
        marcas.add("marca9");
        marcas.add("marca10");
        marcas.forEach(System.out::println);

        marcas.add("blokbaster");
        marcas.add("carrefour");
        marcas.add("Jetix");
        int posicion=marcas.indexOf("blokbaster");
        marcas.remove(posicion);
        marcas.add("blockbuster");

        System.out.println(posicion);
        System.out.println( marcas.remove("carrefour"));

        marcas.forEach(System.out::println);

        List<String> posiblesMarcas= new ArrayList<>();

        posiblesMarcas.add("marca11");
        posiblesMarcas.add("marca12");
        posiblesMarcas.add("marca13");
        posiblesMarcas.add("marca14");
        posiblesMarcas.add("marca15");
        posiblesMarcas.add("marca16");

        marcas.addAll(posiblesMarcas);
        marcas.forEach(System.out::println);

        System.out.println("La lista tiene "+ marcas.size()+ " marcas");
    }

}