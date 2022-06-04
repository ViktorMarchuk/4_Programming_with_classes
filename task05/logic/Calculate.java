package by.epam.task05.logic;

import by.epam.task05.entity.Count;

public class Calculate{
    public int inc(int min, int max, int current) {
        current++;
        if(current > max) {
            current = min;
        }
        return current;
    }

    public int dec(int min, int max, int current) {
        current--;
        if(current < min) {
            current = max;
        }
        return current;
    }

    public void inc(Count countDefault) {
        // TODO Auto-generated method stub
    }
}
