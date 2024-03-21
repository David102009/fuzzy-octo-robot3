package testcases;

import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import utilities.BaseClass;
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
//
}
	
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
		pP.navigateToBasket.isDisplayed();
		

	}
	
	@Test
	public void homePageArrivalsImagesDescription() {
		cP.selectMainNavOption("shop");
		CommonMethods.click(sP.homeButton);
		CommonMethods.scrollToElement(hP.ThreeArrivalsPages.get(0));
		CommonMethods.click(hP.ThreeArrivalsPages.get(0));
		CommonMethods.daveWait(4);
		pP.addToBasketButton.click();
		Assert.assertTrue(pP.commerceMessage.getText().contains("has been added to your basket"));
		pP.clickOnDescriptionTab.click();
		Assert.assertTrue(pP.descriptionMessage.isDisplayed());
		
	}
	
	@Test
	public void homePageArrivalsImagesReviews() {
		cP.selectMainNavOption("shop");
		CommonMethods.click(sP.homeButton);
		CommonMethods.scrollToElement(hP.ThreeArrivalsPages.get(0));
		CommonMethods.click(hP.ThreeArrivalsPages.get(0));
		CommonMethods.daveWait(4);
		pP.addToBasketButton.click();
		Assert.assertTrue(pP.commerceMessage.getText().contains("has been added to your basket"));
		pP.reviewTab.click();
		Assert.assertTrue(pP.commentsInReviewTab.isDisplayed());
		
	}
	
	@Test
	public void homeArrivalsAddToBasketItems() {
		cP.selectMainNavOption("shop");
		CommonMethods.click(sP.homeButton);
		CommonMethods.scrollToElement(hP.ThreeArrivalsPages.get(0));
		CommonMethods.click(hP.ThreeArrivalsPages.get(0));
		CommonMethods.daveWait(4);
		pP.addToBasketButton.click();
		Assert.assertTrue(pP.commerceMessage.getText().contains("has been added to your basket"));
		pP.viewBasket.click();
		pP.navigateToBasket.isDisplayed();
		
		
	}
	
	@Test
	public void homeArrivalsAddToBasketWithMoreBooks() {
		
		cP.selectMainNavOption("shop");
		CommonMethods.click(sP.homeButton);
		CommonMethods.scrollToElement(hP.ThreeArrivalsPages.get(0));
		CommonMethods.click(hP.ThreeArrivalsPages.get(0));
		CommonMethods.daveWait(4);
		pP.addToBasketButton.click();
		Assert.assertTrue(pP.commerceMessage.getText().contains(BaseClass.getProperty("cartMessage")));
		pP.viewBasket.click();
		bP.enterCoupon.sendKeys(BaseClass.getProperty("couponCode"));
		bP.applyCoupon.click();
		Assert.assertTrue(bP.discountAmount.getText().contains(BaseClass.getProperty("couponDiscount")));
		
		
		
		
		
		/*
		 * 14) Enter the Coupon code as ‘krishnasakinala’ to get 50rps off on the total.
		15) User can able to apply coupon by entering ‘krishnasakinala’ in the coupon textbox which
 		give 50rps off on the total price
		 */
	}
	
	
	
	
	

}