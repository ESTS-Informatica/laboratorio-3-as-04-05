
/**
 * Escreva uma descrição da classe AirTransportation aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class AirTransportation extends Transport{
    private String name;
    private int numberOfContainers;
    /**
     * Construtor para objetos da classe AirTransportation
     */
    public AirTransportation(String name, int numberOfContainers)
    {
       super();
       setFees(4.0);
       
       if(name!= null){
           this.name= name;
       } else{
           this.name = " ";
       }
       
       if(numberOfContainers>=0){
           this.numberOfContainers = numberOfContainers;
       } else {
           this.numberOfContainers = 0;
       }
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        if(name != null){
            this.name = name;
        }
    }
    
    public int getNumberOfContainers(){
        return numberOfContainers;
    }
    
    public void setNumberOfContainers(int numberOfContainers){
        if(numberOfContainers>=0){
            this.numberOfContainers= numberOfContainers;
        }
    }

    public double getPriceWithFees(){
        return getFees()*getPrice();
    }
    public String getTransportType(){
        return "Transport Aerio";
    }
    
    public String toString(){
        return super.toString()+                "           Nome:"+name+ "\n" +
                "  NºContentores:"+numberOfContainers+"\n";
    }
}
