package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class StringTest {
    @Test
    @DisplayName("문자 바꾸기")
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    // 요구사항 1
    @Test
    @DisplayName(", 로 쪼개기")
    void split() {
        // "1,2" 를 , 로 split 했을 때 1 과 2로 잘 분리되는지 확인하는 학습 테스트 구현
        String[] actual_1 = "1, 2".split(",");
        assertThat(actual_1).contains("1");
        // assertThat().contains(); => 순서, 중복을 무시하는 대신 원소값과 개수가 정확하게 일치하는지 검사
    }
    @Test
    @DisplayName("1을 ,로 쪼개면 1이다.")
        void split2 (){
            // "1"을 , 로 split 했을 때 1만을 포함하는 배열이 반환되는지에 대한 학습 테스트 구현
            String[] actual_2 = "1".split(",");
            assertThat(actual_2).containsExactly("1");
            // assertThat().containsExactly(); => 순서와 중복을 포함해서 원소값과 개수가 정확하게 일치하는지 검사

            // contains와 containsExactly 는 순서와 중복에서 차이가 존재한다.
        }



    // 요구사항 2
    @DisplayName("() 제거하기")
    @Test
    void substring(){
        // "(1,2)"  값이 주어졌을 때 String의 substring() 메소드를 활용해 ()를 제거하고 "1,2" 를 반환
        String actual = "(1,2)".substring(1, 4);
        assertThat(actual).isEqualTo("1,2");
    }

    @DisplayName("특정위치 문자 가져오기")
    @Test
    void charAt(){
        char a = "abc".charAt(0);
        assertThat(a).isEqualTo('a');
    }

    // 요구사항 3
    // @DisplayName 을 통해 각각의 Test 에 대한 이름을 정의할 수 있음
    @DisplayName("특정 위치 문자 가져오기 예외 has")
    @Test
    public void testException(){
        assertThatThrownBy(()->{
            "abc".charAt(10);
        }).isInstanceOf(IndexOutOfBoundsException.class)
                .hasMessageContaining("10");
    }

    // assertThatThrownBy() 와 유사하지만 assertThatExceptionOfType() 은 Exception 의 시작점을 특정할 수 있다.
    @DisplayName("특정위치 문자 가져오기 예외 with")
    @Test
    void charAt_2(){
        String actual = "abc";
        int index = 10;

        assertThatExceptionOfType(StringIndexOutOfBoundsException.class)
                .isThrownBy(()-> actual.charAt(index))
                .withMessageMatching("Index: 2, Size: 2");
    }

}
