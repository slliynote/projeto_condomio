package classes;

public class Funcionario extends Pessoa{

    private double horario;

    public enum cargo{
        zelador,
        porteiro,
        sindico,
        empregada,
    };


    private double pontos;
    private double historicosDePresenças;

}
