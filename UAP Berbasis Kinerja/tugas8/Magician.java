/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionhandling;

/**
 *
 * @author hp
 */
public class Magician extends Character {
    private int defense;
    private int attack;
    private int HP;
 
    Magician(int defense, int attack, int HP){
        super(defense, attack, HP);
        this.defense = defense;
        this.attack = attack;
        this.HP = HP;
    }
    public boolean attack(){
        double Hit = Math.random();
            if(Hit < 0.35){
            return true;
    }
    return false;
    }
}
    
