
package com.mycompany.atv.extensao.trimestre;

public class ModoDificil extends Jogo{
    
    public ModoDificil(int numChances, int ladosDoDado, int pontos) {
        super(numChances, ladosDoDado, pontos);
    }
    
    public void jogarDado(){
        numJogado = (int) (Math.random() * ladosDoDado);
    }
}
