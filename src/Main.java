public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.saudacao();

        Calculadora calculadora = new Calculadora();
        System.out.println(calculadora.Dobrar(6));

        Musica musica = new Musica();
        musica.titulo = "meteoro da paixão";
        musica.artista = "Luan Santana";
        musica.anoLancamento = 2009;
        musica.FichaTecnica();
        musica.avalia(7);
        musica.avalia(3);
        musica.avalia(9);
        musica.avalia(4);
        musica.avalia(1);
        musica.avalia(8);
        System.out.printf("Avaliação média é: %.2f \n",  musica.pegaMedia());

        Carro carro = new Carro();
        carro.modelo = "celta";
        carro.ano = 2008;
        carro.cor = "preto";
        carro.fichaTecnica();
        System.out.println("O carro tem " + carro.idade() + " anos");

        Aluno aluno = new Aluno("Vítor", 26);
        aluno.informacoes();
    }
}