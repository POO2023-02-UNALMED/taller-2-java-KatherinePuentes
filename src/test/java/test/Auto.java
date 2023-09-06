package test;

public class Auto {
    String modelo;
    int precio;
    Asiento[] asientos;
    String marca;
    Motor motor;
    int registro;
    static int cantidadCreados;

    public int cantidadAsientos(){
        int cantidad=0;
        for (Asiento asiento :asientos){
            if (asiento!=null){
                cantidad++
            }
        }
        return cantidad;
    }

    public String verificarIntegridad(){
        if (original()) {
            return "Auto original";
        }
        return "Las piezas no son originales";
    }

    public boolean original() {
        if (motor.registro != registro) {
            return false;
        }
        for (Asiento asiento : asientos) {
            if (asiento != null && asiento.registro != registro) {
                return false;
            }
        }
        return true;  
    }
}
