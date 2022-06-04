package by.epam.task02.entity;

import java.util.Objects;

public class Test02{
    private int x;
    private int y;

    public Test02() {

    }

    public Test02(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getA() {
        return x;
    }

    public void setA() {
        this.x = x;
    }

    public int getB() {
        return y;
    }

    public void setB() {
        this.y = y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if(obj == null)
            return false;
        if(getClass() != obj.getClass())
            return false;
        Test02 other = (Test02) obj;
        return x == other.x && y == other.y;
    }

    @Override
    public String toString() {
        return "Test02 [x=" + x + ", y=" + y + "]";
    }
}
