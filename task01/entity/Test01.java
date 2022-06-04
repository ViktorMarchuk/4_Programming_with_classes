package by.epam.task01.entity;

import java.util.Objects;

public class Test01{
    private int a;
    private int b;

    public Test01() {

    }

    public Test01(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if(obj == null)
            return false;
        if(getClass() != obj.getClass())
            return false;
        Test01 other = (Test01) obj;
        return a == other.a && b == other.b;
    }

    @Override
    public String toString() {
        return "Test01 [a=" + a + ", b=" + b + "]";
    }

}
