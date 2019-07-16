package org.im97mori.rbt.ble.characteristic;

import android.bluetooth.BluetoothGattCharacteristic;
import android.os.Parcel;

import org.im97mori.ble.ad.AdvertisingDataConstants;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AccelerationLoggerControlTest {

    @Test
    public void test001() {
        byte[] data = new byte[7];
        data[ 0] = (byte) ((AccelerationLoggerControl.LOG_STOP) & 0xff);
        data[ 1] = (byte) ((AccelerationLoggerControl.RANGE_OF_DETECTION_FIXED_VALUE) & 0xff);
        data[ 2] = (byte) ((AccelerationLoggerControl.ODR_1_HZ) & 0xff);
        data[ 3] = (byte) ((0x01) & 0xff);
        data[ 4] = (byte) ((0x00) & 0xff);
        data[ 5] = (byte) ((0x01) & 0xff);
        data[ 6] = (byte) ((0x00) & 0xff);

        BluetoothGattCharacteristic bluetoothGattCharacteristic = new BluetoothGattCharacteristic(AdvertisingDataConstants.BASE_UUID, 0, 0);
        bluetoothGattCharacteristic.setValue(data);

        AccelerationLoggerControl accelerationLoggerControl = new AccelerationLoggerControl(bluetoothGattCharacteristic);
        assertEquals(AccelerationLoggerControl.LOG_STOP, accelerationLoggerControl.getLoggerCondition());
        assertEquals(AccelerationLoggerControl.RANGE_OF_DETECTION_FIXED_VALUE, accelerationLoggerControl.getRangeOfDetection());
        assertEquals(AccelerationLoggerControl.ODR_1_HZ, accelerationLoggerControl.getOdrSetting());
        assertEquals(1, accelerationLoggerControl.getStartPage());
        assertEquals(1, accelerationLoggerControl.getEndPage());
    }

    @Test
    public void test002() {
        byte[] data = new byte[7];
        data[ 0] = (byte) ((AccelerationLoggerControl.LOG_START) & 0xff);
        data[ 1] = (byte) ((AccelerationLoggerControl.RANGE_OF_DETECTION_FIXED_VALUE) & 0xff);
        data[ 2] = (byte) ((AccelerationLoggerControl.ODR_10_HZ) & 0xff);
        data[ 3] = (byte) ((0x00) & 0xff);
        data[ 4] = (byte) ((0x28) & 0xff);
        data[ 5] = (byte) ((0x00) & 0xff);
        data[ 6] = (byte) ((0x28) & 0xff);

        BluetoothGattCharacteristic bluetoothGattCharacteristic = new BluetoothGattCharacteristic(AdvertisingDataConstants.BASE_UUID, 0, 0);
        bluetoothGattCharacteristic.setValue(data);

        AccelerationLoggerControl accelerationLoggerControl = new AccelerationLoggerControl(bluetoothGattCharacteristic);
        assertEquals(AccelerationLoggerControl.LOG_START, accelerationLoggerControl.getLoggerCondition());
        assertEquals(AccelerationLoggerControl.RANGE_OF_DETECTION_FIXED_VALUE, accelerationLoggerControl.getRangeOfDetection());
        assertEquals(AccelerationLoggerControl.ODR_10_HZ, accelerationLoggerControl.getOdrSetting());
        assertEquals(10240, accelerationLoggerControl.getStartPage());
        assertEquals(10240, accelerationLoggerControl.getEndPage());
    }

    @Test
    public void test003() {
        byte[] data = new byte[7];
        data[ 0] = (byte) ((AccelerationLoggerControl.LOG_START) & 0xff);
        data[ 1] = (byte) ((AccelerationLoggerControl.RANGE_OF_DETECTION_FIXED_VALUE) & 0xff);
        data[ 2] = (byte) ((AccelerationLoggerControl.ODR_25_HZ) & 0xff);
        data[ 3] = (byte) ((0x00) & 0xff);
        data[ 4] = (byte) ((0x28) & 0xff);
        data[ 5] = (byte) ((0x00) & 0xff);
        data[ 6] = (byte) ((0x28) & 0xff);

        BluetoothGattCharacteristic bluetoothGattCharacteristic = new BluetoothGattCharacteristic(AdvertisingDataConstants.BASE_UUID, 0, 0);
        bluetoothGattCharacteristic.setValue(data);

        AccelerationLoggerControl accelerationLoggerControl = new AccelerationLoggerControl(bluetoothGattCharacteristic);
        assertEquals(AccelerationLoggerControl.LOG_START, accelerationLoggerControl.getLoggerCondition());
        assertEquals(AccelerationLoggerControl.RANGE_OF_DETECTION_FIXED_VALUE, accelerationLoggerControl.getRangeOfDetection());
        assertEquals(AccelerationLoggerControl.ODR_25_HZ, accelerationLoggerControl.getOdrSetting());
        assertEquals(10240, accelerationLoggerControl.getStartPage());
        assertEquals(10240, accelerationLoggerControl.getEndPage());
    }

    @Test
    public void test004() {
        byte[] data = new byte[7];
        data[ 0] = (byte) ((AccelerationLoggerControl.LOG_START) & 0xff);
        data[ 1] = (byte) ((AccelerationLoggerControl.RANGE_OF_DETECTION_FIXED_VALUE) & 0xff);
        data[ 2] = (byte) ((AccelerationLoggerControl.ODR_100_HZ) & 0xff);
        data[ 3] = (byte) ((0x00) & 0xff);
        data[ 4] = (byte) ((0x28) & 0xff);
        data[ 5] = (byte) ((0x00) & 0xff);
        data[ 6] = (byte) ((0x28) & 0xff);

        BluetoothGattCharacteristic bluetoothGattCharacteristic = new BluetoothGattCharacteristic(AdvertisingDataConstants.BASE_UUID, 0, 0);
        bluetoothGattCharacteristic.setValue(data);

        AccelerationLoggerControl accelerationLoggerControl = new AccelerationLoggerControl(bluetoothGattCharacteristic);
        assertEquals(AccelerationLoggerControl.LOG_START, accelerationLoggerControl.getLoggerCondition());
        assertEquals(AccelerationLoggerControl.RANGE_OF_DETECTION_FIXED_VALUE, accelerationLoggerControl.getRangeOfDetection());
        assertEquals(AccelerationLoggerControl.ODR_100_HZ, accelerationLoggerControl.getOdrSetting());
        assertEquals(10240, accelerationLoggerControl.getStartPage());
        assertEquals(10240, accelerationLoggerControl.getEndPage());
    }

    @Test
    public void test005() {
        byte[] data = new byte[7];
        data[ 0] = (byte) ((AccelerationLoggerControl.LOG_START) & 0xff);
        data[ 1] = (byte) ((AccelerationLoggerControl.RANGE_OF_DETECTION_FIXED_VALUE) & 0xff);
        data[ 2] = (byte) ((AccelerationLoggerControl.ODR_200_HZ) & 0xff);
        data[ 3] = (byte) ((0x00) & 0xff);
        data[ 4] = (byte) ((0x28) & 0xff);
        data[ 5] = (byte) ((0x00) & 0xff);
        data[ 6] = (byte) ((0x28) & 0xff);

        BluetoothGattCharacteristic bluetoothGattCharacteristic = new BluetoothGattCharacteristic(AdvertisingDataConstants.BASE_UUID, 0, 0);
        bluetoothGattCharacteristic.setValue(data);

        AccelerationLoggerControl accelerationLoggerControl = new AccelerationLoggerControl(bluetoothGattCharacteristic);
        assertEquals(AccelerationLoggerControl.LOG_START, accelerationLoggerControl.getLoggerCondition());
        assertEquals(AccelerationLoggerControl.RANGE_OF_DETECTION_FIXED_VALUE, accelerationLoggerControl.getRangeOfDetection());
        assertEquals(AccelerationLoggerControl.ODR_200_HZ, accelerationLoggerControl.getOdrSetting());
        assertEquals(10240, accelerationLoggerControl.getStartPage());
        assertEquals(10240, accelerationLoggerControl.getEndPage());
    }

    @Test
    public void test006() {
        byte[] data = new byte[7];
        data[ 0] = (byte) ((AccelerationLoggerControl.LOG_START) & 0xff);
        data[ 1] = (byte) ((AccelerationLoggerControl.RANGE_OF_DETECTION_FIXED_VALUE) & 0xff);
        data[ 2] = (byte) ((AccelerationLoggerControl.ODR_400_HZ) & 0xff);
        data[ 3] = (byte) ((0x00) & 0xff);
        data[ 4] = (byte) ((0x28) & 0xff);
        data[ 5] = (byte) ((0x00) & 0xff);
        data[ 6] = (byte) ((0x28) & 0xff);

        BluetoothGattCharacteristic bluetoothGattCharacteristic = new BluetoothGattCharacteristic(AdvertisingDataConstants.BASE_UUID, 0, 0);
        bluetoothGattCharacteristic.setValue(data);

        AccelerationLoggerControl accelerationLoggerControl = new AccelerationLoggerControl(bluetoothGattCharacteristic);
        assertEquals(AccelerationLoggerControl.LOG_START, accelerationLoggerControl.getLoggerCondition());
        assertEquals(AccelerationLoggerControl.RANGE_OF_DETECTION_FIXED_VALUE, accelerationLoggerControl.getRangeOfDetection());
        assertEquals(AccelerationLoggerControl.ODR_400_HZ, accelerationLoggerControl.getOdrSetting());
        assertEquals(10240, accelerationLoggerControl.getStartPage());
        assertEquals(10240, accelerationLoggerControl.getEndPage());
    }

    @Test
    public void test007() {
        byte[] data = new byte[7];
        data[ 0] = (byte) ((AccelerationLoggerControl.LOG_START) & 0xff);
        data[ 1] = (byte) ((AccelerationLoggerControl.RANGE_OF_DETECTION_FIXED_VALUE) & 0xff);
        data[ 2] = (byte) ((AccelerationLoggerControl.ODR_400_HZ) & 0xff);
        data[ 3] = (byte) ((0x00) & 0xff);
        data[ 4] = (byte) ((0x28) & 0xff);
        data[ 5] = (byte) ((0x00) & 0xff);
        data[ 6] = (byte) ((0x28) & 0xff);

        BluetoothGattCharacteristic bluetoothGattCharacteristic = new BluetoothGattCharacteristic(AdvertisingDataConstants.BASE_UUID, 0, 0);
        bluetoothGattCharacteristic.setValue(data);

        AccelerationLoggerControl result1 = new AccelerationLoggerControl(bluetoothGattCharacteristic);
        Parcel parcel = Parcel.obtain();
        result1.writeToParcel(parcel, 0);
        parcel.setDataPosition(0);
        AccelerationLoggerControl result2 = AccelerationLoggerControl.CREATOR.createFromParcel(parcel);

        assertEquals(result1.getLoggerCondition(), result2.getLoggerCondition());
        assertEquals(result1.getRangeOfDetection(), result2.getRangeOfDetection());
        assertEquals(result1.getOdrSetting(), result2.getOdrSetting());
        assertEquals(result1.getStartPage(), result2.getStartPage());
        assertEquals(result1.getEndPage(), result2.getEndPage());
    }
}
