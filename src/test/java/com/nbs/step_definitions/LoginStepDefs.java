package com.nbs.step_definitions;

import com.nbs.pages.Locators;
import com.nbs.utilities.ConfigurationReader;
import com.nbs.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LoginStepDefs {


    @Given("the user should be able to open url")
    public void the_user_should_be_able_to_open_url() {
        String url= ConfigurationReader.get("url");
        Driver.get().get(url);
    }

    @When("the user should write {string} to")
    public void the_user_should_write_to(String inputBox) {
        Locators locators=new Locators();
        locators.toDoinputBox.sendKeys(inputBox);

    }

    @Then("the user should be able to click")
    public void the_user_should_be_able_to_click() {
        Locators locators=new Locators();
        locators.CreateTodo.click();
        locators.checkBox.click();

        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        System.out.println(dateFormat.format(date)); //2016/11/16 12:08:43
    }


}
