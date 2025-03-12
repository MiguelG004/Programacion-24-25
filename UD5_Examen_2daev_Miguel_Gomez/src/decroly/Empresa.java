package decroly;
import java.time.*;
import java.util.LinkedList;
public class Empresa {

	private String cif;
	private String nombreEmpresa;
	private LocalDate fechaFundacion;
	private LinkedList <Trabajador> listaTrabajadores = new LinkedList<>();
	private LinkedList <GerenteDep> listaGerentes = new LinkedList<>();
	private LinkedList <Director> listaDirector = new LinkedList<>();

	
	public Empresa(String cif, String nombreEmpresa, LocalDate fechaFundacion) {
		this.cif = cif;
		this.nombreEmpresa = nombreEmpresa;
		this.fechaFundacion = fechaFundacion;
		this.listaTrabajadores = listaTrabajadores;
		this.listaGerentes = listaGerentes;
		this.listaDirector = listaDirector;

	}

	public String getCif() {
		return cif;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public LocalDate getFechaFundacion() {
		return fechaFundacion;
	}

	public LinkedList<Trabajador> getListaTrabajadores() {
		return listaTrabajadores;
	}

	public LinkedList<GerenteDep> getListaGerentes() {
		return listaGerentes;
	}


	public LinkedList<Director> getListaDirector() {
		return listaDirector;
	}


	@Override
	public String toString() {
		return "Empresa [cif = " + cif + ", nombre de la empresa = " + nombreEmpresa + ", fecha de fundacion = " + fechaFundacion
				+ "]";
	}





	public boolean registrarTrabajador(Trabajador t) throws MismoDniException{
        for (Trabajador tra : listaTrabajadores) {
            if(tra.getDni().equals(t.getDni())){
                throw new MismoDniException("Ya existe una persona registrado con el dni: " + t.getDni() + ".");
            }
        }
        listaTrabajadores.add(t);
        return true;
    }
	
	
	public boolean registrarGerente(GerenteDep gd) throws MismoDniException{
        for (GerenteDep ger : listaGerentes) {
            if(ger.getDni().equals(gd.getDni())){
                throw new MismoDniException("Ya existe una persona registrado con el dni: " + gd.getDni() + ".");
            }
        }
        listaGerentes.add(gd);
        return true;
    }
	
	public boolean registrarDirector(Director d) throws MismoDniException{
        for (Director dir : listaDirector) {
            if(dir.getDni().equals(d.getDni())){
                throw new MismoDniException("Ya existe una persona registrado con el dni: " + d.getDni() + ".");
            }
        }
        listaDirector.add(d);
        return true;
    }
	
	
	public boolean eliminarTrabajador(String dni){  
		for (Trabajador trab : listaTrabajadores){
	        if (trab.getDni() == dni) {
	            listaTrabajadores.remove(trab);
	            return true;
	        }
	    }
	    return false;
	}
	
	
	public String mostrarInfoTrabajadores(){
		String infoTrab = "";
		for (Trabajador tra : listaTrabajadores) {
			infoTrab = infoTrab + tra;
		}
		return infoTrab;
	}
	
	
	public String mostrarInfoGerentes(){
		String infoGer = "";
		for (GerenteDep ger : listaGerentes) {
			infoGer = infoGer + ger;
		}
		return infoGer;
	}
	
}
