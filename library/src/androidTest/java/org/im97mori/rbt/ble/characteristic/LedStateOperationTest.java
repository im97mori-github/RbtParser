package org.im97mori.rbt.ble.characteristic;

import android.bluetooth.BluetoothGattCharacteristic;
import android.os.Parcel;

import org.im97mori.ble.ad.AdvertisingDataConstants;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LedStateOperationTest {

    @Test
    public void test001() {
        byte[] data = new byte[3];
        data[0] = (byte) ((LedStateOperation.START_UP_RAINBOW) & 0xff);
        data[1] = (byte) ((LedStateOperation.ERROR_NONE) & 0xff);
        data[2] = (byte) ((LedStateOperation.CONNECTION_NONE) & 0xff);

        BluetoothGattCharacteristic bluetoothGattCharacteristic = new BluetoothGattCharacteristic(AdvertisingDataConstants.BASE_UUID, 0, 0);
        bluetoothGattCharacteristic.setValue(data);

        LedStateOperation ledStateOperation = new LedStateOperation(bluetoothGattCharacteristic);
        assertEquals(LedStateOperation.START_UP_RAINBOW, ledStateOperation.getStartUp());
        assertEquals(LedStateOperation.ERROR_NONE, ledStateOperation.getError());
        assertEquals(LedStateOperation.CONNECTION_NONE, ledStateOperation.getConnection());
    }

    @Test
    public void test002() {
        byte[] data = new byte[3];
        data[0] = (byte) ((LedStateOperation.START_UP_BLUE) & 0xff);
        data[1] = (byte) ((LedStateOperation.ERROR_RED) & 0xff);
        data[2] = (byte) ((LedStateOperation.CONNECTION_GREEN) & 0xff);

        BluetoothGattCharacteristic bluetoothGattCharacteristic = new BluetoothGattCharacteristic(AdvertisingDataConstants.BASE_UUID, 0, 0);
        bluetoothGattCharacteristic.setValue(data);

        LedStateOperation ledStateOperation = new LedStateOperation(bluetoothGattCharacteristic);
        assertEquals(LedStateOperation.START_UP_BLUE, ledStateOperation.getStartUp());
        assertEquals(LedStateOperation.ERROR_RED, ledStateOperation.getError());
        assertEquals(LedStateOperation.CONNECTION_GREEN, ledStateOperation.getConnection());
    }


    @Test
    public void test012() {
        byte[] data = new byte[3];
        data[0] = (byte) ((LedStateOperation.START_UP_BLUE) & 0xff);
        data[1] = (byte) ((LedStateOperation.ERROR_RED) & 0xff);
        data[2] = (byte) ((LedStateOperation.CONNECTION_GREEN) & 0xff);

        BluetoothGattCharacteristic bluetoothGattCharacteristic = new BluetoothGattCharacteristic(AdvertisingDataConstants.BASE_UUID, 0, 0);
        bluetoothGattCharacteristic.setValue(data);

        LedStateOperation result1 = new LedStateOperation(bluetoothGattCharacteristic);
        Parcel parcel = Parcel.obtain();
        result1.writeToParcel(parcel, 0);
        parcel.setDataPosition(0);
        LedStateOperation result2 = LedStateOperation.CREATOR.createFromParcel(parcel);

        assertEquals(result1.getStartUp(), result2.getStartUp());
        assertEquals(result1.getError(), result2.getError());
        assertEquals(result1.getConnection(), result2.getConnection());
    }
}
