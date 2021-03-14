/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yolawocodechallenge;

/**
 *
 * @author ronneyismael
 */
public class Spiderman implements Superhero{
    
    
       public Spiderman(){
       
       System.out.println("-------SPIDERMAN--------");
        
    }

    @Override
    public void superpower() {
        System.out.println("Spiderman superpower are Wall Crawling, Spider Strength, Superhuman speed, Spider senses");
    }

    @Override
    public void race() {
        System.out.println("Spiderman race is human");
    }

    @Override
    public void weight() {
        System.out.println("Spiderman weight is 107 Kg");
    }

    @Override
    public void realName() {
        System.out.println("Spiderman real name is Peter Parker");
    }

    @Override
    public void comics() {
        System.out.println("The superhero is from Marvel Comics");
    }
    
}
