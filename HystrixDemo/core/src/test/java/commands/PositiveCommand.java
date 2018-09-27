package commands;

import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * @author Roman Bubon (bubon_roman@rgs.ru)
 * Created on 9/27/18
 */


//https://github.com/Netflix/Hystrix/wiki/How-it-Works
public class PositiveCommand extends HystrixCommand<String> {

    private static final Logger logger = LoggerFactory.getLogger(PositiveCommand.class);

    private final String name;

    public PositiveCommand(String name) {
        super(HystrixCommandGroupKey.Factory.asKey("default"));
        this.name = name;
    }

    @Override

    protected String run() {

        logger.info("HelloWorld Command Invoked");

        return "Hello " + name;

    }

}
