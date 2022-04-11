/*
 *  Licensed to the Apache Software Foundation (ASF) under one
 *  or more contributor license agreements.  See the NOTICE file
 *  distributed with this work for additional information
 *  regarding copyright ownership.  The ASF licenses this file
 *  to you under the Apache License, Version 2.0 (the
 *  "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *  
 *    http://www.apache.org/licenses/LICENSE-2.0
 *  
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License. 
 *  
 */
package org.apache.directory.shared.kerberos.codec.paEncTsEnc;


import org.apache.directory.api.asn1.ber.AbstractContainer;
import org.apache.directory.shared.kerberos.components.PaEncTsEnc;


/**
 * The AdAndOr container stores the PA-ENC-TS-ENC decoded by the Asn1Decoder.
 * 
 * @author <a href="mailto:dev@directory.apache.org">Apache Directory Project</a>
 */
public class PaEncTsEncContainer extends AbstractContainer
{
    /** An PA-ENC-TS-ENC container */
    private PaEncTsEnc paEncTsEnc = new PaEncTsEnc();


    /**
     * Creates a new PaEncTsEncContainer object.
     */
    public PaEncTsEncContainer()
    {
        super();
        setGrammar( PaEncTsEncGrammar.getInstance() );
        setTransition( PaEncTsEncStatesEnum.START_STATE );
    }


    /**
     * @return Returns the PaEncTsEnc.
     */
    public PaEncTsEnc getPaEncTsEnc()
    {
        return paEncTsEnc;
    }


    /**
     * Set an PaEncTsEnc Object into the container. It will be completed by the
     * KerberosDecoder.
     * 
     * @param paEncTsEnc The PaEncTsEnc to set.
     */
    public void setPaEncTsEnc( PaEncTsEnc paEncTsEnc )
    {
        this.paEncTsEnc = paEncTsEnc;
    }
}
