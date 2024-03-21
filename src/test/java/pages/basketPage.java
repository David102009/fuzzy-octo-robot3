package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class basketPage {

	public basketPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	@FindBy(xpath="//*[@id='coupon_code']")
	public WebElement enterCoupon;
	
	
	@FindBy(xpath="//*[@name='apply_coupon']")
	public WebElement applyCoupon;
	
	@FindBy(xpath="//*[@data-title='Coupon: krishnasakinala']/span")
	public WebElement discountAmount;
	
}
