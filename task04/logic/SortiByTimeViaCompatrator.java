package by.epam.task04.logic;

import by.epam.task04.entity.Train;

import java.util.Comparator;

public class SortiByTimeViaCompatrator implements Comparator<Train>{
    @Override
    public int compare(Train tr1, Train tr2) {
        int res = tr1.getNameOfDestination().compareTo(tr2.getNameOfDestination());
        if(res == 0) {
            res = tr1.getTimeOfDeparture().compareTo(tr2.getNameOfDestination());
        }
        return res;
    }
}


