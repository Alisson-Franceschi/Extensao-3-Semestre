
package com.mycompany.atv.extensao.trimestre;

import java.util.Scanner;

public class AtvExtensao3Trimestre {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Regras regras = new Regras();
        
        int escolhaJogador;
        
        System.out.println("Seja bem vindo ao Enigma Numérico");
        
        do{
            System.out.println("\n\n" + "Escolha um para continuar:");
            System.out.println("1: Jogar" + "\n" +
                               "2: Regras do jogo" + "\n" +
                               "3: Sair do jogo");
            escolhaJogador = scanner.nextInt();
            
            if(escolhaJogador == 1){
                int escolhaModo;
                int numJogador;
                int continuaJogo = 0;
                int pontuacao = 0;
                
                do{
                    System.out.println("Pontuação: " + pontuacao);
                    System.out.println("Escolha seu modo de jogo");
                    System.out.println("1: Fácil" + "\n" +
                                        "2: Normal" + "\n" +
                                        "3: Difícil" + "\n" +
                                        "4: Ultimato" + "\n" +
                                        "5: Voltar");
                    escolhaModo = scanner.nextInt();
                
                    if(escolhaModo == 1){
                        ModoFacil facil = new ModoFacil(15,50, 100);
                        
                        facil.jogarDado();
                        System.out.println("O dado foi jogado, seu número engimático entre 1 e " + facil.ladosDoDado + " foi gerado, tente descobrir quem ele é");
                        System.out.println("No modo fácil você possui " + facil.numChances + " chances");
                        System.out.println("Didigite seu número: ");
                        numJogador = scanner.nextInt();
                        
                        while(facil.numChances != 0){
                            if(numJogador == facil.numJogado){
                                System.out.println("Você acertou!");
                                pontuacao = pontuacao + facil.pontos;
                                break;
                            }else{
                                System.out.println("Você errou");
                                facil.numChances--;
                                if (facil.numChances > 0){
                                System.out.println("Você só possui mais " + facil.numChances + " chances");
                                System.out.println("Informe outro número: ");
                                numJogador = scanner.nextInt();
                                }
                                if(facil.numChances <= 5){
                                    System.out.println("Dica: ");
                                    facil.dicaHelp();
                                }
                            }
                            if(facil.numChances == 0){
                                System.out.println("Acabaram as suas chances" + "\n"
                                        + "O número era " + facil.numJogado + "\n"
                                        + "Game Over!");
                                System.out.println("Pontuação final: " + pontuacao);
                                continuaJogo++;
                            }
                        }
                    }
                    
                    else if(escolhaModo == 2){
                        ModoNormal normal = new ModoNormal(10, 100, 500);
                        
                        normal.jogarDado();
                        System.out.println("O dado foi jogado, seu número engimático entre 1 e " + normal.ladosDoDado + " foi gerado, tente descobrir quem ele é");
                        System.out.println("No modo normal você possui " + normal.numChances + " chances");
                        System.out.println("Didigite seu número: ");
                        numJogador = scanner.nextInt();
                        
                        while(normal.numChances != 0){
                            if(numJogador == normal.numJogado){
                                System.out.println("Você acertou!");
                                pontuacao = pontuacao + normal.pontos;
                                break;
                            }else{
                                System.out.println("Você errou");
                                normal.numChances--;
                                if (normal.numChances > 0){
                                System.out.println("Você só possui mais " + normal.numChances + " chances");
                                System.out.println("Informe outro número: ");
                                numJogador = scanner.nextInt();
                                }
                                if(normal.numChances == 1){
                                    System.out.println("Dica: ");
                                    normal.dicaHelp();
                                }
                            }
                            if(normal.numChances == 0){
                                System.out.println("Acabaram as suas chances" + "\n"
                                        + "O número era " + normal.numJogado + "\n"
                                        + "Game Over!");
                                System.out.println("Pontuação final: " + pontuacao);
                                continuaJogo++;
                            }
                        }
                    }
                    
                    else if(escolhaModo == 3){
                        ModoDificil dificil = new ModoDificil(5, 100, 1000);
                        
                        dificil.jogarDado();
                        System.out.println("O dado foi jogado, seu número engimático entre 1 e " + dificil.ladosDoDado + " foi gerado, tente descobrir quem ele é");
                        System.out.println("No modo difícil você só possui " + dificil.numChances + " chances");
                        System.out.println("Vale lembrar que neste modo não há dicas, então você depende completamnete da sua sorte");
                        System.out.println("Didigite seu número: ");
                        numJogador = scanner.nextInt();
                        
                        while(dificil.numChances != 0){
                            if(numJogador == dificil.numJogado){
                                System.out.println("Você acertou!");
                                pontuacao = pontuacao + dificil.pontos;
                                break;
                            }else{
                                System.out.println("Você errou");
                                dificil.numChances--;
                                if (dificil.numChances > 0){
                                System.out.println("Você só possui mais " + dificil.numChances + " chances");
                                System.out.println("Informe outro número: ");
                                numJogador = scanner.nextInt();
                                }
                            }
                            if(dificil.numChances == 0){
                                System.out.println("Acabaram as suas chances" + "\n"
                                        + "O número era " + dificil.numJogado + "\n"
                                        + "Game Over!");
                                System.out.println("Pontuação final: " + pontuacao);
                                continuaJogo++;
                            }
                        }
                    }
                    
                    else if(escolhaModo == 4){
                        ModoUltimato ultimato = new ModoUltimato(1, 1000, 1000000);
                        
                        ultimato.jogarDado();
                        System.out.println("O dado foi jogado, seu número engimático entre 1 e " + ultimato.ladosDoDado + " foi gerado, boa sorte para descobri-lo");
                        System.out.println("No modo difícil você só possui uma única chance");
                        System.out.println("Este é o modo mais perigoso do jogo, já que, se você errar acabou");
                        System.out.println("Pense com cuidado e digite seu número: ");
                        numJogador = scanner.nextInt();
                        
                        while(ultimato.numChances != 0){
                            if(numJogador == ultimato.numJogado){
                                System.out.println("Você acertou!");
                                pontuacao = pontuacao + ultimato.pontos;
                                break;
                            }else{
                                System.out.println("Você errou");
                                ultimato.numChances--;
                            }
                            if(ultimato.numChances == 0){
                                System.out.println("Acabaram as suas chances" + "\n"
                                        + "O número era " + ultimato.numJogado + "\n"
                                        + "Game Over!");
                                System.out.println("Pontuação final: " + pontuacao);
                                continuaJogo++;
                            }
                        }
                    }
                    
                    else if(escolhaModo == 5){
                        continuaJogo++;
                    }
                    
                    else{
                        System.out.println("Por favor, ecolha uma das opções para continuar o jogo, digitando apenas 1, 2, 3, 4 ou 5" + "\n");
                    }
                }while(continuaJogo == 0);
            }
            
            else if(escolhaJogador == 2){
                regras.mostrarRegras();
            }
            
            else if(escolhaJogador == 3){
                System.out.println("Obrigado por jogar o Enigma Numérico, espero que tenha se divetido :)");
            }
            
            else{
                System.out.println("Por favor, ecolha uma das opções para continuar o jogo, digitando apenas 1, 2 ou 3" + "\n");
            }
            
        }while(escolhaJogador != 3);
    }
}
