import Concessionarias.Ford;
import Concessionarias.Tesla;
import Fabrica.Carro;
import Fabrica.FabricaDeCarro;

public class Main {
    public static void main(String[] args) {
        FabricaDeCarro fabricaFord = new Ford();
        FabricaDeCarro fabricaTesta = new Tesla();

        Carro fordSedan = fabricaFord.createSedan();
        Carro teslaSUV = fabricaTesta.createSUV();

        System.out.println("Ford Sedan: " + fordSedan);
        System.out.println("Tesla SUV: " + teslaSUV);
    }
}