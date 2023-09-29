package pages;


import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class HomePage {
    private final SelenideElement elementsLink = $(byText("Elements"));

    public void clickElementsLink() {
        elementsLink.click();
    }

    public SelenideElement getElementsLink() {
        return elementsLink;
    }
}
