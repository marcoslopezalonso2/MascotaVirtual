package mascota;

public class RatoncitoFiuFiu {
    private String nombre;
    private int edad;
    private int peso;
    private int hambre;
    private int suciedad;
    private int salud;
    private int energia;

    public RatoncitoFiuFiu(String nombre, int edad, int peso, int hambre, int suciedad, int salud, int energia) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.hambre = hambre;
        this.suciedad = suciedad;
        this.salud = salud;
        this.energia = energia;
    }

    public String estadisticas() {
        return "Peso: " + peso + "\nHambre: " +
                hambre + "\nSuciedad: " + suciedad
                + "\nSalud: " + salud + "\nEnergia: " + energia;
    }

    public void limpiar(float esfuerzoHigienico) {
        suciedad -= esfuerzoHigienico;
    }

    public int queTramoEdad() {
        return 0;
    }

    public boolean estasDormido() {
        return false;
    }

    public boolean estasEnfermo() {
        if (salud <= 30) {
            return true;
        } else {
            return false;
        }
    }

    public boolean estasSucio() {
        if (suciedad >= 100) {
            return true;
        } else {
            return false;
        }

    }

    public boolean estasMuerto() {
        if (salud <= 0) {
            return true;
        } else {
            return false;
        }

    }

    public boolean estasFeliz() {
        if (!tienesHambre() && !estasEnfermo() && !estasSucio()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean tienesHambre() {
        if (hambre >= 55) {
            return true;
        } else {
            return false;
        }
    }

    public void envejecer(int segundos) {
        edad += segundos;
        salud -= 1;
        hambre += 1;
        suciedad += 1;

    }

    public boolean tienesQuejas() {
        return false;
    }

    public void alimentar(float cantidadAlimento) {
        ganarPeso(cantidadAlimento);
    }

    public void curar(float cantidadMedicina) {
        aumentarSalud(cantidadMedicina);
    }

    public void ganarPeso(float cantidad) {
        peso += cantidad;
    }

    public void aumentarEnergia(float cantidad) {
        energia += cantidad;
    }

    public void aumentarSalud(float cantidad) {
        salud += cantidad;
    }

}