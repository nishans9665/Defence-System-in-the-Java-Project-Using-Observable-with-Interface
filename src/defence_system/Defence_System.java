
package defence_system;

/**
 *
 * @author Nishan Sameera
 */
public class Defence_System {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Defenceobservable ob = new Defenceobservable();
        
        DefenceMainControl dmc = new DefenceMainControl(ob);
        ob.addDefenceobsever(dmc);
        dmc.setVisible(true);
        
        Tank tank = new Tank(ob);
        ob.addDefenceobsever((Defenceobserver) tank);
        tank.setVisible(true);
        
    } 
}
