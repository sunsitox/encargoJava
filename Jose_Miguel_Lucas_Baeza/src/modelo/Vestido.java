package modelo;

public class Vestido {

    private int id;
    private String tela, talla, diceno;

    public Vestido(int id, String tela, String talla, String diceno) {
        this.id = id;
        this.tela = tela;
        this.talla = talla;
        this.diceno = diceno;
    }

    public int getId() {
        return id;
    }

    public String getTela() {
        return tela;
    }

    public String getTalla() {
        return talla;
    }

    public String getDiceno() {
        return diceno;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTela(String tela) {
        this.tela = tela;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public void setDiceno(String diceno) {
        this.diceno = diceno;
    }

}
