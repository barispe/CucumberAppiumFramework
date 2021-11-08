package Method;

import org.openqa.selenium.By;
import elementsSample.*;
import org.testng.Assert;
import java.net.MalformedURLException;


public class sampleMethods extends configAbstract {


    private Object MobileElement;

    public void initializeTest() throws MalformedURLException {
        initializeTest2();
    }


    public void clickWater() throws InterruptedException {
        untilElementAppear(elementsSample.waterCat);
        click(elementsSample.waterCat);
    }

    public void backToButton() throws InterruptedException {
        driver.navigate().back();
    }

    public void goToBasket() throws InterruptedException {
        untilElementAppear(elementsSample.actionCart);
        click(elementsSample.actionCart);
    }
    public void checkPrice() throws InterruptedException {
        untilElementAppear(elementsSample.addCart);
    }
    public void removeProducts() throws InterruptedException {
        while (isElementExist(elementsSample.removeItem, 3)) {
            click(elementsSample.removeItem);
        }
    }

    public void basketConfirmedEmpty() {
        boolean durum = false;
        if (!isElementExist(elementsSample.removeItem, 4)) {
            durum = true;
            Assert.assertTrue(durum);
        } else {
            Assert.assertTrue(durum);
        }
    }



    public void SkipIntroPages() throws InterruptedException {
        untilElementAppear(elementsSample.skipBtn);
        click(elementsSample.skipBtn);
    }

    public void clickMoreCat() throws InterruptedException {
        untilElementAppear(elementsSample.moreCategory);
        click(elementsSample.moreCategory);
    }

    public static boolean homePageExist() throws InterruptedException {

        if (isElementExist(elementsSample.homePage)) {
            return true;
        } else {
            return false;
        }

    }

    private static boolean isElementExist(By homePage) {
        return false;
    }


    public void clickFirstWater() throws InterruptedException {

        click(elementsSample.firstWater);
    }

    public void navigateBabyCare() throws InterruptedException {
        untilElementAppear(elementsSample.babyCare);
        click(elementsSample.babyCare);
    }

    public void productBasket() throws InterruptedException {
        untilElementAppear(elementsSample.addCart);
        click(elementsSample.addCart);
    }

    public void clearCart() throws InterruptedException {
        while (isElementExist(elementsSample.removeItem, 3)) {
            click(elementsSample.removeItem);
        }
    }

    public void thirdProduct() throws InterruptedException {
        click(elementsSample.babyThird);

    }
}
