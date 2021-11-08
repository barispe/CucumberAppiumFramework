package elementsSample;

import org.openqa.selenium.By;

public class elementsSample {

    public static By emptyCart = By.id("//*[contains(@text,'$0.00')]");
    public static By skipBtn =By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.Button[1]");
    public static By homePage = By.xpath("//*[@contains(@text,'GetirSample')]");
    public static By firstWater = By.xpath("(//*[@resource-id='com.allandroidprojects.getirsample:id/image1'])[1]");
    public static By waterCat = By.xpath("//*[@content-desc='Water']");
    public static By moreCategory =By.xpath("//android.widget.ImageButton[@content-desc=\"Open navigation drawer\"]");
    public static By babyCare = By.xpath("//*[@resource-id='com.allandroidprojects.getirsample:id/design_menu_item_text' and contains(@text,'Baby Care')]");
    public static By addCart = By.xpath("//*[@resource-id='com.allandroidprojects.getirsample:id/text_action_bottom1' and contains(@text,'ADD TO CART')]");
    public static By actionCart = By.xpath("//*[@resource-id='com.allandroidprojects.getirsample:id/action_cart']");
    public static By removeItem = By.xpath("//*[@resource-id='com.allandroidprojects.getirsample:id/text_action1' and contains(@text,'Remove')]");
    public static By babyThird = By.xpath("(//*[@resource-id='com.allandroidprojects.getirsample:id/image1'])[3]");
    public static By checkPrice = By.xpath("//*[@contains(@text,'1.98')]");

}
