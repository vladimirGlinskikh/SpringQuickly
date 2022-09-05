package kz.zhelezyaka.springquickly.addingBeansToTheSpringContext;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {ProjectConfig.class})
class AppTests {

    @Autowired
    private ApplicationContext context;

    @Test
    void testYashaIsInSpringContext() {
        Parrot parrot = context.getBean(Parrot.class);
        assertEquals("Yasha", parrot.getName());
    }

    @Test
    void testHelloIsInTheSpringContext() {
        String s = context.getBean(String.class);
        assertEquals("Hello Bean", s);
    }

    @Test
    void test7IsInTheSpringContext() {
        Integer integer = context.getBean(Integer.class);
        assertEquals(7, integer);
    }

    @Test
    void testUserWasAdded() {
        User user = context.getBean(User.class);
        assertNotNull(user.getAge());
        assertNull(user.getName());
    }

    @Test
    void testUserWasAddedWithName() {
        User user = context.getBean(User.class);
        assertNotNull(user);
        assertEquals("Vladimir", user.getName());
    }
}