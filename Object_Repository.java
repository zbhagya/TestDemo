package Women;

import org.openqa.selenium.By;

public class Object_Repository {

	//Registration objects
	By signinbutton=By.xpath("");
	By emailaddress=By.xpath("//*[@id='email_create']");
	By create_account=By.xpath("//*[@id='SubmitCreate']/span");
	By gender=By.xpath("//*[@id=\'id_gender2\']"); 
	By firstName=By.xpath("//*[@id=\'customer_firstname\']");
	By	lastName=By.xpath("//*[@id='customer_lastname']"); 
	By email=By.xpath("//*[@id='email']");
	By	password=By.xpath("//*[@id='passwd']"); 
	By	selectdate=By.xpath("//*[@id='days']");
	By	selectMonth=By.xpath("//*[@id='months']");
	By	selectYear=By.xpath("//*[@id='years']");
	By fname=By.xpath("//*[@id='firstname']");
	By	lname=By.xpath("//*[@id=\"lastname\"]");
	By	address=By.xpath("//*[@id='address1']"); 
	By	city=By.xpath(" //*[@id='city']");
	By	state =By.xpath("//*[@id='id_state']");
	By	postal_code =By.xpath(" //*[@id='postcode']");
	By	country =By.xpath("//*[@id='id_country']");
	By	mobilePhone=By.xpath("//*[@id=\'phone_mobile\']"); 
	By	register=By.xpath("//*[@id=\'submitAccount\']/span"); 
	
	///login objects
	By loginemail=By.xpath("//*[@id='email']");
	By loginpwd=By.xpath("//*[@id='passwd']");
	By loginbtn=By.xpath("//*[@id='SubmitLogin']/span");
	
	By selectwomen=By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a");
	By selecttops=By.xpath("//*[@id=\"categories_block_left\"]/div/ul/li[1]/a");
	By selecttopimage=By.xpath("//*[@id=\"subcategories\"]/ul/li[1]/div[1]/a/img");
	//By selecttshirt=By.xpath("//*[@id=\"subcategories\"]/ul/li[1]/div[1]/a/img");
	By quickview=By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[2]");
	
	By additems=By.xpath("//*[@id=\"quantity_wanted_p\"]/a[2]/span");
	By addcart=By.xpath("//*[@id=\"add_to_cart\"]/button/span");
	By proceed=By.xpath("//*[@id=\"add_to_cart\"]/button/span");
	
	
	
	
}
