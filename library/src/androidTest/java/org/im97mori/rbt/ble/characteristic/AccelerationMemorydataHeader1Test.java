package org.im97mori.rbt.ble.characteristic;

import android.bluetooth.BluetoothGattCharacteristic;
import android.os.Parcel;

import org.im97mori.ble.ad.AdvertisingDataConstants;
import org.junit.Test;

import java.math.BigInteger;

import static org.im97mori.rbt.RbtConstants.OutputRange.SI_VALUE_CALCULATION_AXIS_XY_AXIS_BIT;
import static org.im97mori.rbt.RbtConstants.OutputRange.SI_VALUE_CALCULATION_AXIS_XZ_AXIS_BIT;
import static org.im97mori.rbt.RbtConstants.OutputRange.SI_VALUE_CALCULATION_AXIS_YZ_AXIS_BIT;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AccelerationMemorydataHeader1Test {

    @Test
    public void test001() {
        byte[] data = new byte[20];
        data[0] = (byte) ((0x01) & 0xff);
        data[1] = (byte) ((0x00) & 0xff);
        data[2] = (byte) ((0x01) & 0xff);
        data[3] = (byte) ((0x00) & 0xff);
        data[4] = (byte) ((0x01) & 0xff);
        data[5] = (byte) ((0x00) & 0xff);
        data[6] = (byte) ((0x00) & 0xff);
        data[7] = (byte) ((0x00) & 0xff);
        data[8] = (byte) ((0x01) & 0xff);
        data[9] = (byte) ((0x00) & 0xff);
        data[10] = (byte) ((0x00) & 0xff);
        data[11] = (byte) ((0x00) & 0xff);
        data[12] = (byte) ((0x00) & 0xff);
        data[13] = (byte) ((0x00) & 0xff);
        data[14] = (byte) ((0x00) & 0xff);
        data[15] = (byte) ((0x00) & 0xff);
        data[16] = (byte) ((AccelerationMemoryDataHeader1.EARTHQUAKE_FLAG_VIBRATION_DATA) & 0xff);
        data[17] = (byte) ((SI_VALUE_CALCULATION_AXIS_YZ_AXIS_BIT) & 0xff);
        data[18] = (byte) ((0xff) & 0xff);
        data[19] = (byte) ((0xff) & 0xff);

        BluetoothGattCharacteristic bluetoothGattCharacteristic = new BluetoothGattCharacteristic(AdvertisingDataConstants.BASE_UUID, 0, 0);
        bluetoothGattCharacteristic.setValue(data);

        AccelerationMemoryDataHeader1 result = new AccelerationMemoryDataHeader1(bluetoothGattCharacteristic);
        assertEquals(1, result.getTotalTransferCount());
        assertFalse(result.isTotalTransferCountDataError());
        assertEquals(1, result.getStorageTotalPage());
        assertEquals(BigInteger.ONE, result.getEarthQuakesOrVibrationCount());
        assertEquals(BigInteger.ONE, result.getTimeCounter());
        assertEquals(AccelerationMemoryDataHeader1.EARTHQUAKE_FLAG_VIBRATION_DATA, result.getEarthQuakeFlag());
        assertEquals(SI_VALUE_CALCULATION_AXIS_YZ_AXIS_BIT, result.getSiValueCalculationAxis());
    }

    @Test
    public void test002() {
        byte[] data = new byte[20];
        data[0] = (byte) ((0xff) & 0xff);
        data[1] = (byte) ((0x7f) & 0xff);
        data[2] = (byte) ((0xff) & 0xff);
        data[3] = (byte) ((0xff) & 0xff);
        data[4] = (byte) ((0xff) & 0xff);
        data[5] = (byte) ((0xff) & 0xff);
        data[6] = (byte) ((0xff) & 0xff);
        data[7] = (byte) ((0xff) & 0xff);
        data[8] = (byte) ((0xff) & 0xff);
        data[9] = (byte) ((0xff) & 0xff);
        data[10] = (byte) ((0xff) & 0xff);
        data[11] = (byte) ((0xff) & 0xff);
        data[12] = (byte) ((0xff) & 0xff);
        data[13] = (byte) ((0xff) & 0xff);
        data[14] = (byte) ((0xff) & 0xff);
        data[15] = (byte) ((0xff) & 0xff);
        data[16] = (byte) ((AccelerationMemoryDataHeader1.EARTHQUAKE_FLAG_EARTHQUAKE_DATA) & 0xff);
        data[17] = (byte) ((SI_VALUE_CALCULATION_AXIS_XZ_AXIS_BIT) & 0xff);
        data[18] = (byte) ((0xff) & 0xff);
        data[19] = (byte) ((0xff) & 0xff);

        BluetoothGattCharacteristic bluetoothGattCharacteristic = new BluetoothGattCharacteristic(AdvertisingDataConstants.BASE_UUID, 0, 0);
        bluetoothGattCharacteristic.setValue(data);

        AccelerationMemoryDataHeader1 result = new AccelerationMemoryDataHeader1(bluetoothGattCharacteristic);
        assertEquals(32767, result.getTotalTransferCount());
        assertFalse(result.isTotalTransferCountDataError());
        assertEquals(65535, result.getStorageTotalPage());
        assertEquals(new BigInteger(1, new byte[]{(byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff}), result.getEarthQuakesOrVibrationCount());
        assertEquals(new BigInteger(1, new byte[]{(byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff}), result.getTimeCounter());
        assertEquals(AccelerationMemoryDataHeader1.EARTHQUAKE_FLAG_EARTHQUAKE_DATA, result.getEarthQuakeFlag());
        assertEquals(SI_VALUE_CALCULATION_AXIS_XZ_AXIS_BIT, result.getSiValueCalculationAxis());
    }

    @Test
    public void test003() {
        byte[] data = new byte[20];
        data[0] = (byte) ((AccelerationMemoryDataHeader1.DATA_ERROR_BIT) & 0xff);
        data[1] = (byte) ((AccelerationMemoryDataHeader1.DATA_ERROR_BIT >> 8) & 0xff);
        data[2] = (byte) ((0xff) & 0xff);
        data[3] = (byte) ((0xff) & 0xff);
        data[4] = (byte) ((0xff) & 0xff);
        data[5] = (byte) ((0xff) & 0xff);
        data[6] = (byte) ((0xff) & 0xff);
        data[7] = (byte) ((0xff) & 0xff);
        data[8] = (byte) ((0xff) & 0xff);
        data[9] = (byte) ((0xff) & 0xff);
        data[10] = (byte) ((0xff) & 0xff);
        data[11] = (byte) ((0xff) & 0xff);
        data[12] = (byte) ((0xff) & 0xff);
        data[13] = (byte) ((0xff) & 0xff);
        data[14] = (byte) ((0xff) & 0xff);
        data[15] = (byte) ((0xff) & 0xff);
        data[16] = (byte) ((AccelerationMemoryDataHeader1.EARTHQUAKE_FLAG_EARTHQUAKE_DATA) & 0xff);
        data[17] = (byte) ((SI_VALUE_CALCULATION_AXIS_XY_AXIS_BIT) & 0xff);
        data[18] = (byte) ((0xff) & 0xff);
        data[19] = (byte) ((0xff) & 0xff);

        BluetoothGattCharacteristic bluetoothGattCharacteristic = new BluetoothGattCharacteristic(AdvertisingDataConstants.BASE_UUID, 0, 0);
        bluetoothGattCharacteristic.setValue(data);

        AccelerationMemoryDataHeader1 result = new AccelerationMemoryDataHeader1(bluetoothGattCharacteristic);
        assertEquals(32768, result.getTotalTransferCount());
        assertTrue(result.isTotalTransferCountDataError());
        assertEquals(65535, result.getStorageTotalPage());
        assertEquals(new BigInteger(1, new byte[]{(byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff}), result.getEarthQuakesOrVibrationCount());
        assertEquals(new BigInteger(1, new byte[]{(byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff}), result.getTimeCounter());
        assertEquals(AccelerationMemoryDataHeader1.EARTHQUAKE_FLAG_EARTHQUAKE_DATA, result.getEarthQuakeFlag());
        assertEquals(SI_VALUE_CALCULATION_AXIS_XY_AXIS_BIT, result.getSiValueCalculationAxis());
    }

    @Test
    public void test004() {
        byte[] data = new byte[20];
        data[0] = (byte) ((AccelerationMemoryDataHeader1.DATA_ERROR_BIT) & 0xff);
        data[1] = (byte) ((AccelerationMemoryDataHeader1.DATA_ERROR_BIT >> 8) & 0xff);
        data[2] = (byte) ((0xff) & 0xff);
        data[3] = (byte) ((0xff) & 0xff);
        data[4] = (byte) ((0xff) & 0xff);
        data[5] = (byte) ((0xff) & 0xff);
        data[6] = (byte) ((0xff) & 0xff);
        data[7] = (byte) ((0xff) & 0xff);
        data[8] = (byte) ((0xff) & 0xff);
        data[9] = (byte) ((0xff) & 0xff);
        data[10] = (byte) ((0xff) & 0xff);
        data[11] = (byte) ((0xff) & 0xff);
        data[12] = (byte) ((0xff) & 0xff);
        data[13] = (byte) ((0xff) & 0xff);
        data[14] = (byte) ((0xff) & 0xff);
        data[15] = (byte) ((0xff) & 0xff);
        data[16] = (byte) ((AccelerationMemoryDataHeader1.EARTHQUAKE_FLAG_EARTHQUAKE_DATA) & 0xff);
        data[17] = (byte) ((SI_VALUE_CALCULATION_AXIS_XZ_AXIS_BIT) & 0xff);
        data[18] = (byte) ((0xff) & 0xff);
        data[19] = (byte) ((0xff) & 0xff);

        BluetoothGattCharacteristic bluetoothGattCharacteristic = new BluetoothGattCharacteristic(AdvertisingDataConstants.BASE_UUID, 0, 0);
        bluetoothGattCharacteristic.setValue(data);

        AccelerationMemoryDataHeader1 result1 = new AccelerationMemoryDataHeader1(bluetoothGattCharacteristic);
        Parcel parcel = Parcel.obtain();
        result1.writeToParcel(parcel, 0);
        parcel.setDataPosition(0);
        AccelerationMemoryDataHeader1 result2 = AccelerationMemoryDataHeader1.CREATOR.createFromParcel(parcel);

        assertEquals(result1.getTotalTransferCount(), result2.getTotalTransferCount());
        assertEquals(result1.getStorageTotalPage(), result2.getStorageTotalPage());
        assertEquals(result1.getEarthQuakesOrVibrationCount(), result2.getEarthQuakesOrVibrationCount());
        assertEquals(result1.getTimeCounter(), result2.getTimeCounter());
        assertEquals(result1.getEarthQuakeFlag(), result2.getEarthQuakeFlag());
        assertEquals(result1.getSiValueCalculationAxis(), result2.getSiValueCalculationAxis());

    }
}
