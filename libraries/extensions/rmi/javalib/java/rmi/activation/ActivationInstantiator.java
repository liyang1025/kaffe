/*
 * Copyright (c) 1996, 1997, 1998, 1999
 *      Transvirtual Technologies, Inc.  All rights reserved.
 *
 * See the file "license-lesser.terms" for information on usage and 
 * redistribution of this file.
 */

package java.rmi.activation;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.MarshalledObject;

public interface ActivationInstantiator
	extends Remote {

public MarshalledObject newInstance(ActivationID id, ActivationDesc desc) throws ActivationException, RemoteException;

}
