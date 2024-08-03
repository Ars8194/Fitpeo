package JavaPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

public class fitPeoTask {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		int desiredValue = -174;

		driver.get("https://fitpeo.com");

		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Revenue Calculator")).click();

		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,450)");

		WebElement slider = driver.findElement(
				By.xpath("//span[@class='MuiSlider-root MuiSlider-colorPrimary MuiSlider-sizeMedium css-duk49p']"));

		int minValue = 0; // Replace with the actual min value of the slider
		int maxValue = 2000; // Replace with the actual max value of the slider

		// Get the width of the slider
		int sliderWidth = slider.getSize().width;

		// Calculate the offset needed to move the slider to the desired value
		int xOffset = (int) ((double) (desiredValue - minValue) / (maxValue - minValue) * sliderWidth);

		// Create an Actions instance
		Actions actions = new Actions(driver);

		// Move the slider to the desired value
		actions.clickAndHold(slider).moveByOffset(xOffset, 0).release().perform();

		Thread.sleep(1500);
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[1]/label/span[1]/input")).click();

		Thread.sleep(1500);
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/label/span[1]/input")).click();

		Thread.sleep(1500);
		JavascriptExecutor jse1 = (JavascriptExecutor) driver;
		jse1.executeScript("window.scrollBy(0,300)");

		Thread.sleep(1500);
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[3]/label/span[1]/input")).click();

		Thread.sleep(1500);
		JavascriptExecutor jse2 = (JavascriptExecutor) driver;
		jse2.executeScript("window.scrollBy(0,300)");

		Thread.sleep(1500);
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[8]/label/span[1]/input")).click();

	}

}
