public final class StringUtil {

    //Legacy Colourparser
    public static String getLegacyColour(String text) {

        if (text.contains("#")) {
            Pattern pattern = Pattern.compile("#[a-fA-F\\d]{6}");
            Matcher match = pattern.matcher(text);

            while (match.find()) {
                String color = text.substring(match.start(), match.end());
                text = text.replace(color, ChatColor.of(color) + "");

                match = pattern.matcher(text);
            }
        }

        return ChatColor.translateAlternateColorCodes('&', text);
    }

    //Adventure Legacy Parser
    public static TextComponent getAdventureColour(String text) {

        LegacyComponentSerializer serializer = LegacyComponentSerializer.builder()
                .character('&')
                .hexCharacter('#')
                .hexColors()
                .build();

        return serializer.deserialize(text);
    }
}
