package com.decroly.daw;
import java.time.LocalDate;
import java.time.LocalDateTime;
public class Empresa {

	private String nombreE;
	private String cif;
	private String fechaFundacion;
	private Trabajador[] trabajadores;
	private Trabajador[] personas;
	private int ntrabajadores, npersonas;
	
	public Empresa(String nombreE, String cif) {
		super();
		this.nombreE = nombreE;
		this.cif = cif;
		this.fechaFundacion = fechaFundacion = LocalDate.now().toString();
		this.trabajadores = new Trabajador[50]; //establezco 50 empleados como maximo dentro de la empresa
		this.personas = new Trabajador[50]; //establezco 50 personas como maximo a crear
		this.ntrabajadores = 0;
	}

	//getters
	public String getNombre() {
		return this.nombreE;
	}

	public String getCif() {
		return cif;
	}

	public String getFechaFundacion() {
		return fechaFundacion;
	}

	public Trabajador[] getTrabajadores() {
		return trabajadores;
	}
	
	public int getNumTrabajadores() {
		return ntrabajadores;
	}
	
	//metodo para ver informacion de la empresa
	public String mostrarInformacionEmpresa(){
		String infoE = String.format("Nombre: %s, CIF: %s, Fecha de fundacion: %s", this.nombreE, this.cif, this.fechaFundacion);
		return infoE;
	}
	
	//metodo que crea una persona dentro de la base de datos del programa
	public void crearPersona(String nombre, String dni, String direccion) {
		 if (ntrabajadores >= 50) {
	            System.out.println("Se ha llegado al limite de las personas a crear");
		 }
		 else {
	        	personas[npersonas] = new Trabajador(nombre, dni, direccion); // Crea un nuevo trabajador y lo agrega al array de trajadores
	            npersonas++;
	    }
	}
	
	//metodo para registrar trabajadares en la empresa
	public void registrarTrabajador(int numeroSS, int nTrabajador) {
		 if (ntrabajadores >= 50) {
	            System.out.println("Se ha llegado al limite de los trabajadores");
		 }
		 else {
			 String nombre = "", dni ="", direccion= "";
			 this.trabajadores [nTrabajador] = trabajadores[ntrabajadores] = new Trabajador(nombre, dni, direccion, numeroSS);; //establece un numero de la seguridad social a la persona que se registra
			 numeroSS = numeroSS +1;
			 ntrabajadores++;
	    }
	}
	
	//metodo para mostrar todas las personas que no esten registradas en la empresa
    public void mostrarInformacionPersonas(){
        for(int i = 0; i < npersonas; i++){
        	System.out.println(i + " " + personas[i].mostrarInfoPersonas());
           }
    }
    
	
	//metodo para mostrar todos los trabajadores de la empresa
    public void mostrarInformacionTrabajadores(){
        for(int i = 0; i < ntrabajadores; i++){
        	System.out.println(i + " " + trabajadores[i].mostrarInfoTrabajador());
           }
    }
    
    //metodo para eliminar trabajadores de la empresa
    public boolean eliminarTrabajadorEmpresa(Trabajador trabajadores, int nTrabajador){
        boolean isEliminated = false;
        if(this.trabajadores != null){
        	 this.trabajadores [nTrabajador] = null; //busca la posicion del trabajador con la variable nTrabajador que se introducira por teclado en gestion
             for(int i = nTrabajador + 1; i < ntrabajadores; i++){
                 this.trabajadores [i-1] = this.trabajadores[i]; //la posicion del siguiente trabajador la hecha para atras
             } //si solo hay uno da error -> cambiar
             this.trabajadores [ntrabajadores-1] = null;
             ntrabajadores--;
             isEliminated = true;
         }
         return isEliminated;
    }
   
    //metodo para eliminar personas
    public boolean eliminarPersonas(Trabajador trabajadores, int nPersona){
        boolean isEliminated = false;
        if(this.personas != null){
        	 this.personas [nPersona] = null; //busca la posicion del trabajador con la variable nTrabajador que se introducira por teclado en gestion
             for(int i = nPersona + 1; i < npersonas; i++){
                 this.personas [i-1] = this.personas[i]; //la posicion del siguiente trabajador la hecha para atras
             }
             this.personas[npersonas-1] = null;
             npersonas--;
             isEliminated = true;
         }
         return isEliminated;
    }

	
}
