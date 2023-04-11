import java.util.ArrayList;
import java.util.List;

/**
 * Paranaense
 */
public class Paranaense {

    int ano, numeroPartidas, golsTotais;
    Time campeao, vice;
    String goleada;
    List<Time> participantes, rebaixados, quartas, semi, finalistas;
    List<Time> participantesTaca1A, participantesTaca2A, participantesTaca1B, participantesTaca2B; // Apenas para o campeonato de 2019 e 2018

    Paranaense()
    {
        participantes = new ArrayList<>();
        rebaixados = new ArrayList<>();
        quartas = new ArrayList<>();
        semi = new ArrayList<>();
        finalistas = new ArrayList<>();
        participantesTaca1A = new ArrayList<>();
        participantesTaca2A = new ArrayList<>();
        participantesTaca1B = new ArrayList<>();
        participantesTaca2B = new ArrayList<>();
    }


}