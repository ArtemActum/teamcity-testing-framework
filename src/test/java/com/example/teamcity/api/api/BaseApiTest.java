package com.example.teamcity.api.api;

import com.example.teamcity.api.generators.TestDataStorage;
import com.example.teamcity.api.request.CheckedRequest;
import com.example.teamcity.api.request.UncheckedRequest;
import com.example.teamcity.api.spec.Specifications;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseApiTest extends BaseTest{

    public TestDataStorage testDataStorage;
    public CheckedRequest checkedWithSuperUser = new CheckedRequest(Specifications.getSpec().superUserSpec());
    public UncheckedRequest uncheckedWithSuperUser = new UncheckedRequest(Specifications.getSpec().superUserSpec());

    @BeforeMethod
    public void setupTest(){
     testDataStorage = TestDataStorage.getStorage();

    }
    @AfterMethod
    public void cleanTest(){
        testDataStorage.delete();
    }
}
