package entities;

public class Bog {
    private int bogId;
    private String titel;
    private int udgivelsesaar;
    private int forfatterId;
    private String name;

    public Bog(int bogId, String titel, int udgivelsesaar, int forfatterId) {
        this.bogId = bogId;
        this.titel = titel;
        this.udgivelsesaar = udgivelsesaar;
        this.forfatterId = forfatterId;
    }

    public Bog(int bogId, String titel, int udgivelsesaar, int forfatterId, String name) {
        this.bogId = bogId;
        this.titel = titel;
        this.udgivelsesaar = udgivelsesaar;
        this.forfatterId = forfatterId;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBogId() {
        return bogId;
    }

    public void setBogId(int bogId) {
        this.bogId = bogId;
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
                "bogId=" + bogId +
                ", titel='" + titel + '\'' +
                ", udgivelsesaar=" + udgivelsesaar +
                ", forfatterId=" + forfatterId +
                ", name='" + name + '\'' +
                '}';
    }
}
