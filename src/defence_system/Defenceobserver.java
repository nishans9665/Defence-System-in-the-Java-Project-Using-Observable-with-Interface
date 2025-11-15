/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package defence_system;

/**
 *
 * @author Nishan Sameera
 */
interface Defenceobserver {
    public void update(int defenceLevel,boolean areaclear);
    public void reciveMessage(String message);
    public void unitMessage(String message);
    public void priMessage(String message);
}
