package family_tree.model.Human;

public class FamilyInfoProvider {
    private Human human;

    public FamilyInfoProvider(Human human) {
        this.human = human;
    }

    public String getFatherInfo() {
        String result = "";
        if (human.getFather() != null) {
            result += human.getFather();
        } else result += "информация отсутствует";
        return result;
    }
    
    public String getMotherInfo() {
        String result = "";
        if (human.getMother() != null) {
            result += human.getMother();
        } else result += "информация отсутствует";
        return result;
    }

    public String getSpouseInfo() {
        String res = "";
        if (human.getSpousa() != null) {
            res += "супруга " + human.getSpousa();
        } else res += "холост";
        return res;
    }

    public String getSpousaInfo() {
        String res = "";
        if (human.getSpouse() != null) {
            res += "супруг " + human.getSpouse();
        } else res += "не замужем";
        return res;
    }

    public String getChildrenInfo()
    {
        StringBuilder res = new StringBuilder();
        if (human.getChildren()!= null)
        {
            res = human.getChildren();
        }
        else res.append("детей нет;");
        return res.toString();
    }
}
