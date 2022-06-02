package damboat.src;

public abstract class Barco {

    private String nombre;
    protected int tripulacion;
    protected int potenciaAtk;
    protected int vitalidad;

    public Barco(String nombre, int potenciaAtk, int vitalidad) {
        this.potenciaAtk = potenciaAtk;
        this.vitalidad = vitalidad;
        this.nombre = nombre;
        this.tripulacion = 100;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPotenciaAtk() {
        return potenciaAtk;
    }

    public int getTripulacion() {
        return tripulacion;
    }

    public int getVitalidad() {
        return vitalidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPotenciaAtk(int potenciaAtk) {
        this.potenciaAtk = potenciaAtk;
    }

    public void setTripulacion(int tripulacion) {
        this.tripulacion = tripulacion;
    }

    public void setVitalidad(int vitalidad) {
        this.vitalidad = vitalidad;
    }

    public abstract int atacar(Barco barco);

    public int actualizarVitalidad(int calculoDamage) {
        vitalidad = this.vitalidad - calculoDamage;
        if (vitalidad <= 0) {
            vitalidad = 0;
        }
        return vitalidad;
    }

    @Override
    public String toString() {
        return "El nombre del barco es " + this.getNombre() + ", la potencia de ataque es " + this.getPotenciaAtk() +
                ", el barco tiene " + this.getTripulacion() + " marineros, \n el barco cuenta con " + this.getVitalidad()
                + " puntos de vitalidad ";
    }

}
