
/**
 * Escreva uma descrição da classe Lorry aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Lorry extends GroundTransportation {
    private int numberOfPallets;
    private int trailers;
    /**
     * Construtor para objetos da classe Lorry
     */
    public Lorry(String licensePlate, int numberOfPallets, int trailers){
        super(licensePlate);
        
        if(numberOfPallets>= 0){
            this.numberOfPallets=numberOfPallets;
        } else {
            this.numberOfPallets =0;
        }
        
        
        if(trailers>=0){
            this.trailers= trailers;
        } else{
            this.trailers= 0;
        }
    
    }
    
    public int getNumberOfPallets(){
        return numberOfPallets;
    }
    
    public int getTrailers(){
        return trailers;
    }
    
    public void setNumberOfPallets(int numberOfPallets){
        if(numberOfPallets>= 0){
            this.numberOfPallets=numberOfPallets;
        }
    }
    
    public void setTrailers(int trailers){
        if(trailers>=0){
            this.trailers= trailers;
        }
    }
    
    @Override
    public String toString(){
        return super.toString() + "Número de Paletes:"+ numberOfPallets+"\n" +
                          "      Traileres:"+ trailers+ "\n";
    }
    
}
