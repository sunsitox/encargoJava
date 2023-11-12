
package modelo;

public class Pantalon {
    private int id;
    private String talla, material, color;

    public Pantalon(String talla, String material, String color) {
        this.talla = talla;
        this.material = material;
        this.color = color;
    }

    public Pantalon(int id, String talla, String material, String color) {
        this.id = id;
        this.talla = talla;
        this.material = material;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public String getTalla() {
        return talla;
    }

    public String getMaterial() {
        return material;
    }

    public String getColor() {
        return color;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setColor(String color) {
        this.color = color;
    }

    
    
}
