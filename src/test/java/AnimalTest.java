import org.junit.After;
import org.junit.Before;

import static org.junit.Assert.*;

/**
 * Created by Guest on 8/15/17.
 */
public class AnimalTest {
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }


    public Animal createNewAnimal(){
        return new Animal("mow the lawn", 1);
    }
}

