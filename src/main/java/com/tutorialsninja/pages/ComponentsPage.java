package com.tutorialsninja.pages;

import com.tutorialsninja.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ComponentsPage extends Utility {
    private static final Logger log = LogManager.getLogger(ComponentsPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Components')]")
    WebElement components;

    public String getPageTitleOfComponents() {
        log.info("get components page title");
        return getTextFromElement(components);
    }
}
