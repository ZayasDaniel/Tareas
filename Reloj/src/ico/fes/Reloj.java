package ico.fes;

public class Reloj {

        private int  hora;
        private int minuto;
        private int segundo;
        private String tipo;
        private String marca;
        private int horaAlarma;
        private int minutoAlarma;
        private int segundoAlarma;



    public Reloj() {
    }

    public Reloj(int hora, int minuto, int segundo) {
        this.hora = (hora >= 0 && hora <= 23) ? hora : 0;
        this.minuto = (minuto >= 0 && minuto <= 59) ? minuto : 0;
        this.segundo = (segundo >= 0 && segundo <= 59) ? segundo : 0;
    }

    public Reloj(int hora, int minuto, int segundo, String tipo, String marca, int horaAlarma, int minutoAlarma, int segundoAlarma) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
        this.tipo = tipo;
        this.marca = marca;
        this.horaAlarma = horaAlarma;
        this.minutoAlarma = minutoAlarma;
        this.segundoAlarma = segundoAlarma;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getHoraAlarma() {
        return horaAlarma;
    }

    public void setHoraAlarma(int horaAlarma) {
        this.horaAlarma = horaAlarma;
    }

    public int getMinutoAlarma() {
        return minutoAlarma;
    }

    public void setMinutoAlarma(int minutoAlarma) {
        this.minutoAlarma = minutoAlarma;
    }

    public int getSegundoAlarma() {
        return segundoAlarma;
    }

    public void setSegundoAlarma(int segundoAlarma) {
        this.segundoAlarma = segundoAlarma;
    }

    @Override
    public String toString() {
        return "Reloj{" +
                "hora=" + hora +
                ", minuto=" + minuto +
                ", segundo=" + segundo +
                ", tipo='" + tipo + '\'' +
                ", marca='" + marca + '\'' +
                ", horaAlarma=" + horaAlarma +
                ", minutoAlarma=" + minutoAlarma +
                ", segundoAlarma=" + segundoAlarma +
                '}';
    }

    public  void avanzar(){
        this.segundo++;
        if(this.segundo >= 60){
            this.segundo = 0;
            this.minuto++;
            if(this.minuto >= 60){
                this.minuto = 0;
                this.hora++;
                if(this.hora >=24){
                    this.hora = 0;
                }
            }

        }

    }

    public void mostrar(){
        System.out.println(this.hora + ":" + this.minuto + ":" + this.segundo );
    }

    public void programarAlarma(int h, int m, int s){
        this.horaAlarma = h;
        this.minutoAlarma = m;
        this.segundoAlarma = s;
    }
}
