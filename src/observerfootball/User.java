/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerfootball;

/**
 *
 * @author theki
 */
public class User implements MyObserver {
    @Override
    public void update(Source o){
        System.out.println(
	 "live result: " 
                + ((FootballManager)o).getSomeData());
    }
}
