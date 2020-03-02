/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciolistadinamica;

/**
 *
 * @author aluno
 */
public class Jogador {
    private String nome;
    private String posicao;
    private double peso;
    private double altura;
    private int numCamisa;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getNumCamisa() {
        return numCamisa;
    }

    public void setNumCamisa(int numCamisa) {
        this.numCamisa = numCamisa;
    }

    public Jogador(String nome, String posicao, double peso, double altura, int numCamisa) {
        this.nome = nome;
        this.posicao = posicao;
        this.peso = peso;
        this.altura = altura;
        this.numCamisa = numCamisa;
    }
    
}
