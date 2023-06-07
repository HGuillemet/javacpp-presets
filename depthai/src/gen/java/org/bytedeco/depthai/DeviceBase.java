// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.depthai;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;

import static org.bytedeco.depthai.global.depthai.*;


/**
 * The core of depthai device for RAII, connects to device and maintains watchdog, timesync, ...
 */
@Namespace("dai") @NoOffset @Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class DeviceBase extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DeviceBase(Pointer p) { super(p); }

    // constants

    /** Default search time for constructors which discover devices */
    @MemberGetter public static native @ByRef @Cast("const std::chrono::seconds*") Pointer DEFAULT_SEARCH_TIME();
    /** Default rate at which system information is logged */
    @MemberGetter public static native float DEFAULT_SYSTEM_INFORMATION_LOGGING_RATE_HZ();
    public static final float DEFAULT_SYSTEM_INFORMATION_LOGGING_RATE_HZ = DEFAULT_SYSTEM_INFORMATION_LOGGING_RATE_HZ();
    /** Default UsbSpeed for device connection */
    @MemberGetter public static native UsbSpeed DEFAULT_USB_SPEED();
    /** Default Timesync period */
    @MemberGetter public static native @ByRef @Cast("const std::chrono::milliseconds*") Pointer DEFAULT_TIMESYNC_PERIOD();
    /** Default Timesync number of samples per sync */
    @MemberGetter public static native int DEFAULT_TIMESYNC_NUM_SAMPLES();
    public static final int DEFAULT_TIMESYNC_NUM_SAMPLES = DEFAULT_TIMESYNC_NUM_SAMPLES();
    /** Default Timesync packet interval randomness */
    @MemberGetter public static native @Cast("const bool") boolean DEFAULT_TIMESYNC_RANDOM();
    public static final boolean DEFAULT_TIMESYNC_RANDOM = DEFAULT_TIMESYNC_RANDOM();

    // Structures

    /**
     * Device specific configuration
     */
    public static class Config extends Pointer {
        static { Loader.load(); }
        /** Default native constructor. */
        public Config() { super((Pointer)null); allocate(); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public Config(long size) { super((Pointer)null); allocateArray(size); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public Config(Pointer p) { super(p); }
        private native void allocate();
        private native void allocateArray(long size);
        @Override public Config position(long position) {
            return (Config)super.position(position);
        }
        @Override public Config getPointer(long i) {
            return new Config((Pointer)this).offsetAddress(i);
        }
    
        public native @Cast("dai::OpenVINO::Version") int version(); public native Config version(int setter);
        public native @ByRef BoardConfig board(); public native Config board(BoardConfig setter);
        public native @Cast("bool") boolean nonExclusiveMode(); public native Config nonExclusiveMode(boolean setter);
    }

    // static API

    /**
     * \brief Get the Default Search Time for finding devices
     *
     * @return Default search time in milliseconds
     */
    public static native @ByVal @Cast("std::chrono::milliseconds*") Pointer getDefaultSearchTime();

    /**
     * Waits for any available device with a timeout
     *
     * @param timeout duration of time to wait for the any device
     * @return Tuple of bool and DeviceInfo. Bool specifies if device was found. DeviceInfo specifies the found device
     */
    public static native @ByVal @Cast("std::tuple<bool,dai::DeviceInfo>*") Pointer getAnyAvailableDevice(@ByVal @Cast("std::chrono::milliseconds*") Pointer timeout);

    /**
     * Gets any available device
     *
     * @return Tuple of bool and DeviceInfo. Bool specifies if device was found. DeviceInfo specifies the found device
     */
    public static native @ByVal @Cast("std::tuple<bool,dai::DeviceInfo>*") Pointer getAnyAvailableDevice();

    /**
     * Waits for any available device with a timeout
     *
     * @param timeout duration of time to wait for the any device
     * @param cb callback function called between pooling intervals
     * @return Tuple of bool and DeviceInfo. Bool specifies if device was found. DeviceInfo specifies the found device
     */
    public static native @ByVal @Cast("std::tuple<bool,dai::DeviceInfo>*") Pointer getAnyAvailableDevice(@ByVal @Cast("std::chrono::milliseconds*") Pointer timeout, Callback cb);

    /**
     * Gets first available device. Device can be either in XLINK_UNBOOTED or XLINK_BOOTLOADER state
     * @return Tuple of bool and DeviceInfo. Bool specifies if device was found. DeviceInfo specifies the found device
     */
    public static native @ByVal @Cast("std::tuple<bool,dai::DeviceInfo>*") Pointer getFirstAvailableDevice(@Cast("bool") boolean skipInvalidDevice/*=true*/);
    public static native @ByVal @Cast("std::tuple<bool,dai::DeviceInfo>*") Pointer getFirstAvailableDevice();

    /**
     * Finds a device by MX ID. Example: 14442C10D13EABCE00
     * @param mxId MyraidX ID which uniquely specifies a device
     * @return Tuple of bool and DeviceInfo. Bool specifies if device was found. DeviceInfo specifies the found device
     */
    public static native @ByVal @Cast("std::tuple<bool,dai::DeviceInfo>*") Pointer getDeviceByMxId(@StdString BytePointer mxId);
    public static native @ByVal @Cast("std::tuple<bool,dai::DeviceInfo>*") Pointer getDeviceByMxId(@StdString ByteBuffer mxId);
    public static native @ByVal @Cast("std::tuple<bool,dai::DeviceInfo>*") Pointer getDeviceByMxId(@StdString String mxId);

    /**
     * Returns all available devices
     * @return Vector of available devices
     */
    public static native @StdVector DeviceInfo getAllAvailableDevices();

    /**
     * Returns information of all connected devices.
     * The devices could be both connectable as well as already connected to devices.
     *
     * @return Vector of connected device information
     */
    public static native @StdVector DeviceInfo getAllConnectedDevices();

    /**
     * Gets device firmware binary for a specific OpenVINO version
     * @param usb2Mode USB2 mode firmware
     * @param version Version of OpenVINO which firmware will support
     * @return Firmware binary
     */
    public static native @Cast("std::uint8_t*") @StdVector BytePointer getEmbeddedDeviceBinary(@Cast("bool") boolean usb2Mode, @Cast("dai::OpenVINO::Version") int version/*=dai::OpenVINO::VERSION_UNIVERSAL*/);
    public static native @Cast("std::uint8_t*") @StdVector BytePointer getEmbeddedDeviceBinary(@Cast("bool") boolean usb2Mode);

    /**
     * Gets device firmware binary for a specific configuration
     * @param config FW with applied configuration
     * @return Firmware binary
     */
    public static native @Cast("std::uint8_t*") @StdVector BytePointer getEmbeddedDeviceBinary(@ByVal Config config);

    /**
     * Connects to any available device with a DEFAULT_SEARCH_TIME timeout.
     * @param pipeline Pipeline to be executed on the device
     */
    public DeviceBase(@Const @ByRef Pipeline pipeline) { super((Pointer)null); allocate(pipeline); }
    private native void allocate(@Const @ByRef Pipeline pipeline);

    /**
     * Connects to any available device with a DEFAULT_SEARCH_TIME timeout.
     * @param pipeline Pipeline to be executed on the device
     * @param usb2Mode Boot device using USB2 mode firmware
     */

    /**
     * Connects to any available device with a DEFAULT_SEARCH_TIME timeout.
     * @param pipeline Pipeline to be executed on the device
     * @param maxUsbSpeed Maximum allowed USB speed
     */
    public DeviceBase(@Const @ByRef Pipeline pipeline, UsbSpeed maxUsbSpeed) { super((Pointer)null); allocate(pipeline, maxUsbSpeed); }
    private native void allocate(@Const @ByRef Pipeline pipeline, UsbSpeed maxUsbSpeed);
    public DeviceBase(@Const @ByRef Pipeline pipeline, @Cast("dai::UsbSpeed") int maxUsbSpeed) { super((Pointer)null); allocate(pipeline, maxUsbSpeed); }
    private native void allocate(@Const @ByRef Pipeline pipeline, @Cast("dai::UsbSpeed") int maxUsbSpeed);

    /**
     * Connects to any available device with a DEFAULT_SEARCH_TIME timeout.
     * @param pipeline Pipeline to be executed on the device
     * @param pathToCmd Path to custom device firmware
     */
    public DeviceBase(@Const @ByRef Pipeline pipeline, @Const @ByRef Path pathToCmd) { super((Pointer)null); allocate(pipeline, pathToCmd); }
    private native void allocate(@Const @ByRef Pipeline pipeline, @Const @ByRef Path pathToCmd);

    /**
     * Connects to device specified by devInfo.
     * @param pipeline Pipeline to be executed on the device
     * @param devInfo DeviceInfo which specifies which device to connect to
     */
    public DeviceBase(@Const @ByRef Pipeline pipeline, @Const @ByRef DeviceInfo devInfo) { super((Pointer)null); allocate(pipeline, devInfo); }
    private native void allocate(@Const @ByRef Pipeline pipeline, @Const @ByRef DeviceInfo devInfo);

    /**
     * Connects to device specified by devInfo.
     * @param pipeline Pipeline to be executed on the device
     * @param devInfo DeviceInfo which specifies which device to connect to
     * @param usb2Mode Boot device using USB2 mode firmware
     */

    /**
     * Connects to device specified by devInfo.
     * @param pipeline Pipeline to be executed on the device
     * @param devInfo DeviceInfo which specifies which device to connect to
     * @param maxUsbSpeed Maximum allowed USB speed
     */
    public DeviceBase(@Const @ByRef Pipeline pipeline, @Const @ByRef DeviceInfo devInfo, UsbSpeed maxUsbSpeed) { super((Pointer)null); allocate(pipeline, devInfo, maxUsbSpeed); }
    private native void allocate(@Const @ByRef Pipeline pipeline, @Const @ByRef DeviceInfo devInfo, UsbSpeed maxUsbSpeed);
    public DeviceBase(@Const @ByRef Pipeline pipeline, @Const @ByRef DeviceInfo devInfo, @Cast("dai::UsbSpeed") int maxUsbSpeed) { super((Pointer)null); allocate(pipeline, devInfo, maxUsbSpeed); }
    private native void allocate(@Const @ByRef Pipeline pipeline, @Const @ByRef DeviceInfo devInfo, @Cast("dai::UsbSpeed") int maxUsbSpeed);

    /**
     * Connects to device specified by devInfo.
     * @param pipeline Pipeline to be executed on the device
     * @param devInfo DeviceInfo which specifies which device to connect to
     * @param pathToCmd Path to custom device firmware
     */
    public DeviceBase(@Const @ByRef Pipeline pipeline, @Const @ByRef DeviceInfo devInfo, @Const @ByRef Path pathToCmd) { super((Pointer)null); allocate(pipeline, devInfo, pathToCmd); }
    private native void allocate(@Const @ByRef Pipeline pipeline, @Const @ByRef DeviceInfo devInfo, @Const @ByRef Path pathToCmd);

    /**
     * Connects to any available device with a DEFAULT_SEARCH_TIME timeout.
     * Uses OpenVINO version OpenVINO::VERSION_UNIVERSAL
     */
    public DeviceBase() { super((Pointer)null); allocate(); }
    private native void allocate();

    /**
     * Connects to any available device with a DEFAULT_SEARCH_TIME timeout.
     * @param version OpenVINO version which the device will be booted with.
     */
    public DeviceBase(@Cast("dai::OpenVINO::Version") int version) { super((Pointer)null); allocate(version); }
    private native void allocate(@Cast("dai::OpenVINO::Version") int version);

    /**
     * Connects to any available device with a DEFAULT_SEARCH_TIME timeout.
     * @param version OpenVINO version which the device will be booted with
     * @param usb2Mode Boot device using USB2 mode firmware
     */

    /**
     * Connects to device specified by devInfo.
     * @param version OpenVINO version which the device will be booted with
     * @param maxUsbSpeed Maximum allowed USB speed
     */
    public DeviceBase(@Cast("dai::OpenVINO::Version") int version, UsbSpeed maxUsbSpeed) { super((Pointer)null); allocate(version, maxUsbSpeed); }
    private native void allocate(@Cast("dai::OpenVINO::Version") int version, UsbSpeed maxUsbSpeed);
    public DeviceBase(@Cast("dai::OpenVINO::Version") int version, @Cast("dai::UsbSpeed") int maxUsbSpeed) { super((Pointer)null); allocate(version, maxUsbSpeed); }
    private native void allocate(@Cast("dai::OpenVINO::Version") int version, @Cast("dai::UsbSpeed") int maxUsbSpeed);

    /**
     * Connects to any available device with a DEFAULT_SEARCH_TIME timeout.
     * @param version OpenVINO version which the device will be booted with
     * @param pathToCmd Path to custom device firmware
     */
    public DeviceBase(@Cast("dai::OpenVINO::Version") int version, @Const @ByRef Path pathToCmd) { super((Pointer)null); allocate(version, pathToCmd); }
    private native void allocate(@Cast("dai::OpenVINO::Version") int version, @Const @ByRef Path pathToCmd);

    /**
     * Connects to device specified by devInfo.
     * @param version OpenVINO version which the device will be booted with
     * @param devInfo DeviceInfo which specifies which device to connect to
     */
    public DeviceBase(@Cast("dai::OpenVINO::Version") int version, @Const @ByRef DeviceInfo devInfo) { super((Pointer)null); allocate(version, devInfo); }
    private native void allocate(@Cast("dai::OpenVINO::Version") int version, @Const @ByRef DeviceInfo devInfo);

    /**
     * Connects to device specified by devInfo.
     * @param version OpenVINO version which the device will be booted with
     * @param devInfo DeviceInfo which specifies which device to connect to
     * @param usb2Mode Boot device using USB2 mode firmware
     */

    /**
     * Connects to device specified by devInfo.
     * @param version OpenVINO version which the device will be booted with
     * @param devInfo DeviceInfo which specifies which device to connect to
     * @param maxUsbSpeed Maximum allowed USB speed
     */
    public DeviceBase(@Cast("dai::OpenVINO::Version") int version, @Const @ByRef DeviceInfo devInfo, UsbSpeed maxUsbSpeed) { super((Pointer)null); allocate(version, devInfo, maxUsbSpeed); }
    private native void allocate(@Cast("dai::OpenVINO::Version") int version, @Const @ByRef DeviceInfo devInfo, UsbSpeed maxUsbSpeed);
    public DeviceBase(@Cast("dai::OpenVINO::Version") int version, @Const @ByRef DeviceInfo devInfo, @Cast("dai::UsbSpeed") int maxUsbSpeed) { super((Pointer)null); allocate(version, devInfo, maxUsbSpeed); }
    private native void allocate(@Cast("dai::OpenVINO::Version") int version, @Const @ByRef DeviceInfo devInfo, @Cast("dai::UsbSpeed") int maxUsbSpeed);

    /**
     * Connects to device specified by devInfo.
     * @param version OpenVINO version which the device will be booted with
     * @param devInfo DeviceInfo which specifies which device to connect to
     * @param pathToCmd Path to custom device firmware
     */
    public DeviceBase(@Cast("dai::OpenVINO::Version") int version, @Const @ByRef DeviceInfo devInfo, @Const @ByRef Path pathToCmd) { super((Pointer)null); allocate(version, devInfo, pathToCmd); }
    private native void allocate(@Cast("dai::OpenVINO::Version") int version, @Const @ByRef DeviceInfo devInfo, @Const @ByRef Path pathToCmd);

    /**
     * Connects to any available device with custom config.
     * @param config Device custom configuration to boot with
     */
    public DeviceBase(@ByVal Config config) { super((Pointer)null); allocate(config); }
    private native void allocate(@ByVal Config config);

    /**
     * Connects to device 'devInfo' with custom config.
     * @param devInfo DeviceInfo which specifies which device to connect to
     * @param config Device custom configuration to boot with
     */
    public DeviceBase(@ByVal Config config, @Const @ByRef DeviceInfo devInfo) { super((Pointer)null); allocate(config, devInfo); }
    private native void allocate(@ByVal Config config, @Const @ByRef DeviceInfo devInfo);

    /**
     * Connects to any available device with a DEFAULT_SEARCH_TIME timeout.
     * Uses OpenVINO version OpenVINO::VERSION_UNIVERSAL
     *
     * @param devInfo DeviceInfo which specifies which device to connect to
     */
    public DeviceBase(@Const @ByRef DeviceInfo devInfo) { super((Pointer)null); allocate(devInfo); }
    private native void allocate(@Const @ByRef DeviceInfo devInfo);

    /**
     * Connects to any available device with a DEFAULT_SEARCH_TIME timeout.
     * Uses OpenVINO version OpenVINO::VERSION_UNIVERSAL
     *
     * @param devInfo DeviceInfo which specifies which device to connect to
     * @param maxUsbSpeed Maximum allowed USB speed
     */
    public DeviceBase(@Const @ByRef DeviceInfo devInfo, UsbSpeed maxUsbSpeed) { super((Pointer)null); allocate(devInfo, maxUsbSpeed); }
    private native void allocate(@Const @ByRef DeviceInfo devInfo, UsbSpeed maxUsbSpeed);
    public DeviceBase(@Const @ByRef DeviceInfo devInfo, @Cast("dai::UsbSpeed") int maxUsbSpeed) { super((Pointer)null); allocate(devInfo, maxUsbSpeed); }
    private native void allocate(@Const @ByRef DeviceInfo devInfo, @Cast("dai::UsbSpeed") int maxUsbSpeed);

    /**
     * Connects to any available device with a DEFAULT_SEARCH_TIME timeout.
     * Uses OpenVINO version OpenVINO::VERSION_UNIVERSAL
     *
     * @param nameOrDeviceId Creates DeviceInfo with nameOrDeviceId to connect to
     */
    public DeviceBase(@StdString BytePointer nameOrDeviceId) { super((Pointer)null); allocate(nameOrDeviceId); }
    private native void allocate(@StdString BytePointer nameOrDeviceId);
    public DeviceBase(@StdString ByteBuffer nameOrDeviceId) { super((Pointer)null); allocate(nameOrDeviceId); }
    private native void allocate(@StdString ByteBuffer nameOrDeviceId);
    public DeviceBase(@StdString String nameOrDeviceId) { super((Pointer)null); allocate(nameOrDeviceId); }
    private native void allocate(@StdString String nameOrDeviceId);

    /**
     * Connects to any available device with a DEFAULT_SEARCH_TIME timeout.
     * Uses OpenVINO version OpenVINO::VERSION_UNIVERSAL
     *
     * @param nameOrDeviceId Creates DeviceInfo with nameOrDeviceId to connect to
     * @param maxUsbSpeed Maximum allowed USB speed
     */
    public DeviceBase(@StdString BytePointer nameOrDeviceId, UsbSpeed maxUsbSpeed) { super((Pointer)null); allocate(nameOrDeviceId, maxUsbSpeed); }
    private native void allocate(@StdString BytePointer nameOrDeviceId, UsbSpeed maxUsbSpeed);
    public DeviceBase(@StdString ByteBuffer nameOrDeviceId, @Cast("dai::UsbSpeed") int maxUsbSpeed) { super((Pointer)null); allocate(nameOrDeviceId, maxUsbSpeed); }
    private native void allocate(@StdString ByteBuffer nameOrDeviceId, @Cast("dai::UsbSpeed") int maxUsbSpeed);
    public DeviceBase(@StdString String nameOrDeviceId, UsbSpeed maxUsbSpeed) { super((Pointer)null); allocate(nameOrDeviceId, maxUsbSpeed); }
    private native void allocate(@StdString String nameOrDeviceId, UsbSpeed maxUsbSpeed);
    public DeviceBase(@StdString BytePointer nameOrDeviceId, @Cast("dai::UsbSpeed") int maxUsbSpeed) { super((Pointer)null); allocate(nameOrDeviceId, maxUsbSpeed); }
    private native void allocate(@StdString BytePointer nameOrDeviceId, @Cast("dai::UsbSpeed") int maxUsbSpeed);
    public DeviceBase(@StdString ByteBuffer nameOrDeviceId, UsbSpeed maxUsbSpeed) { super((Pointer)null); allocate(nameOrDeviceId, maxUsbSpeed); }
    private native void allocate(@StdString ByteBuffer nameOrDeviceId, UsbSpeed maxUsbSpeed);
    public DeviceBase(@StdString String nameOrDeviceId, @Cast("dai::UsbSpeed") int maxUsbSpeed) { super((Pointer)null); allocate(nameOrDeviceId, maxUsbSpeed); }
    private native void allocate(@StdString String nameOrDeviceId, @Cast("dai::UsbSpeed") int maxUsbSpeed);

    /**
     * Device destructor
     * \note In the destructor of the derived class, remember to call close()
     */

    /**
     * Gets Bootloader version if it was booted through Bootloader
     *
     * @return DeviceBootloader::Version if booted through Bootloader or none otherwise
     */
    public native @ByVal VersionOptional getBootloaderVersion();

    /**
     * Checks if devices pipeline is already running
     *
     * @return True if running, false otherwise
     */
    public native @Cast("bool") boolean isPipelineRunning();

    /**
     * Starts the execution of the devices pipeline
     *
     * @return True if pipeline started, false otherwise
     */
    public native @Cast("bool") @Deprecated boolean startPipeline();

    /**
     * Starts the execution of a given pipeline
     * @param pipeline OpenVINO version of the pipeline must match the one which the device was booted with.
     *
     * @return True if pipeline started, false otherwise
     */
    public native @Cast("bool") boolean startPipeline(@Const @ByRef Pipeline pipeline);

    /**
     * Sets the devices logging severity level. This level affects which logs are transferred from device to host.
     *
     * @param level Logging severity
     */
    public native void setLogLevel(LogLevel level);
    public native void setLogLevel(@Cast("dai::LogLevel") int level);

    /**
     * Gets current logging severity level of the device.
     *
     * @return Logging severity level
     */
    public native LogLevel getLogLevel();

    /**
     * Sets the chunk size for splitting device-sent XLink packets. A larger value could
     * increase performance, and 0 disables chunking. A negative value is ignored.
     * Device defaults are configured per protocol, currently 64*1024 for both USB and Ethernet.
     *
     * @param sizeBytes XLink chunk size in bytes
     */
    public native void setXLinkChunkSize(int sizeBytes);

    /**
     * Gets current XLink chunk size.
     *
     * @return XLink chunk size in bytes
     */
    public native int getXLinkChunkSize();

    /**
     * Get the Device Info object o the device which is currently running
     *
     * @return DeviceInfo of the current device in execution
     */
    public native @ByVal DeviceInfo getDeviceInfo();

    /**
     * Get device name if available
     * @return device name or empty string if not available
     */
    public native @StdString BytePointer getDeviceName();

    /**
     * Get MxId of device
     *
     * @return MxId of connected device
     */
    public native @StdString BytePointer getMxId();

    /**
     * Sets logging level which decides printing level to standard output.
     * If lower than setLogLevel, no messages will be printed
     *
     * @param level Standard output printing severity
     */
    public native void setLogOutputLevel(LogLevel level);
    public native void setLogOutputLevel(@Cast("dai::LogLevel") int level);

    /**
     * Gets logging level which decides printing level to standard output.
     *
     * @return Standard output printing severity
     */
    public native LogLevel getLogOutputLevel();

    /**
     * Sets the brightness of the IR Laser Dot Projector. Limits: up to 765mA at 30% duty cycle, up to 1200mA at 6% duty cycle.
     * The duty cycle is controlled by {@code left} camera STROBE, aligned to start of exposure.
     * The emitter is turned off by default
     *
     * @param mA Current in mA that will determine brightness, 0 or negative to turn off
     * @param mask Optional mask to modify only Left (0x1) or Right (0x2) sides on OAK-D-Pro-W-DEV
     * @return True on success, false if not found or other failure
     */
    public native @Cast("bool") boolean setIrLaserDotProjectorBrightness(float mA, int mask/*=-1*/);
    public native @Cast("bool") boolean setIrLaserDotProjectorBrightness(float mA);

    /**
     * Sets the brightness of the IR Flood Light. Limits: up to 1500mA at 30% duty cycle.
     * The duty cycle is controlled by the {@code left} camera STROBE, aligned to start of exposure.
     * If the dot projector is also enabled, its lower duty cycle limits take precedence.
     * The emitter is turned off by default
     *
     * @param mA Current in mA that will determine brightness, 0 or negative to turn off
     * @param mask Optional mask to modify only Left (0x1) or Right (0x2) sides on OAK-D-Pro-W-DEV
     * @return True on success, false if not found or other failure
     */
    public native @Cast("bool") boolean setIrFloodLightBrightness(float mA, int mask/*=-1*/);
    public native @Cast("bool") boolean setIrFloodLightBrightness(float mA);

    /**
     * Retrieves detected IR laser/LED drivers.
     *
     * @return Vector of tuples containing: driver name, I2C bus, I2C address.
     * For OAK-D-Pro it should be {@code [{"LM3644", 2, 0x63}]}
     */
    public native @StdVector StringIntIntTuple getIrDrivers();

    /**
     * Retrieves crash dump for debugging.
     */
    public native @ByVal CrashDump getCrashDump();

    /**
     * Retrieves whether the is crash dump stored on device or not.
     */
    public native @Cast("bool") boolean hasCrashDump();

    /**
     * Add a callback for device logging. The callback will be called from a separate thread with the LogMessage being passed.
     *
     * @param callback Callback to call whenever a log message arrives
     * @return Id which can be used to later remove the callback
     */
    public native int addLogCallback(LogCallback callback);

    /**
     * Removes a callback
     *
     * @param callbackId Id of callback to be removed
     * @return True if callback was removed, false otherwise
     */
    public native @Cast("bool") boolean removeLogCallback(int callbackId);

    /**
     * Sets rate of system information logging ("info" severity). Default 1Hz
     * If parameter is less or equal to zero, then system information logging will be disabled
     *
     * @param rateHz Logging rate in Hz
     */
    public native void setSystemInformationLoggingRate(float rateHz);

    /**
     * Gets current rate of system information logging ("info" severity) in Hz.
     *
     * @return Logging rate in Hz
     */
    public native float getSystemInformationLoggingRate();

    /**
     * Get cameras that are connected to the device
     *
     * @return Vector of connected cameras
     */
    public native @StdVector @Cast("dai::CameraBoardSocket*") IntPointer getConnectedCameras();

    /**
     * Get cameras that are connected to the device with their features/properties
     *
     * @return Vector of connected camera features
     */
    public native @StdVector CameraFeatures getConnectedCameraFeatures();

    /**
     * Get sensor names for cameras that are connected to the device
     *
     * @return Map/dictionary with camera sensor names, indexed by socket
     */
    public native @ByVal CameraBoardSocketStringMap getCameraSensorNames();

    /**
     * Get connected IMU type
     *
     * @return IMU type
     */
    public native @StdString BytePointer getConnectedIMU();

    /**
     * Get connected IMU firmware version
     *
     * @return IMU firmware version
     */
    public native @ByVal Version getIMUFirmwareVersion();

    /**
     * Get embedded IMU firmware version to which IMU can be upgraded
     *
     * @return Get embedded IMU firmware version to which IMU can be upgraded.
     */
    public native @ByVal Version getEmbeddedIMUFirmwareVersion();

    /**
     * Starts IMU firmware update asynchronously only if IMU node is not running.
     * If current firmware version is the same as embedded firmware version then it's no-op. Can be overridden by forceUpdate parameter.
     * State of firmware update can be monitored using getIMUFirmwareUpdateStatus API.
     *
     * @param forceUpdate Force firmware update or not. Will perform FW update regardless of current version and embedded firmware version.
     *
     * @return Returns whether firmware update can be started. Returns false if IMU node is started.
     */
    public native @Cast("bool") boolean startIMUFirmwareUpdate(@Cast("bool") boolean forceUpdate/*=false*/);
    public native @Cast("bool") boolean startIMUFirmwareUpdate();

    /**
     * Get IMU firmware update status
     *
     * @return Whether IMU firmware update is done and last firmware update progress as percentage.
     * return value true and 100 means that the update was successful
     * return value true and other than 100 means that the update failed
     */
    public native @ByVal BoolFloatTuple getIMUFirmwareUpdateStatus();

    /**
     * Retrieves current DDR memory information from device
     *
     * @return Used, remaining and total ddr memory
     */
    public native @ByVal MemoryInfo getDdrMemoryUsage();

    /**
     * Retrieves current CMX memory information from device
     *
     * @return Used, remaining and total cmx memory
     */
    public native @ByVal MemoryInfo getCmxMemoryUsage();

    /**
     * Retrieves current CSS Leon CPU heap information from device
     *
     * @return Used, remaining and total heap memory
     */
    public native @ByVal MemoryInfo getLeonCssHeapUsage();

    /**
     * Retrieves current MSS Leon CPU heap information from device
     *
     * @return Used, remaining and total heap memory
     */
    public native @ByVal MemoryInfo getLeonMssHeapUsage();

    /**
     * Retrieves current chip temperature as measured by device
     *
     * @return Temperature of various onboard sensors
     */
    public native @ByVal ChipTemperature getChipTemperature();

    /**
     * Retrieves average CSS Leon CPU usage
     *
     * @return Average CPU usage and sampling duration
     */
    public native @ByVal CpuUsage getLeonCssCpuUsage();

    /**
     * Retrieves average MSS Leon CPU usage
     *
     * @return Average CPU usage and sampling duration
     */
    public native @ByVal CpuUsage getLeonMssCpuUsage();

    /**
     * Check if EEPROM is available
     * @return True if EEPROM is present on board, false otherwise
     */
    public native @Cast("bool") boolean isEepromAvailable();

    /**
     * Stores the Calibration and Device information to the Device EEPROM
     *
     * @param calibrationObj CalibrationHandler object which is loaded with calibration information.
     *
     * @return true on successful flash, false on failure
     */
    public native @Cast("bool") boolean flashCalibration(@ByVal CalibrationHandler calibrationDataHandler);

    /**
     * Stores the Calibration and Device information to the Device EEPROM
     *
     * @throws std::runtime_exception if failed to flash the calibration
     * @param calibrationObj CalibrationHandler object which is loaded with calibration information.
     */
    public native void flashCalibration2(@ByVal CalibrationHandler calibrationDataHandler);

    /**
     * Fetches the EEPROM data from the device and loads it into CalibrationHandler object
     * If no calibration is flashed, it returns default
     *
     * @return The CalibrationHandler object containing the calibration currently flashed on device EEPROM
     */
    public native @ByVal CalibrationHandler readCalibration();

    /**
     * Fetches the EEPROM data from the device and loads it into CalibrationHandler object
     *
     * @throws std::runtime_exception if no calibration is flashed
     * @return The CalibrationHandler object containing the calibration currently flashed on device EEPROM
     */
    public native @ByVal CalibrationHandler readCalibration2();

    /**
     * Fetches the EEPROM data from the device and loads it into CalibrationHandler object
     * If no calibration is flashed, it returns default
     *
     * @return The CalibrationHandler object containing the calibration currently flashed on device EEPROM
     */
    public native @ByVal CalibrationHandler readCalibrationOrDefault();

    /**
     * Factory reset EEPROM data if factory backup is available.
     *
     * @throws std::runtime_exception If factory reset was unsuccessful
     */
    public native void factoryResetCalibration();

    /**
     * Stores the Calibration and Device information to the Device EEPROM in Factory area
     * To perform this action, correct env variable must be set
     *
     * @throws std::runtime_exception if failed to flash the calibration
     * @return True on successful flash, false on failure
     */
    public native void flashFactoryCalibration(@ByVal CalibrationHandler calibrationHandler);

    /**
     * Destructive action, deletes User area EEPROM contents
     * Requires PROTECTED permissions
     *
     * @throws std::runtime_exception if failed to flash the calibration
     * @return True on successful flash, false on failure
     */
    public native void flashEepromClear();

    /**
     * Destructive action, deletes Factory area EEPROM contents
     * Requires FACTORY PROTECTED permissions
     *
     * @throws std::runtime_exception if failed to flash the calibration
     * @return True on successful flash, false on failure
     */
    public native void flashFactoryEepromClear();

    /**
     * Fetches the EEPROM data from Factory area and loads it into CalibrationHandler object
     *
     * @throws std::runtime_exception if no calibration is flashed
     * @return The CalibrationHandler object containing the calibration currently flashed on device EEPROM in Factory Area
     */
    public native @ByVal CalibrationHandler readFactoryCalibration();

    /**
     * Fetches the EEPROM data from Factory area and loads it into CalibrationHandler object
     * If no calibration is flashed, it returns default
     *
     * @return The CalibrationHandler object containing the calibration currently flashed on device EEPROM in Factory Area
     */
    public native @ByVal CalibrationHandler readFactoryCalibrationOrDefault();

    /**
     * Fetches the raw EEPROM data from User area
     *
     * @throws std::runtime_exception if any error occurred
     * @return Binary dump of User area EEPROM data
     */
    public native @Cast("std::uint8_t*") @StdVector BytePointer readCalibrationRaw();

    /**
     * Fetches the raw EEPROM data from Factory area
     *
     * @throws std::runtime_exception if any error occurred
     * @return Binary dump of Factory area EEPROM data
     */
    public native @Cast("std::uint8_t*") @StdVector BytePointer readFactoryCalibrationRaw();

    /**
     * Retrieves USB connection speed
     *
     * @return USB connection speed of connected device if applicable. Unknown otherwise.
     */
    public native UsbSpeed getUsbSpeed();

    /**
     * Configures Timesync service on device. It keeps host and device clocks in sync
     * First time timesync is started it waits until the initial sync is completed
     * Afterwards the function changes the following parameters
     *
     * @param period Interval between timesync runs
     * @param numSamples Number of timesync samples per run which are used to compute a better value. Set to zero to disable timesync
     * @param random If true partial timesync requests will be performed at random intervals, otherwise at fixed intervals
     */
    public native void setTimesync(@ByVal @Cast("std::chrono::milliseconds*") Pointer period, int numSamples, @Cast("bool") boolean random);

    /**
     * Enables or disables Timesync service on device. It keeps host and device clocks in sync.
     *
     * @param enable Enables or disables consistent timesyncing
     */
    public native void setTimesync(@Cast("bool") boolean enable);

    /**
     * Explicitly closes connection to device.
     * \note This function does not need to be explicitly called
     * as destructor closes the device automatically
     */
    public native @Name("close") void _close();

    /**
     * Is the device already closed (or disconnected)
     *
     * \warning This function is thread-unsafe and may return outdated incorrect values. It is
     * only meant for use in simple single-threaded code. Well written code should handle
     * exceptions when calling any DepthAI apis to handle hardware events and multithreaded use.
     */
    public native @Cast("bool") boolean isClosed();

    /**
     * Returns underlying XLinkConnection
     */
    public native @SharedPtr XLinkConnection getConnection();

    /**
     * Returns underlying XLinkConnection
     */
}
