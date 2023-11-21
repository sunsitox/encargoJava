package modelo;

public class Pantalon extends Articulo {

    private String talla, material, color;

    public Pantalon(String talla, String material, String color, int id, int precio, String nombre) {
        super(id, precio, nombre);
        this.talla = talla;
        this.material = material;
        this.color = color;
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
