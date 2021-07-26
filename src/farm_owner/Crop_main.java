/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farm_owner;

/**
 *
 * @author PRO_
 */
public class Crop_main 
{
    private int serial;
    private String product_name;
    private String quantity;
    public Crop_main(int Serial, String ProductName, String Quantity)
    {
        this.serial= Serial;
        this.product_name= ProductName;
        this.quantity= Quantity;
    }
    public int getSerial()
    {
        return serial;
    }
    public String getProductName()
    {
        return product_name;
    }
    public String getQuantity()
    {
        return quantity;
    }
}
