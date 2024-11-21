package Concessionarias;

import Fabrica.*;

public class Ford implements FabricaDeCarro {
    @Override
    public Carro createSedan() {
        return new SUV(150, "Gasolina", "Azul");
    }

    @Override
    public Carro createSUV() {
        return new Sedan(200, "Diesel", "Preto");
    }
}
