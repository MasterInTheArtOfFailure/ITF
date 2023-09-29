package org.demoqa;

import com.codeborne.selenide.Configuration;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.AlertsFramesWindowsPage;
import pages.ButtonsPage;
import pages.HomePage;
import pages.TextBoxPage;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class DemoqaTests {
    private HomePage homePage;
    private TextBoxPage textBoxPage;
    private ButtonsPage buttonsPage;
    private AlertsFramesWindowsPage alertsFramesWindowsPage;

    @BeforeClass
    public void setUpProperties() {
        System.setProperty("webdriver.chrome.driver", "ChromeDriver/chromedriver");
        System.setProperty("selenide.browser", "Chrome");
        Configuration.browser = "chrome";
        Configuration.timeout = 60000;
        Configuration.pageLoadStrategy = "eager";
        homePage = new HomePage();
        textBoxPage = new TextBoxPage();
        buttonsPage = new ButtonsPage();
        alertsFramesWindowsPage = new AlertsFramesWindowsPage();
    }
    @Test
    public void userCanLoginByUsername() {
        // Step 1: Go to https://demoqa.com/
        open("https://demoqa.com/");

        // Step 2: Click on “Elements”
        homePage.getElementsLink().scrollIntoView(true);
        homePage.clickElementsLink();

        // Step 3: Click on “Text box”
        textBoxPage.getTextBox().click();

        // Step 4: Fill in the fields: Full Name, Email, Current Address, Permanent Address
        textBoxPage.fillForm(textBoxPage.getFullname(), textBoxPage.getEmail(), textBoxPage.getCurrAddress(), textBoxPage.getPermAddress());

        // Step 5: Click on the “Submit” button
        textBoxPage.getSubmitButton().scrollIntoView(true);
        textBoxPage.clickSubmitButton();

        // Step 6: Check that the data in the block is saved correctly
        textBoxPage.checkData(textBoxPage.getFullname(), textBoxPage.getEmail(), textBoxPage.getCurrAddress(), textBoxPage.getPermAddress());

        // Step 7: Click on “Buttons”
        buttonsPage.getButtons().scrollIntoView(true);
        buttonsPage.getButtons().click();

        // Step 8: Click on the “Click me” button
        buttonsPage.clickDynamicClickButton();

        // Step 9: Check that the text “You have done a dynamic click” appears
        buttonsPage.checkDynamicClickMessage();

        // Step 10: Click on the “Right Click me” button
        buttonsPage.rightClickButton();

        // Step 11: Check that the text “You have done a right click” appears
        buttonsPage.checkRightClickMessage();

        // Step 12: Click on the “Double Click me” button
        buttonsPage.doubleClickButton();

        // Step 13: Check that the text “You have done a double click” appears
        buttonsPage.checkDoubleClickMessage();

        //Step 14
        alertsFramesWindowsPage.getAlertsFrameWindowsButton().scrollIntoView(true);
        alertsFramesWindowsPage.clickAlertsFrameWindowsButton();

        //Step 15
        alertsFramesWindowsPage.getBrowserWindowsButton().scrollIntoView(true);
        alertsFramesWindowsPage.clickBrowserWindowButton();

        //Step 16
        alertsFramesWindowsPage.clickNewTabButton();


    }
}
