package Accessories;

import Flower.Flower;
import org.apache.log4j.xml.DOMConfigurator;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by java on 4/25/2017.
 */
public class Accessories {
    static
    {
        new DOMConfigurator().doConfigure("log4j.xml", org.apache.log4j.LogManager.getLoggerRepository());
    }

    static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(Accessories.class);

    public int tprice;

    public Accessories() {}

    public int getTprice()
    {
        return tprice;
    }

    public void setPrice(int price)
    {
        this.tprice = price;
    }

    public static void Range(List<Flower> flowers)
    {
        Collection<Flower> range =flowers
                .stream()
                .filter((p)->p.getLength()>=6&&p.getLength()<=8).collect(Collectors.toList());
        logger.info("flowers,which have length (6-8) "+range);
    }

    public static void Fresh(List<Flower> flowers)
    {
        Collection<Flower> fresh = flowers
                .stream()
                .sorted((o1, o2) -> o1.getDate().compareTo(o2.getDate())).collect(Collectors.toList());
        logger.info("Flowers grown up in : "+fresh);
    }

    public static void Bouquet(List<Flower>  flowers,List<Accessories> acc)
    {
        int fprice= flowers
                .stream()
                .reduce(0, (sum, p) -> sum =sum+ p.getPrice(), (sum1, sum2) -> sum1 + sum2);
        int totalprice = fprice+acc.get(0).getTprice();
        logger.info ("total cost of the bouquet: "+totalprice);
    }

    @Override
    public String toString()
    {
        return "Accessories{" +
                "price=" + tprice +
                '}';
    }
}

