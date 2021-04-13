package lesson_4_White_Box_Practice.fileEditor.test;

public enum TestGroups {
    REQUIRE_FILE_DELETE ("RequireFileDelete");


    String testGroupName;

    TestGroups(String testGroupName) {
        this.testGroupName = testGroupName;
    }
}
