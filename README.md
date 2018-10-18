
# MobileSplendoProject

Please note that the project still being developed!

INSTALLATION:

    1. Appium Desktop - http://appium.io/
    2. Install BlueStacks - https://www.bluestacks.com/ru/index.html#gref
    3. Install Android Studio - https://developer.android.com/studio/index.html
    4. Install Android SDK - inside Android studio or separately
    5. Add environment variables

Configuration:
    1. Appium for inspection.
    - run Appium
    - Start Server;
    - Start inspector Session;
    - Add to JSON Representation next Json:
    https://github.com/SlavaKlepikov/MobileSplendoProject/blob/master/src/main/java/splendo/desired_capabilities_appium.txt
    - Save
    - Start

Troubleshooting & FAQ:

Problem 1: InvalidSelectorException: Message: Locator Strategy 'css selector' is not supported for this session.
Problem 2: NoClassDefFoundError:OkHttpClient$Factory

Solution 1: install release Appium 1.7.0 or lower.
Solution 2: Set dependencies to pom.xml:
    org.seleniumhq.selenium up to 3.14.0
    io.appium up to 6.1.0

Run:
    1. Run emulator BlueStack.
    2. Run Appium.
    3. Run test mvn clean test.
