package testcases;

import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import utilities.CommonMethods;


public class HomePageTest extends CommonMethods {

	
	@Test
	public void homePageHasThreeSliders() {
		cP.selectMainNavOption("shop");
		CommonMethods.daveWait(2);
		CommonMethods.click(sP.homeButton);
		Assert.assertTrue(hP.threeSliders.size() == 3);
	}
	
	@Test
	public void homePageHasThreeArrivals() {
		cP.selectMainNavOption("shop");
		CommonMethods.click(sP.homeButton);
		Assert.assertTrue(hP.ThreeArrivals.size() == 3);

}
	@Ignore
	@Test
	public void  homePageImagesInArrivalsShouldNavigate() {
		cP.selectMainNavOption("shop");
		CommonMethods.click(sP.homeButton);
		CommonMethods.scrollToElement(hP.ThreeArrivalsPages.get(0));
		CommonMethods.click(hP.ThreeArrivalsPages.get(0));
		CommonMethods.daveWait(4);
		pP.addToBasketButton.click();
		Assert.assertTrue(pP.commerceMessage.getText().contains("has been added to your basket"));
		CommonMethods.click(sP.homeButton);
		

	}
	@Ignore
	@Test
	public void homePageArrivalsImagesDescription() {
		cP.selectMainNavOption("shop");
		CommonMethods.click(sP.homeButton);
		CommonMethods.scrollToElement(hP.ThreeArrivalsPages.get(0));
		CommonMethods.click(hP.ThreeArrivalsPages.get(0));
		CommonMethods.daveWait(4);
		pP.addToBasketButton.click();
		Assert.assertTrue(pP.commerceMessage.getText().contains("has been added to your basket"));
		CommonMethods.click(sP.homeButton);

	}
	
	

}