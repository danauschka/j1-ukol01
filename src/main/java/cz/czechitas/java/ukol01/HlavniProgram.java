package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.*;

public class HlavniProgram {

    private Turtle zofka;
    public void start() {
        zofka = new Turtle();

        zofka.turnLeft(90);
        nakresliPrasatko();

        //TODO implementace domácího úkolu
    }

    private void nakresliPrasatko() {
        for (int i = 0; i < 2; i++) {
            zofka.move(120);
            zofka.turnLeft(90);
            zofka.move(100);
            zofka.turnLeft(90);
        }
            zofka.penUp();
            zofka.move(120);
            zofka.penDown();

            nakresliTrojuhelnik();

            zofka.turnRight(15);

            nakresliNohy();

            zofka.turnRight(60);
            zofka.penUp();
            zofka.move(120);
            zofka.penDown();
            zofka.turnRight(60);

        nakresliNohy();
        }

    private void nakresliTrojuhelnik() {

        zofka.turnLeft(45);
        zofka.move(70);
        zofka.turnLeft(90);
        zofka.move(70);
    }

    private void nakresliNohy() {

        zofka.move(35);
        zofka.turnRight(120);
        zofka.penUp();
        zofka.move(35);
        zofka.turnRight(120);
        zofka.penDown();
        zofka.move(35);
    }

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

}
