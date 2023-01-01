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
        int n = 0;
        if (edad < 2500 && edad >= 0) {
            n = 0;
        }
        if (edad >= 2500 && edad < 8000) {
            n = 1;
        } else {
            n = 2;
        }
        return n;
    }

    public boolean estasDormido() {
        if (energia >= 75) {
            return false;
        } else {

            do {
                aumentarEnergia(5);

            } while (energia <= 50);
            return true;

        }

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
        if (hambre >= 170) {

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
        energia -= 1;

    }

    public boolean tienesQuejas() {
        if (!tienesHambre() && !estasEnfermo() && !estasSucio()) {
            return false;
        } else {
            return true;
        }
    }

    public void alimentar(float cantidadAlimento) {
        hambre -= cantidadAlimento;
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