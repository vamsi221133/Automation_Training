$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/training/Desktop/BDDCucumberFrameWork/src/main/resources/Features/Mynthra.feature");
formatter.feature({
  "line": 2,
  "name": "creating framework for mynthra",
  "description": "",
  "id": "creating-framework-for-mynthra",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@all"
    }
  ]
});
formatter.before({
  "duration": 3594067213,
  "error_message": "org.openqa.selenium.WebDriverException: unknown error: cannot determine loading status\nfrom disconnected: unable to send message to renderer\n  (Session info: chrome\u003d78.0.3904.97)\nBuild info: version: \u00273.141.5\u0027, revision: \u0027d54ebd709a\u0027, time: \u00272018-11-06T11:42:16\u0027\nSystem info: host: \u0027IMPACT-PC\u0027, ip: \u0027192.168.27.27\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_162\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 78.0.3904.97, chrome: {chromedriverVersion: 78.0.3904.70 (edb9c9f3de024..., userDataDir: C:\\Users\\training\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:49331}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: ed705031a3f408a0d6731b4224582e34\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.get(RemoteWebDriver.java:277)\r\n\tat Utilities.BrowserConfig.setBrowser(BrowserConfig.java:18)\r\n\tat BuissnessMethods.BaseSetUpDriver_Mynthra.browsertrigger(BaseSetUpDriver_Mynthra.java:14)\r\n\tat StepDefinition.Mynthra_StpDef.additional_classes(Mynthra_StpDef.java:34)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)\r\n\tat java.lang.reflect.Method.invoke(Unknown Source)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:40)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:34)\r\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:60)\r\n\tat cucumber.runtime.Runtime.runHookIfTagsMatch(Runtime.java:224)\r\n\tat cucumber.runtime.Runtime.runHooks(Runtime.java:212)\r\n\tat cucumber.runtime.Runtime.runBeforeHooks(Runtime.java:202)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:40)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:102)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:95)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:38)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:100)\r\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:89)\r\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:41)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:541)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:763)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:463)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:209)\r\n",
  "status": "failed"
});
formatter.scenario({
  "line": 4,
  "name": "Loging to the website and selecting a product by sorting",
  "description": "",
  "id": "creating-framework-for-mynthra;loging-to-the-website-and-selecting-a-product-by-sorting",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@test1"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": ": launching a Mynthra website",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": ": login to the website by passing \"username\" and \"password\"",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": ": Searching for a product",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": ": sorting by Popularity",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": ": click on the product by a larger price(Storing prices in hashmap)",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": ": Switching to the window of the clicked product",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": ": Select the size of the product",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": ": clicking add to bag",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": ": taking screenshot after clicking bag icon",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": ": click on the quantity of the product  and take screenshot",
  "keyword": "Then "
});
formatter.match({
  "location": "Mynthra_StpDef.launching_a_Mynthra_website()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "username",
      "offset": 35
    },
    {
      "val": "password",
      "offset": 50
    }
  ],
  "location": "Mynthra_StpDef.login_to_the_website_by_passing_and(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Mynthra_StpDef.searching_for_a_product()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Mynthra_StpDef.sorting_by_Popularity()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "Mynthra_StpDef.switching_to_the_window_of_the_clicked_product()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Mynthra_StpDef.select_the_size_of_the_product()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Mynthra_StpDef.clicking_add_to_bag()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Mynthra_StpDef.taking_screenshot_after_clicking_bag_icon()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Mynthra_StpDef.click_on_the_quantity_of_the_product_and_take_screenshot()"
});
formatter.result({
  "status": "skipped"
});
});