package entities;

public class Agente extends Entidad {
    private String habilidadEspecial;
    private String misionAsignada;

    public Agente(int id, String nombre, String habilidadEspecial, int nivel) {
        super(id, nombre);
        this.habilidadEspecial = habilidadEspecial;
    }

    public String getHabilidadEspecial() {
        return habilidadEspecial;
    }

    public void setHabilidadEspecial(String habilidadEspecial) {
        this.habilidadEspecial = habilidadEspecial;
    }

    public String getMisionAsignada() {
        return misionAsignada;
    }

    public void asignarMision(String mision) {
        this.misionAsignada = mision;
    }
    public void incrementarNivel (int nivel){
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return super.toString() + ", Habilidad Especial: " + habilidadEspecial + "aumenta nivel" +
                (misionAsignada != null ? ", Misión: " + misionAsignada : "");
    }
}