/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pubsim;

/**
 *
 * @author dhirst1
 */
public class LongDrink extends alcohlicDrink{

    /**
     *
     */
    @Override
    public void addSpirit() {
        System.out.println("Add spirit to glass");
    }

    /**
     *
     */
    @Override
    public void addGarnish() {
        System.out.println("Add a simple garnish");
    }
    
}
