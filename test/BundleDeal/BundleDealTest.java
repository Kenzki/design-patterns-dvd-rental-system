package BundleDeal;

import org.junit.Test;

import static org.junit.Assert.*;

public class BundleDealTest {

    @Test
    void testBundleDeal(){
        BundleDeal newRelease = new NewRelease();
        System.out.println(newRelease.getDescription()
        + "£" + newRelease.cost());
    }

}