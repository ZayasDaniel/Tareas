package ico.fes;

import java.time.LocalTime;
public class DriverReloj {
    public static void main(String[] args) {
        LocalTime local = LocalTime.now();
        Reloj wacho = new Reloj (local.getHour(), local.getMinute(),local.getSecond());


        for (int i = 0; i < 10; i++) {
            wacho.avanzar();
            wacho.mostrar();

        }
    }
}
