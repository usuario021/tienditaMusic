/**La clase Cliente es una representación de la faceta de cliente, valga la redundancia, de entre el conjunto de individuos que han sido 
   registrados en el sistema del software.
 * Esta clase extiende de la clase Persona, desde la cual hereda atributos con los que se almacena y provee los datos de contacto de un 
   cliente.
 * Las instancias de esta clase permiten 
 */
package tienditamusic;
/**@author Carlos Cubillos.
 */
/**Atributos de la clase Cliente.
 * El atributo principal de esta clase es un primitivo boolean de nombre "premium", que consiste en un indicador de la calidad de membresía
   o asociación que posee un cliente respecto a la tienda.
 */
public class Cliente extends Persona{
    private boolean premium;
    private int id;
    
    /**Constructor.
     * El único constructor que posee esta clase inicializa todos los atributos de la clase, tanto los heredados en su condición de 
       implícitos y los propios de esta extensión.
     *@param Los parámetros que recibe se corresponden cada uno con los atributos.
     */
    public Cliente (int id, String nombre, String rut, String telefono, String correo, boolean premium){
        super(nombre, rut, telefono, correo);
        this.id= id;
        this.premium= premium;
    }
    
    /**
     * Métodos Setter y Getter.
     */
    public boolean isPremium() {
        return premium;
    } 
    public void setPremium(boolean premium) {
        this.premium = premium;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
}
