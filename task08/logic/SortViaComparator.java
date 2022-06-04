package by.epam.task08.logic;

import by.epam.task08.entity.CustomerAggregeting;

import java.util.Comparator;

public class SortViaComparator implements Comparator<CustomerAggregeting>{
    @Override
    public int compare(CustomerAggregeting c1, CustomerAggregeting c2) {
        return c1.getCustomData().compareTo(c2.getCustomData());
    }
}
