package study;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SetTest {
    private Set<Integer> numbers;

    @BeforeEach
    void setUp(){
        numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
    }

    // Test Case 구현

    // 요구사항1
    @Test
    @DisplayName("size 크기 확인")
    // Set 의 size() 메소드를 활용해 Set의 크기를 확인하는 학습테스트 구현
        void size(){
        assertThat(numbers.size()).isEqualTo(3);
    }

    // 요구사항 2

    @DisplayName("Set 값이 존재하는지 확인")
    @ParameterizedTest
    @ValueSource(ints = {1,2,3}) // 범위
    // Set의 contains() 메소드를 활용해 1,2,3 의 값이 존재하는 지를 확인하는 학습테스트 구현
    void contains_1(int input) {
        assertThat(numbers.contains(input)); // JUnit 의 ParameterizedTest 를 활용해 중복 코드를 제거
    }

    @DisplayName("Set 입력값 따른 결과값 확인")
    @CsvSource(value = {"1:true", "2:true", "3:true", "4:false", "5:false"}, delimiter = ':')
    @ParameterizedTest
    void contains_2 (int input, boolean expected){
        boolean actualValue = numbers.contains(input);
        assertEquals(expected, actualValue);

    }


}
