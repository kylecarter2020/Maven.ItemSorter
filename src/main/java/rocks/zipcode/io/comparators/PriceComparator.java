package rocks.zipcode.io.comparators;

import rocks.zipcode.io.Item;

import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class PriceComparator implements Comparator<Item> {
    public int compare(Item o1, Item o2) {
        double result = o1.getPrice()-o2.getPrice();
        int resultToReturn = 0;

        if(result < 0)
        {
            resultToReturn = -1;
        }
        else if(result > 0)
        {
            resultToReturn = 1;
        }
        else
        {
            resultToReturn = 0;
        }
        return resultToReturn;
    }
}
