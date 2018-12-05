package tienditamusic;
public class Venta {
    private int id;
    private double monto;
    
    public Venta(){
    }
    
    public Venta(int id, double monto){
        this.id = id;
        this.monto = monto;
    }
    
    //Getters y setters
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
