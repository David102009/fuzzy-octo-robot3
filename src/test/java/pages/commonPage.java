package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;
import utilities.CommonMethods;

public class commonPage {

	public commonPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	
	@FindBy(xpath="//*[@id='main-nav']/li")
	public List<WebElement> mainNavMenu;
	
	
	public void selectMainNavOption(String option) {
		for(WebElement eachOption : mainNavMenu) {	
			if(eachOption.getText().equalsIgnoreCase(option)) {
				CommonMethods.click(eachOption);
				break;
			}
		}
	}
	
	
}
