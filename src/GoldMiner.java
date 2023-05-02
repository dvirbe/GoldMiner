import javax.swing.*;

public class GoldMiner {
    private static int currentMoney;
    private static int tntCount;
    private static double strength;
    private static double luck;
    public final ImageIcon minerImage;
    private final int MINER_SIZE = 125;
    private final int START_AMOUNT = 0;
    private final int START_STRENGTH_POWER = 1;
    private final int START_LUCK = 1;

    public GoldMiner() {
        this.minerImage = Utils.upscaleImage("src/ObjectPhotos/Gold_Miner.png", MINER_SIZE, MINER_SIZE);
        this.currentMoney = START_AMOUNT;
        this.tntCount = 10;
        this.strength = START_STRENGTH_POWER;
        this.luck = START_LUCK;
    }

    public static void addCurrentMoney(int amount) {
        currentMoney += amount;
    }

    public int getCurrentMoney() {
        return currentMoney;
    }

    public void addTntCount() {
        tntCount++;
    }

    public int getTntCount() {
        return tntCount;
    }

    public static double getStrength() {
        double temp = Math.round(strength * 100);
        return temp / 100;
    }

    public static double getLuck() {
        double temp = Math.round(luck * 100);
        return temp / 100;
    }

    public void addStrength() {
        strength += 0.15;
    }

    public void addLuck() {
        luck += 0.10;
    }

    public boolean canBuy(int cost) {
        return cost < currentMoney;
    }
}
