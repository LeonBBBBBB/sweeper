package sweeper;

/**
 * Project: JavaSweeper
 * Author: Leonid Balashov (l.balashov@robot-open.ru)
 * Date: 31.08.2021 15:39
 */
public enum Box {
    ZERO,
    NUM1,
    NUM2,
    NUM3,
    NUM4,
    NUM5,
    NUM6,
    NUM7,
    NUM8,
    BOMB,
    OPENED,
    CLOSED,
    FLAGED,
    BOMBED,
    NOBOMB;

    public Object image;

    public Box getNextNamberBox() {
        return Box.values()[this.ordinal() + 1];
    }

    public int getNumber() {
        return this.ordinal();
    }
}
