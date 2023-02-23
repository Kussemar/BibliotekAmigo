package entities;

public class Bog {
    private int bog_id;
    private String titel;
    private int udgivelsesaar;
    private int forfatterId;

    public Bog(int bog_id, String titel, int udgivelsesaar, int forfatterId) {
        this.bog_id = bog_id;
        this.titel = titel;
        this.udgivelsesaar = udgivelsesaar;
        this.forfatterId = forfatterId;
    }

    public int getBog_id() {
        return bog_id;
    }

    public void setBog_id(int bog_id) {
        this.bog_id = bog_id;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public int getUdgivelsesaar() {
        return udgivelsesaar;
    }

    public void setUdgivelsesaar(int udgivelsesaar) {
        this.udgivelsesaar = udgivelsesaar;
    }

    public int getForfatterId() {
        return forfatterId;
    }

    public void setForfatterId(int forfatterId) {
        this.forfatterId = forfatterId;
    }

    @Override
    public String toString() {
        return "Bog{" +
                "bog_id=" + bog_id +
                ", titel='" + titel + '\'' +
                ", udgivelsesaar=" + udgivelsesaar +
                ", forfatterId=" + forfatterId +
                '}';
    }
}
