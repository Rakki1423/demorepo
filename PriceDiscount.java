import java.util.*;
class PriceDiscount {
    public static void main(String[] args) {
        int[] price= {100, 200, 300, 400};
        
        for(int i=0;i<price.length;i++)
        {
            if(price[i]>250)
            {
                int discount=price[i]*10/100;
                price[i]-=discount;
            }
        }
        for(int i: price)
        {
             System.out.println(i);
        }

    }
}
