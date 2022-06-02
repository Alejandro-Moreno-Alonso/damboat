package damboat;

public class Gwynn extends Barco implements ICura {

    private int rayos;

    public Gwynn(String nombre, int potenciaAtk, int vitalidad) {
        super(nombre, potenciaAtk, vitalidad);
        rayos = 3;
    }

    @Override
    public String getNombre() {
        return super.getNombre();
    }

    @Override
    public int getPotenciaAtk() {
        return super.getPotenciaAtk();
    }

    @Override
    public int getTripulacion() {
        return super.getTripulacion();
    }

    @Override
    public int getVitalidad() {
        return super.getVitalidad();
    }

    public int getRayos() {
        return rayos;
    }

    @Override
    public void setNombre(String nombre) {
        super.setNombre(nombre);
    }

    @Override
    public void setPotenciaAtk(int potenciaAtk) {
        super.setPotenciaAtk(potenciaAtk);
    }

    @Override
    public void setTripulacion(int tripulacion) {
        super.setTripulacion(tripulacion);
    }

    @Override
    public void setVitalidad(int vitalidad) {
        super.setVitalidad(vitalidad);
    }

    public void setRayos(int rayos) {
        this.rayos = rayos;
    }

    @Override
    public int atacar(Barco barco) {
        if (getVitalidad() > 0) {
            if (getRayos() > 0) {

                rayos = this.rayos - 1;
                barco.actualizarVitalidad(this.potenciaAtk);
                System.out.println(this.getNombre() + " ataco como barco Gwynn");
                return rayos;
            } else {
                System.out.println("No te quedan raios wachin");
                return rayos;
            }
        } else {
            System.out.println("Los muertos no atacan :(");
            return vitalidad;
        }

    }

    @Override
    public void CuraLigera() {
        if (this.vitalidad > 0) {
            this.vitalidad = this.vitalidad + (vitalidad / 4);
        } else {
            System.out.println("Los muertos no se curan");
        }
    }

    @Override
    public void CuraLenta() {
        if (this.vitalidad > 0) {
            this.vitalidad = this.vitalidad + (vitalidad / 2);
        } else {
            System.out.println("Los muertos no se curan");
        }
    }

    @Override
    public int actualizarVitalidad(int calculoDamage) {
        if (this.vitalidad < this.potenciaAtk) {
            System.out.println("Moriste :(");
        } else {
            this.vitalidad = this.vitalidad - this.potenciaAtk;
            System.out.println("Has recibido " + this.potenciaAtk + " puntos de damage");
        }
        return this.vitalidad;
    }

    @Override
    public String toString() {
        return super.toString() + "y el barco tiene " + this.getRayos() + " rayos.";
    }

}
