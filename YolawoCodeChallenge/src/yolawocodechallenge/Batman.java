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
public class Batman extends Hero{
    
    
   public Batman(){
       
       System.out.println("-------BATMAN--------");
        
    }

    @Override
    public void race() {
        System.out.println("Batman's race is Human");
    }

    @Override
    public void weight() {
                System.out.println("Batman's weight  is 95 Kg");

    }

    @Override
    public void realName() {
        System.out.println("Batman real name is Bruce Wayne");
    }
    

    @Override
    public void superpower() {
               System.out.println("Batman  powers are exceptional martial artist , brilliant deductive skills, combat strategy ");

    }

    
}
