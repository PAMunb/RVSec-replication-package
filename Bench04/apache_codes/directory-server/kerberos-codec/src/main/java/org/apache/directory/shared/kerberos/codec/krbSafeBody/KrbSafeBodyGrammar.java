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
package org.apache.directory.shared.kerberos.codec.krbSafeBody;


import org.apache.directory.api.asn1.actions.CheckNotNullLength;
import org.apache.directory.api.asn1.ber.grammar.AbstractGrammar;
import org.apache.directory.api.asn1.ber.grammar.Grammar;
import org.apache.directory.api.asn1.ber.grammar.GrammarTransition;
import org.apache.directory.api.asn1.ber.tlv.UniversalTag;
import org.apache.directory.shared.kerberos.KerberosConstants;
import org.apache.directory.shared.kerberos.codec.krbSafeBody.actions.KrbSafeBodyInit;
import org.apache.directory.shared.kerberos.codec.krbSafeBody.actions.StoreRecipientAddress;
import org.apache.directory.shared.kerberos.codec.krbSafeBody.actions.StoreSenderAddress;
import org.apache.directory.shared.kerberos.codec.krbSafeBody.actions.StoreSeqNumber;
import org.apache.directory.shared.kerberos.codec.krbSafeBody.actions.StoreTimestamp;
import org.apache.directory.shared.kerberos.codec.krbSafeBody.actions.StoreUsec;
import org.apache.directory.shared.kerberos.codec.krbSafeBody.actions.StoreUserData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * This class implements the KRB-SAFE-BODY structure. All the actions are declared
 * in this class. As it is a singleton, these declaration are only done once. If
 * an action is to be added or modified, this is where the work is to be done !
 *
 * @author <a href="mailto:dev@directory.apache.org">Apache Directory Project</a>
 */
public final class KrbSafeBodyGrammar extends AbstractGrammar<KrbSafeBodyContainer>
{
    /** The logger */
    static final Logger LOG = LoggerFactory.getLogger( KrbSafeBodyGrammar.class );

    /** A speedup for logger */
    static final boolean IS_DEBUG = LOG.isDebugEnabled();

    /** The instance of grammar. KrbSafeBodyGrammar is a singleton */
    private static Grammar<KrbSafeBodyContainer> instance = new KrbSafeBodyGrammar();


    /**
     * Creates a new KrbSafeBodyGrammar object.
     */
    @SuppressWarnings("unchecked")
    private KrbSafeBodyGrammar()
    {
        setName( KrbSafeBodyGrammar.class.getName() );

        // Create the transitions table
        super.transitions = new GrammarTransition[KrbSafeBodyStatesEnum.LAST_KRB_SAFE_BODY_STATE.ordinal()][256];

        // ============================================================================================
        // KrbSafeBody
        // ============================================================================================
        // --------------------------------------------------------------------------------------------
        // Transition from KrbSafeBody init to KrbSafeBody seq
        // --------------------------------------------------------------------------------------------
        // KRB-SAFE-BODY   ::= SEQUENCE {
        super.transitions[KrbSafeBodyStatesEnum.START_STATE.ordinal()][UniversalTag.SEQUENCE.getValue()] =
            new GrammarTransition<KrbSafeBodyContainer>(
                KrbSafeBodyStatesEnum.START_STATE,
                KrbSafeBodyStatesEnum.KRB_SAFE_BODY_SEQ_TAG_STATE,
                UniversalTag.SEQUENCE,
                new KrbSafeBodyInit() );

        // --------------------------------------------------------------------------------------------
        // Transition from KrbSafeBody seq to user-data tag
        // --------------------------------------------------------------------------------------------
        // KRB-SAFE-BODY   ::= SEQUENCE {
        // user-data       [0]
        super.transitions[KrbSafeBodyStatesEnum.KRB_SAFE_BODY_SEQ_TAG_STATE.ordinal()][KerberosConstants.KRB_SAFE_BODY_USER_DATA_TAG] =
            new GrammarTransition<KrbSafeBodyContainer>(
                KrbSafeBodyStatesEnum.KRB_SAFE_BODY_SEQ_TAG_STATE,
                KrbSafeBodyStatesEnum.KRB_SAFE_BODY_USER_DATA_TAG_STATE,
                KerberosConstants.KRB_SAFE_BODY_USER_DATA_TAG,
                new CheckNotNullLength<KrbSafeBodyContainer>() );

        // --------------------------------------------------------------------------------------------
        // Transition from user-data tag to user-data value
        // --------------------------------------------------------------------------------------------
        // KRB-SAFE-BODY   ::= SEQUENCE {
        // user-data       [0] OCTET STRING
        super.transitions[KrbSafeBodyStatesEnum.KRB_SAFE_BODY_USER_DATA_TAG_STATE.ordinal()][UniversalTag.OCTET_STRING
            .getValue()] =
            new GrammarTransition<KrbSafeBodyContainer>(
                KrbSafeBodyStatesEnum.KRB_SAFE_BODY_USER_DATA_TAG_STATE,
                KrbSafeBodyStatesEnum.KRB_SAFE_BODY_USER_DATA_STATE,
                UniversalTag.OCTET_STRING,
                new StoreUserData() );

        // --------------------------------------------------------------------------------------------
        // Transition from user-data value to timestamp tag
        // --------------------------------------------------------------------------------------------
        // KRB-SAFE-BODY   ::= SEQUENCE {
        // timestamp       [1]
        super.transitions[KrbSafeBodyStatesEnum.KRB_SAFE_BODY_USER_DATA_STATE.ordinal()][KerberosConstants.KRB_SAFE_BODY_TIMESTAMP_TAG] =
            new GrammarTransition<KrbSafeBodyContainer>(
                KrbSafeBodyStatesEnum.KRB_SAFE_BODY_USER_DATA_STATE,
                KrbSafeBodyStatesEnum.KRB_SAFE_BODY_TIMESTAMP_TAG_STATE,
                KerberosConstants.KRB_SAFE_BODY_TIMESTAMP_TAG,
                new CheckNotNullLength<KrbSafeBodyContainer>() );

        // --------------------------------------------------------------------------------------------
        // Transition from timestamp tag to timestamp value
        // --------------------------------------------------------------------------------------------
        // KRB-SAFE-BODY   ::= SEQUENCE {
        // timestamp       [1] KerberosTime OPTIONAL
        super.transitions[KrbSafeBodyStatesEnum.KRB_SAFE_BODY_TIMESTAMP_TAG_STATE.ordinal()][UniversalTag.GENERALIZED_TIME
            .getValue()] =
            new GrammarTransition<KrbSafeBodyContainer>(
                KrbSafeBodyStatesEnum.KRB_SAFE_BODY_TIMESTAMP_TAG_STATE,
                KrbSafeBodyStatesEnum.KRB_SAFE_BODY_TIMESTAMP_STATE,
                UniversalTag.GENERALIZED_TIME,
                new StoreTimestamp() );

        // --------------------------------------------------------------------------------------------
        // Transition from timestamp value to usec tag
        // --------------------------------------------------------------------------------------------
        // KRB-SAFE-BODY   ::= SEQUENCE {
        // usec            [2]
        super.transitions[KrbSafeBodyStatesEnum.KRB_SAFE_BODY_TIMESTAMP_STATE.ordinal()][KerberosConstants.KRB_SAFE_BODY_USEC_TAG] =
            new GrammarTransition<KrbSafeBodyContainer>(
                KrbSafeBodyStatesEnum.KRB_SAFE_BODY_TIMESTAMP_STATE,
                KrbSafeBodyStatesEnum.KRB_SAFE_BODY_USEC_TAG_STATE,
                KerberosConstants.KRB_SAFE_BODY_USEC_TAG,
                new CheckNotNullLength<KrbSafeBodyContainer>() );

        // --------------------------------------------------------------------------------------------
        // Transition from usec tag to usec value
        // --------------------------------------------------------------------------------------------
        // KRB-SAFE-BODY   ::= SEQUENCE {
        // usec            [2] Microseconds OPTIONAL
        super.transitions[KrbSafeBodyStatesEnum.KRB_SAFE_BODY_USEC_TAG_STATE.ordinal()][UniversalTag.INTEGER.getValue()] =
            new GrammarTransition<KrbSafeBodyContainer>(
                KrbSafeBodyStatesEnum.KRB_SAFE_BODY_USEC_TAG_STATE,
                KrbSafeBodyStatesEnum.KRB_SAFE_BODY_USEC_STATE,
                UniversalTag.INTEGER,
                new StoreUsec() );

        // --------------------------------------------------------------------------------------------
        // Transition from usec value to seq-number tag
        // --------------------------------------------------------------------------------------------
        // KRB-SAFE-BODY   ::= SEQUENCE {
        // seq-number      [3]
        super.transitions[KrbSafeBodyStatesEnum.KRB_SAFE_BODY_USEC_STATE.ordinal()][KerberosConstants.KRB_SAFE_BODY_SEQ_NUMBER_TAG] =
            new GrammarTransition<KrbSafeBodyContainer>(
                KrbSafeBodyStatesEnum.KRB_SAFE_BODY_USEC_STATE,
                KrbSafeBodyStatesEnum.KRB_SAFE_BODY_SEQ_NUMBER_TAG_STATE,
                KerberosConstants.KRB_SAFE_BODY_SEQ_NUMBER_TAG,
                new CheckNotNullLength<KrbSafeBodyContainer>() );

        // --------------------------------------------------------------------------------------------
        // Transition from seq-number tag to seq-number value
        // --------------------------------------------------------------------------------------------
        // KRB-SAFE-BODY   ::= SEQUENCE {
        // seq-number      [3] UInt32 OPTIONAL
        super.transitions[KrbSafeBodyStatesEnum.KRB_SAFE_BODY_SEQ_NUMBER_TAG_STATE.ordinal()][UniversalTag.INTEGER
            .getValue()] =
            new GrammarTransition<KrbSafeBodyContainer>(
                KrbSafeBodyStatesEnum.KRB_SAFE_BODY_SEQ_NUMBER_TAG_STATE,
                KrbSafeBodyStatesEnum.KRB_SAFE_BODY_SEQ_NUMBER_STATE,
                UniversalTag.INTEGER,
                new StoreSeqNumber() );

        // --------------------------------------------------------------------------------------------
        // Transition from seq-number to s-address tag
        // --------------------------------------------------------------------------------------------
        // KRB-SAFE-BODY   ::= SEQUENCE {
        // s-address       [4] HostAddress
        super.transitions[KrbSafeBodyStatesEnum.KRB_SAFE_BODY_SEQ_NUMBER_STATE.ordinal()][KerberosConstants.KRB_SAFE_BODY_SENDER_ADDRESS_TAG] =
            new GrammarTransition<KrbSafeBodyContainer>(
                KrbSafeBodyStatesEnum.KRB_SAFE_BODY_SEQ_NUMBER_STATE,
                KrbSafeBodyStatesEnum.KRB_SAFE_BODY_SENDER_ADDRESS_TAG_STATE,
                KerberosConstants.KRB_SAFE_BODY_SENDER_ADDRESS_TAG,
                new StoreSenderAddress() );

        // --------------------------------------------------------------------------------------------
        // Transition from s-address tag to r-address tag
        // --------------------------------------------------------------------------------------------
        // KRB-SAFE-BODY   ::= SEQUENCE {
        // r-address       [5] HostAddress
        super.transitions[KrbSafeBodyStatesEnum.KRB_SAFE_BODY_SENDER_ADDRESS_TAG_STATE.ordinal()][KerberosConstants.KRB_SAFE_BODY_RECIPIENT_ADDRESS_TAG] =
            new GrammarTransition<KrbSafeBodyContainer>(
                KrbSafeBodyStatesEnum.KRB_SAFE_BODY_SENDER_ADDRESS_TAG_STATE,
                KrbSafeBodyStatesEnum.KRB_SAFE_BODY_RECIPIENT_ADDRESS_TAG_STATE,
                KerberosConstants.KRB_SAFE_BODY_RECIPIENT_ADDRESS_TAG,
                new StoreRecipientAddress() );

        //----------------------------- OPTIONAL transitions ---------------------------

        // --------------------------------------------------------------------------------------------
        // Transition from user-data value to usec tag
        // --------------------------------------------------------------------------------------------
        // KRB-SAFE-BODY   ::= SEQUENCE {
        // usec       [2]
        super.transitions[KrbSafeBodyStatesEnum.KRB_SAFE_BODY_USER_DATA_STATE.ordinal()][KerberosConstants.KRB_SAFE_BODY_USEC_TAG] =
            new GrammarTransition<KrbSafeBodyContainer>(
                KrbSafeBodyStatesEnum.KRB_SAFE_BODY_USER_DATA_STATE,
                KrbSafeBodyStatesEnum.KRB_SAFE_BODY_USEC_TAG_STATE,
                KerberosConstants.KRB_SAFE_BODY_USEC_TAG,
                new CheckNotNullLength<KrbSafeBodyContainer>() );

        // --------------------------------------------------------------------------------------------
        // Transition from user-data value to seq-number tag
        // --------------------------------------------------------------------------------------------
        // KRB-SAFE-BODY   ::= SEQUENCE {
        // seq-number       [3]
        super.transitions[KrbSafeBodyStatesEnum.KRB_SAFE_BODY_USER_DATA_STATE.ordinal()][KerberosConstants.KRB_SAFE_BODY_SEQ_NUMBER_TAG] =
            new GrammarTransition<KrbSafeBodyContainer>(
                KrbSafeBodyStatesEnum.KRB_SAFE_BODY_USER_DATA_STATE,
                KrbSafeBodyStatesEnum.KRB_SAFE_BODY_SEQ_NUMBER_TAG_STATE,
                KerberosConstants.KRB_SAFE_BODY_SEQ_NUMBER_TAG,
                new CheckNotNullLength<KrbSafeBodyContainer>() );

        // --------------------------------------------------------------------------------------------
        // Transition from user-data value to s-address tag
        // --------------------------------------------------------------------------------------------
        // KRB-SAFE-BODY   ::= SEQUENCE {
        // s-address       [4]
        super.transitions[KrbSafeBodyStatesEnum.KRB_SAFE_BODY_USER_DATA_STATE.ordinal()][KerberosConstants.KRB_SAFE_BODY_SENDER_ADDRESS_TAG] =
            new GrammarTransition<KrbSafeBodyContainer>(
                KrbSafeBodyStatesEnum.KRB_SAFE_BODY_USER_DATA_STATE,
                KrbSafeBodyStatesEnum.KRB_SAFE_BODY_SENDER_ADDRESS_TAG_STATE,
                KerberosConstants.KRB_SAFE_BODY_SENDER_ADDRESS_TAG,
                new StoreSenderAddress() );

        // --------------------------------------------------------------------------------------------
        // Transition from usec value to s-address tag
        // --------------------------------------------------------------------------------------------
        // KRB-SAFE-BODY   ::= SEQUENCE {
        // s-address       [4]
        super.transitions[KrbSafeBodyStatesEnum.KRB_SAFE_BODY_USEC_STATE.ordinal()][KerberosConstants.KRB_SAFE_BODY_SENDER_ADDRESS_TAG] =
            new GrammarTransition<KrbSafeBodyContainer>(
                KrbSafeBodyStatesEnum.KRB_SAFE_BODY_USEC_STATE,
                KrbSafeBodyStatesEnum.KRB_SAFE_BODY_SENDER_ADDRESS_TAG_STATE,
                KerberosConstants.KRB_SAFE_BODY_SENDER_ADDRESS_TAG,
                new StoreSenderAddress() );
    }


    /**
     * Get the instance of this grammar
     *
     * @return An instance on the KRB-SAFE-BODY Grammar
     */
    public static Grammar<KrbSafeBodyContainer> getInstance()
    {
        return instance;
    }
}
