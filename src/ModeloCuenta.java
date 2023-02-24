import java.util.List;

public class ModeloCuenta {
    private String numeroCuenta;
    private String nombreCuenta;
    private List<ModeloBeneficiario> beneficiarios;
    private List<ModeloTarjeta> tarjetas;

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getNombreCuenta() {
        return nombreCuenta;
    }

    public void setNombreCuenta(String nombreCuenta) {
        this.nombreCuenta = nombreCuenta;
    }

    public List<ModeloBeneficiario> getBeneficiarios() {
        return beneficiarios;
    }

    public void setBeneficiarios(List<ModeloBeneficiario> beneficiarios) {
        this.beneficiarios = beneficiarios;
    }

    public List<ModeloTarjeta> getTarjetas() {
        return tarjetas;
    }

    public void setTarjetas(List<ModeloTarjeta> tarjetas) {
        this.tarjetas = tarjetas;
    }
}
