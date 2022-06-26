import java.util.ArrayList;
import java.util.List;

public class ValidadorCNPJ {

    String cnpj;
    List<String> errosValidacao = new ArrayList<>();

    public ValidadorCNPJ(String cnpj){
        this.cnpj = cnpj;
    }

    public List<String> executaValidacoes(){

        validaTamanhoCNPJFormatted();

        if(errosValidacao.isEmpty()){
            validaTamanhoCNPJNumberOnly();
        }
        if(errosValidacao.isEmpty()){
            validaPrimeiroDigitoChecador();
        }
        if(errosValidacao.isEmpty()){
            validaSegundoDigitoChecador();
        }

        return errosValidacao;
    }

    public void validaTamanhoCNPJFormatted(){
        if(cnpj.contains(".") || cnpj.contains("/") || cnpj.contains("-")){
            if(cnpj.length() != 18){
                errosValidacao.add("O CNPJ digitado não possui a quantidade de caracteres correto.");
            }else{
                String[] caracteres = cnpj.split("");
                if(!caracteres[2].equals(".") && caracteres[6].equals(".") && caracteres[10].equals("/") && caracteres[15].equals("-")){
                    errosValidacao.add("O CNPJ não está formatado corretamente.");
                }
            }
        }
    }

    public void validaTamanhoCNPJNumberOnly(){
        if(!(cnpj.contains(".") || cnpj.contains("/") || cnpj.contains("-"))){
            if(cnpj.length() != 14){
                errosValidacao.add("O CNPJ digitado não possui a quantidade de caracteres correto.");
            }
        }
    }

    public void validaPrimeiroDigitoChecador(){

        String primeiroDigitoValidador;

        if(cnpj.contains(".") || cnpj.contains("/") || cnpj.contains("-")){
            cnpj = cnpj.replace(".", "");
            cnpj = cnpj.replace("/", "");
            cnpj = cnpj.replace("-", "");
        }
        Integer somatorio = 0;
        String[] caracteres = cnpj.split("");
        somatorio += Integer.parseInt(caracteres[0]) * 5;
        somatorio += Integer.parseInt(caracteres[1]) * 4;
        somatorio += Integer.parseInt(caracteres[2]) * 3;
        somatorio += Integer.parseInt(caracteres[3]) * 2;
        somatorio += Integer.parseInt(caracteres[4]) * 9;
        somatorio += Integer.parseInt(caracteres[5]) * 8;
        somatorio += Integer.parseInt(caracteres[6]) * 7;
        somatorio += Integer.parseInt(caracteres[7]) * 6;
        somatorio += Integer.parseInt(caracteres[8]) * 5;
        somatorio += Integer.parseInt(caracteres[9]) * 4;
        somatorio += Integer.parseInt(caracteres[10]) * 3;
        somatorio += Integer.parseInt(caracteres[11]) * 2;

        Integer quociente  = somatorio % 11;
        if(quociente < 2){
            primeiroDigitoValidador = "0";
        }else{
            primeiroDigitoValidador = String.valueOf(11 - quociente);
        }

        if(!primeiroDigitoValidador.equals(caracteres[12])){
            errosValidacao.add("O primeiro digito validador do CNPJ está incorreto!");
        }
    }

    public void validaSegundoDigitoChecador(){

        String segundoDigitoValidador;

        if(cnpj.contains(".") || cnpj.contains("/") || cnpj.contains("-")){
            cnpj = cnpj.replaceAll(".", "");
            cnpj = cnpj.replaceAll("/", "");
            cnpj = cnpj.replaceAll("-", "");
        }
        Integer somatorio = 0;
        String[] caracteres = cnpj.split("");
        somatorio += Integer.parseInt(caracteres[0]) * 6;
        somatorio += Integer.parseInt(caracteres[1]) * 5;
        somatorio += Integer.parseInt(caracteres[2]) * 4;
        somatorio += Integer.parseInt(caracteres[3]) * 3;
        somatorio += Integer.parseInt(caracteres[4]) * 2;
        somatorio += Integer.parseInt(caracteres[5]) * 9;
        somatorio += Integer.parseInt(caracteres[6]) * 8;
        somatorio += Integer.parseInt(caracteres[7]) * 7;
        somatorio += Integer.parseInt(caracteres[8]) * 6;
        somatorio += Integer.parseInt(caracteres[9]) * 5;
        somatorio += Integer.parseInt(caracteres[10]) * 4;
        somatorio += Integer.parseInt(caracteres[11]) * 3;
        somatorio += Integer.parseInt(caracteres[12]) * 2;

        Integer quociente  = somatorio % 11;
        if(quociente < 2){
            segundoDigitoValidador = "0";
        }else{
            segundoDigitoValidador = String.valueOf(11 - quociente);
        }

        if(!segundoDigitoValidador.equals(caracteres[13])){
            errosValidacao.add("O segundo digito validador do CNPJ está incorreto!");
        }
    }
}
