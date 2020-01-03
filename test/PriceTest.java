import org.junit.Test;

import static org.junit.Assert.*;

public class PriceTest {

    @Test
    public void getCostNewReleaseFalse() { assertEquals(1, new NewRelease().getCost(1));

    }

    @Test
    public void getCostNewReleaseTrue() { assertEquals(3, new NewRelease().getCost(1));
    }

    @Test
    public void getCostChildren() { assertEquals(1, new Children().getCost(1));




    }
}