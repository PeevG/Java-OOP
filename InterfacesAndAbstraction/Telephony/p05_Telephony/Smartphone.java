package p05_Telephony;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Smartphone implements Browsable, Callable {
    private List<String> numbers;
    private List<String> urls;

    public Smartphone(List<String> numbers, List<String> urls) {
        this.numbers = numbers;
        this.urls = urls;
    }

    @Override
    public String call() {
        Pattern pattern = Pattern.compile("^[0-9]+$");
        StringBuilder sb = new StringBuilder();

        for (String number :this.numbers) {
            if (this.isValid(number, pattern)) {
                sb.append(String.format("Calling... %s", number));
                sb.append(System.lineSeparator());
            } else {
               sb.append("Invalid number!");
            }
        } return sb.toString().trim();
    }

    @Override
    public String browse() {
        Pattern pattern = Pattern.compile("^[^0-9]+$");
        StringBuilder sb = new StringBuilder();

        for (String url :this.urls) {
            if (this.isValid(url, pattern)) {
                sb.append(String.format("Browsing: %s!", url));
                sb.append(System.lineSeparator());
            } else {
                sb.append("Invalid URL!");
            }
        } return sb.toString().trim();
    }

    private boolean isValid(String number, Pattern pattern) {
        Matcher matcher = pattern.matcher(number);
        return matcher.find();
    }
}
