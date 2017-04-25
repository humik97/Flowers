package Flower;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by java on 4/25/2017.
 */
public class Flower implements Comparable<Flower>
{
    private String name;
    private double length;
    private Date date;
    public int price;
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    private final DateFormat format = new SimpleDateFormat("dd.MM.yyyy");

    public Flower(String name, double length, String date) throws ParseException
    {
        this.name=name;
        this.length=length;
        this.date=format.parse(date);
    }

    public Date getDate()
    {
        return date;
    }

    public void setLength(double length)
    {
        this.length = length;
    }


    public void setPrice(int price)
    {
        this.price = price;
    }

    public void setDate(Date date)
    {
        this.date = date;
    }

    public double getLength()
    {
        return length;
    }
    public int getPrice()
    {
        return price;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flower flower = (Flower) o;

        if (Double.compare(flower.length, length) != 0) return false;
        if (price != flower.price) return false;
        if (date != null ? !date.equals(flower.date) : flower.date != null) return false;
        return format != null ? format.equals(flower.format) : flower.format == null;
    }

    @Override
    public int hashCode()
    {
        int result;
        long temp;
        temp = Double.doubleToLongBits(length);
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + price;
        result = 31 * result + (format != null ? format.hashCode() : 0);
        return result;
    }

    @Override
    public int compareTo(Flower o)
    {
        return getDate().compareTo(o.getDate());
    }

    @Override
    public String toString()
    {
        return "Flower{" +name+": "+
                "length=" + length +
                ", date=" + date +
                ", price=" + price +
                '}';
    }
}
