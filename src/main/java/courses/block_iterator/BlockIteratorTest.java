package courses.block_iterator;

import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Треба написати клас BlockIterator - реалізацію інтерфейсу Iterator.
 * <p>
 * class BlockIterator implements Iterator<List<String>> {
 * BlockIterator(Iterator<String> lines, String regexp);
 * boolean hasNext() { … } List<String>
 * next() {
 * …
 * }
 * }
 * <p>
 * Конструктор на вхід приймає ітератор по колекції рядків та регулярний вираз.
 * <p>
 * Для пояснення постановки задачі та для написання тестів використовується такий приклад:
 * <p>
 * Це колекція рядків (перший параметр конструктора):
 * lines = [ "123", "- test -", "start", "end", "test123", ]
 * <p>
 * Це регексп:
 * regexp = ".*test.*”
 * <p>
 * Перший виклик методу next() на колекції lines дає таку колекцію (підсписок - від першого входження регекспу і до наступного, але не включаючи його):
 * next() --> [ "- test -“, "start”, "end”, ]
 * <p>
 * Другий виклик методу next() повертає ось такий підсписок (від наступного входження регекспу і до кінця, оскільки наступного входження вже немає):
 * next() --> [ "test123” ]
 * <p>
 * Бізнес-логіка методу hasNext() подібна до next(), але замість списку повертається true/false
 * <p>
 * Код потрібно покрити юніт-тестами (JUnit)
 * <p>
 * Час на реалізацію (разом з тестами) - 40-50 хв
 * <p>
 * Важливий коментар – конструктор приймає на вхід не колекцію, а ітератор: BlockIterator(Iterator<String> lines, String regexp); Багатьох кандидатів це конф’юзить
 * <p>
 * Другий важливий коментар – в конструкторі вхідні дані не можна заганяти в пам’ять (список, масив і т.д.), чи робити ще якісь перетворення. Відні дані можуть бути дуже великими (десятки мегабайт) – завантажувати в пам’ять не можна, треба обробляти на льоту.
 * <p>
 * Третій і останній важливий нюанс – на співбесіді з Пейманом треба зробити так, щоб у нього склалось враження, що ти це завдання бачиш перший раз :)
 * <p>
 * <p>
 * І ще один момент: Метод hasNext() - ідемпотентний: якщо його викликати один, два, десять разів – результат має бути однаковий
 */
class BlockIterator implements Iterator<List<String>> {

    private Matcher matcher;

    public BlockIterator(Iterator<String> lines, String regexp) {
        if (lines.hasNext()) {
            String line = lines.next();
            matcher = Pattern.compile(regexp).matcher(line);
        }
    }

    @Override
    public boolean hasNext() {
        return matcher.find();
    }

    @Override
    public List<String> next() {
        return null;
    }
}

public class BlockIteratorTest {

    public static final String[] lines = new String[]{"123", "- test -", "start", "end", "test123"};


}
