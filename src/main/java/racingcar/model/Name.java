package racingcar.model;

import java.util.Objects;

public class Name {

    private static final int NAME_MAX_LENGTH = 5;

    private String name;

    protected Name(String name) {
        this.name = name;
    }

    public static Name from(String name) {
        if (isBlank(name)) {
            throw new IllegalArgumentException("[ERROR] - 잘못된 값을 입력했습니다.");
        }
        if (isOverNameLength(name)) {
            throw new IllegalArgumentException("[ERROR] - 이름이 5글자를 초과합니다.");
        }

        return new Name(name);
    }

    private static boolean isBlank(String testName) {
        return Objects.isNull(testName) || testName.trim().isEmpty();
    }

    private static boolean isOverNameLength(String testName) {
        return testName.length() > NAME_MAX_LENGTH;
    }

    public String getName() {
        return this.name;
    }
}
