package Fabrica;

public interface FabricaDeCarro {
        <T extends Automovel> T criaAutomovel(Class<T> tipo);
}
