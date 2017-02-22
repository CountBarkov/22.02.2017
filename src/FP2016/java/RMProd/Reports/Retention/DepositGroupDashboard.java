package RMProd.Reports.Retention;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;
/**
 * Created by Mark
 */
public class DepositGroupDashboard {
    private WebDriver driver;
    private StringBuffer pausa = new StringBuffer();


    @Before
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    @Test
    public void DepositGroupDashboard() throws Exception {
        driver.get("http://stage-registration.23traders.com/reports/deposit_group_dashboard/");
        driver.findElement(By.id("name")).sendKeys("Timur_admin");
        driver.findElement(By.id("UserPassword")).sendKeys("Tg123456");
        driver.findElement(By.className("submit")).click();

        try {
            Thread.sleep(5000);
        } catch (Error e) {
            pausa.append(e.toString());
        }

        //Change Since date
        driver.findElement(By.xpath("//*[@id=\"left-side\"]/form/table/tbody/tr[2]/td[1]/div/input[1]")).clear();
        String date1 = "2015-01-01";
        driver.findElement(By.xpath("//*[@id=\"left-side\"]/form/table/tbody/tr[2]/td[1]/div/input[1]")).sendKeys(date1);

        //Change To date
        driver.findElement(By.xpath("//*[@id=\"left-side\"]/form/table/tbody/tr[2]/td[1]/div/input[2]")).clear();
        String date2 = "2017-02-01";
        driver.findElement(By.xpath("//*[@id=\"left-side\"]/form/table/tbody/tr[2]/td[1]/div/input[2]")).sendKeys(date2);

        //Select Traffic Groups
        driver.findElement(By.xpath("//*[@id=\"left-side\"]/form/table/tbody/tr[2]/td[2]/div/button")).click();
        driver.findElement(By.xpath("//*[@id=\"left-side\"]/form/table/tbody/tr[2]/td[2]/div/ul/li[2]/a/label/input")).click();

        //Select Countries
        driver.findElement(By.xpath("//*[@id=\"left-side\"]/form/table/tbody/tr[2]/td[3]/div/button")).click();
        driver.findElement(By.xpath("//*[@id=\"left-side\"]/form/table/tbody/tr[2]/td[3]/div/ul/li[2]/a/label/input")).click();

        //Select Retention Employee (Reception)
        driver.findElement(By.xpath("//*[@id=\"left-side\"]/form/table/tbody/tr[2]/td[4]/div/button")).click();
        driver.findElement(By.xpath("//*[@id=\"left-side\"]/form/table/tbody/tr[2]/td[4]/div/ul/li[2]/a/label/input")).click();

        //Select Cost
        driver.findElement(By.xpath("//*[@id=\"left-side\"]/form/table/tbody/tr[4]/td[1]/select")).click();
        driver.findElement(By.xpath("//*[@id=\"left-side\"]/form/table/tbody/tr[4]/td[1]/select/option[2]")).click();

        //Select Limit
        driver.findElement(By.xpath("//*[@id=\"left-side\"]/form/table/tbody/tr[4]/td[5]/select")).click();
        driver.findElement(By.xpath("//*[@id=\"left-side\"]/form/table/tbody/tr[4]/td[5]/select/option[8]")).click();

        //Click button
        driver.findElement(By.xpath("//*[@id=\"left-side\"]/form/table/tbody/tr[4]/th/input")).click();

        try {
            Thread.sleep(30000);
        } catch (Error e) {
            pausa.append(e.toString());
        }

        String se = "DepositGroupDashboard:";
        System.out.println(se);
        String s = driver.findElement(By.xpath("//*[@id=\"data-table\"]")).getText();
        System.out.println(s);
/*        String s1 = driver.findElement(By.cssSelector("[table-name='table_new_clients']")).getText();
        System.out.println(s1);
        String s2 = driver.findElement(By.cssSelector("[table-name='table_balances']")).getText();
        System.out.println(s2);
        String s3 = driver.findElement(By.cssSelector("[table-name='table_online_clients']")).getText();
        System.out.println(s3);
        String s4 = driver.findElement(By.cssSelector("[table-name='table_no_comments_four_business_days']")).getText();
        System.out.println(s4);
        String s5 = driver.findElement(By.cssSelector("[table-name='table_last_trades']")).getText();
        System.out.println(s5);
        String s6 = driver.findElement(By.cssSelector("[table-name='table_deposits']")).getText();
        System.out.println(s6);
        String s7 = driver.findElement(By.cssSelector("[table-name='table_withdraw_requests']")).getText();
        System.out.println(s7);
        String s8 = driver.findElement(By.cssSelector("[table-name='table_no_trade_four_days']")).getText();
        System.out.println(s8);
        String sf = "---------------------------------------";
        System.out.println(sf);
*/
        driver.close();
    }
}
