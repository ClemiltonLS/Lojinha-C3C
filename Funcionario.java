public class Funcionario extends Pessoa{
    public int matricula;
    public final String setor = "";
    
    @Override
    public final void dadosPessoais(){
        System.out.println("Matricula: " + matricula);
        System.out.println("Setor: " + setor);
        super.dadosPessoais();
    }

    @Override
    public void falar(){
        System.out.println("Método implementado na classe Funcionário");
    }
}
