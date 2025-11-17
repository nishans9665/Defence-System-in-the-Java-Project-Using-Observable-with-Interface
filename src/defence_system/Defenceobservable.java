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

    void sendunimessage(String message) {
      for(Defenceobserver obsever:observerList){
           obsever.reciveMessage(message);
       }
    }

    void setAreaclear(boolean clear) {
       this.areaclear = clear;
       notifyObserver();
    }

    void privatemessage(String message) {
       for(Defenceobserver observer:observerList){
           observer.priMessage(message);
       }
    }

    void sendMessagetotal(String message) {
        for(Defenceobserver observer:observerList){
            observer.unitMessage(message);
        }
    }
    
}
