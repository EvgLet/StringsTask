import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LetlabReg2 {

    public static void checkEmail(String sEmail) {
        String sDomen = "[a-z][a-z[0-9]\u005F\u002E\u002D]*[a-z||0-9]";

//String sDomen2 = “([a-z]){2,4}”;
// variant two (net||org||ru||info … ||jp)
        String sDomen2 = "(net||org||ru||info)";

        Pattern p = Pattern.compile(sDomen + "@" + sDomen + "\u002E" + sDomen2);
        Matcher m = p.matcher(sEmail.toLowerCase());

        String sResult = m.matches()?sEmail + ": passed.":sEmail + ": not passed.";

        System.out.println(sResult);
    }

    public static void main(String[] args) {

        checkEmail("mail@mail.ru");
        checkEmail("mail@mail.org");
        checkEmail("mail@@@mail.info");
        checkEmail("mail@mail.");
        checkEmail("mail@mail");
        checkEmail("sgfdsg");
        checkEmail("m.a.i.l@mail.ru");
        checkEmail("_mail@mail.ru");
        checkEmail("mail_@mail.ru");
        checkEmail("mail@_mail.ru");
        checkEmail("mail@mail_.ru");
        checkEmail("1mail@mail.ru");
        checkEmail("mail1@mail.ru");
        checkEmail("mail@mail1.ru");
        checkEmail("m___ail@mail.ru");
        checkEmail("C_fdhsfk4@mai32l.ru");
        checkEmail("ma*il@mail.ru");
        checkEmail("mail@ma^il.ru");
        checkEmail("mail@mail.my.my1.ru");
        checkEmail("@mail.my.my1.ru");
        checkEmail("mail@mail.my.my1.u");
        checkEmail("mail@.ru");
        checkEmail("m l@ddd.ru");
        checkEmail("mail@d d.r u");
    }
}