public class BonusMilesService {

    public int calculate (int cost) {

        int bonus = 20;
        int miles = 1;
        int bonusMile = cost * miles / bonus;
        System.out.println(bonusMile);

        return bonusMile;
    }
}
