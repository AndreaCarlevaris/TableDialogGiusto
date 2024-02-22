package ItisCuneo.backend;
import java.time.LocalDate;
public class Cespiti {
    private String codice;

    private int quantita;
    private LocalDate dataAcquisto;

    public Cespiti(String codice, int quantita, LocalDate dataAcquisto) {
        this.codice = codice;
        this.quantita = quantita;
        this.dataAcquisto = dataAcquisto;
    }

    public String toRow(){
        return codice+","+quantita+","+dataAcquisto;
    }

    public String getCodice() {
        return codice;
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }

    public int getQuantita() {
        return quantita;
    }

    public void setQuantita(int quantita) {
        this.quantita = quantita;
    }

    public LocalDate getDataAcquisto() {
        return dataAcquisto;
    }

    public void setDataAcquisto(LocalDate dataAcquisto) {
        this.dataAcquisto = dataAcquisto;
    }


    @Override
    public String toString() {
        return "Cespiti{" +
                "codice='" + codice + '\'' +
                ", quantita=" + quantita +
                ", dataAcquisto=" + dataAcquisto +
                '}';
    }
}
