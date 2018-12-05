package tienditamusic;


public class Usuario extends Persona {

        //Atributos
	private String username;
	private String password;
	private int id;
        private int tipo;

	//Constructores
	public Usuario() {
		super();
	}
	
	public Usuario(int id, String nombre,String rut, String telefono, String correo, String password, String username) {
		super(nombre, rut, telefono, correo);
                this.username = username;
                this.password = password;
		this.id = id;
	}
        public Usuario (String user, String pass, int id,int tipo ){
            username=user;
            password=pass;
            this.id=id;
            this.tipo=tipo;
        }
		
	//Getters y setters
	public String getNombreUsuario() {
		return username;
	}
	
        public void setNombreUsuario(String username) {
		this.username = username;
	}
	
	public int getIdUsuario() {
		return id;
	}
	
        public void setIdUsuario(int id) {
		this.id = id;
	}
        
       	public String getContraseña() {
		return password;
	}
	
        public void setContraseña(String password) {
		this.password = password;
	}	
        public int getId(){
            return id;
        }
        public void setId(int id){
            this.id=id;
        }
        public int getTipo(){
            return tipo;
        }
        public void setTipo(int tipo){
            this.tipo=tipo;
        }
}