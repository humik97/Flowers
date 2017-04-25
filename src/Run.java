import Accessories.Accessories;
import Accessories.Paper;
import Flower.Chamomile;
import Flower.Flower;
import Flower.Rose;
import Flower.Tulip;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static Accessories.Accessories.Bouquet;
import static Accessories.Accessories.Fresh;
import static Accessories.Accessories.Range;

/**
 * Created by java on 4/25/2017.
 */
public class Run {
        static
        {
            new DOMConfigurator().doConfigure("log4j.xml", org.apache.log4j.LogManager.getLoggerRepository());
        }
        static Logger logger = Logger.getLogger(Run.class);
        public  static void main(String[]args) throws ParseException
        {
            Flower rose = new Rose("Rose",5, "08.03.2017");
            Flower tulip = new Tulip("Tulip",6, "07.03.2017");
            Flower chamomile = new Chamomile("Chamomile",8, "06.03.2017");
            List<Flower> flowers=new ArrayList<>();
            List <Accessories> acc = new ArrayList<>();
            acc.add(new Paper());
            flowers.addAll(Arrays.asList(rose, chamomile, tulip));
            Fresh(flowers);
            Range(flowers);
            Bouquet(flowers,acc);
        }
    }

