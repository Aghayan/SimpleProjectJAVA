package diceSimulation;

public class DiceSimulationTest {
    public static void main(String[] args) {
        Dice dice = new Dice();
        IDiceSimulation diceSimulation =(Turn turn)->{
            dice.setTurn(turn);
            return dice;
        };

        for(int i = 0 ; i<10 ; i++){
            if(i%2==0){
                diceSimulation.dice(Turn.FIRSTTURN).setNumber(dice.number());
                System.out.println(dice.toString());
            }else {
                diceSimulation.dice(Turn.SECENDTURN).setNumber(dice.number());
                System.out.println(dice.toString());
            }
        }
    }
}
