// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.flycapture.FlyCapture2;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.flycapture.global.FlyCapture2.*;


	/**
	 * The TopologyNode class contains topology information that can be
	 * used to generate a tree structure of all cameras and devices connected
	 * to a computer.
	 */
	@Namespace("FlyCapture2") @NoOffset @Properties(inherit = org.bytedeco.flycapture.presets.FlyCapture2.class)
public class TopologyNode extends Pointer {
	    static { Loader.load(); }
	    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
	    public TopologyNode(Pointer p) { super(p); }
	    /** Native array allocator. Access with {@link Pointer#position(long)}. */
	    public TopologyNode(long size) { super((Pointer)null); allocateArray(size); }
	    private native void allocateArray(long size);
	    @Override public TopologyNode position(long position) {
	        return (TopologyNode)super.position(position);
	    }
	

			/**
			 * Possible states of a port on a node.
			 */
			/** enum FlyCapture2::TopologyNode::PortType */
			public static final int
				NOT_CONNECTED = 1,
				CONNECTED_TO_PARENT = 2,
				CONNECTED_TO_CHILD = 3;

			/**
			 * Type of node.
			 */
			/** enum FlyCapture2::TopologyNode::NodeType */
			public static final int
				COMPUTER = 0,
				BUS = 1,
				CAMERA = 2,
				NODE = 3;

			/**
			 * Default constructor.
			 */
			public TopologyNode() { super((Pointer)null); allocate(); }
			private native void allocate();

			/**
			 * Constructor.
			 *
			 * @param guid The PGRGuid of the node (if applicable).
			 * @param deviceId Device ID of the node.
			 * @param nodeType Type of the node.
			 * @param interfaceType Interface type of the node.
			 */
			public TopologyNode(
								@ByVal PGRGuid guid,
								int deviceId,
								@Cast("FlyCapture2::TopologyNode::NodeType") int nodeType,
								@Cast("FlyCapture2::InterfaceType") int interfaceType ) { super((Pointer)null); allocate(guid, deviceId, nodeType, interfaceType); }
			private native void allocate(
								@ByVal PGRGuid guid,
								int deviceId,
								@Cast("FlyCapture2::TopologyNode::NodeType") int nodeType,
								@Cast("FlyCapture2::InterfaceType") int interfaceType );

			/**
			 * Default destructor.
			 */

			/**
			 * Copy constructor.
			 */
			public TopologyNode( @Const @ByRef TopologyNode other ) { super((Pointer)null); allocate(other); }
			private native void allocate( @Const @ByRef TopologyNode other );

			/**
			 * Assignment operator.
			 *
			 * @param other The TopologyNode to copy from.
			 */
			public native @ByRef @Name("operator =") TopologyNode put( @Const @ByRef TopologyNode other );

			/**
			 * Get the PGRGuid associated with the node.
			 *
			 * @return PGRGuid of the node.
			 */
			public native @ByVal PGRGuid GetGuid();

			/**
			 * Get the device ID associated with the node.
			 *
			 * @return Device ID of the node.
			 */
			public native int GetDeviceId();

			/**
			 * Get the node type associated with the node.
			 *
			 * @return Node type of the node.
			 */
			public native @Cast("FlyCapture2::TopologyNode::NodeType") int GetNodeType();

			/**
			 * Get the interface type associated with the node.
			 *
			 * @return Interface type of the node.
			 */
			public native @Cast("FlyCapture2::InterfaceType") int GetInterfaceType();

			/**
			 * Get the number of child nodes.
			 *
			 * @return Number of child nodes.
			 */
			public native @Cast("unsigned int") int GetNumChildren();

			/**
			 * Get child node located at the specified position.
			 *
			 * @param position Position of the node.
			 *
			 * @return TopologyNode at the specified position.
			 */
			public native @ByVal TopologyNode GetChild( @Cast("unsigned int") int position );

			/**
			 * Add the specified TopologyNode as a child of the node.
			 *
			 * @param childNode The TopologyNode to add.
			 */
			public native void AddChild( @ByVal TopologyNode childNode );

			/**
			 * Get the number of ports.
			 *
			 * @return Number of ports.
			 */
			public native @Cast("unsigned int") int GetNumPorts();

			/**
			 * Get type of port located at the specified position.
			 *
			 * @param position Position of the port.
			 *
			 * @return PortType at the specified position.
			 */
			public native @Cast("FlyCapture2::TopologyNode::PortType") int GetPortType( @Cast("unsigned int") int position );

			/**
			 * Add the specified PortType as a port of the node.
			 *
			 * @param childPort The port to add.
			 */
			public native void AddPortType( @Cast("FlyCapture2::TopologyNode::PortType") int childPort );

			/**
			 * Assign a PGRGuid and device ID to the node.
			 *
			 * @param guid PGRGuid to be assigned.
			 * @param deviceId Device ID to be assigned.
			 *
			 * @return Whether the data was successfully set to the node.
			 */
			public native @Cast("bool") boolean AssignGuidToNode( @ByVal PGRGuid guid, int deviceId );

			/**
			 * Assign a PGRGuid, device ID and nodeType to the node.
			 *
			 * @param guid PGRGuid to be assigned.
			 * @param deviceId Device ID to be assigned.
			 * @param nodeType NodeType to be assigned
			 *
			 * @return Whether the data was successfully set to the node.
			 */
			public native @Cast("bool") boolean AssignGuidToNode(@ByVal PGRGuid guid, int deviceId, @Cast("FlyCapture2::TopologyNode::NodeType") int nodeType);
	}
