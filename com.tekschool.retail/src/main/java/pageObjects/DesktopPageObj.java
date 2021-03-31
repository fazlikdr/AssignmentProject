package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class DesktopPageObj extends Base {

	public DesktopPageObj() {
		// we will use initElements method of PageFactory class
		
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//body/div[1]/nav[1]/div[2]/ul[1]/li[1]/a[1]")
	private WebElement desktopTab;

	@FindBy(xpath = "//a[contains(text(),'Show All Desktops')]")
	private WebElement showAllDesktop;

	@FindBy(xpath = "//a[contains(text(),'HP LP3065')]")
	private WebElement hpLP3065;

	@FindBy(xpath = "//button[@id='button-cart']")
	private WebElement addToCartBtn;

	@FindBy(xpath = "//body/div[@id='product-product']/div[1]")
	private WebElement messageDisplay;

	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[2]/div[1]/div[2]/div[1]/h4[1]/a[1]")
	private WebElement addToCart;

	@FindBy(xpath = "//select[@id='input-option226']//option[contains(text(),'Red')]")
	private WebElement selectColor;

	@FindBy(xpath = "//input[@id='input-quantity']")
	private WebElement selectQuantity1;

	@FindBy(xpath = "//button[@id='button-cart']")
	private WebElement addToCartButton;

	@FindBy(xpath = "//body/div[@id='product-product']/div[1]")
	private WebElement messageDisplaySuccess;

	// Fourth Scenario
	@FindBy(xpath = "//a[contains(text(),'Canon EOS 5D')]")
	private WebElement clickCanon;

	@FindBy(xpath = "//a[contains(text(),'Write a review')]")
	private WebElement clickReviewLink;

	@FindBy(xpath = "//input[@id='input-name']")
	private WebElement enterName;

	@FindBy(css = "#input-review")
	private WebElement enterReview;

	@FindBy(xpath = "//body/div[@id='product-product']/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[4]/div[1]/input[3]")
	private WebElement clickBadOrGood;

	@FindBy(css = "#button-review")
	private WebElement clickContinue;

	@FindBy(xpath = "//body/div[@id='product-product']/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[2]")
	private WebElement reviewMessage;

	// We start writing public methods to access each element with respected actions
	// to them.

	public void clickOnDesktop() {
		desktopTab.click();
	}

	public void clickOnShowAllDesktop() {
		showAllDesktop.click();
	}

	public void clickonHp() {
		hpLP3065.click();
	}

	public void addToCartBtn() {
		addToCartBtn.click();
	}

	public boolean messageDisplayed() {
		boolean messageDisplayed = messageDisplay.isDisplayed();
		return messageDisplayed;
	}

	// Third Scenario
	public void addToCart() {
		addToCart.click();
	}

	public void selectColor() {
		selectColor.click();
	}

	public void selectQuantity1() {
		selectQuantity1.click();
	}

	public void addToCartButton() {
		addToCartButton.click();
	}

	public boolean messageDisplaySuccess() {
		boolean messageDisplayed = messageDisplaySuccess.isDisplayed();
		return messageDisplayed;
	}

	public void clickCanon() {
		clickCanon.click();
	}

	public void clickReviewLink() {
		clickReviewLink.click();
	}

	public void enterName(String name) {
		enterName.sendKeys(name);
	}

	public void enterReview(String review) {
		enterReview.sendKeys(review);
	}

	public void clickBadorGood() {
		clickBadOrGood.click();	
	}

	public void clicContinue() {
		clickContinue.click();
	}

	public boolean reviewMessage() {
		boolean reviewMessageDisplayed = reviewMessage.isDisplayed();
		return reviewMessageDisplayed;
	}
}
