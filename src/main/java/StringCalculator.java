import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;

/**
 * @author josearodrigueze
 */
public class StringCalculator {

    Integer add(String numerbs) {
        if (StringUtils.isBlank(numerbs)) {
            return 0;
        }

        final String regex = "([\n]|,)";
        final Integer sum = Arrays
            .stream(numerbs.split(regex))
            .map(String::trim)
            .mapToInt(Integer::parseInt)
            .sum();

        return sum;
    }
}
