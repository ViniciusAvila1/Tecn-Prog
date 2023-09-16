package Interfaces;
import java.util.List;

public interface FechamentoLetivoInterface {

    @Override
    public Double calcularMedia(List<Double> notas) {
        
        Double somanotas = 0D;
        Double media;

        for(Double n : notas) {
            somanotas += n;
        }

        if(notas.size() > 5 ) {
            media = (somanotas / notas.size()) * 1.1;
        } else {
            media = somanotas / notas.size();
        }

        return media;
    }
}