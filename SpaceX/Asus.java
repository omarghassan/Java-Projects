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
public class Asus extends Laptop {
    
    private String asus_build;

    public Asus(String asus_build, int laptop_id, int price, int ram, String cpu) {
        super(laptop_id, price, ram, cpu);
        this.asus_build = asus_build;
    }
    
    
}
