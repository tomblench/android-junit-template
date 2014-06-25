android-junit-template
======================

Template for running junit tests on device or emulator.

```
bash-3.2$ gradle connectedCheck
...
:connectedCheck

BUILD SUCCESSFUL

Total time: 35.53 secs
bash-3.2$ cat build/androidTest-results/connected/TEST-AVD_for_Galaxy_Nexus_by_Google\(AVD\)\ -\ 4.4.2-android-junit-template-.xml 
<?xml version='1.0' encoding='UTF-8' ?>
<testsuite name="com.cloudant.basictest.BasicTest" tests="2" failures="0" errors="0" time="0.087" timestamp="2014-06-25T10:33:25" hostname="localhost">
  <properties device="AVD_for_Galaxy_Nexus_by_Google(AVD) - 4.4.2" flavor="" project="android-junit-template" />
  <testcase name="testAndroidTestCaseSetupProperly" classname="com.cloudant.basictest.BasicTest" time="0.026" />
  <testcase name="testDTest1" classname="com.cloudant.basictest.BasicTest" time="0.0" />
</testsuite>
```
