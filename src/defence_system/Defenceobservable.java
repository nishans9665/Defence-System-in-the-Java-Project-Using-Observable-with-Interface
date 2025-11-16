/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package defence_system;

import java.util.ArrayList;

/**
 *
 * @author Nishan Sameera
 */
public class Defenceobservable {
    private int DefenceLeval;
    private boolean areaclear;
    private ArrayList<Defenceobserver>observerList = new ArrayList<>();

    public void addDefenceobsever(Defenceobserver defenceobserver) {
        observerList.add(defenceobserver);
    }
    
    public void removeDefenceobsever(Defenceobserver defenceobserver){
        observerList.remove(defenceobserver);
    }
    
    public void setDefenceLevel(int DefenceLeval){
        if (this.DefenceLeval != DefenceLeval) {
            this.DefenceLeval = DefenceLeval;
            notifyObserver();
        }
    }

    public void notifyObserver() {
       for(Defenceobserver defenceobserver:observerList){
           defenceobserver.update(DefenceLeval, areaclear);
       }
    }

    void sendunimessage(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void setAreaclear(boolean check) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void privatemessage(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void sendMessagetotal(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
    
}
