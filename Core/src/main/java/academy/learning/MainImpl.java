package academy.learning;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainImpl
{
    private static Logger log = LoggerFactory.getLogger(MainImpl.class);

    private final static String CONFIG_LOCATION = "beansFile.xml";

    public static void main(String[] args)
    {
        // Create Context (Container)
        // this is also interface                   // this is class
        ConfigurableApplicationContext context =  new ClassPathXmlApplicationContext(CONFIG_LOCATION);

        NumberGenerator numGen = context.getBean("numberGeneratorBean",NumberGenerator.class);


        int numberGet = numGen.nextNumber();

       // log.info("The Number is {}",noGet);

        log.debug("Number is {}",numberGet);


        context.close();

    }
}
