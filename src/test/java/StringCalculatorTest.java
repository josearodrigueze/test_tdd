import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author josearodrigueze on 03-05-17.
 */
public class StringCalculatorTest {
    StringCalculator calculator;

    @Before
    public void setUp() throws Exception {
        calculator = new StringCalculator();
    }

    @Test
    public void add_with_empty_string() throws Exception {
        //behavior
        final String numerbs = "";

        //sut
        final Integer result = calculator.add(numerbs);

        //assert
        final int expected = 0;
        assertThat(result, is(expected));
    }

    @Test
    public void add_with_string_comma_separated() throws Exception {
        //behavior
        final String numerbs = "1,2,3,4,5";

        //sut
        final Integer result = calculator.add(numerbs);

        //assert
        final int expected = 15;
        assertThat(result, is(expected));
    }

    @Test
    public void add_with_string_with_enter_separated() throws Exception {
        //behavior
        final String numerbs = "1\n2\n3\n4\n5";

        //sut
        final Integer result = calculator.add(numerbs);

        //assert
        final int expected = 15;
        assertThat(result, is(expected));
    }

    @Test
    public void add_with_string_with_enter_and_comma_separated() throws Exception {
        //behavior
        final String numerbs = "1\n2\n3,4\n5";

        //sut
        final Integer result = calculator.add(numerbs);

        //assert
        final int expected = 15;
        assertThat(result, is(expected));
    }

    @Test
    public void add_with_string_with_invalid_enter_and_comma_separated() throws Exception {
        //behavior
        final String numerbs = "1,\n";

        //sut
        final Integer result = calculator.add(numerbs);

        //assert
        final int expected = 1;
        assertThat(result, is(expected));
    }
}