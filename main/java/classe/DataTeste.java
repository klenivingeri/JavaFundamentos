package classe;

public class DataTeste {
    public static void main(String[] args) {
        Data d1 = new Data();
        d1.dia = 7;
        d1.mes = 11;
        d1.ano = 2024;

        System.out.printf("%d/%d/%d\n", d1.dia, d1.mes, d1.ano );

        var d2 = new Data();
        d2.dia = 31;
        d2.mes = 12;
        d2.ano = 2024;
        System.out.printf("%d/%d/%d\n", d2.dia, d2.mes, d2.ano);

        String dataFormatad = d2.obterDataFormatada();
        System.out.printf(dataFormatad);
    }
}
