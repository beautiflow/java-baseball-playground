package baseball.domain;

public class ValidationUtils {
    public static boolean validNo(int i) {
        if(i <= 9){
            return true;
        }
        return false;
    }
}
