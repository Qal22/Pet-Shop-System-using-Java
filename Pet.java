
/**
 * Write a description of class Pet here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.text.*;
public class Pet extends PetShop
{
    DecimalFormat dc = new DecimalFormat("0.00");
    
    private String pet_trait;
    private double total_price;
    
    public Pet()
    {
        super();
        pet_trait = null;
    }
    
    public Pet(String cn , String cc , String pt , int q , String ptrait)
    {
        super(cn,cc,pt,q);
        pet_trait = ptrait;
    }
    
    public Pet(String cn , String cc , String pt , int q , String ptrait , double tp)
    {
        super(cn,cc,pt,q);
        pet_trait = ptrait;
        total_price = tp;
    }
    
    public String getpet_trait()
    {
        return pet_trait;
    }
    
    public void setpet_trait(String ptrait)
    {
        pet_trait = ptrait;
    }
    
    public double calcTotalPrice()
    {
        if (super.getpet_type().equalsIgnoreCase("Dog"))
        {
            
            if (pet_trait.equalsIgnoreCase("Samoyed"))
            {
                total_price = 860.00 * super.getquantity();
            }
            else if (pet_trait.equalsIgnoreCase("Siberian Husky"))
            {
                total_price = 990.00 * super.getquantity();
            }
            else if (pet_trait.equalsIgnoreCase("Beagle"))
            {
                total_price = 750.00 * super.getquantity();
            }
            
        }
        else if (super.getpet_type().equalsIgnoreCase("Cat"))
        {
            
            if (pet_trait.equalsIgnoreCase("British Shorthair"))
            {
                total_price = 630.00 * super.getquantity();
            }
            else if (pet_trait.equalsIgnoreCase("Balinese Cat"))
            {
                total_price = 550.00 * super.getquantity();
            }
            else if (pet_trait.equalsIgnoreCase("Persian Cat"))
            {
                total_price = 560.00 * super.getquantity();
            }
            
        }
        else if (super.getpet_type().equalsIgnoreCase("Rabbit"))
        {
            
            if (pet_trait.equalsIgnoreCase("Cashmere Lop"))
            {
                total_price = 100.00 * super.getquantity();
            }
            else if (pet_trait.equalsIgnoreCase("Angora Teddy Bears"))
            {
                total_price = 99.00 * super.getquantity();
            }
            else if (pet_trait.equalsIgnoreCase("Jersey Wooly"))
            {
                total_price = 110.00 * super.getquantity();
            }
            
        }
        else if (super.getpet_type().equalsIgnoreCase("Fish"))
        {
            
            if (pet_trait.equalsIgnoreCase("Guppy"))
            {
                total_price = 44.00 * super.getquantity();
            }
            else if (pet_trait.equalsIgnoreCase("Neon Tetra"))
            {
                total_price = 68.00 * super.getquantity();
            }
            else if (pet_trait.equalsIgnoreCase("GoldFish"))
            {
                total_price = 89.00 * super.getquantity();
            }
            
        }
        else if (super.getpet_type().equalsIgnoreCase("Bird"))
        {
            
            if (pet_trait.equalsIgnoreCase("Owl"))
            {
                total_price = 240.00 * super.getquantity();
            }
            else if (pet_trait.equalsIgnoreCase("Parrot"))
            {
                total_price = 160.00 * super.getquantity();
            }
            else if (pet_trait.equalsIgnoreCase("Kingfisher"))
            {
                total_price = 99.90 * super.getquantity();
            }
            
        }
        else if (super.getpet_type().equalsIgnoreCase("Chameleons"))
        {
            
            if (pet_trait.equalsIgnoreCase("Furcifer"))
            {
                total_price = 450.00 * super.getquantity();
            }
            else if (pet_trait.equalsIgnoreCase("Fischer's chameleon"))
            {
                total_price = 560.00 * super.getquantity();
            }
            else if (pet_trait.equalsIgnoreCase("Calumma"))
            {
                total_price = 670.00 * super.getquantity();
            }
            
        }
        
        total_price = total_price - (total_price * super.discount());
        
        return total_price;
    }
    
    public String toString()
    {
        return super.toString() +
               "\nPet Trait   : " + pet_trait +
               "\nTotal Price : RM" + dc.format(calcTotalPrice());
    }
}
