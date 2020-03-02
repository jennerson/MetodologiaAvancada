/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciolistadinamica;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Jogador> time = new ArrayList<Jogador>();
        Scanner entrada  = new Scanner(System.in);
        
        for(int i=1; i<=11; i++){
            System.out.println("Informe os dados do Jogador: ");
            
            String nome = entrada.next();
            String posicao = entrada.next();
            double peso = entrada.nextDouble();
            double altura = entrada.nextDouble();
            int numCamisa = entrada.nextInt();
            
            time.add(new Jogador(nome, posicao, peso, altura, numCamisa));
        }
        
        for(int i=0; i<time.size();i++){
            String layout = "---=== Informações do Jogador ===---"
                + "\n"
                + "- Nome: " + time.get(i).getNome() + "\n"
                + "- Posição: " + time.get(i).getPosicao() + "\n"
                + "- Peso: " + time.get(i).getPeso() + "\n"
                + "- Altura: " + time.get(i).getAltura() + "\n"
                + "- Num Camisa: " + time.get(i).getNumCamisa();
        }
    }
    
}
