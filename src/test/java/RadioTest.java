
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void testnext() {
        Radio radio = new Radio();
        radio.setCurrentStation(3);

        radio.next();


        int expected = 4;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testnext0_1() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.next();


        int expected = 1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testnext1_2() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);

        radio.next();


        int expected = 2;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testnext8_9() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);

        radio.next();


        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testnext9_0() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.next();


        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testprev() {
        Radio radio = new Radio();
        radio.setCurrentStation(3);

        radio.prev();


        int expected = 2;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testprev0_9() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.prev();


        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testprev9_8() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.prev();


        int expected = 8;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testprev2_1() {
        Radio radio = new Radio();
        radio.setCurrentStation(2);

        radio.prev();


        int expected = 1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testprev1_0() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);

        radio.prev();


        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testIncreaseVol() {
        Radio radio = new Radio();
        radio.setCurrentVolume(55);

        radio.increaseVolume();


        int expected = 56;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testIncreaseVol99_100() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);

        radio.increaseVolume();


        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testIncreaseVol100_100() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        radio.increaseVolume();


        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testIncreaseVol0_1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.increaseVolume();


        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testIncreaseVol1_2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);

        radio.increaseVolume();


        int expected = 2;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testDecreaseVol() {
        Radio radio = new Radio();
        radio.setCurrentVolume(55);

        radio.decreaseVolume();


        int expected = 54;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testDecreaseVol100_99() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        radio.decreaseVolume();


        int expected = 99;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testDecreaseVol99_98() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);

        radio.decreaseVolume();


        int expected = 98;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testDecreaseVol1_0() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);

        radio.decreaseVolume();


        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testDecreaseVol0_0() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.decreaseVolume();


        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}
