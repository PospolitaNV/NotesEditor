package notes.Utils;

public class InputCheckUtil {
    //Можно заменить весь метод на StringUtils.isEmpty(string) ---- см. добавление зависимостей через Maven (ApacheCommons)
    public static boolean isInputValid(String string) {
        return string != null && string.length() > 0;
    }
}
