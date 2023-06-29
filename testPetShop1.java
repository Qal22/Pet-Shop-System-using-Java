
/**
 * Write a description of class testPetShop1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.io.*;
import java.util.*;
import java.text.*;
public class testPetShop1
{
    public static void main(String[] args)throws Exception
    {
        Scanner scan = new Scanner(System.in);
        scan.useDelimiter("\n");
        
        FileReader fr1 = new FileReader("customerdata.txt");
        BufferedReader buffR1 = new BufferedReader(fr1);
      
        int size=0;
        int counter1=0;
        
        String indata1=null;
        /*
        while((indata1 = buffR1.readLine())!=null)
        {
            size++;
        }
        */
        PetShop1[] ps = new PetShop1[100];
        
        try
        {
            String indata = null;
            
            while ((indata = buffR1.readLine())!=null)
            {
                
                //System.out.println(indata);
                StringTokenizer st = new StringTokenizer(indata,";");
                
                String name = st.nextToken();
                
                String pet_type = st.nextToken();
                
                String item_bought = st.nextToken();
                
                String Quantity = st.nextToken();
                int quantity = Integer.parseInt(Quantity);
                
                String Totalprice = st.nextToken();
                double totalprice = Double.parseDouble(Totalprice);
                
                ps[counter1] = new PetShop1(name,pet_type,item_bought,quantity,totalprice);
                
                counter1++;
            }
            
            buffR1.close();
            String response = "00";
            
            FileWriter fw1 = new FileWriter("NEWcustomerdata.txt");
            BufferedWriter buffW1 = new BufferedWriter(fw1);
            PrintWriter pw1 = new PrintWriter(buffW1);
            
            for (int i=0 ; i<counter1 ; i++)
            {
                pw1.println(ps[i].getname() + ";" + ps[i].getpet_type() + ";" + ps[i].getitem_bought() + ";" + ps[i].getquantity() + ";" + ps[i].gettotalprice());
            }
            
            while(response.equals("00"))
            {
                System.out.print("\n---------------------------------------------");
                System.out.print("\n               Shaf's Pet Shop               ");
                System.out.print("\n---------------------------------------------" + "\n");
                
                System.out.println("\nSelect based on number that you want to buy");
                System.out.println("(01)  Pet");
                System.out.println("(02)  Food Pack");
                System.out.println("(03)  Shelves");
                System.out.println("(04)  Accessories");
                System.out.println("(0)   Exit Program");
                System.out.print("Input : ");
                response = scan.next();
                
                if (response.equals("01"))
                {
                    System.out.print("\n---------------------------------------------");
                    System.out.print("\n               Shaf's Pet Shop               ");
                    System.out.print("\n---------------------------------------------" + "\n\n");
                    
                    System.out.println("Dog");
                    System.out.println("Cat");
                    System.out.println("Rabbit");
                    System.out.println("Fish");
                    System.out.println("Bird");
                    System.out.println("Chameleons");
                
                    System.out.print("\nPlease enter your pet type : ");
                    String pet_type = scan.next();
                    System.out.println(" ");
                    
                    if (pet_type.equalsIgnoreCase("Dog"))
                    {
                        System.out.println("Types That Available");
                        System.out.println("Samoyed         RM860.00");
                        System.out.println("Siberian Husky  RM990.00");
                        System.out.println("Beagle          RM750.00");
                        System.out.print("Please enter the pet trait name : ");
                        String item_bought = scan.next();
                    
                        System.out.print("Quantity : ");
                        int quantity = scan.nextInt();
                        
                        System.out.print("Please enter your name : ");
                        String name = scan.next();
                    
                        ps[counter1] = new PetShop1(response,name,pet_type,item_bought,quantity);
                        pw1.println(name + ";" + pet_type + ";" + item_bought + ";" + quantity + ";" + ps[counter1].calctotalprice());
                    }
                    else if (pet_type.equalsIgnoreCase("Cat"))
                    {
                        System.out.println("Types That Available");
                        System.out.println("British Shorthair   RM630.00");
                        System.out.println("Balinese Cat        RM550.00");
                        System.out.println("Persian Cat         RM560.00");
                        System.out.print("Please enter the pet trait name : ");
                        String item_bought = scan.next();
                    
                        System.out.print("Quantity : ");
                        int quantity = scan.nextInt();
                        
                        System.out.print("Please enter your name : ");
                        String name = scan.next();
                    
                        ps[counter1] = new PetShop1(response,name,pet_type,item_bought,quantity);
                        pw1.println(name + ";" + pet_type + ";" + item_bought + ";" + quantity + ";" + ps[counter1].calctotalprice());
                    }
                    else if (pet_type.equalsIgnoreCase("Rabbit"))
                    {
                        System.out.println("Types That Available");
                        System.out.println("Cashmere Lop         RM100.00");
                        System.out.println("Angora Teddy Bears   RM 99.00");
                        System.out.println("Jersey Wooly         RM110.00");
                        System.out.print("Please enter the pet trait name : ");
                        String item_bought = scan.next();
                    
                        System.out.print("Quantity : ");
                        int quantity = scan.nextInt();
                        
                        System.out.print("Please enter your name : ");
                        String name = scan.next();
                    
                        ps[counter1] = new PetShop1(response,name,pet_type,item_bought,quantity);
                        pw1.println(name + ";" + pet_type + ";" + item_bought + ";" + quantity + ";" + ps[counter1].calctotalprice());
                    }
                    else if (pet_type.equalsIgnoreCase("Fish"))
                    {
                        System.out.println("Types That Available");
                        System.out.println("Guppy          RM44.00");
                        System.out.println("Neon Tetra     RM68.00");
                        System.out.println("Gold Fish      RM89.00");
                        System.out.print("Please enter the pet trait name : ");
                        String item_bought = scan.next();
                    
                        System.out.print("Quantity : ");
                        int quantity = scan.nextInt();
                        
                        System.out.print("Please enter your name : ");
                        String name = scan.next();
                    
                        ps[counter1] = new PetShop1(response,name,pet_type,item_bought,quantity);
                        pw1.println(name + ";" + pet_type + ";" + item_bought + ";" + quantity + ";" + ps[counter1].calctotalprice());
                    }
                    else if (pet_type.equalsIgnoreCase("Bird"))
                    {
                        System.out.println("Types That Available");
                        System.out.println("Owl         RM240.00");
                        System.out.println("Parrot      RM160.00");
                        System.out.println("Kingfisher  RM99.90");
                        System.out.print("Please enter the pet trait name : ");
                        String item_bought = scan.next();
                    
                        System.out.print("Quantity : ");
                        int quantity = scan.nextInt();
                        
                        System.out.print("Please enter your name : ");
                        String name = scan.next();
                    
                        ps[counter1] = new PetShop1(response,name,pet_type,item_bought,quantity);
                        pw1.println(name + ";" + pet_type + ";" + item_bought + ";" + quantity + ";" + ps[counter1].calctotalprice());
                    }
                    else if (pet_type.equalsIgnoreCase("Chameleons"))
                    {
                        System.out.println("Types That Available");
                        System.out.println("Furcifer             RM450.00");
                        System.out.println("Fischer's chameleon  RM560.00");
                        System.out.println("Calumma              RM670.00");
                        System.out.print("Please enter the pet trait name : ");
                        String item_bought = scan.next();
                    
                        System.out.print("Quantity : ");
                        int quantity = scan.nextInt();
                        
                        System.out.print("Please enter your name : ");
                        String name = scan.next();
                    
                        ps[counter1] = new PetShop1(response,name,pet_type,item_bought,quantity);
                        pw1.println(name + ";" + pet_type + ";" + item_bought + ";" + quantity + ";" + ps[counter1].calctotalprice());
                    }
                    else 
                    {
                        /*System.out.println("Error!!! Please enter again");
                        System.out.print("Please enter your pet type : ");
                        pet_type = scan.next();*/
                    }
                    
                    
                    System.out.println(ps[counter1].receipt1());
                    System.out.println("(0)  Exit Program");
                    System.out.println("(00) Back To Main Menu");
                    System.out.print("Input : ");
                    response = scan.next();
                    
                    counter1++;
                    size++;
                }
                else if (response.equals("02"))
                {
                    System.out.print("\n---------------------------------------------");
                    System.out.print("\n               Shaf's Pet Shop               ");
                    System.out.print("\n---------------------------------------------" + "\n\n");
                    
                    System.out.println("Dog");
                    System.out.println("Cat");
                    System.out.println("Rabbit");
                    System.out.println("Fish");
                    System.out.println("Bird");
                    System.out.println("Chameleons");
                
                    System.out.print("\nPlease enter your pet type : ");
                    String pet_type = scan.next();
                    
                    System.out.println("\nS - Small Food Pack - RM15.00");
                    System.out.println("B - Big Food Pack   - RM20.00");
                    System.out.print("Please enter the size : ");
                    char sizefood = scan.next().charAt(0);
                    
                    System.out.print("Please enter the quantity : ");
                    int quantity = scan.nextInt();
                    
                    System.out.print("Please enter your name : ");
                    String name = scan.next();
                    
                    String item_bought;
                    if ((sizefood == 'S')||(sizefood == 's'))
                    {
                        item_bought = "Food Pack (Small)";
                        
                        ps[counter1] = new PetShop1(response,name,pet_type,item_bought,quantity);
                        pw1.println(name + ";" + pet_type + ";" + item_bought + ";" + quantity + ";" + ps[counter1].calctotalprice());
                    }
                    else if ((sizefood == 'B')||(sizefood == 'b'))
                    {
                        item_bought = "Food Pack (Big)";
                        
                        ps[counter1] = new PetShop1(response,name,pet_type,item_bought,quantity);
                        pw1.println(name + ";" + pet_type + ";" + item_bought + ";" + quantity + ";" + ps[counter1].calctotalprice());
                    }
                
                    System.out.println(ps[counter1].receipt2());
                    System.out.println("(0)  Exit Program");
                    System.out.println("(00) Back To Main Menu");
                    System.out.print("Input : ");
                    response = scan.next();
                    
                    counter1++;
                    size++;
                }
                else if (response.equals("03"))
                {
                    System.out.print("\n---------------------------------------------");
                    System.out.print("\n               Shaf's Pet Shop               ");
                    System.out.print("\n---------------------------------------------" + "\n\n");
                    
                    System.out.println("Dog");
                    System.out.println("Cat");
                    System.out.println("Rabbit");
                    System.out.println("Fish");
                    System.out.println("Bird");
                    System.out.println("Chameleons");
                
                    System.out.print("\nPlease enter your pet type : ");
                    String pet_type = scan.next();
                    
                    if (pet_type.equalsIgnoreCase("Dog"))
                    {
                        String item_bought = "Shelves (Cage)";
                        
                        System.out.print("Please enter the quantity : ");
                        int quantity = scan.nextInt();
                        
                        System.out.print("Please enter your name : ");
                        String name = scan.next();
                        
                        ps[counter1] = new PetShop1(response,name,pet_type,item_bought,quantity);
                        pw1.println(name + ";" + pet_type + ";" + item_bought + ";" + quantity + ";" + ps[counter1].calctotalprice());
                    }
                    else if (pet_type.equalsIgnoreCase("Cat"))
                    {
                        String item_bought = "Shelves (Cage)";
                        
                        System.out.print("Please enter the quantity : ");
                        int quantity = scan.nextInt();
                        
                        System.out.print("Please enter your name : ");
                        String name = scan.next();
                        
                        ps[counter1] = new PetShop1(response,name,pet_type,item_bought,quantity);
                        pw1.println(name + ";" + pet_type + ";" + item_bought + ";" + quantity + ";" + ps[counter1].calctotalprice());
                    }
                    else if (pet_type.equalsIgnoreCase("Rabbit"))
                    {
                        String item_bought = "Shelves (Cage)";
                        
                        System.out.print("Please enter the quantity : ");
                        int quantity = scan.nextInt();
                        
                        System.out.print("Please enter your name : ");
                        String name = scan.next();
                        
                        ps[counter1] = new PetShop1(response,name,pet_type,item_bought,quantity);
                        pw1.println(name + ";" + pet_type + ";" + item_bought + ";" + quantity + ";" + ps[counter1].calctotalprice());
                    }
                    else if (pet_type.equalsIgnoreCase("Fish"))
                    {
                        String item_bought = "Shelves (Aquarium)";
                        
                        System.out.print("Please enter the quantity : ");
                        int quantity = scan.nextInt();
                        
                        System.out.print("Please enter your name : ");
                        String name = scan.next();
                        
                        ps[counter1] = new PetShop1(response,name,pet_type,item_bought,quantity);
                        pw1.println(name + ";" + pet_type + ";" + item_bought + ";" + quantity + ";" + ps[counter1].calctotalprice());
                    }
                    else if (pet_type.equalsIgnoreCase("Bird"))
                    {
                        String item_bought = "Shelves (Cage)";
                        
                        System.out.print("Please enter the quantity : ");
                        int quantity = scan.nextInt();
                        
                        System.out.print("Please enter your name : ");
                        String name = scan.next();
                        
                        ps[counter1] = new PetShop1(response,name,pet_type,item_bought,quantity);
                        pw1.println(name + ";" + pet_type + ";" + item_bought + ";" + quantity + ";" + ps[counter1].calctotalprice());
                    }
                    else if (pet_type.equalsIgnoreCase("Chameleons"))
                    {
                        String item_bought = "Shelves (Aquarium)";
                        
                        System.out.print("Please enter the quantity : ");
                        int quantity = scan.nextInt();
                        
                        System.out.print("Please enter your name : ");
                        String name = scan.next();
                        
                        ps[counter1] = new PetShop1(response,name,pet_type,item_bought,quantity);
                        pw1.println(name + ";" + pet_type + ";" + item_bought + ";" + quantity + ";" + ps[counter1].calctotalprice());
                    }
                    else 
                    {
                        System.out.println("Error!!! Please enter again");
                        System.out.print("Please enter your pet type : ");
                        pet_type = scan.next();
                    }
                    
                    System.out.println(ps[counter1].receipt3());
                    System.out.println("(0)  Exit Program");
                    System.out.println("(00) Back To Main Menu");
                    System.out.print("Input : ");
                    response = scan.next();
                    
                    counter1++;
                    size++;
                }
                else if (response.equals("04"))
                {
                    System.out.print("\n---------------------------------------------");
                    System.out.print("\n               Shaf's Pet Shop               ");
                    System.out.print("\n---------------------------------------------" + "\n\n");
                    
                    System.out.println("Dog");
                    System.out.println("Cat");
                    System.out.println("Rabbit");
                    System.out.println("Fish");
                    System.out.println("Bird");
                    System.out.println("Chameleons");
                
                    System.out.print("\nPlease enter your pet type : ");
                    String pet_type = scan.next();
                    
                    if (pet_type.equalsIgnoreCase("Dog"))
                    {
                        String item_bought = "Accessories (Collars & Leashes)";
                        
                        System.out.print("Please enter the quantity : ");
                        int quantity = scan.nextInt();
                        
                        System.out.print("Please enter your name : ");
                        String name = scan.next();
                        
                        ps[counter1] = new PetShop1(response,name,pet_type,item_bought,quantity);
                        pw1.println(name + ";" + pet_type + ";" + item_bought + ";" + quantity + ";" + ps[counter1].calctotalprice());
                    }
                    else if (pet_type.equalsIgnoreCase("Cat"))
                    {
                        String item_bought = "Accessories (Collars & Bowls)";
                        
                        System.out.print("Please enter the quantity : ");
                        int quantity = scan.nextInt();
                        
                        System.out.print("Please enter your name : ");
                        String name = scan.next();
                        
                        ps[counter1] = new PetShop1(response,name,pet_type,item_bought,quantity);
                        pw1.println(name + ";" + pet_type + ";" + item_bought + ";" + quantity + ";" + ps[counter1].calctotalprice());
                    }
                    else if (pet_type.equalsIgnoreCase("Rabbit"))
                    {
                        String item_bought = "Accessories (Carrier & Water Bottle)";
                        
                        System.out.print("Please enter the quantity : ");
                        int quantity = scan.nextInt();
                        
                        System.out.print("Please enter your name : ");
                        String name = scan.next();
                        
                        ps[counter1] = new PetShop1(response,name,pet_type,item_bought,quantity);
                        pw1.println(name + ";" + pet_type + ";" + item_bought + ";" + quantity + ";" + ps[counter1].calctotalprice());
                    }
                    else if (pet_type.equalsIgnoreCase("Fish"))
                    {
                        String item_bought = "Accessories (Filter & Air Pump)";
                        
                        System.out.print("Please enter the quantity : ");
                        int quantity = scan.nextInt();
                        
                        System.out.print("Please enter your name : ");
                        String name = scan.next();
                        
                        ps[counter1] = new PetShop1(response,name,pet_type,item_bought,quantity);
                        pw1.println(name + ";" + pet_type + ";" + item_bought + ";" + quantity + ";" + ps[counter1].calctotalprice());
                    }
                    else if (pet_type.equalsIgnoreCase("Bird"))
                    {
                        String item_bought = "Accessories (Carrier & Water Bottle)";
                        
                        System.out.print("Please enter the quantity : ");
                        int quantity = scan.nextInt();
                        
                        System.out.print("Please enter your name : ");
                        String name = scan.next();
                        
                        ps[counter1] = new PetShop1(response,name,pet_type,item_bought,quantity);
                        pw1.println(name + ";" + pet_type + ";" + item_bought + ";" + quantity + ";" + ps[counter1].calctotalprice());
                    }
                    else if (pet_type.equalsIgnoreCase("Chameleons"))
                    {
                        String item_bought = "Accessories (Lighting & Heating)";
                        
                        System.out.print("Please enter the quantity : ");
                        int quantity = scan.nextInt();
                        
                        System.out.print("Please enter your name : ");
                        String name = scan.next();
                        
                        ps[counter1] = new PetShop1(response,name,pet_type,item_bought,quantity);
                        pw1.println(name + ";" + pet_type + ";" + item_bought + ";" + quantity + ";" + ps[counter1].calctotalprice());
                    }
                    else 
                    {
                        System.out.println("Error!!! Please enter again");
                        System.out.print("Please enter your pet type : ");
                        pet_type = scan.next();
                    }
                    
                    System.out.println(ps[counter1].receipt4());
                    System.out.println("(0)  Exit Program");
                    System.out.println("(00) Back To Main Menu");
                    System.out.print("Input : ");
                    response = scan.next();
                    
                    counter1++;
                    size++;
                }
                else
                {
                    System.out.println("Error!!! Please enter again");
                    System.out.print("Input : ");
                    response = scan.next();
                }
            }
            pw1.close();
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
