package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.*;

public class HlavniProgram {

    private Turtle zofka;
    public void start() {
        zofka = new Turtle();

        zofka.turnLeft(90);
        zofka.penUp();
        zofka.move(350);
        zofka.turnRight(90);
        zofka.move(220);
        zofka.penDown();

        nakresliMaleSlunicko();

        zofka.penUp();
        zofka.turnLeft(180);
        zofka.move(250);
        zofka.turnRight(90);
        zofka.move(50);
        zofka.turnRight(90);
        zofka.penDown();

        nakresliDomecky();

        zofka.penUp();
        zofka.turnLeft(180);
        zofka.move(200);
        zofka.turnRight(90);
        zofka.move(200);
        zofka.turnRight(90);
        zofka.penDown();

        nakresliDomecek();

        zofka.penUp();
        zofka.turnRight(45);
        zofka.move(300);
        zofka.penDown();

        nakresliPrasatko();

        zofka.penUp();
        zofka.turnLeft(210);
        zofka.move(30);
        zofka.turnRight(90);
        zofka.move(400);
        zofka.turnRight(90);
        zofka.penDown();

        nakresliDomecek();

        zofka.penUp();
        zofka.turnLeft(45);
        zofka.move(450);
        zofka.turnLeft(180);
        zofka.penDown();

        nakresliD();

        zofka.penUp();
        zofka.turnRight(170);
        zofka.move(200);
        zofka.penDown();

        nakresliA();

        zofka.penUp();
        zofka.turnLeft(70);
        zofka.move(100);
        zofka.penDown();

        nakresliN();

        zofka.turnLeft(90);
        zofka.move(100);
        zofka.penDown();


        nakresliA();

        /*
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
        */

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

    /*
    private void nakresliMaleSlunicko() {
        for (int i = 0; i < 12; i++) {
            zofka.move(15);
            zofka.turnRight(40);
            zofka.turnLeft(100);
            zofka.move(20);
            zofka.penUp();
            zofka.turnLeft(180);
            zofka.move(20);
            zofka.penDown();
            zofka.turnLeft(90);
        }
    }
    */
    private void nakresliMaleSlunicko() {
        for (int i = 0; i < 12; i++) {
            zofka.move(15);
            zofka.turnLeft(75);
            zofka.move(20);
            zofka.penUp();
            zofka.turnLeft(180);
            zofka.move(20);
            zofka.penDown();
            zofka.turnLeft(75);
        }
    }
    private void nakresliObdelnik() {
        for (int i = 0; i < 2; i++) {
            zofka.move(120);
            zofka.turnLeft(90);
            zofka.move(100);
            zofka.turnLeft(90);
        }
    }

    private void nakresliDomecek() {
            nakresliObdelnik();
            zofka.penUp();
            zofka.move(120);
            zofka.penDown();
            nakresliTrojuhelnik();
    }

    private void nakresliDomecky() {
        for (int i = 0; i < 5; i++) {
            nakresliDomecek();
            zofka.turnLeft(45);
            zofka.penUp();
            zofka.move(120);
            zofka.turnLeft(90);
            zofka.move(300);
            zofka.penDown();
            zofka.turnLeft(90);
        }
    }

    private void nakresliD() {
        zofka.move(250);
        zofka.turnRight(90);
        for (int i = 0; i < 21; i++) {
            zofka.move(20);
            zofka.turnRight(9);
        }
    }

    private void nakresliA() {
        zofka.turnLeft(70);
        zofka.move(250);
        zofka.turnRight(140);
        zofka.move(125);
        zofka.turnRight(110);
        zofka.move(85);
        zofka.turnRight(180);
        zofka.move(85);
        zofka.turnRight(70);
        zofka.move(125);
    }

    private void nakresliN() {

        zofka.turnLeft(90);
        zofka.move(250);
        zofka.turnRight(150);
        zofka.move(289);
        zofka.turnLeft(150);
        zofka.move(250);
        zofka.penUp();
        zofka.turnRight(180);
        zofka.move(250);
    }

        public static void main(String[] args) {
            new HlavniProgram().start();
        }

}
