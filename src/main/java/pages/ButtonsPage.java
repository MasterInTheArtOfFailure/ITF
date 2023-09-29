package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class ButtonsPage {
    private final SelenideElement buttons = $(byText("Buttons"));
    private final SelenideElement dynamicClickButton = $(byText("Click Me"));
    private final SelenideElement dynamicClickMessage = $(byText("You have done a dynamic click"));
    private final SelenideElement rightClickButton = $(byText("Right Click Me"));
    private final SelenideElement rightClickMessage = $(byText("You have done a right click"));
    private final SelenideElement doubleClickButton = $(byText("Double Click Me"));
    private final SelenideElement doubleClickMessage = $(byText("You have done a double click"));

    public void clickDynamicClickButton() {
        dynamicClickButton.click();
    }

    public void checkDynamicClickMessage() {
        dynamicClickMessage.shouldHave(text("You have done a dynamic click"));
    }

    public void rightClickButton() {
        rightClickButton.contextClick();
    }

    public void checkRightClickMessage() {
        rightClickMessage.shouldHave(text("You have done a right click"));
    }

    public void doubleClickButton() {
        doubleClickButton.doubleClick();
    }

    public void checkDoubleClickMessage() {
        doubleClickMessage.shouldHave(text("You have done a double click"));
    }

    public SelenideElement getDynamicClickButton() {
        return dynamicClickButton;
    }

    public SelenideElement getRightClickButton() {
        return rightClickButton;
    }

    public SelenideElement getDoubleClickButton() {
        return doubleClickButton;
    }

    public SelenideElement getButtons() {
        return buttons;
    }
}
