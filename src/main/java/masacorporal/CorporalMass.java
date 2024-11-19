package masacorporal;

public class CorporalMass {
    private Double kilograms;
    private Double height;

    public CorporalMass(Double kilograms, Double height) {
        this.kilograms = kilograms;
        this.height = height;
    }

    public Double getKilograms() {
        return kilograms;
    }

    public void setKilograms(Double kilograms) {
        this.kilograms = kilograms;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }
}
