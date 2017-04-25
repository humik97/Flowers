package Flower;

import java.text.ParseException;

/**
 * Created by java on 4/25/2017.
 */
public class Tulip extends Flower
{
    public Tulip(String name,double length, String date) throws ParseException
    {
        super(name,length, date);
        price =300;
    }
}
