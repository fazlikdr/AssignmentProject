package stepDefinitions;

import core.Base;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.DesktopPageObj;
import utilities.WebDriverUtility;

public class RetailPageDesktopDefinitions extends Base {

	DesktopPageObj desktoppageobj = new DesktopPageObj();

	@When("^User click on Desktops tab$")
	public void user_click_on_Desktops_tab() throws Throwable {
		desktoppageobj.clickOnDesktop();
		WebDriverUtility.wait(3500);
	}

	@When("^User click on Show all desktops$")
	public void user_click_on_Show_all_desktops() throws Throwable {
		desktoppageobj.clickOnShowAllDesktop();
		WebDriverUtility.wait(3500);
	}

	@Then("^User should see all items are present in Desktop page$")
	public void user_should_see_all_items_are_present_in_Desktop_page() throws Throwable {
		WebDriverUtility.wait(3500);
	}

	@When("^User click on ‘HP LP(\\d+)’ item$")
	public void user_click_on_HP_LP_item(int arg1) throws Throwable {
		desktoppageobj.clickonHp();
		WebDriverUtility.wait(3500);
	}

	@When("^User click add to Cart button$")
	public void user_click_add_to_Cart_button() throws Throwable {
		desktoppageobj.addToCartBtn();
		WebDriverUtility.wait(3500);
		WebDriverUtility.screenShot();
	}

	@Then("^User should see a message ‘Success: you have added HP LP (\\d+) to your Shopping cart!’$")
	public void user_should_see_a_message_Success_you_have_added_HP_LP_to_your_Shopping_cart(int arg1)
			throws Throwable {
		desktoppageobj.messageDisplaySuccess();
		WebDriverUtility.wait(3500);
		WebDriverUtility.screenShot();
	}

	// Third Scenario

	@When("^User click ADD TO CART option on ‘Canon EOS (\\d+)D’ item$")
	public void user_click_ADD_TO_CART_option_on_Canon_EOS_D_item(int arg1) throws Throwable {
		desktoppageobj.addToCart();
		WebDriverUtility.wait(3500);
		WebDriverUtility.screenShot();
	}

	@When("^User select color from dropdown ‘Red’$")
	public void user_select_color_from_dropdown_Red() throws Throwable {
		desktoppageobj.selectColor();
		WebDriverUtility.wait(3500);
		WebDriverUtility.screenShot();
	}

	@When("^User select quantity (\\d+)$")
	public void user_select_quantity(int arg1) throws Throwable {
		desktoppageobj.selectQuantity1();
		WebDriverUtility.wait(3500);
		WebDriverUtility.screenShot();
	}

	@Then("^User should see a message ‘Success: You have added Canon EOS (\\d+)D to your shopping cart!$")
	public void user_should_see_a_message_Success_You_have_added_Canon_EOS_D_to_your_shopping_cart(int arg1)
			throws Throwable {
		desktoppageobj.messageDisplaySuccess();
		WebDriverUtility.wait(3500);
		WebDriverUtility.screenShot();
	}

	// Fourth Scenario

	@When("^User click on Canon EOS (\\d+)D item$")
	public void user_click_on_Canon_EOS_D_item(int arg1) throws Throwable {
		desktoppageobj.clickCanon();
		WebDriverUtility.wait(3500);
		WebDriverUtility.screenShot();
	}

	@When("^User click on write a review link$")
	public void user_click_on_write_a_review_link() throws Throwable {
		desktoppageobj.clickReviewLink();
		WebDriverUtility.wait(3500);
	}

	@When("^User enter yourname '(.+)'")
	public void user_enter_yourname_name(String FazalMohammadFazli) throws Throwable {
		desktoppageobj.enterName(FazalMohammadFazli);
		WebDriverUtility.wait(3500);
	}

	@When("^User enter yourReview '(.+)'")
	public void user_enter_yourReview_Pretty_Good(String PrettyGood)
			throws Throwable {
		desktoppageobj.enterReview(PrettyGood);
	}

	@When("^User click on Bad or Good Button$")
	public void user_click_on_Bad_or_Good_Button() throws Throwable {
		desktoppageobj.clickBadorGood();
		WebDriverUtility.wait(3500);
	}

	@When("^User click on Continue Button$")
	public void user_click_on_Continue_Button() throws Throwable {
		desktoppageobj.clicContinue();
		WebDriverUtility.wait(3500);
	}

	@Then("^User should see a message with Thank you for your review\\. It has been submitted to the webmaster for approval\\.$")
	public void user_should_see_a_message_with_Thank_you_for_your_review_It_has_been_submitted_to_the_webmaster_for_approval()
			throws Throwable {
		desktoppageobj.reviewMessage();
		WebDriverUtility.wait(3500);
	}

}
