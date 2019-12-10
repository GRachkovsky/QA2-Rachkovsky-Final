package pages;

import runners.Common;
import org.openqa.selenium.By;

public class OrderPage extends Common {
    public By cartConfirmation = By.xpath("//*[@id='main']/div/div/form/div[2]/a[2]");
    public By registration = By.xpath("//a[@class='button btn-v2']");
    public By firstName = By.xpath("//*[@id='order_main_data_name']");
    public By lastName = By.xpath("//*[@id='order_main_data_surname']");
    public By emailAddress = By.xpath("//*[@id='order_main_data_email']");
    public By phoneNumber = By.xpath("//*[@id='order_main_data_contact_phone_number']");
    public By news = By.xpath("//*[@id='order_form']/div[2]/div[1]/div[2]/section/div[1]/div[1]/div[3]/span/a/span[1]");
    public By newsConfirmation = By.xpath("//a[contains(.,'Nev')]");
    public By terms = By.xpath("//*[@id='accept_purchase_agreement']");
    public By delivery = By.xpath("//*[@id='available_delivery_types_container']/article[11]/a");
    public By proceedButton = By.xpath("//*[@id='order_form']/div[2]/div[3]/a[2]");
    public By paymentType = By.xpath("//*[@id='payment-tabs']/li[1]/a");
    public By paymentProceedButton = By.xpath("//*[@id='order_form']/div[3]/a[2]");
    public By orderName = By.xpath("//*[@id='main']/div/div/form/section/table/tbody/tr[2]/td[2]/div/h4/a");
    public By orderPrice = By.xpath("//*[@id='shopping-cart-total-amount']");
    public By orderClient = By.xpath("//*[@id='main']/div/div/form/div[2]/div/div[1]/p");

    public void cartConfirmationClick() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(cartConfirmation).click();
    }

    public void registrationClick() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(registration).click();
    }

    public void firstNameKeys(String firstNameGS) throws InterruptedException {
    Thread.sleep(3000);
    driver.findElement(firstName).sendKeys(firstNameGS);
    }

    public void lastNameKeys(String lastNameGS) throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(lastName).sendKeys(lastNameGS);
    }

    public void emailAddressKeys(String emailAddressGS) throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(emailAddress).sendKeys(emailAddressGS);
    }

    public void phoneNumberKeys(String phoneNumberGS) throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(phoneNumber).sendKeys(phoneNumberGS);
    }

    public void newsClick() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(news).click();
    }

    public void newsConfirmationClick() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(newsConfirmation).click();
    }

    public void termsClick() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(terms).click();
    }

    public void deliveryClick() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(delivery).click();
    }

    public void proceedButtonClick() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(proceedButton).click();
    }

    public void paymentTypeClick() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(paymentType).click();
    }

    public void paymentProceedButtonClick() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(paymentProceedButton).click();
    }

    public String orderNameCompare() throws InterruptedException {
        Thread.sleep(3000);
        return driver.findElement(orderName).getText();
    }

    public String orderPriceCompare() throws InterruptedException {
        Thread.sleep(3000);
        return driver.findElement(orderPrice).getText().substring(0,5);
    }

    public String orderClientCompare() throws InterruptedException {
        Thread.sleep(3000);
        return driver.findElement(orderClient).getText();
    }
}
