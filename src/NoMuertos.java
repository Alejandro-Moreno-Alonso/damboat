package damboat.src;

public class NoMuertos extends Barco implements ICura {

    int barrera;

    public NoMuertos(String nombre, int potenciaAtk, int vitalidad) {
        super(nombre, potenciaAtk, vitalidad);
        barrera = 20;
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

    public int getBarrera() {
        return barrera;
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

    public void setBarrera(int barrera) {
        this.barrera = barrera;
    }

    @Override
    public int atacar(Barco barco) {
        if (getVitalidad() > 0) {

            barco.actualizarVitalidad(this.potenciaAtk);
            System.out.println(this.getNombre() + " ataco como barco noMuerto");
            return vitalidad;
        } else {
            System.out.println("Los muertos no atacan :( (Por mucho que ya estés técnicamente muerto)");
            return vitalidad;
        }

    }

    @Override
    public void CuraLigera() {
        if (vitalidad > 0) {
            this.vitalidad = this.vitalidad / 2;
            this.potenciaAtk = this.potenciaAtk + (this.potenciaAtk * 4 / 10);
        } else {
            System.out.println("Los muertos no pueden curarse (Por mucho que ya estés técnicamente muerto)");
        }
    }

    @Override
    public void CuraLenta() {
        if (this.vitalidad > 0) {
            this.vitalidad = this.vitalidad / 4;
            this.potenciaAtk = this.potenciaAtk + (this.potenciaAtk * 7 / 10);

        } else {
            System.out.println("Los muertos no pueden curarse (Por mucho que ya estés técnicamente muerto)");

        }
    }

    @Override
    public String toString() {
        return super.toString() + "y el barco tiene " + this.getBarrera() +
                " puntos de barrera restantes.";
    }

    @Override
    public int actualizarVitalidad(int calculoDamage) {
        if (this.potenciaAtk > this.barrera) {
            calculoDamage = this.potenciaAtk - this.barrera;
            this.vitalidad = this.vitalidad - calculoDamage;
            this.barrera = 0;
        } else {
            this.barrera = this.barrera - this.potenciaAtk;
        }

        if (vitalidad > 0) {
            System.out.println("Has recibido " + this.potenciaAtk + " puntos de damage");
        } else {
            System.out.println("Moriste :(");
        }
        return vitalidad;
    }

}
