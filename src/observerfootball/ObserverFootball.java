/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerfootball;

import java.util.Scanner;

/**
 *
 * @author theki
 */
public class ObserverFootball {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        User u1 =new User();
        User u2 =new User();
        User u3 =new User();
	FootballManager fb = new FootballManager();              
	fb.register(u1);              
	fb.register(u2);      
        fb.register(u3);
        boolean isExit=false;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter Score : ");
            String input =sc.nextLine();
            if (input.equals("")){
                isExit=true;
            }else{
                fb.setSomeData(input);
            }
        }while(!isExit);
    }
    
}
