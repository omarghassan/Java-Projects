/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SpaceX;

/**
 *
 * @author Omar
 */
public class Acer extends Laptop{
    
    private String acer_build;

    public Acer(String acer_build, int laptop_id, int price, int ram, String cpu) {
        super(laptop_id, price, ram, cpu);
        this.acer_build = acer_build;
    }
    
    
}
