package commons;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AstractPage {

	public void openAnyUrl(WebDriver driver, String url) {
		driver.get(url);
	}
	public String getTitlePage(WebDriver driver) {
		return driver.getTitle();
	}
	
	public String getCurrentUrl(WebDriver driver) {
		return driver.getCurrentUrl();
	}
	
	public void back(WebDriver driver) {
		driver.navigate().back();
	} 
	
	public void forward(WebDriver driver) {
		driver.navigate().forward();
	}
	
	public void refresh(WebDriver driver) {
		driver.navigate().refresh();
	}
	
	public void clickToElement (WebDriver driver, String locator) {
		WebElement element = driver.findElement(By.xpath(locator));
		element.click();
	}
	
	public void sendKeyToElement(WebDriver driver, String locator, String value) {
		WebElement element = driver.findElement(By.xpath(locator));
		element.clear();
		element.sendKeys(value);
	}
	
	public void selectItemInDropDown (WebDriver driver, String locator, String value) {
		Select select = new Select(driver.findElement(By.xpath(locator)));
		select.selectByVisibleText(value);
	}
	
	public String getFirstSelectedItem (WebDriver driver, String locator) {
		Select select = new Select(driver.findElement(By.xpath(locator)));
		return select.getFirstSelectedOption().getText();
	}
	
	public String getAttributeValue(WebDriver driver, String locator, String attribute) {
		WebElement element = driver.findElement(By.xpath(locator));
		return element.getAttribute(attribute);
	}
	
	public String getTextInElement(WebDriver driver, String locator) {
		WebElement element = driver.findElement(By.xpath(locator));
		return element.getText();
	}
	
	public int getSizeElement(WebDriver driver, String locator) {
		List <WebElement> elements = driver.findElements(By.xpath(locator));
		return elements.size();
	}
	
	public void checkTheCheckBox(WebDriver driver, String locator) {
		WebElement element = driver.findElement(By.xpath(locator));
		if (!element.isSelected()) {
			element.click();
		}
	}
	
	public void unCheckTheCheckBox(WebDriver driver, String locator) {
		WebElement element = driver.findElement(By.xpath(locator));
		if (element.isSelected()) {
			element.click();
		}
	}
	
	public boolean isControlDisplayed(WebDriver driver, String locator) {
		WebElement element = driver.findElement(By.xpath(locator));
		return element.isDisplayed();
	}
	
	public boolean isControlEnabled(WebDriver driver, String locator) {
		WebElement element = driver.findElement(By.xpath(locator));
		return element.isEnabled();
	}

	public boolean isControlSelected(WebDriver driver, String locator) {
		WebElement element = driver.findElement(By.xpath(locator));
		return element.isSelected();
	}
	
	public void waitForControlVisible(WebDriver driver, String locator) { 
		By by = By.xpath(locator);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(by));
	}


}

















