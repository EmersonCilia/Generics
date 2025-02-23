import Concessionarias.*;
import Fabrica.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        FabricaDeCarro fabricaBMW = new BMW();
        FabricaDeCarro fabricaFord = new Ford();
        FabricaDeCarro fabricaToyota = new Toyota();

        List<Automovel> Automoveis = new ArrayList<>();

        Automoveis.add(fabricaBMW.criaAutomovel(Sedan.class));
        Automoveis.add(fabricaFord.criaAutomovel(SUV.class));
        Automoveis.add(fabricaToyota.criaAutomovel(Caminhao.class));

        for (Automovel automovel : Automoveis) {
            System.out.println(automovel);
        }
    }
}
