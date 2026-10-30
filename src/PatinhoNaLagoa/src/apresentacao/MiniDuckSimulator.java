package apresentacao;

import patos.Duck;
import patos.MallardDuck;
import voos.FlyNoWay;
import quacks.MuteQuack;
import patos.RubberDuck;
import patos.DecoyDuck;
import patos.ModelDuck;
import voos.FlyRocketPowered;

public class MiniDuckSimulator {

    public static void main(String[] args) {

    	Duck mallard = new MallardDuck();

    	mallard.display();

    	mallard.setQuackBehavior(new MuteQuack());
    	mallard.performQuack();

    	mallard.performFly();
    	mallard.swim();
    	
    	System.out.println("\n--- Pato de borracha ---");

    	Duck rubber = new RubberDuck();
    	rubber.display();
    	rubber.performQuack();
    	rubber.performFly();
    	rubber.swim();
    	
    	
    	System.out.println("\n--- Pato chamariz ---");

    	Duck decoy = new DecoyDuck();
    	decoy.display();
    	decoy.performQuack();
    	decoy.performFly();
    	decoy.swim();
    	
    	
    	System.out.println("\n--- Pato-modelo ---");

    	Duck model = new ModelDuck();

    	model.performFly();

    	model.setFlyBehavior(new FlyRocketPowered());

    	model.performFly();
    	
    }
}