package modelo;

public class Vestido extends Articulo {

    private String tela, talla, diseno;

    public Vestido(int id, int precio, String nombre, String tela, String talla, String diseno) {
        super(id, precio, nombre);
        this.tela = tela;
        this.talla = talla;
        this.diseno = diseno;
    }

    public String getTela() {
        return tela;
    }

    public String getTalla() {
        return talla;
    }

    public String getDiseno() {
        return diseno;
    }

    public void setTela(String tela) {
        this.tela = tela;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public void setDiseno(String diseno) {
        this.diseno = diseno;
    }
}
