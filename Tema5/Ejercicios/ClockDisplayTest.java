package Ejercicios;

public class ClockDisplayTest {
    public static void main(String[] args) {
        ClockDisplay reloj = new ClockDisplay();
        reloj.setTime(12, 45);
        reloj.timeTick();
        reloj.getTime();

        NumberDisplay r1 = new NumberDisplay(300);
        r1.increment();
    }
}
