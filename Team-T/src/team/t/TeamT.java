/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team.t;

/**
 *
 * @author temp
 */
public class TeamT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Customer c=new Customer();
        c.sendOrder();
        c.receiveOrder();
        Order o=new Order();
        o.close();
        o.confirm();
        Specialorder s=new Specialorder();
        s.confirm();
        s.close();
        s.dispatch();
        Normal n=new Normal();
        n.confirm();
        n.close();
        n.dispatch();
        n.receive();
        
    }
    
}
