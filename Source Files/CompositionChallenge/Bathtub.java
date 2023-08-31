public class Bathtub {

    private String faucet;
    private boolean isHot;

    public Bathtub(String faucet, boolean isHot) {
        this.faucet = faucet;
        this.isHot = isHot;
    }

    public String getFaucet() {
        return this.faucet;
    }

    public boolean getIsHot () {
        return this.isHot;
    }
}
