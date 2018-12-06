package tienditamusic;
/** 
 * La clase Venta representa una abstracción del concepto de precio de venta en la realización de una transacción de la tienda.
Provee un atributo id para hacer referencias específicas y distinguir a las instancias de esta clase, de este modo efectuar búsquedas específicas
en la colección anidada en la clase HistorialVentas, donde se encuentran las instancias.*/
*@author: 
*@version: Primera versión.
*@see ______. 
*/
    
public class Venta 
{
    /**Atributos de Venta.
     * El atributo id representa un identificador o distintivo, para los fines usuales, la búsqueda dentro de las colecciones y las demás funciones típicas que recurren al uso de búsqueda.
     * El atributo monto representa el precio total de las compras realizadas.
     */  
    private int id;    
    private double monto;    
    
    /**Constructores.
     * El primer constructor es neutro, no modifica los atributos de la instancia.
     * El segundo constructor define los atributos ingresados por parámentro.
         *@param id se asigna al identificador.
         *@param monto representa el precio total de la compra.
     */
    public Venta()
    {
    }
    
    public Venta(int id, double monto)
    {
        this.id = id;
        this.monto = monto;
    }
    
    /**Getters y setters
     * Para esta clase únicamente se presentan los métodos Getter y Setter para obtención y redefinición de los valores de los atributos.
     */
    public int getId(){
            return id;
    }
    public void setId(int id) {
            this.id = id;
    }

    public double getMonto() {
            return monto;
    }
    public void setMonto(double monto) {
            this.monto = monto;
    }
}
