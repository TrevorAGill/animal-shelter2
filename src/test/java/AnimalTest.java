import models.Animal;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

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

    @Test
    public void instantiateNewAnimal() throws Exception {
        Animal newAnimal = createNewAnimal();
        assertTrue(newAnimal instanceof Animal);
    }

    public Animal createNewAnimal(){
        return new Animal("Callie","female","dog","springer spaniel");
    }
}

