
/**
 * Write a description of class application here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.io.*;
import java.util.*;
import java.text.*;
public class application
{
    public static void main(String[] args)throws Exception
    {
        Scanner scan = new Scanner(System.in);
        scan.useDelimiter("\n");
        
        FileReader fr1 = new FileReader("customerdata.txt");
        BufferedReader buffR1 = new BufferedReader(fr1);
        
        FileWriter fw1 = new FileWriter("NEWcustomerdata.txt");
        BufferedWriter buffW1 = new BufferedWriter(fw1);
        PrintWriter pw1 = new PrintWriter(buffW1);
        
        PetShop[] ps = new PetShop[100];
        
        try
        {
            String indata = null;
            int counter = 0;
            
            while ((indata = buffR1.readLine())!=null)
            {
                StringTokenizer st = new StringTokenizer(indata,";");
                
                String name = st.nextToken();
                
                String contact = st.nextToken();
                
                String pet_type = st.nextToken();
                
                String Quantity = st.nextToken();
                int quantity = Integer.parseInt(Quantity);
                
                String item_bought = st.nextToken();
                
                String Totalprice = st.nextToken();
                double totalprice = Double.parseDouble(Totalprice);
                
                if (item_bought.equalsIgnoreCase("Samoyed")||item_bought.equalsIgnoreCase("Siberian Husky")||item_bought.equalsIgnoreCase("Beagle")||item_bought.equalsIgnoreCase("British Shorthair")||item_bought.equalsIgnoreCase("Balinese Cat")||item_bought.equalsIgnoreCase("Persian Cat")||item_bought.equalsIgnoreCase("Cashmere Lop")||item_bought.equalsIgnoreCase("Angora Teddy Bears")||item_bought.equalsIgnoreCase("Jersey Wooly")||item_bought.equalsIgnoreCase("Guppy")||item_bought.equalsIgnoreCase("Neon Tetra")||item_bought.equalsIgnoreCase("Goldfish")||item_bought.equalsIgnoreCase("Owl")||item_bought.equalsIgnoreCase("Parrot")||item_bought.equalsIgnoreCase("Kingfisher")||item_bought.equalsIgnoreCase("Furcifer")||item_bought.equalsIgnoreCase("Fischer's chameleon")||item_bought.equalsIgnoreCase("Calumma"))
                {
                    ps[counter] = new Pet(name,contact,pet_type,quantity,item_bought,totalprice);
                    
                    pw1.print("\n---------------------------------------------");
                    pw1.print("\n               Haisha's Pet Shop               ");
                    pw1.print("\n---------------------------------------------" + "\n");
                    pw1.print(ps[counter].toString());
                }
                else if (item_bought.equalsIgnoreCase("Small")||item_bought.equalsIgnoreCase("Big"))
                {
                    ps[counter] = new FoodPack(name,contact,pet_type,quantity,item_bought,totalprice);
                    
                    pw1.print("\n---------------------------------------------");
                    pw1.print("\n               Haisha's Pet Shop               ");
                    pw1.print("\n---------------------------------------------" + "\n");
                    pw1.print(ps[counter].toString());
                }
                else if (item_bought.equalsIgnoreCase("Cage")||item_bought.equalsIgnoreCase("Aquarium"))
                {
                    ps[counter] = new Beds(name,contact,pet_type,quantity,item_bought,totalprice);
                    
                    pw1.print("\n---------------------------------------------");
                    pw1.print("\n               Haisha's Pet Shop               ");
                    pw1.print("\n---------------------------------------------" + "\n");
                    pw1.print(ps[counter].toString());
                }
                else if (item_bought.equalsIgnoreCase("Collars & Leashes")||item_bought.equalsIgnoreCase("Collars & Bowls")||item_bought.equalsIgnoreCase("Carrier & Water Bottle")||item_bought.equalsIgnoreCase("Filter & Air Pump")||item_bought.equalsIgnoreCase("Lighting & Heating"))
                {
                    ps[counter] = new Accessories(name,contact,pet_type,quantity,item_bought,totalprice);
                    
                    pw1.print("\n---------------------------------------------");
                    pw1.print("\n               Haisha's Pet Shop               ");
                    pw1.print("\n---------------------------------------------" + "\n");
                    pw1.print(ps[counter].toString());
                }
                
                counter++;
            }
            
            buffR1.close();
            
            String response = "00";
            
            while((response.equals("00"))&&(counter < ps.length))
            {
                System.out.print("\n---------------------------------------------");
                System.out.print("\n               Haisha's Pet Shop               ");
                System.out.print("\n---------------------------------------------" + "\n");
                
                System.out.println("Select based on number that you want to buy");
                System.out.println("(01)  Pet");
                System.out.println("(02)  Food Pack");
                System.out.println("(03)  Beds");
                System.out.println("(04)  Accessories");
                System.out.println("(0)   Exit Program");
                System.out.print("Input : ");
                response = scan.next();
                
                while (!(response.equalsIgnoreCase("01")||response.equalsIgnoreCase("02")||response.equalsIgnoreCase("03")||response.equalsIgnoreCase("04")||response.equalsIgnoreCase("0")))
                {
                    System.out.println("INVALID INPUT!!! Please Enter The Input Again");
                    System.out.print("Input : ");
                    response = scan.next();
                }
                
                String pet_type = null;
                if (!response.equals("0"))
                {
                    System.out.print("\n---------------------------------------------");
                    System.out.print("\n               Haisha's Pet Shop               ");
                    System.out.print("\n---------------------------------------------" + "\n");
                    
                    System.out.println("Dog");
                    System.out.println("Cat");
                    System.out.println("Rabbit");
                    System.out.println("Fish");
                    System.out.println("Bird");
                    System.out.println("Chameleons");
                
                    System.out.print("\nPlease enter your pet type : ");
                    pet_type = scan.next();
                    
                    while (!(pet_type.equalsIgnoreCase("Dog")||pet_type.equalsIgnoreCase("Cat")||pet_type.equalsIgnoreCase("Rabbit")||pet_type.equalsIgnoreCase("Fish")||pet_type.equalsIgnoreCase("Bird")||pet_type.equalsIgnoreCase("Chameleons")))
                    {
                        System.out.println("INVALID INPUT!!! Please Enter The Input Again");
                        System.out.print("Input : ");
                        pet_type = scan.next();
                    }
                
                    System.out.print("\n---------------------------------------------");
                    System.out.print("\n               Haisha's Pet Shop               ");
                    System.out.print("\n---------------------------------------------" + "\n");
                }
                
                if (response.equals("01"))
                {
                    
                    if (pet_type.equalsIgnoreCase("Dog"))
                    {
                        System.out.println("Types That Available");
                        System.out.println("Samoyed         RM860.00");
                        System.out.println("Siberian Husky  RM990.00");
                        System.out.println("Beagle          RM750.00");
                        System.out.print("Please enter the pet trait name : ");
                        String pet_trait = scan.next();
                        
                        while (!(pet_trait.equalsIgnoreCase("Samoyed")||pet_trait.equalsIgnoreCase("Siberian Husky")||pet_trait.equalsIgnoreCase("Beagle")))
                        {
                            System.out.println("INVALID INPUT!!! Please Enter The Input Again");
                            System.out.print("Input : ");
                            pet_trait = scan.next();
                        }
                    
                        System.out.print("Quantity : ");
                        int quantity = scan.nextInt();
                        
                        while (quantity <= 0)
                        {
                            System.out.println("INVALID INPUT!!! Please Enter The Input Again");
                            System.out.print("Input : ");
                            quantity = scan.nextInt();
                        }
                        
                        System.out.print("Please enter your name : ");
                        String name = scan.next();
                        
                        System.out.print("Please enter your contact : ");
                        String contact = scan.next();
                    
                        ps[counter] = new Pet(name,contact,pet_type,quantity,pet_trait);
                        
                        pw1.print("\n---------------------------------------------");
                        pw1.print("\n               Haisha's Pet Shop               ");
                        pw1.print("\n---------------------------------------------" + "\n");
                        pw1.print(ps[counter].toString());
                        
                        System.out.print("\n---------------------------------------------");
                        System.out.print("\n               Haisha's Pet Shop               ");
                        System.out.print("\n---------------------------------------------" + "\n");
                        System.out.println(ps[counter].toString());
                        
                    }
                    else if (pet_type.equalsIgnoreCase("Cat"))
                    {
                        System.out.println("Types That Available");
                        System.out.println("British Shorthair   RM630.00");
                        System.out.println("Balinese Cat        RM550.00");
                        System.out.println("Persian Cat         RM560.00");
                        System.out.print("Please enter the pet trait name : ");
                        String pet_trait = scan.next();
                        
                        while (!(pet_trait.equalsIgnoreCase("British Shorthair")||pet_trait.equalsIgnoreCase("Balinese Cat")||pet_trait.equalsIgnoreCase("Persian Cat")))
                        {
                            System.out.println("INVALID INPUT!!! Please Enter The Input Again");
                            System.out.print("Input : ");
                            pet_trait = scan.next();
                        }
                    
                        System.out.print("Quantity : ");
                        int quantity = scan.nextInt();
                        
                        while (quantity <= 0)
                        {
                            System.out.println("INVALID INPUT!!! Please Enter The Input Again");
                            System.out.print("Input : ");
                            quantity = scan.nextInt();
                        }
                        
                        System.out.print("Please enter your name : ");
                        String name = scan.next();
                        
                        System.out.print("Please enter your contact : ");
                        String contact = scan.next();
                    
                        ps[counter] = new Pet(name,contact,pet_type,quantity,pet_trait);
                        
                        pw1.print("\n---------------------------------------------");
                        pw1.print("\n               Haisha's Pet Shop               ");
                        pw1.print("\n---------------------------------------------" + "\n");
                        pw1.print(ps[counter].toString());
                        
                        System.out.print("\n---------------------------------------------");
                        System.out.print("\n               Haisha's Pet Shop               ");
                        System.out.print("\n---------------------------------------------" + "\n");
                        System.out.println(ps[counter].toString());
                        
                    }
                    else if (pet_type.equalsIgnoreCase("Rabbit"))
                    {
                        System.out.println("Types That Available");
                        System.out.println("Cashmere Lop         RM100.00");
                        System.out.println("Angora Teddy Bears   RM 99.00");
                        System.out.println("Jersey Wooly         RM110.00");
                        System.out.print("Please enter the pet trait name : ");
                        String pet_trait = scan.next();
                        
                        while (!(pet_trait.equalsIgnoreCase("Cashmere Lop")||pet_trait.equalsIgnoreCase("Angora Teddy Bears")||pet_trait.equalsIgnoreCase("Jersey Wooly")))
                        {
                            System.out.println("INVALID INPUT!!! Please Enter The Input Again");
                            System.out.print("Input : ");
                            pet_trait = scan.next();
                        }
                    
                        System.out.print("Quantity : ");
                        int quantity = scan.nextInt();
                        
                        while (quantity <= 0)
                        {
                            System.out.println("INVALID INPUT!!! Please Enter The Input Again");
                            System.out.print("Input : ");
                            quantity = scan.nextInt();
                        }
                        
                        System.out.print("Please enter your name : ");
                        String name = scan.next();
                        
                        System.out.print("Please enter your contact : ");
                        String contact = scan.next();
                    
                        ps[counter] = new Pet(name,contact,pet_type,quantity,pet_trait);
                        
                        pw1.print("\n---------------------------------------------");
                        pw1.print("\n               Haisha's Pet Shop               ");
                        pw1.print("\n---------------------------------------------" + "\n");
                        pw1.print(ps[counter].toString());
                        
                        System.out.print("\n---------------------------------------------");
                        System.out.print("\n               Haisha's Pet Shop               ");
                        System.out.print("\n---------------------------------------------" + "\n");
                        System.out.println(ps[counter].toString());
                        
                    }
                    else if (pet_type.equalsIgnoreCase("Fish"))
                    {
                        System.out.println("Types That Available");
                        System.out.println("Guppy          RM44.00");
                        System.out.println("Neon Tetra     RM68.00");
                        System.out.println("Goldfish       RM89.00");
                        System.out.print("Please enter the pet trait name : ");
                        String pet_trait = scan.next();
                        
                        while (!(pet_trait.equalsIgnoreCase("Guppy")||pet_trait.equalsIgnoreCase("Neon Tetra")||pet_trait.equalsIgnoreCase("Goldfish")))
                        {
                            System.out.println("INVALID INPUT!!! Please Enter The Input Again");
                            System.out.print("Input : ");
                            pet_trait = scan.next();
                        }
                    
                        System.out.print("Quantity : ");
                        int quantity = scan.nextInt();
                        
                        while (quantity <= 0)
                        {
                            System.out.println("INVALID INPUT!!! Please Enter The Input Again");
                            System.out.print("Input : ");
                            quantity = scan.nextInt();
                        }
                        
                        System.out.print("Please enter your name : ");
                        String name = scan.next();
                        
                        System.out.print("Please enter your contact : ");
                        String contact = scan.next();
                    
                        ps[counter] = new Pet(name,contact,pet_type,quantity,pet_trait);
                        
                        pw1.print("\n---------------------------------------------");
                        pw1.print("\n               Haisha's Pet Shop               ");
                        pw1.print("\n---------------------------------------------" + "\n");
                        pw1.print(ps[counter].toString());
                        
                        System.out.print("\n---------------------------------------------");
                        System.out.print("\n               Haisha's Pet Shop               ");
                        System.out.print("\n---------------------------------------------" + "\n");
                        System.out.println(ps[counter].toString());
                        
                    }
                    else if (pet_type.equalsIgnoreCase("Bird"))
                    {
                        System.out.println("Types That Available");
                        System.out.println("Owl         RM240.00");
                        System.out.println("Parrot      RM160.00");
                        System.out.println("Kingfisher  RM99.90");
                        System.out.print("Please enter the pet trait name : ");
                        String pet_trait = scan.next();
                        
                        while (!(pet_trait.equalsIgnoreCase("Owl")||pet_trait.equalsIgnoreCase("Parrot")||pet_trait.equalsIgnoreCase("Kingfisher")))
                        {
                            System.out.println("INVALID INPUT!!! Please Enter The Input Again");
                            System.out.print("Input : ");
                            pet_trait = scan.next();
                        }
                    
                        System.out.print("Quantity : ");
                        int quantity = scan.nextInt();
                        
                        while (quantity <= 0)
                        {
                            System.out.println("INVALID INPUT!!! Please Enter The Input Again");
                            System.out.print("Input : ");
                            quantity = scan.nextInt();
                        }
                        
                        System.out.print("Please enter your name : ");
                        String name = scan.next();
                        
                        System.out.print("Please enter your contact : ");
                        String contact = scan.next();
                    
                        ps[counter] = new Pet(name,contact,pet_type,quantity,pet_trait);
                        
                        pw1.print("\n---------------------------------------------");
                        pw1.print("\n               Haisha's Pet Shop               ");
                        pw1.print("\n---------------------------------------------" + "\n");
                        pw1.print(ps[counter].toString());
                        
                        System.out.print("\n---------------------------------------------");
                        System.out.print("\n               Haisha's Pet Shop               ");
                        System.out.print("\n---------------------------------------------" + "\n");
                        System.out.println(ps[counter].toString());
                        
                    }
                    else if (pet_type.equalsIgnoreCase("Chameleons"))
                    {
                        System.out.println("Types That Available");
                        System.out.println("Furcifer             RM450.00");
                        System.out.println("Fischer's chameleon  RM560.00");
                        System.out.println("Calumma              RM670.00");
                        System.out.print("Please enter the pet trait name : ");
                        String pet_trait = scan.next();
                        
                        while (!(pet_trait.equalsIgnoreCase("Furcifer")||pet_trait.equalsIgnoreCase("Fischer's chameleon")||pet_trait.equalsIgnoreCase("Calumma")))
                        {
                            System.out.println("INVALID INPUT!!! Please Enter The Input Again");
                            System.out.print("Input : ");
                            pet_trait = scan.next();
                        }
                    
                        System.out.print("Quantity : ");
                        int quantity = scan.nextInt();
                        
                        while (quantity <= 0)
                        {
                            System.out.println("INVALID INPUT!!! Please Enter The Input Again");
                            System.out.print("Input : ");
                            quantity = scan.nextInt();
                        }
                        
                        System.out.print("Please enter your name : ");
                        String name = scan.next();
                        
                        System.out.print("Please enter your contact : ");
                        String contact = scan.next();
                    
                        ps[counter] = new Pet(name,contact,pet_type,quantity,pet_trait);
                        
                        pw1.print("\n---------------------------------------------");
                        pw1.print("\n               Haisha's Pet Shop               ");
                        pw1.print("\n---------------------------------------------" + "\n");
                        pw1.print(ps[counter].toString());
                        
                        System.out.print("\n---------------------------------------------");
                        System.out.print("\n               Haisha's Pet Shop               ");
                        System.out.print("\n---------------------------------------------" + "\n");
                        System.out.println(ps[counter].toString());
                        
                    }
                    
                    System.out.println("\n(0)  Exit Program");
                    System.out.println("(00) Back To Main Menu");
                    System.out.print("Input : ");
                    response = scan.next();
                    
                }
                else if (response.equals("02"))
                {
                    
                    System.out.println("S - Small Food Pack - RM15.00");
                    System.out.println("B - Big Food Pack   - RM20.00");
                    System.out.print("Please enter the size : ");
                    char sizefood = scan.next().charAt(0);
                    
                    while (!((sizefood == 'S')||(sizefood == 's')||(sizefood == 'B')||(sizefood == 'b')))
                    {
                        System.out.println("INVALID INPUT!!! Please Enter The Input Again");
                        System.out.print("Input : ");
                        sizefood = scan.next().charAt(0);
                    }
                    
                    String size = null;
                    if ((sizefood == 'S')||(sizefood == 's'))
                    {
                        size = "Small";
                    }
                    else if ((sizefood == 'B')||(sizefood == 'b'))
                    {
                        size = "Big";
                    }
                    
                    System.out.print("Please enter the quantity : ");
                    int quantity = scan.nextInt();
                    
                    while (quantity <= 0)
                    {
                            System.out.println("INVALID INPUT!!! Please Enter The Input Again");
                            System.out.print("Input : ");
                            quantity = scan.nextInt();
                    }
                    
                    System.out.print("Please enter your name : ");
                    String name = scan.next();
                    
                    System.out.print("Please enter your contact : ");
                    String contact = scan.next();
                    
                    ps[counter] = new FoodPack(name,contact,pet_type,quantity,size);
                        
                    pw1.print("\n---------------------------------------------");
                    pw1.print("\n               Haisha's Pet Shop               ");
                    pw1.print("\n---------------------------------------------" + "\n");
                    pw1.print(ps[counter].toString());
                        
                    System.out.print("\n---------------------------------------------");
                    System.out.print("\n               Haisha's Pet Shop               ");
                    System.out.print("\n---------------------------------------------" + "\n");
                    System.out.println(ps[counter].toString());
                    
                    System.out.println("\n(0)  Exit Program");
                    System.out.println("(00) Back To Main Menu");
                    System.out.print("Input : ");
                    response = scan.next();
                        
                }
                else if (response.equals("03"))
                {
                    
                    String bed_type = null;
                    if (pet_type.equalsIgnoreCase("Dog")||pet_type.equalsIgnoreCase("Cat")||pet_type.equalsIgnoreCase("Rabbit")||pet_type.equalsIgnoreCase("Bird"))
                    {
                        bed_type = "Cage";
                    }
                    else if (pet_type.equalsIgnoreCase("Fish")||pet_type.equalsIgnoreCase("Chameleons"))
                    {
                        bed_type = "Aquarium";
                    }
                    
                    System.out.println("Bed type for your pet : " + bed_type);
                    System.out.println("Price per unit : RM30.00");
                    
                    System.out.print("Please enter the quantity : ");
                    int quantity = scan.nextInt();
                    
                    while (quantity <= 0)
                    {
                            System.out.println("INVALID INPUT!!! Please Enter The Input Again");
                            System.out.print("Input : ");
                            quantity = scan.nextInt();
                    }
                    
                    System.out.print("Please enter your name : ");
                    String name = scan.next();
                    
                    System.out.print("Please enter your contact : ");
                    String contact = scan.next();
                    
                    ps[counter] = new Beds(name,contact,pet_type,quantity,bed_type);
                        
                    pw1.print("\n---------------------------------------------");
                    pw1.print("\n               Haisha's Pet Shop               ");
                    pw1.print("\n---------------------------------------------" + "\n");
                    pw1.print(ps[counter].toString());
                        
                    System.out.print("\n---------------------------------------------");
                    System.out.print("\n               Haisha's Pet Shop               ");
                    System.out.print("\n---------------------------------------------" + "\n");
                    System.out.println(ps[counter].toString());
                    
                    System.out.println("\n(0)  Exit Program");
                    System.out.println("(00) Back To Main Menu");
                    System.out.print("Input : ");
                    response = scan.next();
                        
                    
                }
                else if (response.equals("04"))
                {
                    
                    String accessories = null;
                    if (pet_type.equalsIgnoreCase("Dog"))
                    {
                        accessories = "Collars & Leashes";
                    }
                    else if (pet_type.equalsIgnoreCase("Cat"))
                    {
                        accessories = "Collars & Bowls";
                    }
                    else if (pet_type.equalsIgnoreCase("Rabbit"))
                    {
                        accessories = "Carrier & Water Bottle";
                    }
                    else if (pet_type.equalsIgnoreCase("Fish"))
                    {
                        accessories = "Filter & Air Pump";
                    }
                    else if (pet_type.equalsIgnoreCase("Bird"))
                    {
                        accessories = "Carrier & Water Bottle";
                    }
                    else if (pet_type.equalsIgnoreCase("Chameleons"))
                    {
                        accessories = "Lighting & Heating";
                    }
                    
                    System.out.println("Accessories for your pet : " + accessories);
                    System.out.println("Price per package : RM20.00");
                    
                    System.out.print("Please enter the quantity : ");
                    int quantity = scan.nextInt();
                    
                    while (quantity <= 0)
                    {
                            System.out.println("INVALID INPUT!!! Please Enter The Input Again");
                            System.out.print("Input : ");
                            quantity = scan.nextInt();
                    }
                    
                    System.out.print("Please enter your name : ");
                    String name = scan.next();
                    
                    System.out.print("Please enter your contact : ");
                    String contact = scan.next();
                    
                    ps[counter] = new Accessories(name,contact,pet_type,quantity,accessories);
                        
                    pw1.print("\n---------------------------------------------");
                    pw1.print("\n               Haisha's Pet Shop               ");
                    pw1.print("\n---------------------------------------------" + "\n");
                    pw1.print(ps[counter].toString());
                        
                    System.out.print("\n---------------------------------------------");
                    System.out.print("\n               Haisha's Pet Shop               ");
                    System.out.print("\n---------------------------------------------" + "\n");
                    System.out.println(ps[counter].toString());
                    
                    System.out.println("\n(0)  Exit Program");
                    System.out.println("(00) Back To Main Menu");
                    System.out.print("Input : ");
                    response = scan.next();
                    
                    
                    
                }
                
                counter++;
                
                while (!(response.equalsIgnoreCase("0")||response.equalsIgnoreCase("00")))
                {
                    System.out.println("INVALID INPUT!!! Please Enter The Input Again");
                    System.out.print("Input : ");
                    response = scan.next();
                }
                
            }
            
            pw1.close();
            System.out.println("\nThank You!!! :)");
            
        }
        catch(FileNotFoundException fnfe)
        {
            System.out.println("File not found");   
        }
        catch (IOException ioe)   
        {
            System.out.println(ioe.getMessage()); 
        }
        
        catch (Exception e)   
        {
            System.out.println(e.getMessage());
        }
        
    }
}
