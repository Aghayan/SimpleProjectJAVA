package diceSimulation;

import java.util.Random;

public class Dice {
    private int number;
    private Turn turn;

    public Dice() {
    }

    public Dice(int number, Turn turn) {
        this.number = number;
        this.turn = turn;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Turn getTurn() {
        return turn;
    }

    public void setTurn(Turn turn) {
        this.turn = turn;
    }

    public int number(){
        return (int) (Math.random() * 6 + 1);
    }

    @Override
    public String toString() {
        return "Dice{" +
                "number=" + number +
                ", turn=" + turn +
                '}';
    }
}
