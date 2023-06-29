
/**
 * Write a description of class FoodPack here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.text.*;
public class FoodPack extends PetShop
{
    DecimalFormat dc = new DecimalFormat("0.00");
    
    private String food_size;
    private double total_price;
    
    public FoodPack()
    {
        super();
        food_size = null;
    }
    
    public FoodPack(String cn , String cc , String pt , int q , String fs)
    {
        super(cn,cc,pt,q);
        food_size = fs;
    }
    
    public FoodPack(String cn , String cc , String pt , int q , String fs , double tp)
    {
        super(cn,cc,pt,q);
        food_size = fs;
        total_price = tp;
    }
    
    public String getfood_size()
    {
        return food_size;
    }
    
    public void setfood_size(String fs)
    {
        food_size = fs;
    }
    
    public double calcTotalPrice()
    {
        if (food_size.equals("Small"))
        {
            total_price = 15.00 * super.getquantity();
        }
        else if (food_size.equals("Big"))
        {
            total_price = 20.00 * super.getquantity();
        }
        
        total_price = total_price - (total_price * super.discount());
        
        return total_price;
    }
    
    public String toString()
    {
        return super.toString() +
               "\nFood Size   : " + food_size +
               "\nTotal Price : RM" + dc.format(calcTotalPrice());
    }
    
}
