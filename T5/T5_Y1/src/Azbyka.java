public class Azbyka implements Decoder {
    @Override
    public String encode(String source) {
        char[] abcCyr = {'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я', ' '};
        String[] abcMorze = { ".-", "-...", ".--", "---.", "-..", ".", "...-", "--..", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "...", "-", "..-", "..-.", "....", "-.-.", "---.", "----", "--.-", ".--.-.", "-.--", "-..-", "..-..", "..--", ".-.-", " "};
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < source.length(); i++) {
            for (int x = 0; x < abcMorze.length; x++) {
                if (source.charAt(i) == abcCyr[x]) {
                    builder.append(abcMorze[x] + " ");
                }
            }
        }
        return builder.toString();
    }

    @Override
    public String decode(String encoded) {
        String[] subStr;
        String str = encoded;
        subStr = str.split(" ");
        char[] abcCyr = {'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я', ' '};
        String[] abcMorze = { ".-", "-...", ".--", "---.", "-..", ".", "...-", "--..", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "...", "-", "..-", "..-.", "....", "-.-.", "---.", "----", "--.-", ".--.-.", "-.--", "-..-", "..-..", "..--", ".-.-", " "};
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < subStr.length; i++) {
            for (int x = 0; x < abcMorze.length; x++) {
                if (subStr[i].contains(abcMorze[x])) {
                    builder.append(abcCyr[x]);
                    break;

                }
            }
        }
        return builder.toString();
    }
}
