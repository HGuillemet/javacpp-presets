// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.Bullet3Dynamics;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.Bullet3Common.*;
import static org.bytedeco.bullet.global.Bullet3Common.*;
import org.bytedeco.bullet.Bullet3Collision.*;
import static org.bytedeco.bullet.global.Bullet3Collision.*;

import static org.bytedeco.bullet.global.Bullet3Dynamics.*;

/**do not change those serialization structures, it requires an updated sBulletDNAstr/sBulletDNAstr64 */
@Properties(inherit = org.bytedeco.bullet.presets.Bullet3Dynamics.class)
public class b3ContactSolverInfoFloatData extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public b3ContactSolverInfoFloatData() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public b3ContactSolverInfoFloatData(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public b3ContactSolverInfoFloatData(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public b3ContactSolverInfoFloatData position(long position) {
        return (b3ContactSolverInfoFloatData)super.position(position);
    }
    @Override public b3ContactSolverInfoFloatData getPointer(long i) {
        return new b3ContactSolverInfoFloatData((Pointer)this).offsetAddress(i);
    }

	public native float m_tau(); public native b3ContactSolverInfoFloatData m_tau(float setter);
	public native float m_damping(); public native b3ContactSolverInfoFloatData m_damping(float setter);  //global non-contact constraint damping, can be locally overridden by constraints during 'getInfo2'.
	public native float m_friction(); public native b3ContactSolverInfoFloatData m_friction(float setter);
	public native float m_timeStep(); public native b3ContactSolverInfoFloatData m_timeStep(float setter);

	public native float m_restitution(); public native b3ContactSolverInfoFloatData m_restitution(float setter);
	public native float m_maxErrorReduction(); public native b3ContactSolverInfoFloatData m_maxErrorReduction(float setter);
	public native float m_sor(); public native b3ContactSolverInfoFloatData m_sor(float setter);
	public native float m_erp(); public native b3ContactSolverInfoFloatData m_erp(float setter);  //used as Baumgarte factor

	public native float m_erp2(); public native b3ContactSolverInfoFloatData m_erp2(float setter);       //used in Split Impulse
	public native float m_globalCfm(); public native b3ContactSolverInfoFloatData m_globalCfm(float setter);  //constraint force mixing
	public native float m_splitImpulsePenetrationThreshold(); public native b3ContactSolverInfoFloatData m_splitImpulsePenetrationThreshold(float setter);
	public native float m_splitImpulseTurnErp(); public native b3ContactSolverInfoFloatData m_splitImpulseTurnErp(float setter);

	public native float m_linearSlop(); public native b3ContactSolverInfoFloatData m_linearSlop(float setter);
	public native float m_warmstartingFactor(); public native b3ContactSolverInfoFloatData m_warmstartingFactor(float setter);
	public native float m_maxGyroscopicForce(); public native b3ContactSolverInfoFloatData m_maxGyroscopicForce(float setter);
	public native float m_singleAxisRollingFrictionThreshold(); public native b3ContactSolverInfoFloatData m_singleAxisRollingFrictionThreshold(float setter);

	public native int m_numIterations(); public native b3ContactSolverInfoFloatData m_numIterations(int setter);
	public native int m_solverMode(); public native b3ContactSolverInfoFloatData m_solverMode(int setter);
	public native int m_restingContactRestitutionThreshold(); public native b3ContactSolverInfoFloatData m_restingContactRestitutionThreshold(int setter);
	public native int m_minimumSolverBatchSize(); public native b3ContactSolverInfoFloatData m_minimumSolverBatchSize(int setter);

	public native int m_splitImpulse(); public native b3ContactSolverInfoFloatData m_splitImpulse(int setter);
	public native @Cast("char") byte m_padding(int i); public native b3ContactSolverInfoFloatData m_padding(int i, byte setter);
	@MemberGetter public native @Cast("char*") BytePointer m_padding();
}
