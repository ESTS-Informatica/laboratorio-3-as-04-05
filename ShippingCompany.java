import java.util.HashSet;
import java.util.ArrayList;

/**
 * Write a description of class ShippingCompany here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ShippingCompany extends HashSet<Transport>{
    private String name;
    private ArrayList<Transport> isService;
    
    /**
     * Constructor for objects of class ShippingCompany
     */
    public ShippingCompany(String name){
        isService = new ArrayList();
        if(name!=null){
            this.name=name;
        }else{
            this.name= "";
        }
    }
    
    public String getName(){
        return name;
    }
    public ArrayList<Transport> getIsService(){
        return isService;
    }
    
    public void setName(String name){
         if(name!=null){
            this.name=name;
        }else{
            this.name= "";
        }
    }
    
    @Override
    public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    for (Transport t : isService) {
        stringBuilder.append(t).append("\n");
    }
        return stringBuilder.toString();
    }   
}