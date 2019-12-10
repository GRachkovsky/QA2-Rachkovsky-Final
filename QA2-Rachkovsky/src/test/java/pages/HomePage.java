package pages;

import runners.Common;
import org.openqa.selenium.By;

public class HomePage extends Common {
    public By bannerMain = By.xpath("//a[@class='close-button animated']");
    public By bannerSecondary = By.xpath("//div[@class='close-button-slider desktop']");
    public By cookie = By.xpath("//a[@class='c-button-inverse']");
    public By category = By.xpath("//a[contains(@href,'/smarzas_un_kosmetika')]");
    public By subCategory = By.xpath("//*[@class='ait-category-dropdown-drop']//li[1]");
    public By subSubCategory = By.xpath("//*[@class='slide-inner']//ul/li[1]");
    public By filter = By.xpath("//a[@class='select-opener select-add-info']");
    public By filterSelect = By.xpath("//div[@class='drop-list']//li[5]");
    public By filterSelectProduct = By.xpath("//div[@class='p-image']");

    public void startWebpage() {
        driver.get("https://www.1a.lv/");
    }

    public void bannerMainClick() throws InterruptedException {
        Thread.sleep(3000);
        try {
            if (driver.findElement(By.id("mt-65cf2a318dbd5e21")).isDisplayed()) {
            driver.switchTo().frame(driver.findElement(By.id("mt-65cf2a318dbd5e21")));
            driver.findElement(bannerMain).click();
            driver.switchTo().defaultContent();
        }} catch (Exception e) {}
    }

    public void bannerSecondaryClick() throws InterruptedException {
        Thread.sleep(3000);
        try {
            if (driver.findElement(By.id("mt-5db6e4c3ca16efa9")).isDisplayed()) {
            driver.switchTo().frame(driver.findElement(By.id("mt-5db6e4c3ca16efa9")));
            driver.findElement(bannerSecondary).click();
            driver.switchTo().defaultContent();
        }} catch (Exception e) {}
    }

    public void cookieClick() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(cookie).click();
    }

    public void categoryClick() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(category).click();
    }

    public void subCategoryClick() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(subCategory).click();
    }

    public void subSubCategoryClick() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(subSubCategory).click();
    }

    public void filterClick() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(filter).click();
    }

    public void filterSelectClick() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(filterSelect).click();
    }

    public void filterSelectProductClick() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(filterSelectProduct).click();
    }
}
