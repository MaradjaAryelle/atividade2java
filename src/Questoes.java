public class Questoes {
    public static String mesPorExtenso(int dia, int mes, int ano){

        String nomeMes = "";

        if (mes ==1){
            nomeMes = "Janeiro";
        } else if (mes == 2){
            nomeMes = "Fevereiro";
        } else if (mes == 3){
            nomeMes = "Março";
        } else if (mes == 4){
            nomeMes = "Abrl";
        } else if (mes == 5){
            nomeMes = "Maio";
        } else if (mes == 6){
            nomeMes = "Junho";
        } else if (mes == 7){
            nomeMes = "Julho";
        } else if (mes == 8){
            nomeMes = "Agosto";
        } else if (mes == 9){
            nomeMes = "Setembro";
        } else if (mes == 10){
            nomeMes = "Outubro";
        } else if (mes == 11){
            nomeMes = "Novembro";
        } else {
            nomeMes = "Dezembro";
        }

        return String.format("%d de %s de %d", dia, nomeMes, ano);
    }
    public static String soma(int num1, int num2, int num3) {

        int soma = num1 + num2 + num3;
        return String.format("A soma dos números é %d", soma);
    }
    public static String somaImposto(double taxaImposto , double custo){

        double soma = custo + custo * (taxaImposto/100);
        return String.format("O custo total é de %.2f", soma);

    }
}
