package NewsLetters;

import Member.Member;
import Newsletters.Newsletter;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ObserverTest {

    private Newsletter newsletter;
    private Member member;

    @BeforeEach
    void setUp(){
        newsletter = new Newsletter();
        member = new Member("David", "david@gmail.com", "Tralee");

        newsletter.registerObserver(member);
    }

    @org.junit.jupiter.api.Test
    void testRegisterObserver() {
        assertTrue(newsletter.getObservers().contains(member));
    }

    @Test
    void testRemoveObserver() {
        newsletter.removeObserver(member);
        assertFalse(newsletter.getObservers().contains(member));
    }

    @Test
    void testSetNews(){
        newsletter.setNews("HelloWorld");
    }
}