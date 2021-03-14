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
public class YolawoCodeChallenge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("######  ABSTRACT  ########");
        System.out.println("A superhero has different superpower, weight, race and real name but he is from the same Comics so we have kept comics same and have implemented it in a class Batman");
        
        Hero hero = new Batman();
        hero.superpower();
        hero.race();
        hero.realName();
        hero.weight();
        hero.comics();
        
        System.out.println("######  INTERFACE  ########");

         System.out.println("A superhero can be from Different Comics. So it is most convenient to put the same method as abstract and define it according to object need");
        
        Superhero superhero = new Spiderman();
        superhero.superpower();
        superhero.race();
        superhero.realName();
        superhero.weight();
        superhero.comics();

        
        
        
    }
    
}
