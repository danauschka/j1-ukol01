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

        drawSmallSun();

        zofka.penUp();
        zofka.turnLeft(180);
        zofka.move(250);
        zofka.turnRight(90);
        zofka.move(50);
        zofka.turnRight(90);
        zofka.penDown();

        drawHouses();

        zofka.penUp();
        zofka.turnLeft(180);
        zofka.move(200);
        zofka.turnRight(90);
        zofka.move(200);
        zofka.turnRight(90);
        zofka.penDown();

        drawHouse();

        zofka.penUp();
        zofka.turnRight(45);
        zofka.move(300);
        zofka.penDown();

        drawPiggy();

        zofka.penUp();
        zofka.turnLeft(210);
        zofka.move(30);
        zofka.turnRight(90);
        zofka.move(400);
        zofka.turnRight(90);
        zofka.penDown();

        drawHouse();

        zofka.penUp();
        zofka.turnLeft(45);
        zofka.move(450);
        zofka.turnLeft(180);


        drawName();

        /* Reseni casti 1 a 2 (nakresleni obrazcu a slunicka)
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

    private void drawPiggy() {
        drawHouse();

        zofka.turnRight(15);

        drawLegs();

        zofka.turnRight(60);
        zofka.penUp();
        zofka.move(120);
        zofka.penDown();
        zofka.turnRight(60);

        drawLegs();
    }

    private void drawTriangle() {
        zofka.turnLeft(45);
        zofka.move(70);
        zofka.turnLeft(90);
        zofka.move(70);
    }

    private void drawLegs() {

        zofka.move(35);
        zofka.turnRight(120);
        zofka.penUp();
        zofka.move(35);
        zofka.turnRight(120);
        zofka.penDown();
        zofka.move(35);
    }

    private void drawOctagon() {
        for (int i = 0; i < 8; i++) {
            zofka.move(50);
            zofka.turnLeft(45);
        }
    }

    private void drawCircle() {
        for (int i = 0; i < 36; i++) {
            zofka.move(10);
            zofka.turnRight(10);
        }
    }

    private void drawSun() {
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
    private void drawSmallSun() {
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

    private void drawRectangle() {
        for (int i = 0; i < 2; i++) {
            zofka.move(120);
            zofka.turnLeft(90);
            zofka.move(100);
            zofka.turnLeft(90);
        }
    }

    private void drawHouse() {
        drawRectangle();
        zofka.penUp();
        zofka.move(120);
        zofka.penDown();
        drawTriangle();
    }

    private void drawHouses() {
        for (int i = 0; i < 5; i++) {
            drawHouse();
            zofka.turnLeft(45);
            zofka.penUp();
            zofka.move(120);
            zofka.turnLeft(90);
            zofka.move(300);
            zofka.penDown();
            zofka.turnLeft(90);
        }
    }

    private void drawD() {
        zofka.penDown();
        zofka.move(250);
        zofka.turnRight(90);
        for (int i = 0; i < 21; i++) {
            zofka.move(20);
            zofka.turnRight(9);
        }
        zofka.penUp();
        zofka.turnRight(170);
        zofka.move(200);
    }

    private void drawA() {
        zofka.penDown();
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
        zofka.penUp();
        zofka.turnLeft(70);
        zofka.move(100);
    }

    private void drawN() {
        zofka.penDown();
        zofka.turnLeft(90);
        zofka.move(250);
        zofka.turnRight(150);
        zofka.move(289);
        zofka.turnLeft(150);
        zofka.move(250);
        zofka.penUp();
        zofka.turnRight(180);
        zofka.move(250);
        zofka.turnLeft(90);
        zofka.move(100);
    }

    private void drawName() {
        drawD();
        drawA();
        drawN();
        drawA();
    }
        public static void main(String[] args) {
            new HlavniProgram().start();
        }

}
