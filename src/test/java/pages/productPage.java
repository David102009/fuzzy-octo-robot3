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
	
	@FindBy(xpath="//div[@class='woocommerce-tabs wc-tabs-wrapper']/ul/li[1]")
	public WebElement clickOnDescriptionTab;
	
	
	@FindBy(xpath="//*[@id='tab-description']")
	public WebElement descriptionMessage;
	
	@FindBy(xpath="//li[starts-with(@class,'reviews_tab')]")
	public WebElement reviewTab;
	
	@FindBy(xpath="//div[@id='comments']")
	public WebElement commentsInReviewTab;
	
	@FindBy(xpath="//*[@class='button wc-forward']")
	public WebElement viewBasket;
	
	@FindBy(xpath="//*[@action='https://practice.automationtesting.in/basket/']")
	public WebElement navigateToBasket;
}
