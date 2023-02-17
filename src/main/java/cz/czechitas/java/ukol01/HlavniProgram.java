package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.*;

public class HlavniProgram {

    private Turtle zofka;
    public void start() {
        zofka = new Turtle();

        zofka.turnLeft(90);
        nakresliPrasatko();

        zofka.turnLeft(30);
        zofka.penUp();
        zofka.move(300);
        zofka.turnLeft(90);
        zofka.move(400);
        zofka.penDown();

        nakresliOsmiuhelnik();

        zofka.penUp();
        zofka.turnRight(180);
        zofka.move(200);
        zofka.penDown();

        nakresliKolecko();

        zofka.penUp();
        zofka.move(200);
        zofka.penDown();

        nakresliSlunicko();




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

    private void nakresliOsmiuhelnik() {
        for (int i = 0; i < 8; i++) {
            zofka.move(50);
            zofka.turnLeft(45);
        }
    }

    private void nakresliKolecko() {
        for (int i = 0; i < 36; i++) {
            zofka.move(10);
            zofka.turnRight(10);
        }
    }

    private void nakresliSlunicko() {
        for (int i = 0; i < 12; i++) {
            zofka.move(35);
            zofka.turnRight(40);
            zofka.turnLeft(100);
            zofka.move(40);
            zofka.turnLeft(180);
            zofka.move(40);
            zofka.turnLeft(90);


        }
    }

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

}
