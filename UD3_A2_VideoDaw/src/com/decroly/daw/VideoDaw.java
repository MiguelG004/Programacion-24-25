package com.decroly.daw;
import java.time.LocalDate;

public class VideoDaw {
	private String cif;
	private String direccion;
	private String fechaAlta;
	Pelicula[] peliculasRegistradas;
	Cliente[] clientesRegistrados;
	private int peliculastotales = 0, clientestotales = 0;
	
	
	public VideoDaw(String cif, String direccion) {
		this.cif = cif;
		this.direccion = direccion;
		this.fechaAlta = fechaAlta = LocalDate.now().toString();
		this.peliculasRegistradas = new Pelicula[100];
		this.clientesRegistrados = new Cliente [100];
	}
	
	public String getCif() {
		return cif;
	}


	public String getDireccion() {
		return direccion;
	}

	public String getFechaAlta() {
		return fechaAlta;
	}

	public Pelicula[] getPeliculasRegistradas() {
		return peliculasRegistradas;
	}

	public Cliente[] getClientesRegistrados() {
		return clientesRegistrados;
	}

	public int getPeliculasTotales() {
	    return peliculastotales;
	}
	
	public int getClientesTotales() {
        return clientestotales;	    
	}
	
	public String mostrarInfoVideoClub(){
		String infoVideoDaw = String.format("CIF: %s, Direccion: %s, Fecha de alta: %s, Peliculas registradas: %s, Clientes registrados: %s", 
				this.cif, this.direccion, this.fechaAlta, this.peliculasRegistradas, this.clientesRegistrados);
		return infoVideoDaw;
	}
    
    public void mostrarPeliculas(){
        for(int i = 0; i < peliculastotales; i++){
           System.out.println(i + " " + peliculasRegistradas[i].mostrarInfoPelicula());
           }
    }
   

       public void mostrarClientes(){ 
           if(clientesRegistrados != null){   
        	   for(int i = 0; i < clientestotales; i++){
               System.out.println(clientesRegistrados[i].mostrarInfoCliente());
               }
           }
       }


       public Pelicula obtenerNumPelicula(int i){
           return this.peliculasRegistradas[i];
       } 

       public Cliente obtenerNumCliente(int i){
           return this.clientesRegistrados[i];
       }

     

       public boolean alquilarPelicula(int c, int p){
           this.obtenerNumCliente(c);
           this.obtenerNumPelicula(p).alquilarPelicula();
           boolean isAdd = false;
           return isAdd;
       }

       public boolean devolverPelicula(int c, int p){
           this.obtenerNumCliente(c);
           this.obtenerNumPelicula(p);
           boolean isEliminated = false;
           return isEliminated;
       }

       public boolean darBajaCliente(Cliente c, int nCliente){
           boolean isEliminated = false;
           if(this.clientesRegistrados != null){
               this.clientesRegistrados [nCliente] = null;
               for(int i = nCliente + 1; i < clientestotales; i++){
                   this.clientesRegistrados [i-1] = this.clientesRegistrados[i];
               }
               this.clientesRegistrados [clientestotales-1] = null;
               clientestotales--;
               isEliminated = true;
           }
           return isEliminated;
       }

       public boolean darBajaPelicula(Pelicula p, int cod){
           boolean isEliminated = false;
           if (cod >= 0 && cod < peliculastotales) {
               this.peliculasRegistradas [cod] = null;
               
               for(int i = cod + 1; i < peliculastotales; i++){
                   this.peliculasRegistradas [i-1] = this.peliculasRegistradas[i];
               }
               this.peliculasRegistradas[peliculastotales-1] = null;
               peliculastotales--;
               isEliminated = true;
       
           }
       return isEliminated;
       }
}
