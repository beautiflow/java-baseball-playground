package baseball.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ValidationUtilsTest {

    @Test
    @DisplayName("야구_숫자_1_9_검증")
    void 야구_숫자_1_9_검증() {
        assertThat(ValidationUtils.validNo(9)).isTrue();
    }
}
