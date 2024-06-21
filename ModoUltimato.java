
package com.mycompany.atv.extensao.trimestre;

public class ModoUltimato extends Jogo{
    
    public ModoUltimato(int numChances, int ladosDoDado, int pontos) {
        super(numChances, ladosDoDado, pontos);
    }
    
    public void jogarDado(){
        numJogado = (int) (Math.random() * ladosDoDado);
    }
}
