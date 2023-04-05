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
public class Software {
    
    private int software_id;
    private String software_name;
    private String software_description;
    private int software_size;

    public Software(int software_id, String software_name, String software_description, int software_size) {
        this.software_id = software_id;
        this.software_name = software_name;
        this.software_description = software_description;
        this.software_size = software_size;
    }
    
   public boolean checkSoftware() {
       
       if (software_description.length() > 20 && software_size < 50) {
           return true;
       } else {
           
           return false;
       }
   }

    public void setSoftware_description(String software_description) {
        this.software_description = software_description;
    }

    public String getSoftware_description() {
        return software_description;
    }

    public void setSoftware_id(int software_id) {
        this.software_id = software_id;
    }

    public int getSoftware_id() {
        return software_id;
    }

    public void setSoftware_name(String software_name) {
        this.software_name = software_name;
    }

    public String getSoftware_name() {
        return software_name;
    }

    public void setSoftware_size(int software_size) {
        this.software_size = software_size;
    }

    public int getSoftware_size() {
        return software_size;
    }

    @Override
    public String toString() {
        return "Software{" + "software_id=" + software_id + ", software_name=" + software_name + ", software_description=" + software_description + ", software_size=" + software_size + '}';
    }
   
  
    
}
