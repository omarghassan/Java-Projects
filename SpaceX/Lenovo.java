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
public class Lenovo extends Laptop {
    
    private String lenovo_build;

    public Lenovo(String lenovo_build, int laptop_id, int price, int ram, String cpu) {
        super(laptop_id, price, ram, cpu);
        this.lenovo_build = lenovo_build;
    }
    
    
    
}
