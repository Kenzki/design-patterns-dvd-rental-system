import org.junit.Test;

import static org.junit.Assert.*;

public class DVDRateStrategyTest {

    @Test
    public void getRateNewReleaseFalse() { assertEquals(1, new NewReleaseRate().getRate(1));

    }

    @Test
    public void getRateNewReleaseTrue() { assertEquals(3, new NewReleaseRate().getRate(1));
    }

    @Test
    public void getRateChildren() { assertEquals(1, new ChildrenRate().getRate(1));




    }
}