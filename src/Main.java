import Concessionarias.*;
import Fabrica.*;

public class Main {
    public static void main(String[] args) {
        FabricaDeCarro fabricaBMW = new BMW();
        FabricaDeCarro fabricaFord = new Ford();
        FabricaDeCarro fabricaToyota = new Toyota();

        Automovel bmwSedan = fabricaBMW.criaAutomovel(Sedan.class);
        Automovel fordSUV = fabricaFord.criaAutomovel(SUV.class);
        Automovel toyotaSedan = fabricaToyota.criaAutomovel(Caminhao.class);

        System.out.println("BMW Sedan: " + bmwSedan);
        System.out.println("ford SUV: " + fordSUV);
        System.out.println("toyota Caminhao: " + toyotaSedan);
    }
}