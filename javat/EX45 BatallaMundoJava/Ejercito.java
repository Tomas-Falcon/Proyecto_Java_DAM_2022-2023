import java.util.*;

class Ejercito {
    private String nombre;
    private ArrayList<Soldado> soldados;

    public Ejercito(String nombre) {
        this.nombre = nombre;
        soldados = new ArrayList<>(5);
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Soldado> getSoldados() {
        return soldados;
    }

    public void reclutarSoldado(Soldado soldado) {
        soldados.add(soldado);
    }

    public boolean estaVivo() {
        for (Soldado soldado : soldados) {
            if (soldado.estaVivo()) {
                return true;
            }
        }
        return false;
    }

    public int vidaTotal() {
        int vida = 0;
        for (Soldado soldado : soldados) {
            vida += soldado.getPuntosVida();
        }
        return vida;
    }

    public String toString() {
        String resultado = nombre + ":\n";
        for (Soldado soldado : soldados) {
            resultado += soldado.toString() + "\n";
        }
        return resultado;
    }
}