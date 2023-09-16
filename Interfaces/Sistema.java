package Interfaces;

public class Sistema {
    
    public static void main(String...strings) {

        FechamentoLetivoInterface fechamento = new FechamentoFatec();

        List<Double> notas = new ArrayList<Double>();
        notas.add(5.0);
        notas.add(7.0);

        Double media = fechamento.calcularMedia(notas);
        System.out.println("Media: " + media);
    }
}
