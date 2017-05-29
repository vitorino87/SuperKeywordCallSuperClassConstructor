/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superkeywordcallsuperclassconstructor;

/**
 *
 * @author tiago.lucas
 */
public class SuperKeywordCallSuperClassConstructor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BoxWeight b1 = new BoxWeight(10,15,20,25.75);
        BoxWeight b2 = new BoxWeight(2,3,4,2.25);
        BoxWeight b3 = new BoxWeight();
        BoxWeight b4 = new BoxWeight(5,6);
        BoxWeight b5 = new BoxWeight(b1);
        double vol;
        
        vol = b1.volume();
        System.out.println("Volume of b1 is "+vol);
        System.out.println("Weight of b1 is "+b1.weight);
        
        vol= b2.volume();
        System.out.println("Volume of b2 is "+vol);
        System.out.println("Weight of b2 is "+b2.weight);
        
        vol = b3.volume();
        System.out.println("Volume of b3 is "+vol);
        System.out.println("Weight of b3 is "+b3.weight);
        
        vol=b4.volume();
        System.out.println("Volume of b4 is "+vol);
        System.out.println("Weight of b4 is "+b4.weight);
        
        vol = b5.volume();
        System.out.println("Volume of b5 is "+vol);
        System.out.println("Weight of b5 is "+b5.weight);
    }
    
}
