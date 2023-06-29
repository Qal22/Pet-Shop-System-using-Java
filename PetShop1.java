
/**
 * Write a description of class PetShop1 here.
 *
 * @author (Muhammad Haikal Bin Khalid)
 * @version (2.0)
 */
import java.io.*;
import java.util.*;
import java.text.*;
public class PetShop1
{
    DecimalFormat dc = new DecimalFormat("0.00");
    private String name;
    private String pet_type;
    private String item_bought;
    private int quantity;
    private double totalprice;
    private String response;
    
    public PetShop1()
    {
        name = null;
        pet_type = null;
        item_bought = null;
        quantity = 0;
        totalprice = 0.0;
    }
    
    public PetShop1(String n , String pt , String ib , int q , double tp)
    {
        name = n;
        pet_type = pt;
        item_bought = ib;
        quantity = q;
        totalprice = tp;
    }
    
    public PetShop1(String r , String n , String pt , String ib , int q)
    {
        response = r;
        name = n;
        pet_type = pt;
        item_bought = ib;
        quantity = q;
    }
    
    public String getname()
    {
        return name;
    }
    public String getpet_type()
    {
        return pet_type;
    }
    public String getitem_bought()
    {
        return item_bought;
    }
    public int getquantity()
    {
        return quantity;
    }
    public double gettotalprice()
    {
        return totalprice;
    }
    
    public void setname(String n)
    {
        name = n;
    }
    public void setpet_type(String pt)
    {
        pet_type = pt;
    }
    public void setitem_bought(String ib)
    {
        item_bought = ib;
    }
    public void setquantity(int q)
    {
        quantity = q;
    }
    public void settotalprice(double tp)
    {
        totalprice = tp;
    }
    
    public double calctotalprice()
    {
        if (response.equals("01"))
        {
            if (pet_type.equalsIgnoreCase("Dog"))
            {
                if (item_bought.equalsIgnoreCase("Samoyed"))
                {
                    totalprice = 860.00 * quantity;
                }
                else if (item_bought.equalsIgnoreCase("Siberian Husky"))
                {
                    totalprice = 990.00 * quantity;
                }
                else if (item_bought.equalsIgnoreCase("Beagle"))
                {
                    totalprice = 750.00 * quantity;
                }
            }
            else if (pet_type.equalsIgnoreCase("Cat"))
            {
                if (item_bought.equalsIgnoreCase("British Shorthair"))
                {
                    totalprice = 630.00 * quantity;
                }
                else if (item_bought.equalsIgnoreCase("Balinese Cat"))
                {
                    totalprice = 550.00 * quantity;
                }
                else if (item_bought.equalsIgnoreCase("Persian Cat"))
                {
                    totalprice = 560.00 * quantity;
                }
            }
            else if (pet_type.equalsIgnoreCase("Rabbit"))
            {
                if (item_bought.equalsIgnoreCase("Cashmere Lop"))
                {
                    totalprice = 100.00 * quantity;
                }
                else if (item_bought.equalsIgnoreCase("Angora Teddy Bears"))
                {
                    totalprice = 99.00 * quantity;
                }
                else if (item_bought.equalsIgnoreCase("Jersey Wooly"))
                {
                    totalprice = 110.00 * quantity;
                }
            }
            else if (pet_type.equalsIgnoreCase("Fish"))
            {
                if (item_bought.equalsIgnoreCase("Guppy"))
                {
                    totalprice = 44.00 * quantity;
                }
                else if (item_bought.equalsIgnoreCase("Neon Tetra"))
                {
                    totalprice = 68.00 * quantity;
                }
                else if (item_bought.equalsIgnoreCase("Gold Fish"))
                {
                    totalprice = 89.00 * quantity;
                }
            }
            else if (pet_type.equalsIgnoreCase("Bird"))
            {
                if (item_bought.equalsIgnoreCase("Owl"))
                {
                    totalprice = 240.00 * quantity;
                }
                else if (item_bought.equalsIgnoreCase("Parrot"))
                {
                    totalprice = 160.00 * quantity;
                }
                else if (item_bought.equalsIgnoreCase("Kingfisher"))
                {
                    totalprice = 99.90 * quantity;
                }
            }
            else if (pet_type.equalsIgnoreCase("Chameleons"))
            {
                if (item_bought.equalsIgnoreCase("Furcifer"))
                {
                    totalprice = 450.00 * quantity;
                }
                else if (item_bought.equalsIgnoreCase("Fischer's chameleon"))
                {
                    totalprice = 560.00 * quantity;
                }
                else if (item_bought.equalsIgnoreCase("Calumma"))
                {
                    totalprice = 670.00 * quantity;
                }
            }
        }
        else if (response.equals("02"))
        {
            if (item_bought.equals("Food Pack (Small)"))
            {
                totalprice = 15.00 * quantity;
            }
            else if (item_bought.equals("Food Pack (Big)"))
            {
                totalprice = 20.00 * quantity;
            }
        }
        else if (response.equals("03"))
        {
            totalprice = 30.00 * quantity;
        }
        else if (response.equals("04"))
        {
            totalprice = 20.00 * quantity;
        }
        
        return totalprice;
    }
    
    public String header()
    {
        return "\n---------------------------------------------" +
               "\n               Shaf's Pet Shop               " +
               "\n---------------------------------------------" + "\n";
    }
    
    public String receipt1()
    {
        return header() +
               "\nCustomer Name : " + name +
               "\nPet that you bought" +
               "\nPet type      : " + pet_type +
               "\nPet Trait     : " + item_bought +
               "\nQuantity      : " + quantity +
               "\nTotal Price   : RM" + dc.format(totalprice);
    }
    
    public String receipt2()
    {
        return header() +
               "\nCustomer Name : " + name +
               "\nProduct that you bought" +
               "\nProduct Name : " + item_bought +
               "\nFor Pet Type : " + pet_type +
               "\nQuantity     : " + quantity +
               "\nTotal Price  : RM" + dc.format(totalprice);
    }
    
    public String receipt3()
    {
        return header() +
               "\nCustomer Name : " + name +
               "\nProduct that you bought" +
               "\nProduct Name : " + item_bought +
               "\nQuantity     : " + quantity +
               "\nTotal Price  : RM " + dc.format(totalprice);
    }
    
    public String receipt4()
    {
        return header() +
               "\nCustomer Name : " + name +
               "\nProduct that you bought" +
               "\nProduct Name : " + item_bought +
               "\nQuantity     : " + quantity +
               "\nTotal Price  : RM " + dc.format(totalprice);
    }
}
