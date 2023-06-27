package data;

public enum Language {
    DE("de"),
    EN("en"),
    ES("es"),
    IT("it");

    private String lang;

    Language(String lang) {
        this.lang = lang;
    }

    public String getLang() {
        return lang;
    }
}
