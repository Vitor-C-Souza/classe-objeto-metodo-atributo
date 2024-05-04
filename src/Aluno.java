public class Aluno {
    String nome;
    int idade;

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }


    void informacoes(){
        System.out.printf("""
                nome:       %s
                idade:      %d
                """, nome, idade);
    }


}
