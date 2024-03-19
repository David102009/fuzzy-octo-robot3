package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class productPage {

	

	public productPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	
	@FindBy(xpath="//button[@class='single_add_to_cart_button button alt']")
	public WebElement addToBasketButton;
	
	
	@FindBy(xpath="//div[@class='woocommerce-message']")
	public WebElement commerceMessage;
	
	@FindBy(xpath="//*[@class='description_tab active']")
	public WebElement clickOnDescriptionTab;
	
	@FindBy(xpath="//*[@class='posted_in']")
	public WebElement categorySelections;
	
	@FindBy(xpath="//*[@id='tab-description']")
	public WebElement descriptionMessage;
	
	
}
