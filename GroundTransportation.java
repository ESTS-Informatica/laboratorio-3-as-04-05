
/**
 * Escreva uma descrição da classe GroundTransportation aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class GroundTransportation extends Transport{
    private String licensePlate;
    
    /**
     * Construtor para objetos da classe GroundTransportation
     */
    public GroundTransportation(String licensePlate)
    {
        super();
        setFees(3.0);
        
        if(licensePlate!= null){
            this.licensePlate= licensePlate;
        } else {
            this.licensePlate= " ";
        }

    }
    
    public String getLicensePlate(){
        return licensePlate;
    }
    
    public void setLicensePlate(String licensePlate){
        if(licensePlate!= null){
            this.licensePlate= licensePlate;
        }
    }
    public double getPriceWithFees(){
        return getFees()*getPrice();
    }
    public String getTransportType(){
        return "Transport Terrestre";
    }
    public String toStrng(){
        return "\nTipo Transporte: " + getTransportType()+ "\n" +
                          "             ID: " + getId() + "\n" +
                          "         Origem: \n" +
                          "        Destino: \n" +
                          "          Preço:  0,00€\n" +
                          "     Honorarios: 3,00%\n" +
                          "    Preço Final: 0,00€\n" +
                          "      Matricula: ABC123\n";
    }

}
