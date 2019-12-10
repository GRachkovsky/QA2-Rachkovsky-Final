package pages;

import runners.Common;
import org.openqa.selenium.By;

public class ProductPage extends Common {
    public By add = By.xpath("//a[@class='button btn-cart']");
    public By cart = By.xpath("//div[@id='shopping_cart_container']");
    public By productName = By.xpath("//div[@class='product-main-info']/h1");
    public By productPrice = By.xpath("//div[@data-sell-price-w-vat]");

    public void addClick() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(add).click();
    }

    public void cartClick() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(cart).click();
    }

    public String productNameCompare() throws InterruptedException {
        Thread.sleep(3000);
        return driver.findElement(productName).getText();
    }

    public String productPriceCompare() throws InterruptedException {
        Thread.sleep(3000);
        return driver.findElement(productPrice).getAttribute("data-sell-price-w-vat");
    }
}
