/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmogeneticojava;

/**
 *
 * @author Bruna Amorim
 */
public class Inicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numGeracoes=20, tamPopulacao=30, 
        probMutacao=15, 
        qtdeCruzamentos=10; 
        double capacidade=6;
        AlgoritmoGenetico ag = 
         new AlgoritmoGenetico(numGeracoes,tamPopulacao,
                               probMutacao,qtdeCruzamentos,
                               capacidade);
        ag.executaAG();       
    }
}
