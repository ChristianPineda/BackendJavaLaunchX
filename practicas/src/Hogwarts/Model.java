package Hogwarts;

public class Model {
    private String name;
    private String gen;
    private String house;
    private String bogg;
    private String patronus;

    public Model() {

    }

    public Model(String nombre, String genero, String casa, String boggart, String patronus) {
        this.name = nombre;
        this.gen = genero;
        this.house = casa;
        this.bogg = boggart;
        this.patronus = patronus;
    }

    public String getname() {  return name;  }
    public String getgen() {  return gen;  }
    public String gethouse() {  return house;  }
    public String getbogg() {  return bogg;  }
    public String getPatronus() {  return patronus;  }

    public boolean setname(String name) {
        if (!name.isEmpty()) {
            this.name = name;
            return true;
        }
        return false;
    }

    public boolean setgen(String gen) {
        if (!gen.isEmpty()) {
            this.gen = gen;
            return true;
        }
        return false;
    }

    public boolean sethouse(String house) {
        if (!house.isEmpty()) {
            this.house = house;
            return true;
        }
        return false;
    }

    public boolean setbogg(String bogg) {
        if (!bogg.isEmpty()) {
            this.bogg = bogg;
            return true;
        }
        return false;
    }

    public boolean setPatronus(String patronus) {
        if (!patronus.isEmpty()) {
            this.patronus = patronus;
            return true;
        }
        return false;
    }

    public String showMessage() {
        return "Nombre: " + name +
                "\nGenero: " + gen +
                "\nCasa: " + house +
                "\nBoggart: " + bogg +
                "\nPatronus: " + patronus;
    }
}