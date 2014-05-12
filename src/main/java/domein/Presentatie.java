package domein;

import exceptions.TeVeelGastenException;
import java.util.List;

/**
 *
 * @author Niels
 */
public class Presentatie {
    
    private String titel, onderzoeksdomein;
    
    private Student student;
    
    private Tijdslot tijdslot;
    
    private List<Gast> gasten;

    private final int maxAantalGasten;
    
    public Presentatie(String titel, String onderzoeksdomein, Student student, Tijdslot tijdslot, List<Gast> gasten, int maxAantalGasten){
        
        setTitel(titel);
        setOnderzoeksdomein(onderzoeksdomein);
        setStudent(student);
        setTijdslot(tijdslot);
        setGasten(gasten);
        this.maxAantalGasten = maxAantalGasten;
    }
    
    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getOnderzoeksdomein() {
        return onderzoeksdomein;
    }

    public void setOnderzoeksdomein(String onderzoeksdomein) {
        this.onderzoeksdomein = onderzoeksdomein;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Tijdslot getTijdslot() {
        return tijdslot;
    }

    public void setTijdslot(Tijdslot tijdslot) {
        this.tijdslot = tijdslot;
    }

    public List<Gast> getGasten() {
        return gasten;
    }

    public void setGasten(List<Gast> gasten) {
        this.gasten = gasten;
    }

    public int getMaxAantalGasten() {
        return maxAantalGasten;
    }
    
    public void voegGastToe(Gast gast) throws TeVeelGastenException{
        
        if(getGasten().size() < getMaxAantalGasten())
            getGasten().add(gast);
        else
            throw new TeVeelGastenException("Het maximaal aantal studenten voor deze presentatie is bereikt.");
        
    }
    
}
