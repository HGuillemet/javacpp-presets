// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.nvToolsExt;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.cuda.global.nvToolsExt.*;


/** \brief Event Attribute Structure.
 * \anchor EVENT_ATTRIBUTE_STRUCTURE
 *
 * This structure is used to describe the attributes of an event. The layout of
 * the structure is defined by a specific version of the tools extension
 * library and can change between different versions of the Tools Extension
 * library.
 *
 * \par Initializing the Attributes
 *
 * The caller should always perform the following three tasks when using
 * attributes:
 * <ul>
 *    <li>Zero the structure
 *    <li>Set the version field
 *    <li>Set the size field
 * </ul>
 *
 * Zeroing the structure sets all the event attributes types and values
 * to the default value.
 *
 * The version and size field are used by the Tools Extension
 * implementation to handle multiple versions of the attributes structure.
 *
 * It is recommended that the caller use one of the following to methods
 * to initialize the event attributes structure:
 *
 * \par Method 1: Initializing nvtxEventAttributes for future compatibility
 * <pre>{@code
 * nvtxEventAttributes_t eventAttrib = {0};
 * eventAttrib.version = NVTX_VERSION;
 * eventAttrib.size = NVTX_EVENT_ATTRIB_STRUCT_SIZE;
 * }</pre>
 *
 * \par Method 2: Initializing nvtxEventAttributes for a specific version
 * <pre>{@code
 * nvtxEventAttributes_t eventAttrib = {0};
 * eventAttrib.version = 1;
 * eventAttrib.size = (uint16_t)(sizeof(nvtxEventAttributes_v1));
 * }</pre>
 *
 * If the caller uses Method 1 it is critical that the entire binary
 * layout of the structure be configured to 0 so that all fields
 * are initialized to the default value.
 *
 * The caller should either use both NVTX_VERSION and
 * NVTX_EVENT_ATTRIB_STRUCT_SIZE (Method 1) or use explicit values
 * and a versioned type (Method 2).  Using a mix of the two methods
 * will likely cause either source level incompatibility or binary
 * incompatibility in the future.
 *
 * \par Settings Attribute Types and Values
 *
 *
 * \par Example:
 * <pre>{@code
 * // Initialize
 * nvtxEventAttributes_t eventAttrib = {0};
 * eventAttrib.version = NVTX_VERSION;
 * eventAttrib.size = NVTX_EVENT_ATTRIB_STRUCT_SIZE;
 *
 * // Configure the Attributes
 * eventAttrib.colorType = NVTX_COLOR_ARGB;
 * eventAttrib.color = 0xFF880000;
 * eventAttrib.messageType = NVTX_MESSAGE_TYPE_ASCII;
 * eventAttrib.message.ascii = "Example";
 * }</pre>
 *
 * In the example the caller does not have to set the value of
 * \ref ::nvtxEventAttributes_v2::category or
 * \ref ::nvtxEventAttributes_v2::payload as these fields were set to
 * the default value by {0}.
 * @see
 * ::nvtxDomainMarkEx
 * ::nvtxDomainRangeStartEx
 * ::nvtxDomainRangePushEx
 */
@Name("nvtxEventAttributes_v2") @Properties(inherit = org.bytedeco.cuda.presets.nvToolsExt.class)
public class nvtxEventAttributes_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public nvtxEventAttributes_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public nvtxEventAttributes_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public nvtxEventAttributes_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public nvtxEventAttributes_t position(long position) {
        return (nvtxEventAttributes_t)super.position(position);
    }
    @Override public nvtxEventAttributes_t getPointer(long i) {
        return new nvtxEventAttributes_t((Pointer)this).offsetAddress(i);
    }

    /**
    * \brief Version flag of the structure.
    *
    * Needs to be set to NVTX_VERSION to indicate the version of NVTX APIs
    * supported in this header file. This can optionally be overridden to
    * another version of the tools extension library.
    */
    public native @Cast("uint16_t") short version(); public native nvtxEventAttributes_t version(short setter);

    /**
    * \brief Size of the structure.
    *
    * Needs to be set to the size in bytes of the event attribute
    * structure used to specify the event.
    */
    public native @Cast("uint16_t") short size(); public native nvtxEventAttributes_t size(short setter);

    /**
     * \brief ID of the category the event is assigned to.
     *
     * A category is a user-controlled ID that can be used to group
     * events.  The tool may use category IDs to improve filtering or
     * enable grouping of events in the same category. The functions
     * \ref ::nvtxNameCategoryA or \ref ::nvtxNameCategoryW can be used
     * to name a category.
     *
     * Default Value is 0
     */
    public native @Cast("uint32_t") int category(); public native nvtxEventAttributes_t category(int setter);

    /** \brief Color type specified in this attribute structure.
     *
     * Defines the color format of the attribute structure's \ref COLOR_FIELD
     * "color" field.
     *
     * Default Value is NVTX_COLOR_UNKNOWN
     */
    public native int colorType(); public native nvtxEventAttributes_t colorType(int setter);              /* nvtxColorType_t */

    /** \brief Color assigned to this event. \anchor COLOR_FIELD
     *
     * The color that the tool should use to visualize the event.
     */
    public native @Cast("uint32_t") int color(); public native nvtxEventAttributes_t color(int setter);

    /**
     * \brief Payload type specified in this attribute structure.
     *
     * Defines the payload format of the attribute structure's \ref PAYLOAD_FIELD
     * "payload" field.
     *
     * Default Value is NVTX_PAYLOAD_UNKNOWN
     */
    public native int payloadType(); public native nvtxEventAttributes_t payloadType(int setter);            /* nvtxPayloadType_t */

    public native int reserved0(); public native nvtxEventAttributes_t reserved0(int setter);

    /**
     * \brief Payload assigned to this event. \anchor PAYLOAD_FIELD
     *
     * A numerical value that can be used to annotate an event. The tool could
     * use the payload data to reconstruct graphs and diagrams.
     */
        @Name("payload.ullValue") public native @Cast("uint64_t") long payload_ullValue(); public native nvtxEventAttributes_t payload_ullValue(long setter);
        @Name("payload.llValue") public native @Cast("int64_t") long payload_llValue(); public native nvtxEventAttributes_t payload_llValue(long setter);
        @Name("payload.dValue") public native double payload_dValue(); public native nvtxEventAttributes_t payload_dValue(double setter);
        /* NVTX_VERSION_2 */
        @Name("payload.uiValue") public native @Cast("uint32_t") int payload_uiValue(); public native nvtxEventAttributes_t payload_uiValue(int setter);
        @Name("payload.iValue") public native int payload_iValue(); public native nvtxEventAttributes_t payload_iValue(int setter);
        @Name("payload.fValue") public native float payload_fValue(); public native nvtxEventAttributes_t payload_fValue(float setter);

    /** \brief Message type specified in this attribute structure.
     *
     * Defines the message format of the attribute structure's \ref MESSAGE_FIELD
     * "message" field.
     *
     * Default Value is NVTX_MESSAGE_UNKNOWN
     */
    public native int messageType(); public native nvtxEventAttributes_t messageType(int setter);            /* nvtxMessageType_t */

    /** \brief Message assigned to this attribute structure. \anchor MESSAGE_FIELD
     *
     * The text message that is attached to an event.
     */
    public native @ByRef @Cast("nvtxMessageValue_t*") Pointer message(); public native nvtxEventAttributes_t message(Pointer setter);

}
