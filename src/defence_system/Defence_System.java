
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
        
        Tank tank = new Tank(ob);
        ob.addDefenceobsever((Defenceobserver) tank);
        tank.setVisible(true);
        
    } 
}
