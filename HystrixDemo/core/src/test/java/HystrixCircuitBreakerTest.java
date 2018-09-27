import commands.FallbackCommand;
import commands.PositiveCommand;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Roman Bubon (bubon_roman@rgs.ru)
 * Created on 9/27/18
 */
public class HystrixCircuitBreakerTest {

    @Test
    public void testHystrixCircuitBreaker(){
        PositiveCommand testCommand = new PositiveCommand("World");
        assertEquals("Hello World", testCommand.execute());


        FallbackCommand fallbackCommand = new FallbackCommand();
        assertEquals("Falling back", fallbackCommand.execute());




    }

}
