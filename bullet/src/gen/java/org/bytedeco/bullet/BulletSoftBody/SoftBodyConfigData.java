// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletSoftBody;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;
import org.bytedeco.bullet.BulletCollision.*;
import static org.bytedeco.bullet.global.BulletCollision.*;
import org.bytedeco.bullet.BulletDynamics.*;
import static org.bytedeco.bullet.global.BulletDynamics.*;

import static org.bytedeco.bullet.global.BulletSoftBody.*;


@Properties(inherit = org.bytedeco.bullet.presets.BulletSoftBody.class)
public class SoftBodyConfigData extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public SoftBodyConfigData() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public SoftBodyConfigData(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SoftBodyConfigData(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public SoftBodyConfigData position(long position) {
        return (SoftBodyConfigData)super.position(position);
    }
    @Override public SoftBodyConfigData getPointer(long i) {
        return new SoftBodyConfigData((Pointer)this).offsetAddress(i);
    }

	public native int m_aeroModel(); public native SoftBodyConfigData m_aeroModel(int setter);                         // Aerodynamic model (default: V_Point)
	public native float m_baumgarte(); public native SoftBodyConfigData m_baumgarte(float setter);                       // Velocities correction factor (Baumgarte)
	public native float m_damping(); public native SoftBodyConfigData m_damping(float setter);                         // Damping coefficient [0,1]
	public native float m_drag(); public native SoftBodyConfigData m_drag(float setter);                            // Drag coefficient [0,+inf]
	public native float m_lift(); public native SoftBodyConfigData m_lift(float setter);                            // Lift coefficient [0,+inf]
	public native float m_pressure(); public native SoftBodyConfigData m_pressure(float setter);                        // Pressure coefficient [-inf,+inf]
	public native float m_volume(); public native SoftBodyConfigData m_volume(float setter);                          // Volume conversation coefficient [0,+inf]
	public native float m_dynamicFriction(); public native SoftBodyConfigData m_dynamicFriction(float setter);                 // Dynamic friction coefficient [0,1]
	public native float m_poseMatch(); public native SoftBodyConfigData m_poseMatch(float setter);                       // Pose matching coefficient [0,1]
	public native float m_rigidContactHardness(); public native SoftBodyConfigData m_rigidContactHardness(float setter);            // Rigid contacts hardness [0,1]
	public native float m_kineticContactHardness(); public native SoftBodyConfigData m_kineticContactHardness(float setter);          // Kinetic contacts hardness [0,1]
	public native float m_softContactHardness(); public native SoftBodyConfigData m_softContactHardness(float setter);             // Soft contacts hardness [0,1]
	public native float m_anchorHardness(); public native SoftBodyConfigData m_anchorHardness(float setter);                  // Anchors hardness [0,1]
	public native float m_softRigidClusterHardness(); public native SoftBodyConfigData m_softRigidClusterHardness(float setter);        // Soft vs rigid hardness [0,1] (cluster only)
	public native float m_softKineticClusterHardness(); public native SoftBodyConfigData m_softKineticClusterHardness(float setter);      // Soft vs kinetic hardness [0,1] (cluster only)
	public native float m_softSoftClusterHardness(); public native SoftBodyConfigData m_softSoftClusterHardness(float setter);         // Soft vs soft hardness [0,1] (cluster only)
	public native float m_softRigidClusterImpulseSplit(); public native SoftBodyConfigData m_softRigidClusterImpulseSplit(float setter);    // Soft vs rigid impulse split [0,1] (cluster only)
	public native float m_softKineticClusterImpulseSplit(); public native SoftBodyConfigData m_softKineticClusterImpulseSplit(float setter);  // Soft vs rigid impulse split [0,1] (cluster only)
	public native float m_softSoftClusterImpulseSplit(); public native SoftBodyConfigData m_softSoftClusterImpulseSplit(float setter);     // Soft vs rigid impulse split [0,1] (cluster only)
	public native float m_maxVolume(); public native SoftBodyConfigData m_maxVolume(float setter);                       // Maximum volume ratio for pose
	public native float m_timeScale(); public native SoftBodyConfigData m_timeScale(float setter);                       // Time scale
	public native int m_velocityIterations(); public native SoftBodyConfigData m_velocityIterations(int setter);                // Velocities solver iterations
	public native int m_positionIterations(); public native SoftBodyConfigData m_positionIterations(int setter);                // Positions solver iterations
	public native int m_driftIterations(); public native SoftBodyConfigData m_driftIterations(int setter);                   // Drift solver iterations
	public native int m_clusterIterations(); public native SoftBodyConfigData m_clusterIterations(int setter);                 // Cluster solver iterations
	public native int m_collisionFlags(); public native SoftBodyConfigData m_collisionFlags(int setter);                    // Collisions flags
}
