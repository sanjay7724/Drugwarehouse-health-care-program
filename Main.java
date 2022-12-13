/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package miniproject;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author sanjay
 */
class DrugWareHouse{
    public static ArrayList<String> medicines = new ArrayList<String>();
    Scanner s = new Scanner(System.in);
    public void medicine(){
        medicines.add("Paracetemol");
        medicines.add("Betadine");
        medicines.add("Pantacid");
        
        System.out.println("1. List the available medicines");
        System.out.println("2. Check medicine availability");
        System.out.println("3. Add medicine");
        System.out.println("4. Remove medicine");
        System.out.println("ENTER YOUR CHOICE");
        int choice;
        choice = s.nextInt();
        switch(choice){
            case 1:
                int size = medicines.size();
                System.out.println("The Available medicines are:");
                for(int i = 0; i< size;i++){
                    System.out.println(medicines.get(i));
                
            }break;
            case 2:
                System.out.println("Enter the medicine name");
                String med = s.next();
                if(medicines.contains(med)){
                    System.out.println(med+" is Available");
                }else{
                    System.out.println(med+" is unavailable");
                }
            break;
            case 3:
                System.out.println("Enter the medicine name:");
                String med1 = s.next();
                if(medicines.contains(med1)){
                    System.out.println("Medicine is already available");
                }else{
                    medicines.add(med1);
                }int size1 = medicines.size();
                System.out.println("The  medicines are:");
                for(int i = 0; i< size1;i++){
                    System.out.println(medicines.get(i));
                
            }
            break;
            case 4:
                System.out.println("Enter the name of the medicine to be removed:");
                String med2 = s.next();
                if(medicines.contains(med2)){
                    medicines.remove(med2);
                }else{
                    System.out.println("Medicine is unavailable");
                }int size2 = medicines.size();
                System.out.println("The  medicines are:");
                for(int i = 0; i< size2;i++){
                    System.out.println(medicines.get(i));
                
            }
            break;
                
                
        }
    }
}
public class Miniproject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DrugWareHouse obj1 = new DrugWareHouse();
        obj1.medicine();
    }
    
}
