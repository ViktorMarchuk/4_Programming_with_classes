package by.epam.task05.entity;

import java.util.Objects;

public class Count{
    private int min;
    private int max;
    private int current;

    public Count() {
        this.min = 0;
        this.max = 12;
        this.current = 2;
    }

    public Count(int min, int max, int current) {
        this.min = min;
        this.max = max;
        this.current = current;

        if(max < min) {
            int temp = max;
            max = min;
            min = temp;
        }
        if(current < min) {
            current = min;
            if(current > max)
                current = max;
        }
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getCurrent() {
        return current;
    }

    public void setCurrent(int current) {
        this.current = current;

    }

    @Override
    public int hashCode() {
        return Objects.hash(current, max, min);
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if(obj == null)
            return false;
        if(getClass() != obj.getClass())
            return false;
        Count other = (Count) obj;
        return current == other.current && max == other.max && min == other.min;
    }

    @Override
    public String toString() {
        return "Count [min=" + min + ", max=" + max + ", current=" + current + "]";
    }
}
