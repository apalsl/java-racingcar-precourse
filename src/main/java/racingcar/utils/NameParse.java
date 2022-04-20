package racingcar.utils;

import org.junit.jupiter.api.Test;

import java.util.*;

public class NameParse {


    public static String[] parseName(String input) {
        if (isBlank(input)) {
            throw new IllegalArgumentException("[ERROR] 잘못된 입력입니다.");
        }
        if (hasDuplicateName(input)) {
            throw new IllegalArgumentException("[ERROR] 중복된 이름을 입력하였습니다.");
        }

        return input.split(",");
    }

    private static boolean hasDuplicateName(String input) {
        String[] splitNameResult = input.split(",");
        Set<String> duplicateCheckSet =  new HashSet<>();
        for (String name : splitNameResult) {
            duplicateCheckSet.add(name);
        }

        return splitNameResult.length != duplicateCheckSet.size();
    }

    private static boolean isBlank(String input) {
        return Objects.isNull(input) || input.trim().isEmpty();
    }
}
