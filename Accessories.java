
/**
 * Write a description of class Accessories here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.text.*;
public class Accessories extends PetShop
{
    DecimalFormat dc = new DecimalFormat("0.00");
    
    private String accessories_type;
    private double total_price;
    
    public Accessories()
    {
        super();
        accessories_type = null;
    }
    
    public Accessories(String cn , String cc , String pt , int q , String at)
    {
        super(cn,cc,pt,q);
        accessories_type = at;
    }
    
    public Accessories(String cn , String cc , String pt , int q , String at , double tp)
    {
        super(cn,cc,pt,q);
        accessories_type = at;
        total_price = tp;
    }
    
    public String getaccessories_type()
    {
        return accessories_type;
    }
    
    public void setaccessories_type(String at)
    {
        accessories_type = at;
    }
    
    public double calcTotalPrice()
    {
        total_price = 20.00 * super.getquantity();
        
        total_price = total_price - (total_price * super.discount());
        
        return total_price;
    }
    
    public String toString()
    {
        return super.toString() +
               "\nAccessories : " + accessories_type +
               "\nTotal Price : RM" + dc.format(calcTotalPrice());
    }
}
