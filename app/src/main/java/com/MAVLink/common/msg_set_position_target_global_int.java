/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE SET_POSITION_TARGET_GLOBAL_INT PACKING
package com.MAVLink.common;

import com.MAVLink.MAVLinkPacket;
import com.MAVLink.Messages.MAVLinkMessage;
import com.MAVLink.Messages.MAVLinkPayload;

/**
 * Sets a desired vehicle position, velocity, and/or acceleration in a global coordinate system (WGS84). Used by an external controller to command the vehicle (manual controller or other system).
 */
public class msg_set_position_target_global_int extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_SET_POSITION_TARGET_GLOBAL_INT = 86;
    public static final int MAVLINK_MSG_LENGTH = 53;
    private static final long serialVersionUID = MAVLINK_MSG_ID_SET_POSITION_TARGET_GLOBAL_INT;


    /**
     * Timestamp (time since system boot). The rationale for the timestamp in the setpoint is to allow the system to compensate for the transport delay of the setpoint. This allows the system to compensate processing latency.
     */
    public long time_boot_ms;

    /**
     * X Position in WGS84 frame
     */
    public int lat_int;

    /**
     * Y Position in WGS84 frame
     */
    public int lon_int;

    /**
     * Altitude (MSL, Relative to home, or AGL - depending on frame)
     */
    public float alt;

    /**
     * X velocity in NED frame
     */
    public float vx;

    /**
     * Y velocity in NED frame
     */
    public float vy;

    /**
     * Z velocity in NED frame
     */
    public float vz;

    /**
     * X acceleration or force (if bit 10 of type_mask is set) in NED frame in meter / s^2 or N
     */
    public float afx;

    /**
     * Y acceleration or force (if bit 10 of type_mask is set) in NED frame in meter / s^2 or N
     */
    public float afy;

    /**
     * Z acceleration or force (if bit 10 of type_mask is set) in NED frame in meter / s^2 or N
     */
    public float afz;

    /**
     * yaw setpoint
     */
    public float yaw;

    /**
     * yaw rate setpoint
     */
    public float yaw_rate;

    /**
     * Bitmap to indicate which dimensions should be ignored by the vehicle.
     */
    public int type_mask;

    /**
     * System ID
     */
    public short target_system;

    /**
     * Component ID
     */
    public short target_component;

    /**
     * Valid options are: MAV_FRAME_GLOBAL_INT = 5, MAV_FRAME_GLOBAL_RELATIVE_ALT_INT = 6, MAV_FRAME_GLOBAL_TERRAIN_ALT_INT = 11
     */
    public short coordinate_frame;


    /**
     * Generates the payload for a mavlink message for a message of this type
     *
     * @return
     */
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_SET_POSITION_TARGET_GLOBAL_INT;

        packet.payload.putUnsignedInt(time_boot_ms);

        packet.payload.putInt(lat_int);

        packet.payload.putInt(lon_int);

        packet.payload.putFloat(alt);

        packet.payload.putFloat(vx);

        packet.payload.putFloat(vy);

        packet.payload.putFloat(vz);

        packet.payload.putFloat(afx);

        packet.payload.putFloat(afy);

        packet.payload.putFloat(afz);

        packet.payload.putFloat(yaw);

        packet.payload.putFloat(yaw_rate);

        packet.payload.putUnsignedShort(type_mask);

        packet.payload.putUnsignedByte(target_system);

        packet.payload.putUnsignedByte(target_component);

        packet.payload.putUnsignedByte(coordinate_frame);

        return packet;
    }

    /**
     * Decode a set_position_target_global_int message into this class fields
     *
     * @param payload The message to decode
     */
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();

        this.time_boot_ms = payload.getUnsignedInt();

        this.lat_int = payload.getInt();

        this.lon_int = payload.getInt();

        this.alt = payload.getFloat();

        this.vx = payload.getFloat();

        this.vy = payload.getFloat();

        this.vz = payload.getFloat();

        this.afx = payload.getFloat();

        this.afy = payload.getFloat();

        this.afz = payload.getFloat();

        this.yaw = payload.getFloat();

        this.yaw_rate = payload.getFloat();

        this.type_mask = payload.getUnsignedShort();

        this.target_system = payload.getUnsignedByte();

        this.target_component = payload.getUnsignedByte();

        this.coordinate_frame = payload.getUnsignedByte();

    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_set_position_target_global_int() {
        msgid = MAVLINK_MSG_ID_SET_POSITION_TARGET_GLOBAL_INT;
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     */
    public msg_set_position_target_global_int(MAVLinkPacket mavLinkPacket) {
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.msgid = MAVLINK_MSG_ID_SET_POSITION_TARGET_GLOBAL_INT;
        unpack(mavLinkPacket.payload);
    }


    /**
     * Returns a string with the MSG name and data
     */
    public String toString() {
        return "MAVLINK_MSG_ID_SET_POSITION_TARGET_GLOBAL_INT - sysid:" + sysid + " compid:" + compid + " time_boot_ms:" + time_boot_ms + " lat_int:" + lat_int + " lon_int:" + lon_int + " alt:" + alt + " vx:" + vx + " vy:" + vy + " vz:" + vz + " afx:" + afx + " afy:" + afy + " afz:" + afz + " yaw:" + yaw + " yaw_rate:" + yaw_rate + " type_mask:" + type_mask + " target_system:" + target_system + " target_component:" + target_component + " coordinate_frame:" + coordinate_frame + "";
    }
}
        