import java.util.List;

public class ModeloCliente {
    private String nombreCliente;
    private String apellidoCliente;
    private List<ModeloCuenta> Cuentas;

    public ModeloCliente(String nombreCliente, String apellidoCliente, List<ModeloCuenta> cuentas) {
        this.nombreCliente = nombreCliente;
        this.apellidoCliente = apellidoCliente;
        Cuentas = cuentas;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getApellidoCliente() {
        return apellidoCliente;
    }

    public void setApellidoCliente(String apellidoCliente) {
        this.apellidoCliente = apellidoCliente;
    }

    public List<ModeloCuenta> getCuentas() {
        return Cuentas;
    }

    public void setCuentas(List<ModeloCuenta> cuentas) {
        Cuentas = cuentas;
    }
}
