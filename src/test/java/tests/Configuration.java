package tests;

import org.testng.ITestContext;
import org.testng.annotations.BeforeSuite;

public class Configuration {

    // resources in the project is a standard package, which should be located on the same level as 'test/java' folder
    // move it from \src\test\java\resources to \src\test\resources
    @BeforeSuite
    public void setUpParams(ITestContext context)
    {
        context.getCurrentXmlTest().getAllParameters();

    }
}
