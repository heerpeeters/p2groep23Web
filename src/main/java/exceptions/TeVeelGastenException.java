
package exceptions;


public class TeVeelGastenException extends Exception{
   
    
    public TeVeelGastenException(String message){
        
        super(message);
        
    }
    
    public TeVeelGastenException(){
        
        super("Het maximaal aantal gasten voor deze presentatie is bereikt.");
        
    }
}
