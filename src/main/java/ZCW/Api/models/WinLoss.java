package ZCW.Api.models;

public class WinLoss {

    private final Integer win;
    private final Integer lose;

    public WinLoss(Integer win, Integer lose) { this.win = win; this.lose = lose; }

    public Integer getWin() { return win; }
    public Integer getLose() { return lose; }
}
