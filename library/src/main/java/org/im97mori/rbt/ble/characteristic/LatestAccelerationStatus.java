package org.im97mori.rbt.ble.characteristic;

import android.bluetooth.BluetoothGattCharacteristic;
import android.os.Parcel;
import android.os.Parcelable;

import static org.im97mori.rbt.RbtConstants.OutputRange.OUTPUT_RANGE_ACCELERATION_UNIT;

/**
 * 2.2.5 Latest acceleration status (Characteristics UUID: 0x5016)
 */
@SuppressWarnings("WeakerAccess")
public class LatestAccelerationStatus extends AbstractCharacteristic implements Parcelable {

    /**
     * @see Creator
     */
    public static final Creator<LatestAccelerationStatus> CREATOR = new Creator<LatestAccelerationStatus>() {

        /**
         * {@inheritDoc}
         */
        @Override
        public LatestAccelerationStatus createFromParcel(Parcel in) {
            return new LatestAccelerationStatus(in);
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public LatestAccelerationStatus[] newArray(int size) {
            return new LatestAccelerationStatus[size];
        }

    };

    /**
     * Sequence number
     */
    private final int mSequenceNumber;

    /**
     * Vibration information
     */
    private final int mVibrationInformation;

    /**
     * Maximum acceleration (X-axis)
     */
    private final int mMaximumAccelerationXAxis;

    /**
     * Maximum acceleration (Y-axis)
     */
    private final int mMaximumAccelerationYAxis;

    /**
     * Maximum acceleration (Z-axis)
     */
    private final int mMaximumAccelerationZAxis;

    /**
     * SI value calculation axis
     */
    private final int mSiValueCalculationAxis;

    /**
     * Acceleration offset (X-axis)
     */
    private final int mAccelerationOffsetXAxis;

    /**
     * Acceleration offset (Y-axis)
     */
    private final int mAccelerationOffsetYAxis;

    /**
     * Acceleration offset (Z-axis)
     */
    private final int mAccelerationOffsetZAxis;

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x5016
     */
    public LatestAccelerationStatus(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        mSequenceNumber = bluetoothGattCharacteristic.getIntValue(BluetoothGattCharacteristic.FORMAT_UINT8, 0);
        mVibrationInformation = bluetoothGattCharacteristic.getIntValue(BluetoothGattCharacteristic.FORMAT_UINT8, 1);
        mMaximumAccelerationXAxis = bluetoothGattCharacteristic.getIntValue(BluetoothGattCharacteristic.FORMAT_SINT16, 2);
        mMaximumAccelerationYAxis = bluetoothGattCharacteristic.getIntValue(BluetoothGattCharacteristic.FORMAT_SINT16, 4);
        mMaximumAccelerationZAxis = bluetoothGattCharacteristic.getIntValue(BluetoothGattCharacteristic.FORMAT_SINT16, 6);
        mSiValueCalculationAxis = bluetoothGattCharacteristic.getIntValue(BluetoothGattCharacteristic.FORMAT_UINT8, 8);
        mAccelerationOffsetXAxis = bluetoothGattCharacteristic.getIntValue(BluetoothGattCharacteristic.FORMAT_SINT16, 9);
        mAccelerationOffsetYAxis = bluetoothGattCharacteristic.getIntValue(BluetoothGattCharacteristic.FORMAT_SINT16, 11);
        mAccelerationOffsetZAxis = bluetoothGattCharacteristic.getIntValue(BluetoothGattCharacteristic.FORMAT_SINT16, 13);
    }

    /**
     * Constructor from {@link Parcel}
     *
     * @param in Parcel
     */
    private LatestAccelerationStatus(Parcel in) {
        mSequenceNumber = in.readInt();
        mVibrationInformation = in.readInt();
        mMaximumAccelerationXAxis = in.readInt();
        mMaximumAccelerationYAxis = in.readInt();
        mMaximumAccelerationZAxis = in.readInt();
        mSiValueCalculationAxis = in.readInt();
        mAccelerationOffsetXAxis = in.readInt();
        mAccelerationOffsetYAxis = in.readInt();
        mAccelerationOffsetZAxis = in.readInt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int describeContents() {
        return 0;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(mSequenceNumber);
        dest.writeInt(mVibrationInformation);
        dest.writeInt(mMaximumAccelerationXAxis);
        dest.writeInt(mMaximumAccelerationYAxis);
        dest.writeInt(mMaximumAccelerationZAxis);
        dest.writeInt(mSiValueCalculationAxis);
        dest.writeInt(mAccelerationOffsetXAxis);
        dest.writeInt(mAccelerationOffsetYAxis);
        dest.writeInt(mAccelerationOffsetZAxis);
    }

    /**
     * @return Sequence number
     */
    public int getSequenceNumber() {
        return mSequenceNumber;
    }

    /**
     * @return Vibration information
     */
    public int getVibrationInformation() {
        return mVibrationInformation;
    }

    /**
     * @return Maximum acceleration (X-axis)
     */
    public int getMaximumAccelerationXAxis() {
        return mMaximumAccelerationXAxis;
    }

    /**
     * @return Maximum acceleration (X-axis)(gal)
     */
    public double getMaximumAccelerationXAxisGal() {
        return mMaximumAccelerationXAxis * OUTPUT_RANGE_ACCELERATION_UNIT;
    }

    /**
     * @return Maximum acceleration (Y-axis)
     */
    public int getMaximumAccelerationYAxis() {
        return mMaximumAccelerationYAxis;
    }

    /**
     * @return Maximum acceleration (Y-axis)(gal)
     */
    public double getMaximumAccelerationYAxisGal() {
        return mMaximumAccelerationYAxis * OUTPUT_RANGE_ACCELERATION_UNIT;
    }

    /**
     * @return Maximum acceleration (Z-axis)
     */
    public int getMaximumAccelerationZAxis() {
        return mMaximumAccelerationZAxis;
    }

    /**
     * @return Maximum acceleration (Z-axis)(gal)
     */
    public double getMaximumAccelerationZAxisGal() {
        return mMaximumAccelerationZAxis * OUTPUT_RANGE_ACCELERATION_UNIT;
    }

    /**
     * @return SI value calculation axis
     */
    public int getSiValueCalculationAxis() {
        return mSiValueCalculationAxis;
    }

    /**
     * @return Acceleration offset (X-axis)
     */
    public int getAccelerationOffsetXAxis() {
        return mAccelerationOffsetXAxis;
    }

    /**
     * @return Acceleration offset (X-axis)(gal)
     */
    public double getAccelerationOffsetXAxisGal() {
        return mAccelerationOffsetXAxis * OUTPUT_RANGE_ACCELERATION_UNIT;
    }

    /**
     * @return Acceleration offset (Y-axis)
     */
    public int getAccelerationOffsetYAxis() {
        return mAccelerationOffsetYAxis;
    }

    /**
     * @return Acceleration offset (Y-axis)(gal)
     */
    public double getAccelerationOffsetYAxisGal() {
        return mAccelerationOffsetYAxis * OUTPUT_RANGE_ACCELERATION_UNIT;
    }

    /**
     * @return Acceleration offset (Z-axis)
     */
    public int getAccelerationOffsetZAxis() {
        return mAccelerationOffsetZAxis;
    }

    /**
     * @return Acceleration offset (Z-axis)(gal)
     */
    public double getAccelerationOffsetZAxisGal() {
        return mAccelerationOffsetZAxis * OUTPUT_RANGE_ACCELERATION_UNIT;
    }

}
