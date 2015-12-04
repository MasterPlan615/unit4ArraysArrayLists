import java.util.ArrayList;

public class Store
{
    private ArrayList<String> name = new ArrayList<String>();
    private ArrayList<Double> price = new ArrayList<Double>();
    
    public void addSale(String customerName, double amount)
    {
        name.add(customerName);
        price.add(amount);
    }
    public String nameOfBestCustomer()
    {
        int largest = 0;
        for( int i = 0; i < price.size(); i++)
        {
            if(price.get(i) >= price.get(largest))
            {
                largest = i;
            }
        }
        
        return name.get(largest) + " is the best customer!";
    }
}