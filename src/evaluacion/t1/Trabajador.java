/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evaluacion.t1;

/**
 *
 * @author UCC20319
 */
public class Trabajador {
     // Atributos
    private static int contadorId = 1; // es static porque es un contador global compartido entre todos los objetos 
    //atributos privados de cada trabajador 
    private int id; //es el número personal de cada trabajador.
    private String nombre;
    private String tipoDocumento;
    private String nroDocumento;
    private String regimen;
    private String fondoPension;
    private double salario;
    private boolean tieneHijos;
    private boolean turnoNocturno;

    // Constructor, se ejecuta cuando creamos un nuevo trabajador
    public Trabajador(String nombre, String tipoDocumento, String nroDocumento, String regimen, String fondoPension, double salario, boolean tieneHijos, boolean turnoNocturno) {
         // Asigna el id actual y luego incrementa el contador
        this.id            = contadorId++;
        this.nombre        = nombre;
        this.tipoDocumento = tipoDocumento;
        this.nroDocumento  = nroDocumento;
        this.regimen       = regimen;
        this.fondoPension  = fondoPension;
        this.salario       = salario;
        this.tieneHijos    = tieneHijos;
        this.turnoNocturno = turnoNocturno;
    }

    // ===== GETTERS =====
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public String getNroDocumento() {
        return nroDocumento;
    }

    public String getRegimen() {
        return regimen;
    }

    public String getFondoPension() {
        return fondoPension;
    }

    public double getSalario() {
        return salario;
    }

    public boolean isTieneHijos() {
        return tieneHijos;
    }

    public boolean isTurnoNocturno() {
        return turnoNocturno;
    }

    // ===== SETTERS =====
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public void setNroDocumento(String nroDocumento) {
        this.nroDocumento = nroDocumento;
    }

    public void setRegimen(String regimen) {
        this.regimen = regimen;
    }

    public void setFondoPension(String fondoPension) {
        this.fondoPension = fondoPension;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setTieneHijos(boolean tieneHijos) {
        this.tieneHijos = tieneHijos;
    }

    public void setTurnoNocturno(boolean turnoNocturno) {
        this.turnoNocturno = turnoNocturno;
    }

    // ===== METODOS =====
    public double calcularPension() {
        if (fondoPension.equals("AFP_INTEGRA"))  return salario * 0.12;
        if (fondoPension.equals("AFP_PRIMA"))    return salario * 0.125;
        if (fondoPension.equals("AFP_HABITAT"))  return salario * 0.127;
        if (fondoPension.equals("ONP"))          return salario * 0.13;
        return 0;
    }

    public double calcularSueldo() {
        return salario - calcularPension();
    }

    public void mostrar() {
        System.out.println("---------------------------");
        System.out.println("ID:            " + id);
        System.out.println("Nombre:        " + nombre);
        System.out.println("Documento:     " + tipoDocumento + " - " + nroDocumento);
        System.out.println("Regimen:       " + regimen);
        System.out.println("Fondo pension: " + fondoPension);
        System.out.println("Tiene hijos:   " + tieneHijos);
        System.out.println("Turno noc.:    " + turnoNocturno);
        System.out.println("Salario base:  S/ " + salario);
        System.out.println("Pension:       S/ " + calcularPension());
        System.out.println("Sueldo neto:   S/ " + calcularSueldo());
        System.out.println("---------------------------");
    }
    
}
