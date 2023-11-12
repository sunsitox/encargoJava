/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author José Miguel
 */
public class Polera {
    private int id;
    private String talla, material, color;

    public Polera(int id, String talla, String material, String color) {
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
