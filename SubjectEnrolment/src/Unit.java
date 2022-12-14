public class Unit {
    private String code;
    private String title;
    private UnitType type;

    public Unit(String code, String title, UnitType type) {
        this.code = code;
        this.title = title;
        this.type = type;
    }

    @Override
    public String toString() {
        return "\nUnit{" +
                "code='" + code + '\'' +
                ", title='" + title + '\'' +
                ", type=" + type +
                '}';
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public UnitType getType() {
        return type;
    }

    public void setType(UnitType type) {
        this.type = type;
    }
}
