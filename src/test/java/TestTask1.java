import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import com.example.task1.Gender;
import com.example.task1.User;

public class TestTask1 {

    @Test
    public void testBuilder() {
        User user = User.builder("John")
                .age(25)
                .gender(Gender.MALE)
                .weight(70.5)
                .height(175.0)
                .build();

        assertEquals("John", user.getName());
        assertEquals(25, user.getAge());
        assertEquals(Gender.MALE, user.getGender());
        assertEquals(70.5, user.getWeight(), 0.001);
        assertEquals(175.0, user.getHeight(), 0.001);
    }

    @Test
    public void testToString() {
        User user = User.builder("Alice")
                .age(30)
                .gender(Gender.FEMALE)
                .weight(60.0)
                .height(160.0)
                .build();

        String expectedToString = "User(name=Alice, age=30, gender=FEMALE, weight=60.0, height=160.0)";
        assertEquals(expectedToString, user.toString());
    }

    @Test
    public void testBuilderWithNameOnly() {
        User user = User.builder("Bob").build();

        assertEquals("Bob", user.getName());
        assertEquals(0, user.getAge());
        assertNull(user.getGender());
        assertEquals(0.0, user.getWeight(), 0.001);
        assertEquals(0.0, user.getHeight(), 0.001);
    }
}