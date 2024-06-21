
package com.mycompany.atv.extensao.trimestre;

public abstract class Jogo{
    int numChances;
    int numJogado;
    int ladosDoDado;
    int pontos;
    
    public Jogo(int numChances, int ladosDoDado, int pontos){
        this.numChances = numChances;
        this.ladosDoDado = ladosDoDado;
        this.pontos = pontos;
    }
    
    public void jogarDado(){
        numJogado = (int) (Math.random() * ladosDoDado);
    }
}
