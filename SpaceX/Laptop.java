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
public class Laptop {
    
    private int laptop_id;
    private int price;
    private int ram;
    private String cpu;
    ArrayList<Software> installed_softwares = new ArrayList<Software>();

    public Laptop(int laptop_id, int price, int ram, String cpu) {
        this.laptop_id = laptop_id;
        this.price = price;
        this.ram = ram;
        this.cpu = cpu;
    }
    
    public void addSoftware(Software software_obj) {
        
        installed_softwares.add(software_obj);
    }
    
    
    public int deleteSoftware(int number_id) {
        
        for (int i = 0; i < installed_softwares.size(); i++) {
            
            if (number_id == installed_softwares.get(i).getSoftware_id()) {
                
                installed_softwares.remove(number_id);
            }
        }
        
        
        return 0;
    }
    
    
    public void printInstalledSoftwares () {
        
      for (int i = 0; i < installed_softwares.size(); i++) {
          
            System.out.println(installed_softwares.get(i));
        }
    }

    public int getLaptop_id() {
        return laptop_id;
    }

    public void setLaptop_id(int laptop_id) {
        this.laptop_id = laptop_id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public ArrayList<Software> getInstalled_softwares() {
        return installed_softwares;
    }

    public void setInstalled_softwares(ArrayList<Software> installed_softwares) {
        this.installed_softwares = installed_softwares;
    }

    @Override
    public String toString() {
        return "Laptop{" + "laptop_id=" + laptop_id + ", price=" + price + ", ram=" + ram + ", cpu=" + cpu + ", installed_softwares=" + installed_softwares + '}';
    }
    
    
    
    
}
