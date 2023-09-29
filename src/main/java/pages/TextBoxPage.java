package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class TextBoxPage {
    private final String fullname = "testName";
    private final String email = "testEmail@gmail.com";
    private final String currAddress = "testCurr";
    private final String permAddress = "testPerm";
    private final SelenideElement textBox = $(byText("Text Box"));
    private final SelenideElement fullNameField = $("#userName");
    private final SelenideElement emailField = $("#userEmail");
    private final SelenideElement currentAddressField = $("#currentAddress");
    private final SelenideElement permanentAddressField = $("#permanentAddress");
    private final SelenideElement submitButton = $("#submit");
    private final SelenideElement nameBlock = $("#name");
    private final SelenideElement emailBlock = $("#email");
    private final SelenideElement currentAddressBlock = $("#currentAddress", 1);
    private final SelenideElement permanentAddressBlock = $("#permanentAddress", 1);

    public void fillForm(String fullName, String email, String currentAddress, String permanentAddress) {
        fullNameField.setValue(fullName);
        emailField.setValue(email);
        currentAddressField.setValue(currentAddress);
        permanentAddressField.setValue(permanentAddress);
    }

    public void clickSubmitButton() {
        submitButton.click();
    }

    public void checkData(String fullName, String email, String currentAddress, String permanentAddress) {
        nameBlock.shouldHave(text(fullName));
        emailBlock.shouldHave(text(email));
        currentAddressBlock.shouldHave(text(currentAddress));
        permanentAddressBlock.shouldHave(text(permanentAddress));
    }

    public SelenideElement getTextBox() {
        return textBox;
    }

    public SelenideElement getSubmitButton() {
        return submitButton;
    }

    public String getFullname() {
        return fullname;
    }

    public String getEmail() {
        return email;
    }

    public String getCurrAddress() {
        return currAddress;
    }

    public String getPermAddress() {
        return permAddress;
    }
}
