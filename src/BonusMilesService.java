public class BonusMilesService {
    public int calculate(int price) {
        int bonus = 20;
        int bonusMiles = 1;
        int miles = price * bonusMiles / bonus ;
        return miles;
    }
}