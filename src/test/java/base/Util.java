package base;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class Util extends Config{
    // write selenium func that can be re-used

    // ============ drop-down
    public void dropdownByXpathUsingValue(String loc, String value) {
        Select se = new Select(driver.findElement(By.xpath(loc)));
        se.selectByValue(value);
    }

}
