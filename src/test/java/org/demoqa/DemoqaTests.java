package org.demoqa;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.AlertsFramesWindowsPage;
import pages.ButtonsPage;
import pages.HomePage;
import pages.TextBoxPage;

import static com.codeborne.selenide.Selenide.*;

@Listeners({io.qameta.allure.testng.AllureTestNg.class})
public class DemoqaTests {
    private HomePage homePage;
    private TextBoxPage textBoxPage;
    private ButtonsPage buttonsPage;
    private AlertsFramesWindowsPage alertsFramesWindowsPage;


    @BeforeAll
    static void setupAllureReports() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide()
                .screenshots(true)
                .savePageSource(true)
        );
    }
    @BeforeClass
    public void setUpProperties() {
        System.setProperty("webdriver.chrome.driver", "ChromeDriver/chromedriver");
        System.setProperty("selenide.browser", "Chrome");
        Configuration.browser = "chrome";
        Configuration.timeout = 10000;
        Configuration.pageLoadStrategy = "eager";
        homePage = new HomePage();
        textBoxPage = new TextBoxPage();
        buttonsPage = new ButtonsPage();
        alertsFramesWindowsPage = new AlertsFramesWindowsPage();
    }
    @Test (priority = 0, description = "Test for DemoQA website with a specific scenario")
    @Severity(SeverityLevel.CRITICAL)
    public void TestScenario() {
        // Step 1
        open("https://demoqa.com/");

        // Step 2
        homePage.getElementsLink().scrollIntoView(true);
        homePage.clickElementsLink();

        // Step 3:
        textBoxPage.getTextBox().click();

        // Step 4
        textBoxPage.fillForm(textBoxPage.getFullname(), textBoxPage.getEmail(), textBoxPage.getCurrAddress(), textBoxPage.getPermAddress());

        // Step 5
        textBoxPage.getSubmitButton().scrollIntoView(true);
        textBoxPage.clickSubmitButton();

        // Step 6
        textBoxPage.checkData(textBoxPage.getFullname(), textBoxPage.getEmail(), textBoxPage.getCurrAddress(), textBoxPage.getPermAddress());

        // Step 7
        buttonsPage.getButtons().scrollIntoView(true);
        buttonsPage.getButtons().click();

        // Step 8
        buttonsPage.clickDynamicClickButton();

        // Step 9
        buttonsPage.checkDynamicClickMessage();

        // Step 10
        buttonsPage.rightClickButton();

        // Step 11
        buttonsPage.checkRightClickMessage();

        // Step 12
        buttonsPage.doubleClickButton();

        // Step 13
        buttonsPage.checkDoubleClickMessage();

        //Step 14
        alertsFramesWindowsPage.getAlertsFrameWindowsButton().scrollIntoView(true);
        alertsFramesWindowsPage.clickAlertsFrameWindowsButton();

        //Step 15
        alertsFramesWindowsPage.getBrowserWindowsButton().scrollIntoView(true);
        alertsFramesWindowsPage.clickBrowserWindowButton();

        //Step 16
        alertsFramesWindowsPage.clickNewTabButton();

        //Step 17
        Selenide.switchTo().window(1);
        Selenide.closeWindow();
        Selenide.switchTo().window(0);

        //Step 18
        alertsFramesWindowsPage.clickNewWindowButton();

        //Step 19
        Selenide.switchTo().window(1);
        Selenide.closeWindow();
        Selenide.switchTo().window(0);

        //Step 20
        alertsFramesWindowsPage.getAlertsButton().click();

        //Step 21
        alertsFramesWindowsPage.clickAlertButton();
        //Step 22
        Selenide.switchTo().alert().accept();

        //Step 23
        //В Selenide switchTo().alert() будет ожидать некоторое дефолтное количество секунд (возможно берется из Configuration, тогда timeout(60))
        //В целом лучше, чем Thread.sleep()
        alertsFramesWindowsPage.getAlertButton5Secs().click();
        //Step 24
        Selenide.switchTo().alert().accept();

        //Step 25
        alertsFramesWindowsPage.clickConfirmButton();

        //Step 26
        Selenide.switchTo().alert().accept();

        //Step 27
        alertsFramesWindowsPage.checkConfirmText("Ok");

        //Step 28
        alertsFramesWindowsPage.clickPromptButton();

        //Step 29
        Selenide.switchTo().alert().sendKeys("Test name");

        //Step 30
        alertsFramesWindowsPage.checkPromptResult("Test name");

    }
}
