
import java.util.List;
import java.util.Scanner;

public class Principal {



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um CNPJ para ser validado: ");
        String cnpj = sc.nextLine();
        ValidadorCNPJ validador = new ValidadorCNPJ(cnpj);
        List<String> validacao = validador.executaValidacoes();

        if(validacao.isEmpty()){
            System.out.println("CNPJ digitado está correto!");
        }else{
            System.out.println("CNPJ digitado está incorreto! O mesmo apresentou o(s) seguinte(s) erro(s): ");
            validacao.forEach(erro -> System.out.println(erro));
        }

    }
}
