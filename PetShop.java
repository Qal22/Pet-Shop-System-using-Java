
/**
 * Write a description of class PetShop here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class PetShop
{
    private String cust_name;
    private String cust_contact;
    private String pet_type;
    private int quantity;
    private double discount_value;
    
    public PetShop()
    {
        cust_name = null;
        cust_contact = null;
        pet_type = null;
        quantity = 0;
        discount_value = 0.0;
    }
    
    public PetShop(String cn , String cc , String pt , int q)
    {
        cust_name = cn;
        cust_contact = cc;
        pet_type = pt;
        quantity = q;
    }
    
    public String getcust_name()
    {
        return cust_name;
    }
    public String getcust_contact()
    {
        return cust_contact;
    }
    public String getpet_type()
    {
        return pet_type;
    }
    public int getquantity()
    {
        return quantity;
    }
    
    public void setcust_name(String n)
    {
        cust_name = n;
    }
    public void setcust_contact(String c)
    {
        cust_contact = c;
    }
    public void setpet_type(String p)
    {
        pet_type = p;
    }
    public void setquantity(int q)
    {
        quantity = q;
    }
    
    public double discount()
    {
        if (quantity >= 3)
        {
            discount_value = 0.15;
        }
        else
        {
            discount_value = 0;
        }
        
        return discount_value;
    }
    
    public String toString()
    {
        return "\nName        : " + cust_name +
               "\nContact     : " + cust_contact +
               "\nPet Type    : " + pet_type + 
               "\nQuantity    : " + quantity; 
    }
    
    public abstract double calcTotalPrice();
}
