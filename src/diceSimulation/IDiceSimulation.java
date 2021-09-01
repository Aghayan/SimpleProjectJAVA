package diceSimulation;

@FunctionalInterface
public interface IDiceSimulation {
    Dice dice(Turn turn);
}
