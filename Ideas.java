import org.jetbrains.annotations.NotNull;
import javax.annotation.Nonnegative;

public final class NumberConversion {

    @NotNull
    public static String getAsSmallNumber(final @Nonnegative int number) {
        final var numberString = String.valueOf(number);
        final StringBuilder temp = new StringBuilder();
        for (final char c : numberString.toCharArray()) {

            switch (c) {
                case '0' -> temp.append("⁰");
                case '1' -> temp.append("¹");
                case '2' -> temp.append("²");
                case '3' -> temp.append("³");
                case '4' -> temp.append("⁴");
                case '5' -> temp.append("⁵");
                case '6' -> temp.append("⁶");
                case '7' -> temp.append("⁷");
                case '8' -> temp.append("⁸");
                case '9' -> temp.append("⁹");
            }
        }
        return temp.toString();
    }
}
