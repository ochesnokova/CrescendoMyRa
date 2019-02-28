package support;

import constants.RandomDate;
import org.testng.annotations.Test;
import org.testng.internal.Constants;

/**
 * Created by ochesnokova on 6/6/17.
 */
public class DateTest {

    @Test
    public void test001() {

        RandomDate.setRandomDate();

        System.out.println(RandomDate.getDay());
        System.out.println(RandomDate.getMonth());
        System.out.println(RandomDate.getYear());


    }

    @Test
    public void test002() {
        System.out.println(constants.Constants.months[5]);

    }
}
