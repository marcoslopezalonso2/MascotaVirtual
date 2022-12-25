package mascota;

public class RatoncitoFiuFiu {
    private String nombre;
    private int edad;
    private int peso;
    private int hambre;
    private int suciedad;
    private int  salud;
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
        return false;
    }

    public boolean estasSucio() {
        return false;
    }

    public boolean estasMuerto() {
        return false;
    }

    public void envejecer(int segundos) {
        edad += segundos;
        salud-=6;
        hambre +=6;
        suciedad +=6;

    }

    public boolean tienesQuejas() {
        return false;
    }

    public void alimentar(float cantidadAlimento) {
        hambre -= cantidadAlimento;
    }

    public void curar(float cantidadMedicina) {
        salud += cantidadMedicina;
    }
}