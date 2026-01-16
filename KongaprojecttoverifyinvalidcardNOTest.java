{
  "id": "4715a142-c7f8-401e-a295-970b828882d4",
  "version": "2.0",
  "name": "konga project-invalid card no",
  "url": "http://konga.com/",
  "tests": [{
    "id": "bc680739-54e0-4303-85e7-f242b01ad857",
    "name": "konga project to verify wrong payment credentials",
    "commands": [{
      "id": "01e3ca46-6c4c-48f6-a485-8fe8746cdb87",
      "comment": "",
      "command": "open",
      "target": "https://www.konga.com/",
      "targets": [],
      "value": ""
    }, {
      "id": "935f0eb0-5969-4e71-8b58-3a6966fa7ec4",
      "comment": "",
      "command": "setWindowSize",
      "target": "1238x672",
      "targets": [],
      "value": ""
    }, {
      "id": "cd891685-f3cd-4f9b-901f-62836edaa4d6",
      "comment": "",
      "command": "click",
      "target": "linkText=Login / Signup",
      "targets": [
        ["linkText=Login / Signup", "linkText"],
        ["css=.DesktopNavigation_authLink__Zpjyj > .DesktopNavigation_searchBandIconLink__Nreez", "css:finder"],
        ["xpath=//a[contains(text(),'Login / Signup')]", "xpath:link"],
        ["xpath=//div[@id='nav-bar-fix']/div/div/div[4]/a", "xpath:idRelative"],
        ["xpath=//a[contains(@href, '/account/login?return_url=/')]", "xpath:href"],
        ["xpath=//div[4]/a", "xpath:position"],
        ["xpath=//a[contains(.,'Login / Signup')]", "xpath:innerText"]
      ],
      "value": ""
    }, {
      "id": "26b85bfc-9e59-44d3-8e91-9a6ac4908f8a",
      "comment": "",
      "command": "click",
      "target": "id=username",
      "targets": [
        ["id=username", "id"],
        ["name=username", "name"],
        ["css=#username", "css:finder"],
        ["xpath=//input[@id='username']", "xpath:attributes"],
        ["xpath=//main[@id='mainContent']/div/div/div[2]/div/form/div/input", "xpath:idRelative"],
        ["xpath=//div/input", "xpath:position"]
      ],
      "value": ""
    }, {
      "id": "8a7e1b61-03ed-4fe8-a10a-c89fe0dea9d3",
      "comment": "",
      "command": "executeScript",
      "target": "document.getElementById(\"username\")",
      "targets": [],
      "value": "sambrave883@gmail.com"
    }, {
      "id": "609a3815-fc19-4a85-87d1-42573b54233a",
      "comment": "",
      "command": "click",
      "target": "id=password",
      "targets": [
        ["id=password", "id"],
        ["name=password", "name"],
        ["css=#password", "css:finder"],
        ["xpath=//input[@id='password']", "xpath:attributes"],
        ["xpath=//main[@id='mainContent']/div/div/div[2]/div/form/div[2]/input", "xpath:idRelative"],
        ["xpath=//div[2]/input", "xpath:position"]
      ],
      "value": ""
    }, {
      "id": "12f171cd-d138-4f7a-befe-110e344f0e56",
      "comment": "",
      "command": "executeScript",
      "target": "document.getElementById(\"password\")",
      "targets": [],
      "value": "Engineer@93"
    }, {
      "id": "38073b57-9e72-45f8-9c41-34d93b3ed864",
      "comment": "",
      "command": "click",
      "target": "css=.button_button__cpnXl",
      "targets": [
        ["css=.button_button__cpnXl", "css:finder"],
        ["xpath=//button[@type='submit']", "xpath:attributes"],
        ["xpath=//main[@id='mainContent']/div/div/div[2]/div/form/div[3]/button", "xpath:idRelative"],
        ["xpath=//button", "xpath:position"],
        ["xpath=//button[contains(.,'Login')]", "xpath:innerText"]
      ],
      "value": ""
    }, {
      "id": "972c807c-0d4b-43ae-8c9a-52a9b16513e7",
      "comment": "",
      "command": "click",
      "target": "linkText=Computers and Accessories",
      "targets": [
        ["linkText=Computers and Accessories", "linkText"],
        ["css=.DesktopNavigation_navItem__TBbw6:nth-child(2)", "css:finder"],
        ["xpath=//a[contains(text(),'Computers and Accessories')]", "xpath:link"],
        ["xpath=//div[@id='nav-bar-fix']/div[2]/div/a[2]", "xpath:idRelative"],
        ["xpath=(//a[contains(@href, '/category/computers-accessories-5227')])[2]", "xpath:href"],
        ["xpath=//div[3]/div[2]/div/a[2]", "xpath:position"]
      ],
      "value": ""
    }, {
      "id": "c05e28e3-9a1a-4474-b4dd-904c02205bb2",
      "comment": "",
      "command": "click",
      "target": "linkText=All Categories",
      "targets": [
        ["linkText=All Categories", "linkText"],
        ["css=.DesktopNavigation_navItem__TBbw6:nth-child(1)", "css:finder"],
        ["xpath=//a[contains(text(),'All Categories')]", "xpath:link"],
        ["xpath=//div[@id='nav-bar-fix']/div[2]/div/a", "xpath:idRelative"],
        ["xpath=(//a[contains(@href, '#')])[2]", "xpath:href"],
        ["xpath=//nav/div[3]/div[2]/div/a", "xpath:position"],
        ["xpath=//a[contains(.,'All Categories')]", "xpath:innerText"]
      ],
      "value": ""
    }, {
      "id": "61b53f55-94ab-4958-9ec3-2c56c1584b7a",
      "comment": "",
      "command": "click",
      "target": "linkText=Macbooks",
      "targets": [
        ["linkText=Macbooks", "linkText"],
        ["css=.DesktopNavigation_subCategorySection__H95KA:nth-child(1) > .DesktopNavigation_subCategorySectionChild__5kEvf:nth-child(6)", "css:finder"],
        ["xpath=//a[contains(text(),'Macbooks')]", "xpath:link"],
        ["xpath=//div[@id='subFixId']/div/div[2]/div/div/div/a[6]", "xpath:idRelative"],
        ["xpath=//a[contains(@href, '/category/macbooks-5249')]", "xpath:href"],
        ["xpath=//div[2]/div/div/div/a[6]", "xpath:position"],
        ["xpath=//a[contains(.,'Macbooks')]", "xpath:innerText"]
      ],
      "value": ""
    }, {
      "id": "690cc00b-f0ff-42d6-8942-3fd15a998de6",
      "comment": "",
      "command": "click",
      "target": "css=.List_listItem__KlvU2:nth-child(1) .asset_imageCover__ttp_S",
      "targets": [
        ["css=.List_listItem__KlvU2:nth-child(1) .asset_imageCover__ttp_S", "css:finder"],
        ["xpath=//img[@alt='Pro With M1 Pro Chip - 1TB HDD - 16GB RAM - 14.2\" - Late 2021 - Space Grey']", "xpath:img"],
        ["xpath=//main[@id='mainContent']/section/section/section/section/section/section/ul/li/article/div/a/div/span/img", "xpath:idRelative"],
        ["xpath=//article/div/a/div/span/img", "xpath:position"]
      ],
      "value": ""
    }, {
      "id": "bbc66e19-291f-41c4-86ff-f4f2fa044261",
      "comment": "",
      "command": "click",
      "target": "linkText=Go To Home Page",
      "targets": [
        ["linkText=Go To Home Page", "linkText"],
        ["css=.button_button__cpnXl", "css:finder"],
        ["xpath=//a[contains(text(),'Go To Home Page')]", "xpath:link"],
        ["xpath=//main[@id='mainContent']/div/div/div/div/a", "xpath:idRelative"],
        ["xpath=(//a[contains(@href, '/')])[85]", "xpath:href"],
        ["xpath=//main/div/div/div/div/a", "xpath:position"],
        ["xpath=//a[contains(.,'Go To Home Page')]", "xpath:innerText"]
      ],
      "value": ""
    }, {
      "id": "1f2406a0-cf10-4568-bb47-f07d625e3d81",
      "comment": "",
      "command": "click",
      "target": "linkText=All Categories",
      "targets": [
        ["linkText=All Categories", "linkText"],
        ["css=.DesktopNavigation_activeNavItem__o_xA7", "css:finder"],
        ["xpath=//a[contains(text(),'All Categories')]", "xpath:link"],
        ["xpath=//div[@id='nav-bar-fix']/div[2]/div/a", "xpath:idRelative"],
        ["xpath=(//a[contains(@href, '#')])[2]", "xpath:href"],
        ["xpath=//nav/div[3]/div[2]/div/a", "xpath:position"],
        ["xpath=//a[contains(.,'All Categories')]", "xpath:innerText"]
      ],
      "value": ""
    }, {
      "id": "7e84ef68-c91a-4347-b0d5-75ac02f40229",
      "comment": "",
      "command": "click",
      "target": "linkText=Macbooks",
      "targets": [
        ["linkText=Macbooks", "linkText"],
        ["css=.DesktopNavigation_subCategorySection__H95KA:nth-child(1) > .DesktopNavigation_subCategorySectionChild__5kEvf:nth-child(6)", "css:finder"],
        ["xpath=//a[contains(text(),'Macbooks')]", "xpath:link"],
        ["xpath=//div[@id='subFixId']/div/div[2]/div/div/div/a[6]", "xpath:idRelative"],
        ["xpath=//a[contains(@href, '/category/macbooks-5249')]", "xpath:href"],
        ["xpath=//div[2]/div/div/div/a[6]", "xpath:position"],
        ["xpath=//a[contains(.,'Macbooks')]", "xpath:innerText"]
      ],
      "value": ""
    }, {
      "id": "f8b77151-1e0d-4ac3-b234-2e39463aa8e1",
      "comment": "",
      "command": "runScript",
      "target": "window.scrollTo(0,0)",
      "targets": [],
      "value": ""
    }, {
      "id": "3f49aba2-5812-40e0-8e08-848b793e6784",
      "comment": "",
      "command": "click",
      "target": "css=.List_listItem__KlvU2:nth-child(3) .asset_imageCover__ttp_S",
      "targets": [
        ["css=.List_listItem__KlvU2:nth-child(3) .asset_imageCover__ttp_S", "css:finder"],
        ["xpath=//img[@alt='Apple MacBook Air M2 Chip With 8 Core CPU With 8 Core GPU 256GB SSD Silver 13 inch']", "xpath:img"],
        ["xpath=//main[@id='mainContent']/section/section/section/section/section/section/ul/li[3]/article/div/a/div/span/img", "xpath:idRelative"],
        ["xpath=//li[3]/article/div/a/div/span/img", "xpath:position"]
      ],
      "value": ""
    }, {
      "id": "ab39dd55-6dcc-4133-9ccd-124c52cc8235",
      "comment": "",
      "command": "runScript",
      "target": "window.scrollTo(0,0)",
      "targets": [],
      "value": ""
    }, {
      "id": "858e4316-8768-46bf-a39c-de5217ab0e70",
      "comment": "",
      "command": "click",
      "target": "css=.productDetail_productCtaSticky__71e8u > .button_button__cpnXl",
      "targets": [
        ["css=.productDetail_productCtaSticky__71e8u > .button_button__cpnXl", "css:finder"],
        ["xpath=(//button[@type='submit'])[9]", "xpath:attributes"],
        ["xpath=//main[@id='mainContent']/div[4]/div[3]/div/div/div/div[2]/div[2]/form/div[5]/div/button", "xpath:idRelative"],
        ["xpath=//div[5]/div/button", "xpath:position"]
      ],
      "value": ""
    }, {
      "id": "c7692f78-cde5-45a4-9686-b66e81747185",
      "comment": "",
      "command": "runScript",
      "target": "window.scrollTo(0,0)",
      "targets": [],
      "value": ""
    }, {
      "id": "ca1d7ef8-4218-430f-b573-82f5752f0d4c",
      "comment": "",
      "command": "click",
      "target": "linkText=Continue to Checkout",
      "targets": [
        ["linkText=Continue to Checkout", "linkText"],
        ["css=.button_success__sLUz_:nth-child(1) > .button_button__cpnXl", "css:finder"],
        ["xpath=(//a[contains(text(),'Continue to Checkout')])[2]", "xpath:link"],
        ["xpath=//main[@id='mainContent']/div/div[2]/div[4]/div/div[6]/div/a", "xpath:idRelative"],
        ["xpath=(//a[contains(@href, '/checkout/complete-order')])[2]", "xpath:href"],
        ["xpath=//div[6]/div/a", "xpath:position"]
      ],
      "value": ""
    }, {
      "id": "850c3842-fe90-46ce-99ed-a665d18d3ee0",
      "comment": "",
      "command": "runScript",
      "target": "window.scrollTo(0,0)",
      "targets": [],
      "value": ""
    }, {
      "id": "87f83aa5-ac43-4e87-9d2a-548deb6e2b99",
      "comment": "",
      "command": "click",
      "target": "css=.paymentOptions_paymentOptionsContentPayNowHeader__eiuIT input",
      "targets": [
        ["css=.paymentOptions_paymentOptionsContentPayNowHeader__eiuIT input", "css:finder"],
        ["xpath=//input[@value='kpaygateway']", "xpath:attributes"],
        ["xpath=//main[@id='mainContent']/div/div[3]/div/section[2]/div/div[2]/div/div/span/input", "xpath:idRelative"],
        ["xpath=//span/input", "xpath:position"]
      ],
      "value": ""
    }, {
      "id": "c39f17d5-dd23-42db-ba99-de68588dba7d",
      "comment": "",
      "command": "runScript",
      "target": "window.scrollTo(0,0)",
      "targets": [],
      "value": ""
    }, {
      "id": "9f53d465-8c04-49da-b71d-0d095fbebc83",
      "comment": "",
      "command": "runScript",
      "target": "window.scrollTo(0,0)",
      "targets": [],
      "value": ""
    }, {
      "id": "64cbd19e-ad62-4a03-9cf5-12c3f61c3ecf",
      "comment": "",
      "command": "click",
      "target": "name=placeOrder",
      "targets": [
        ["name=placeOrder", "name"],
        ["css=.checkout_placeOrderButton__yJwNl", "css:finder"],
        ["xpath=//button[@name='placeOrder']", "xpath:attributes"],
        ["xpath=//main[@id='mainContent']/div/div[3]/div/section[2]/div/div[2]/div[3]/div[2]/div/button", "xpath:idRelative"],
        ["xpath=//div[3]/div[2]/div/button", "xpath:position"],
        ["xpath=//button[contains(.,'Continue to Payment')]", "xpath:innerText"]
      ],
      "value": ""
    }, {
      "id": "e2b88792-09e7-4843-a513-de3f40fe8093",
      "comment": "",
      "command": "selectFrame",
      "target": "index=8",
      "targets": [
        ["index=8"]
      ],
      "value": ""
    }, {
      "id": "b633d468-f97a-479a-b20c-80e7d5a6ebf4",
      "comment": "",
      "command": "click",
      "target": "css=.Card .payment-option-info",
      "targets": [
        ["css=.Card .payment-option-info", "css:finder"],
        ["xpath=//div[@id='channel-template']/div[2]/div/div[3]/button/div/span[2]", "xpath:idRelative"],
        ["xpath=//div[3]/button/div/span[2]", "xpath:position"]
      ],
      "value": ""
    }, {
      "id": "7a58345a-d7f7-4976-b64f-9fabd719dee8",
      "comment": "",
      "command": "click",
      "target": "id=card-number",
      "targets": [
        ["id=card-number", "id"],
        ["css=#card-number", "css:finder"],
        ["xpath=//input[@id='card-number']", "xpath:attributes"],
        ["xpath=//div[@id='input-card-no-container']/div[2]/input", "xpath:idRelative"],
        ["xpath=//input", "xpath:position"]
      ],
      "value": ""
    }, {
      "id": "ab3e11af-ed51-4dcc-8d15-408b72daeb21",
      "comment": "",
      "command": "type",
      "target": "id=card-number",
      "targets": [
        ["id=card-number", "id"],
        ["css=#card-number", "css:finder"],
        ["xpath=//input[@id='card-number']", "xpath:attributes"],
        ["xpath=//div[@id='input-card-no-container']/div[2]/input", "xpath:idRelative"],
        ["xpath=//input", "xpath:position"]
      ],
      "value": "3453 4634 5341 3454 "
    }, {
      "id": "8063ff8c-3f80-466f-98fe-ea2b2145d285",
      "comment": "",
      "command": "click",
      "target": "id=expiry",
      "targets": [
        ["id=expiry", "id"],
        ["css=#expiry", "css:finder"],
        ["xpath=//input[@id='expiry']", "xpath:attributes"],
        ["xpath=//div[@id='card-exists--false']/div/div[2]/div[2]/input", "xpath:idRelative"],
        ["xpath=//div[2]/div[2]/input", "xpath:position"]
      ],
      "value": ""
    }, {
      "id": "179e2754-a7d0-4c8a-8c81-32db7cac192f",
      "comment": "",
      "command": "type",
      "target": "id=expiry",
      "targets": [
        ["id=expiry", "id"],
        ["css=#expiry", "css:finder"],
        ["xpath=//input[@id='expiry']", "xpath:attributes"],
        ["xpath=//div[@id='card-exists--false']/div/div[2]/div[2]/input", "xpath:idRelative"],
        ["xpath=//div[2]/div[2]/input", "xpath:position"]
      ],
      "value": "12/37"
    }, {
      "id": "aad44cd8-388a-4007-92a1-a93fc8d54c9c",
      "comment": "",
      "command": "click",
      "target": "id=cvv",
      "targets": [
        ["id=cvv", "id"],
        ["name=cvv", "name"],
        ["css=#cvv", "css:finder"],
        ["xpath=//input[@id='cvv']", "xpath:attributes"],
        ["xpath=//div[@id='card-exists--false']/div/div[3]/div[2]/input", "xpath:idRelative"],
        ["xpath=//div[3]/div[2]/input", "xpath:position"]
      ],
      "value": ""
    }, {
      "id": "78f37809-497c-4807-981a-d6b5ef3e23a0",
      "comment": "",
      "command": "type",
      "target": "id=cvv",
      "targets": [
        ["id=cvv", "id"],
        ["name=cvv", "name"],
        ["css=#cvv", "css:finder"],
        ["xpath=//input[@id='cvv']", "xpath:attributes"],
        ["xpath=//div[@id='card-exists--false']/div/div[3]/div[2]/input", "xpath:idRelative"],
        ["xpath=//div[3]/div[2]/input", "xpath:position"]
      ],
      "value": "234"
    }, {
      "id": "a042f143-f27d-4182-aef7-d57ca41dc1bf",
      "comment": "",
      "command": "click",
      "target": "id=card-pin-new",
      "targets": [
        ["id=card-pin-new", "id"],
        ["css=#card-pin-new", "css:finder"],
        ["xpath=//input[@id='card-pin-new']", "xpath:attributes"],
        ["xpath=//div[@id='card-pin-holder']/div[2]/input", "xpath:idRelative"],
        ["xpath=//div[4]/div[2]/input", "xpath:position"]
      ],
      "value": ""
    }, {
      "id": "c74c3bc0-3ed5-44b9-bbb4-25070c18a238",
      "comment": "",
      "command": "click",
      "target": "css=#keypads > .keypadbutton:nth-child(3)",
      "targets": [
        ["css=#keypads > .keypadbutton:nth-child(3)", "css:finder"],
        ["xpath=//button[@value='5']", "xpath:attributes"],
        ["xpath=//div[@id='keypads']/button[3]", "xpath:idRelative"],
        ["xpath=//button[3]", "xpath:position"],
        ["xpath=//button[contains(.,'5')]", "xpath:innerText"]
      ],
      "value": ""
    }, {
      "id": "e8aeb76a-dc52-4ac6-b817-382727ddb60e",
      "comment": "",
      "command": "click",
      "target": "css=#keypads > .keypadbutton:nth-child(3)",
      "targets": [
        ["css=#keypads > .keypadbutton:nth-child(3)", "css:finder"],
        ["xpath=//button[@value='5']", "xpath:attributes"],
        ["xpath=//div[@id='keypads']/button[3]", "xpath:idRelative"],
        ["xpath=//button[3]", "xpath:position"],
        ["xpath=//button[contains(.,'5')]", "xpath:innerText"]
      ],
      "value": ""
    }, {
      "id": "3b217079-5744-4fc4-88cd-ca632fc15525",
      "comment": "",
      "command": "doubleClick",
      "target": "css=#keypads > .keypadbutton:nth-child(3)",
      "targets": [
        ["css=#keypads > .keypadbutton:nth-child(3)", "css:finder"],
        ["xpath=//button[@value='5']", "xpath:attributes"],
        ["xpath=//div[@id='keypads']/button[3]", "xpath:idRelative"],
        ["xpath=//button[3]", "xpath:position"],
        ["xpath=//button[contains(.,'5')]", "xpath:innerText"]
      ],
      "value": ""
    }, {
      "id": "c8306fbb-437b-40fd-a4f9-3e39642193c4",
      "comment": "",
      "command": "click",
      "target": "css=#keypads > .keypadbutton:nth-child(3)",
      "targets": [
        ["css=#keypads > .keypadbutton:nth-child(3)", "css:finder"],
        ["xpath=//button[@value='5']", "xpath:attributes"],
        ["xpath=//div[@id='keypads']/button[3]", "xpath:idRelative"],
        ["xpath=//button[3]", "xpath:position"],
        ["xpath=//button[contains(.,'5')]", "xpath:innerText"]
      ],
      "value": ""
    }, {
      "id": "faf69e33-0776-4676-90dc-f1ec4dabc3ac",
      "comment": "",
      "command": "click",
      "target": "css=#keypads > .keypadbutton:nth-child(3)",
      "targets": [
        ["css=#keypads > .keypadbutton:nth-child(3)", "css:finder"],
        ["xpath=//button[@value='5']", "xpath:attributes"],
        ["xpath=//div[@id='keypads']/button[3]", "xpath:idRelative"],
        ["xpath=//button[3]", "xpath:position"],
        ["xpath=//button[contains(.,'5')]", "xpath:innerText"]
      ],
      "value": ""
    }, {
      "id": "79d83b69-a970-4a0b-8d6a-76a038088861",
      "comment": "",
      "command": "doubleClick",
      "target": "css=#keypads > .keypadbutton:nth-child(3)",
      "targets": [
        ["css=#keypads > .keypadbutton:nth-child(3)", "css:finder"],
        ["xpath=//button[@value='5']", "xpath:attributes"],
        ["xpath=//div[@id='keypads']/button[3]", "xpath:idRelative"],
        ["xpath=//button[3]", "xpath:position"],
        ["xpath=//button[contains(.,'5')]", "xpath:innerText"]
      ],
      "value": ""
    }, {
      "id": "8c6a25f9-7306-4c2c-b72a-bdf0b804a309",
      "comment": "",
      "command": "click",
      "target": "css=#keypads > .keypadbutton:nth-child(9)",
      "targets": [
        ["css=#keypads > .keypadbutton:nth-child(9)", "css:finder"],
        ["xpath=//button[@value='8']", "xpath:attributes"],
        ["xpath=//div[@id='keypads']/button[9]", "xpath:idRelative"],
        ["xpath=//button[9]", "xpath:position"],
        ["xpath=//button[contains(.,'8')]", "xpath:innerText"]
      ],
      "value": ""
    }, {
      "id": "b3b0be8f-ac08-41e0-b41e-02ca15881e1f",
      "comment": "",
      "command": "click",
      "target": "css=#keypads > .keypadbutton:nth-child(9)",
      "targets": [
        ["css=#keypads > .keypadbutton:nth-child(9)", "css:finder"],
        ["xpath=//button[@value='8']", "xpath:attributes"],
        ["xpath=//div[@id='keypads']/button[9]", "xpath:idRelative"],
        ["xpath=//button[9]", "xpath:position"],
        ["xpath=//button[contains(.,'8')]", "xpath:innerText"]
      ],
      "value": ""
    }, {
      "id": "bdd03123-0651-48fa-ba0f-f9eed4a7dde6",
      "comment": "",
      "command": "click",
      "target": "id=validateCardForm",
      "targets": [
        ["id=validateCardForm", "id"],
        ["css=#validateCardForm", "css:finder"],
        ["xpath=//button[@id='validateCardForm']", "xpath:attributes"],
        ["xpath=//div[@id='card-exists--false']/div[2]/button", "xpath:idRelative"],
        ["xpath=//div[2]/button", "xpath:position"],
        ["xpath=//button[contains(.,'Pay Now')]", "xpath:innerText"]
      ],
      "value": ""
    }, {
      "id": "690fdc34-f8d2-4783-8dc1-1da78bf344bd",
      "comment": "",
      "command": "click",
      "target": "id=card-number_unhappy",
      "targets": [
        ["id=card-number_unhappy", "id"],
        ["css=#card-number_unhappy", "css:finder"],
        ["xpath=//label[@id='card-number_unhappy']", "xpath:attributes"],
        ["xpath=//div[@id='input-card-no-container']/div[2]/label", "xpath:idRelative"],
        ["xpath=//div[2]/label", "xpath:position"],
        ["xpath=//label[contains(.,'Invalid card number')]", "xpath:innerText"]
      ],
      "value": ""
    }, {
      "id": "417637b0-a1d4-4642-b660-0d48ac3dd6e1",
      "comment": "",
      "command": "verifyText",
      "target": "id=card-number_unhappy",
      "targets": [
        ["id=card-number_unhappy", "id"],
        ["css=#card-number_unhappy", "css:finder"],
        ["xpath=//label[@id='card-number_unhappy']", "xpath:attributes"],
        ["xpath=//div[@id='input-card-no-container']/div[2]/label", "xpath:idRelative"],
        ["xpath=//div[2]/label", "xpath:position"],
        ["xpath=//label[contains(.,'Invalid card number')]", "xpath:innerText"]
      ],
      "value": "Invalid card number"
    }, {
      "id": "54cad936-c348-4616-9fff-3b16cdda0a8e",
      "comment": "",
      "command": "close",
      "target": "",
      "targets": [],
      "value": ""
    }]
  }],
  "suites": [{
    "id": "ddb58e57-ae0c-4765-a18d-c85c7751a3de",
    "name": "konga project to verify invalid card NO",
    "persistSession": false,
    "parallel": false,
    "timeout": 300,
    "tests": ["bc680739-54e0-4303-85e7-f242b01ad857"]
  }],
  "urls": ["http://konga.com/"],
  "plugins": []
}