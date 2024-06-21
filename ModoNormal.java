
package com.mycompany.atv.extensao.trimestre;

public class ModoNormal extends Jogo{
    
    int numAjuda1;
    int numAjuda2;
    
    public ModoNormal(int numChances, int ladosDoDado, int pontos) {
        super(numChances, ladosDoDado, pontos);
    }
    
    public void jogarDado(){
        numJogado = (int) (Math.random() * ladosDoDado);
    }
    
    public void dicaHelp(){
        
        do{
            numAjuda1 = (int) (Math.random() * ladosDoDado);
        } while(numAjuda1 > numJogado);
        
        do{
            numAjuda2 = (int) (Math.random() * ladosDoDado);
        }while(numAjuda2 < numJogado);
        
        System.out.println("O número que foi sorteado para você está entre " + numAjuda1 + " e " + numAjuda2);
    }
}
