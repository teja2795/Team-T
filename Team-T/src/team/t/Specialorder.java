/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team.t;

import java.util.Date;

/**
 *
 * @author temp
 */
public class Specialorder extends Order {
    Date date;
    String number;
    public void confirm()
    {
        System.out.println("this is confirm method in Specialorder class");
    }
    public void close()
    {
        System.out.println("this is close method in Special order class");
    }
    public void dispatch()
    {
        System.out.println("this is dispatch method in Special order class");
    }
}
