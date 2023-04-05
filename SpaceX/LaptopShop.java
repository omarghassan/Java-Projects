/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SpaceX;
import java.util.ArrayList;
/**
 *
 * @author Omar
 */
public class LaptopShop {
    
    private int shop_id;
    private String shop_name;
    ArrayList<Laptop> laptops = new ArrayList<Laptop>();

    public LaptopShop(int shop_id, String shop_name) {
        this.shop_id = shop_id;
        this.shop_name = shop_name;
    }

    public void setShop_id(int shop_id) {
        this.shop_id = shop_id;
    }

    public void setShop_name(String shop_name) {
        this.shop_name = shop_name;
    }

    public void setLaptops(ArrayList<Laptop> laptops) {
        this.laptops = laptops;
    }

    public int getShop_id() {
        return shop_id;
    }

    public String getShop_name() {
        return shop_name;
    }

    public ArrayList<Laptop> getLaptops() {
        return laptops;
    }
    
    public Laptop shopByRam(int ram_size) {
        
        for (int i  = 0; i<laptops.size(); i++) {
            
      
                if(laptops.get(i).getRam() == ram_size){
                    return laptops.get(i);
                } else {
                    
                    return null;
                }
        }
        return null;
        
    }
    
    public Laptop shopByPrice(int priceRange1, int priceRange2) {
        
        for (int i  = 0;i< laptops.size(); i++) {
            
            if (laptops.get(i).getPrice() == priceRange1 && laptops.get(i).getPrice() == priceRange2) {
                 
                return laptops.get(i);
            } else {
                
                return null;
            }
        }
            return null;
    }
}

