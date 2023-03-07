package ico.fes;

public class PaginaWeb {
    private String tipo;
    private String nombre;
    private String url;
    private String contenido;
    private String fechaModification;

    public PaginaWeb() {
    }

    public PaginaWeb(String tipo, String nombre, String url, String contenido, String fechaModification) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.url = url;
        this.contenido = contenido;
        this.fechaModification = fechaModification;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getFechaModification() {
        return fechaModification;
    }

    public void setFechaModification(String fechaModification) {
        this.fechaModification = fechaModification;
    }

    @Override
    public String toString() {
        return "PaginaWeb{" +
                "tipo='" + tipo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", url='" + url + '\'' +
                ", contenido='" + contenido + '\'' +
                ", fechaModification='" + fechaModification + '\'' +
                '}';
    }

    public void visitar(){
        System.out.println("Bienvendio a: " + nombre );
        System.out.println("-----------------");
        System.out.println(contenido);
        System.out.println("----------------------");
    }

    public void cerrar(){
        System.out.println("Adios!!!!!!!");
    }
}
