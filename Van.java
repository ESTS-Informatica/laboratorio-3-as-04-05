
/**
 * Escreva uma descrição da classe Van aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Van extends GroundTransportation{
    private int numberOfPackages;

    /**
     * Construtor para objetos da classe Van
     */
    public Van(int numberOfPackages,String licensePlate){
       super(licensePlate); 
       if(numberOfPackages>=0){
           this.numberOfPackages = numberOfPackages;
       } else {
           this.numberOfPackages = 0;
       }
    }
    
    public int getNumberOfPackages(){
        return numberOfPackages;

    }
    
    public void setNumberOfPackages(int newNumber){
        if(newNumber>=0){
           this.numberOfPackages = newNumber;
       } else {
           this.numberOfPackages = 0;
       }
    }
    
    @Override
    public String toString(){
        return super.toString()+ "Numero de pacotes :" + numberOfPackages;
    }
}

