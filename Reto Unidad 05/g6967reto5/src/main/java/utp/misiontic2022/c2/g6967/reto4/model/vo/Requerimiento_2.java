package utp.misiontic2022.c2.g6967.reto4.model.vo;

public class Requerimiento_2 {

    // Atributos
    private String fecIni;
    private String nombreCiudad;
    private String nomConstructora;
    private String nombreLider;
    private Integer codigoTipo;
    private Integer estrato;

    // Constructores
    public Requerimiento_2(){
    }

    public Requerimiento_2(String fecIni, String nombreCiudad, String nomConstructora, String nombreLider, 
                           Integer codigoTipo, Integer estrato){
        this.setFecIni(fecIni);
        this.setNombreCiudad(nombreCiudad);
        this.setNomConstructora(nomConstructora);
        this.setNombreLider(nombreLider);
        this.setCodigoTipo(codigoTipo);
        this.setEstrato(estrato);
    }

    // Generamos los getters y setters
    public String getFecIni() {
        return fecIni;
    }
    public void setFecIni(String fecIni) {
        this.fecIni = fecIni;
    }
    public String getNombreCiudad() {
        return nombreCiudad;
    }
    public void setNombreCiudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }
    public String getNomConstructora() {
        return nomConstructora;
    }
    public void setNomConstructora(String nomConstructora) {
        this.nomConstructora = nomConstructora;
    }
    public String getNombreLider() {
        return nombreLider;
    }
    public void setNombreLider(String nombreLider) {
        this.nombreLider = nombreLider;
    }
    public Integer getCodigoTipo() {
        return codigoTipo;
    }
    public void setCodigoTipo(Integer codigoTipo) {
        this.codigoTipo = codigoTipo;
    }
    public Integer getEstrato() {
        return estrato;
    }
    public void setEstrato(Integer estrato) {
        this.estrato = estrato;
    }
    
}
