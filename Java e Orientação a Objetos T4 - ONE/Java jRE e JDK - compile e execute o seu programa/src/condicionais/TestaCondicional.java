package condicionais;

public class TestaCondicional {
    public static void main(String[] args) {

        System.out.println("Tesyando condicionais");
        int idade = 15;
        int quantidadeDePessoas = 3;
        if (idade >= 18){
            System.out.println("Você tem mais de 18 anos");
            System.out.println("seja bem vindo");
        }
        else {
            if (quantidadeDePessoas >= 2){
                System.out.println("você não tem 18, mas pode entrar pois está acompanhado de " + quantidadeDePessoas + " pessoas");

            }
            else {
                System.out.println("infelizmente você não pode entrar");
            }
        }
    }
}
