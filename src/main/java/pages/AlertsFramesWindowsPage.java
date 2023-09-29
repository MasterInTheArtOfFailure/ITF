package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.partialText;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;


public class AlertsFramesWindowsPage {
    private final SelenideElement alertsFrameWindowsButton = $(byText("Alerts, Frame & Windows"));
    private final SelenideElement browserWindowsButton = $(byText("Browser Windows"));
    private final SelenideElement newTabButton = $(byText("New Tab"));
    private final SelenideElement newWindowButton = $(byText("New Window"));
    private final SelenideElement alertsButton = $(byText("Alerts"));
    private final SelenideElement alertButton = $(byId("alertButton"));
    private final SelenideElement alertButton5Secs = $(byId("timerAlertButton"));
    private final SelenideElement confirmButton = $(byId("confirmButton"));
    private final SelenideElement confirmButtonText = $(byId("confirmResult"));
    private final SelenideElement promptButton = $(byId("promtButton"));
    private final SelenideElement promptButtonText = $(byId("promptResult"));

    public SelenideElement getAlertsFrameWindowsButton() {
        return alertsFrameWindowsButton;
    }

    public SelenideElement getBrowserWindowsButton() {
        return browserWindowsButton;
    }

    public SelenideElement getAlertsButton() {
        return alertsButton;
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
    public void clickNewWindowButton() {
        newWindowButton.click();
    }

    public void clickAlertButton() {
        alertButton.click();
    }

    public SelenideElement getAlertButton5Secs() {
        return alertButton5Secs;
    }

    public SelenideElement getConfirmButton() {
        return confirmButton;
    }

    public void clickConfirmButton() {
        confirmButton.click();
    }

    public void checkConfirmText(String confirmText) {
        confirmButtonText.shouldHave(partialText(confirmText));
    }

    public void clickPromptButton() {
        promptButton.click();
    }

    public void checkPromptResult(String promptText) {
        promptButtonText.shouldHave(text(promptText));
    }
}
