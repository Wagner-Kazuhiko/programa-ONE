public class Designer extends Funcionario{

    @Override
    public double getBonificacao() {
        System.out.println("Chamando o método bonificação do Designer");
        return super.getBonificacao() + 200;
    }
}
