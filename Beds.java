
/**
 * Write a description of class Shelves here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.text.*;
public class Beds extends PetShop
{
    DecimalFormat dc = new DecimalFormat("0.00");
    
    private String bed_type;
    private double total_price;
    
    public Beds()
    {
        super();
        bed_type = null;
    }
    
    public Beds(String cn , String cc , String pt , int q , String bt)
    {
        super(cn,cc,pt,q);
        bed_type = bt;
    }
    
    public Beds(String cn , String cc , String pt , int q , String bt , double tp)
    {
        super(cn,cc,pt,q);
        bed_type = null;
        total_price = tp;
    }
    
    public String getbed_type()
    {
        return bed_type;
    }
    
    public void setbed_type(String bt)
    {
        bed_type = bt;
    }
    
    public double calcTotalPrice()
    {
        total_price = 30.00 * super.getquantity();
        
        total_price = total_price - (total_price * super.discount());
        
        return total_price;
    }
    
    public String toString()
    {
        return super.toString() +
               "\nBed Type    : " + bed_type +
               "\nTotal Price : RM" + dc.format(calcTotalPrice());
    }
    
}
