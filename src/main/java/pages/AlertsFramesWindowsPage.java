package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.switchTo;

public class AlertsFramesWindowsPage {
    private final SelenideElement alertsFrameWindowsButton = $(byText("Alerts, Frame & Windows"));
    private final SelenideElement browserWindowsButton = $(byText("Browser Windows"));
    private final SelenideElement newTabButton = $(byText("New Tab"));
    private final SelenideElement newWindowButton = $(byText("New Window"));
    private final SelenideElement newWindowMessageButton = $(byText("New Window Message"));
    private final SelenideElement promtButton = $("#promtButton");
    private final SelenideElement confirmResult = $("#confirmResult");
    private final SelenideElement promptResult = $("#promptResult");

    public SelenideElement getAlertsFrameWindowsButton() {
        return alertsFrameWindowsButton;
    }

    public SelenideElement getBrowserWindowsButton() {
        return browserWindowsButton;
    }

    public void clickBrowserWindowButton() {
        browserWindowsButton.click();
    }

    public void clickAlertsFrameWindowsButton() {
        alertsFrameWindowsButton.click();
    }

    public void clickNewTabButton() {
        newTabButton.click();
    }

}
