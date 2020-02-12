package ua.testing.controller;

public interface RegexContainer {
    String FIRST_NAME_REGEX = "[A-Z][a-z]{1,20}";
    String LAST_NAME_REGEX = "[A-Z][a-z]{1,20}";
    String NICKNAME_REGEX = "([A-Za-z@_-]\\d*){1,20}";
}
