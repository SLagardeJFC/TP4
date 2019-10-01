/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bowling;
import bowling.SinglePlayerGame;


/**
 *
 * @author pedago
 */
public class MainMulti implements bowling.MultiPlayerGame{
    
    public SinglePlayerGame gameList[];
    
    public MainMulti(){
        
    }
    
    public String affichage(String player,int tour,int boule){
        String s = "Prochain tir : joueur "+player+", tour n° "+tour+", boule n° "+boule;
        return s;
    }
    
    @Override
    public String startNewGame(String[] playerName) throws Exception {
        if((playerName==null)){
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        for(int i=0;i<playerName.length;i++){
            gameList[i]=(new SinglePlayerGame());
        }
        return affichage(playerName[0], 0, 0);
    }

    @Override
    public String lancer(int nombreDeQuillesAbattues) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int scoreFor(String playerName) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
