public class Carro {
    String modelo;
    int ano;
    String cor;

    void fichaTecnica(){
        System.out.printf("""
                modelo:     %s
                ano:        %d
                cor:        %s
                """, modelo, ano, cor);
    }

    int idade(){
        return 2024 - ano;
    }
}
