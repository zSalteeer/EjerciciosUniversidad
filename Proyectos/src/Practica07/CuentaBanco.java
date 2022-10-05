package Practica07;
public class CuentaBanco {
    //Atributos
    public int numeroCuenta;
    public String nombreCliente;
    public String nombreBanco;
    public double saldo;
    //Constructor
    public CuentaBanco(String noc, double sal) {
        numeroCuenta=987654;
        nombreCliente=noc;
        nombreBanco="BBVA Bancomer";
        saldo=sal;
    }
    public CuentaBanco(int ncu, String noc, String nob, double sal) {
        numeroCuenta=ncu;
        nombreCliente=noc;
        nombreBanco=nob;
        saldo=sal;
    }
    //Métodos
    public void describirCuenta() {
        System.out.println("Número Cuenta: "+numeroCuenta);
        System.out.println("Nombre Cliente: "+nombreCliente);
        System.out.println("Nombre Banco: "+nombreBanco);
        System.out.println("Saldo: "+saldo);
        //System.out.println("-------------------------------------");
    }
    public double depositarCuenta(double cantidad) {
        saldo=saldo+cantidad;
        System.out.println("-------------------------------------");
        System.out.println("Cantidad Depositada: ");        
        return cantidad;
    }
    public double retirarCuenta(double cantidad) {
        if(cantidad > saldo){
            System.out.println("-------------------------------------");
            System.out.println("NO ES POSIBLE, Saldo es "+saldo+" menor a "+cantidad);
            return 0;
        } else {
            saldo=saldo-cantidad;
            System.out.println("-------------------------------------");
            System.out.println("Cantidad Retirada: ");
            return cantidad;
        }
    }
    public double consultarSaldo() {
        System.out.println("-------------------------------------");
        System.out.println("Saldo Actual: ");
        return saldo;
    }
    public static void main (String[] args){
        CuentaBanco obj = new CuentaBanco(320149579,"Reyna Mendez Cristian Ignacio","Banorte",12000);
        obj.describirCuenta();
        System.out.println(obj.retirarCuenta(1000));
        System.out.println(obj.consultarSaldo());
        System.out.println(obj.depositarCuenta(10000));
        System.out.println(obj.consultarSaldo());
        
        CuentaBanco obj2 = new CuentaBanco("Reyna Mendez Cristian Ignacio",22000);
        obj2.describirCuenta();
        System.out.println(obj2.retirarCuenta(1000));
        System.out.println(obj2.consultarSaldo());
        System.out.println(obj2.depositarCuenta(10000));
        System.out.println(obj2.consultarSaldo());
    }
}
