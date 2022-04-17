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
package org.apache.directory.shared.kerberos.exceptions;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;


/**
 * A type-safe enumeration of Kerberos error types.
 *
 * @author <a href="mailto:dev@directory.apache.org">Apache Directory Project</a>
 */
public final class ErrorType implements Comparable<ErrorType>
{

    // TODO Add i18n. Don't no if these error messages are also a response to the client.
    // If so shall they really be i18n?

    /**
     * No error.
     */
    public static final ErrorType KDC_ERR_NONE = new ErrorType( 0, "No error" );

    /**
     * Client's entry in database has expired.
     */
    public static final ErrorType KDC_ERR_NAME_EXP = new ErrorType( 1, "Client's entry in database has expired" );

    /**
     * Server's entry in database has expired.
     */
    public static final ErrorType KDC_ERR_SERVICE_EXP = new ErrorType( 2, "Server's entry in database has expired" );

    /**
     * Requested protocol version number not supported.
     */
    public static final ErrorType KDC_ERR_BAD_PVNO = new ErrorType( 3,
        "Requested protocol version number not supported" );

    /**
     * Client's key encrypted in old master key.
     */
    public static final ErrorType KDC_ERR_C_OLD_MAST_KVNO = new ErrorType( 4,
        "Client's key encrypted in old master key" );

    /**
     * Server's key encrypted in old master key.
     */
    public static final ErrorType KDC_ERR_S_OLD_MAST_KVNO = new ErrorType( 5,
        "Server's key encrypted in old master key" );

    /**
     * Client not found in Kerberos database.
     */
    public static final ErrorType KDC_ERR_C_PRINCIPAL_UNKNOWN = new ErrorType( 6,
        "Client not found in Kerberos database" );

    /**
     * Server not found in Kerberos database.
     */
    public static final ErrorType KDC_ERR_S_PRINCIPAL_UNKNOWN = new ErrorType( 7,
        "Server not found in Kerberos database" );

    /**
     * Multiple principal entries in database.
     */
    public static final ErrorType KDC_ERR_PRINCIPAL_NOT_UNIQUE = new ErrorType( 8,
        "Multiple principal entries in database" );

    /**
     * The client or server has a null key.
     */
    public static final ErrorType KDC_ERR_NULL_KEY = new ErrorType( 9, "The client or server has a null key" );

    /**
     * Ticket not eligible for postdating.
     */
    public static final ErrorType KDC_ERR_CANNOT_POSTDATE = new ErrorType( 10, "Ticket not eligible for postdating" );

    /**
     * Requested start time is later than end time.
     */
    public static final ErrorType KDC_ERR_NEVER_VALID = new ErrorType( 11,
        "Requested start time is later than end time" );

    /**
     * KDC policy rejects request.
     */
    public static final ErrorType KDC_ERR_POLICY = new ErrorType( 12, "KDC policy rejects request" );

    /**
     * KDC cannot accommodate requested option.
     */
    public static final ErrorType KDC_ERR_BADOPTION = new ErrorType( 13, "KDC cannot accommodate requested option" );

    /**
     * KDC has no support for encryption type.
     */
    public static final ErrorType KDC_ERR_ETYPE_NOSUPP = new ErrorType( 14, "KDC has no support for encryption type" );

    /**
     * KDC has no support for checksum type.
     */
    public static final ErrorType KDC_ERR_SUMTYPE_NOSUPP = new ErrorType( 15, "KDC has no support for checksum type" );

    /**
     * KDC has no support for padata type.
     */
    public static final ErrorType KDC_ERR_PADATA_TYPE_NOSUPP = new ErrorType( 16, "KDC has no support for padata type" );

    /**
     * KDC has no support for transited type.
     */
    public static final ErrorType KDC_ERR_TRTYPE_NOSUPP = new ErrorType( 17, "KDC has no support for transited type" );

    /**
     * Clients credentials have been revoked.
     */
    public static final ErrorType KDC_ERR_CLIENT_REVOKED = new ErrorType( 18, "Clients credentials have been revoked" );

    /**
     * Credentials for server have been revoked.
     */
    public static final ErrorType KDC_ERR_SERVICE_REVOKED = new ErrorType( 19,
        "Credentials for server have been revoked" );

    /**
     * TGT has been revoked.
     */
    public static final ErrorType KDC_ERR_TGT_REVOKED = new ErrorType( 20, "TGT has been revoked" );

    /**
     * Client not yet valid; try again later.
     */
    public static final ErrorType KDC_ERR_CLIENT_NOTYET = new ErrorType( 21, "Client not yet valid; try again later" );

    /**
     * Server not yet valid; try again later.
     */
    public static final ErrorType KDC_ERR_SERVICE_NOTYET = new ErrorType( 22, "Server not yet valid; try again later" );

    /**
     * Password has expired; change password to reset.
     */
    public static final ErrorType KDC_ERR_KEY_EXPIRED = new ErrorType( 23,
        "Password has expired; change password to reset" );

    /**
     * Pre-authentication information was invalid.
     */
    public static final ErrorType KDC_ERR_PREAUTH_FAILED = new ErrorType( 24,
        "Pre-authentication information was invalid" );

    /**
     * Additional pre-authentication required.
     */
    public static final ErrorType KDC_ERR_PREAUTH_REQUIRED = new ErrorType( 25,
        "Additional pre-authentication required" );

    /**
     * Requested server and ticket don't match.
     */
    public static final ErrorType KDC_ERR_SERVER_NOMATCH = new ErrorType( 26, "Requested server and ticket don't match" );

    /**
     * Server valid for user2user only.
     */
    public static final ErrorType KDC_ERR_MUST_USE_USER2USER = new ErrorType( 27, "Server valid for user2user only" );

    /**
     * KDC Policy rejects transited path.
     */
    public static final ErrorType KDC_ERR_PATH_NOT_ACCEPTED = new ErrorType( 28, "KDC Policy rejects transited path" );

    /**
     * A service is not available.
     */
    public static final ErrorType KDC_ERR_SVC_UNAVAILABLE = new ErrorType( 29, "A service is not available" );

    /**
     * Integrity check on decrypted field failed.
     */
    public static final ErrorType KRB_AP_ERR_BAD_INTEGRITY = new ErrorType( 31,
        "Integrity check on decrypted field failed" );

    /**
     * Ticket expired.
     */
    public static final ErrorType KRB_AP_ERR_TKT_EXPIRED = new ErrorType( 32, "Ticket expired" );

    /**
     * Ticket not yet valid.
     */
    public static final ErrorType KRB_AP_ERR_TKT_NYV = new ErrorType( 33, "Ticket not yet valid" );

    /**
     * Request is a replay.
     */
    public static final ErrorType KRB_AP_ERR_REPEAT = new ErrorType( 34, "Request is a replay" );

    /**
     * The ticket isn't for us.
     */
    public static final ErrorType KRB_AP_ERR_NOT_US = new ErrorType( 35, "The ticket isn't for us" );

    /**
     * Ticket and authenticator don't match.
     */
    public static final ErrorType KRB_AP_ERR_BADMATCH = new ErrorType( 36, "Ticket and authenticator don't match" );

    /**
     * Clock skew too great.
     */
    public static final ErrorType KRB_AP_ERR_SKEW = new ErrorType( 37, "Clock skew too great" );

    /**
     * Incorrect net address.
     */
    public static final ErrorType KRB_AP_ERR_BADADDR = new ErrorType( 38, "Incorrect net address" );

    /**
     * Protocol version mismatch.
     */
    public static final ErrorType KRB_AP_ERR_BADVERSION = new ErrorType( 39, "Protocol version mismatch" );

    /**
     * Invalid msg type.
     */
    public static final ErrorType KRB_AP_ERR_MSG_TYPE = new ErrorType( 40, "Invalid msg type" );

    /**
     * Message stream modified.
     */
    public static final ErrorType KRB_AP_ERR_MODIFIED = new ErrorType( 41, "Message stream modified" );

    /**
     * Message out of order.
     */
    public static final ErrorType KRB_AP_ERR_BADORDER = new ErrorType( 42, "Message out of order" );

    /**
     * Specified version of key is not available.
     */
    public static final ErrorType KRB_AP_ERR_BADKEYVER = new ErrorType( 44, "Specified version of key is not available" );

    /**
     * Service key not available.
     */
    public static final ErrorType KRB_AP_ERR_NOKEY = new ErrorType( 45, "Service key not available" );

    /**
     * Mutual authentication failed.
     */
    public static final ErrorType KRB_AP_ERR_MUT_FAIL = new ErrorType( 46, "Mutual authentication failed" );

    /**
     * Incorrect message direction.
     */
    public static final ErrorType KRB_AP_ERR_BADDIRECTION = new ErrorType( 47, "Incorrect message direction" );

    /**
     * Alternative authentication method required.
     */
    public static final ErrorType KRB_AP_ERR_METHOD = new ErrorType( 48, "Alternative authentication method required" );

    /**
     * Incorrect sequence number in message.
     */
    public static final ErrorType KRB_AP_ERR_BADSEQ = new ErrorType( 49, "Incorrect sequence number in message" );

    /**
     * Inappropriate type of checksum in message.
     */
    public static final ErrorType KRB_AP_ERR_INAPP_CKSUM = new ErrorType( 50,
        "Inappropriate type of checksum in message" );

    /**
     * Policy rejects transited path.
     */
    public static final ErrorType KRB_AP_PATH_NOT_ACCEPTED = new ErrorType( 51, "Policy rejects transited path" );

    /**
     * Response too big for UDP; retry with TCP.
     */
    public static final ErrorType KRB_ERR_RESPONSE_TOO_BIG = new ErrorType( 52,
        "Response too big for UDP; retry with TCP" );

    /**
     * Generic error (description in e-text).
     */
    public static final ErrorType KRB_ERR_GENERIC = new ErrorType( 60, "Generic error (description in e-text)" );

    /**
     * Field is too long for this implementation.
     */
    public static final ErrorType KRB_ERR_FIELD_TOOLONG = new ErrorType( 61,
        "Field is too long for this implementation" );

    /**
     * Client is not trusted.
     */
    public static final ErrorType KDC_ERR_CLIENT_NOT_TRUSTED = new ErrorType( 62, "Client is not trusted" );

    /**
     * KDC is not trusted.
     */
    public static final ErrorType KRB_ERR_KDC_NOT_TRUSTED = new ErrorType( 63, "KDC is not trusted" );

    /**
     * Signature is invalid.
     */
    public static final ErrorType KDC_ERR_INVALID_SIG = new ErrorType( 64, "Signature is invalid" );

    /**
     * Diffie-Hellman (DH) key parameters not accepted.
     */
    public static final ErrorType KDC_ERR_DH_KEY_PARAMETERS_NOT_ACCEPTED = new ErrorType( 65,
        "Diffie-Hellman (DH) key parameters not accepted." );

    /**
     * Certificates do not match.
     */
    public static final ErrorType KRB_ERR_CERTIFICATE_MISMATCH = new ErrorType( 66, "Certificates do not match" );

    /**
     * No TGT available to validate USER-TO-USER.
     */
    public static final ErrorType KRB_AP_ERR_NO_TGT = new ErrorType( 67, "No TGT available to validate USER-TO-USER" );

    /**
     * Wrong realm.
     */
    public static final ErrorType KRB_ERR_WRONG_REALM = new ErrorType( 68, "Wrong realm" );

    /**
     * Ticket must be for USER-TO-USER.
     */
    public static final ErrorType KRB_AP_ERR_USER_TO_USER_REQUIRED = new ErrorType( 69,
        "Ticket must be for USER-TO-USER" );

    /**
     * Can't verify certificate.
     */
    public static final ErrorType KDC_ERR_CANT_VERIFY_CERTIFICATE = new ErrorType( 70, "Can't verify certificate" );

    /**
     * Invalid certificate.
     */
    public static final ErrorType KDC_ERR_INVALID_CERTIFICATE = new ErrorType( 71, "Invalid certificate" );

    /**
     * Revoked certificate.
     */
    public static final ErrorType KDC_ERR_REVOKED_CERTIFICATE = new ErrorType( 72, "Revoked certificate" );

    /**
     * Revocation status unknown.
     */
    public static final ErrorType KDC_ERR_REVOCATION_STATUS_UNKNOWN = new ErrorType( 73, "Revocation status unknown" );

    /**
     * Revocation status unavailable.
     */
    public static final ErrorType KRB_ERR_REVOCATION_STATUS_UNAVAILABLE = new ErrorType( 74,
        "Revocation status unavailable" );

    /**
     * Client names do not match.
     */
    public static final ErrorType KDC_ERR_CLIENT_NAME_MISMATCH = new ErrorType( 75, "Client names do not match" );

    /**
     * KDC names do not match.
     */
    public static final ErrorType KRB_ERR_KDC_NAME_MISMATCH = new ErrorType( 76, "KDC names do not match" );

    /**
     * Inconsistent key purpose.
     */
    public static final ErrorType KDC_ERR_INCONSISTENT_KEY_PURPOSE = new ErrorType( 77, "Inconsistent key purpose" );

    /**
     * Digest in certificate not accepted.
     */
    public static final ErrorType KDC_ERR_DIGEST_IN_CERT_NOT_ACCEPTED = new ErrorType( 78,
        "Digest in certificate not accepted" );

    /**
     * PA checksum must be included.
     */
    public static final ErrorType KDC_ERR_PA_CHECKSUM_MUST_BE_INCLUDED = new ErrorType( 79,
        "PA checksum must be included" );

    /**
     * Digest in signed data not accepted.
     */
    public static final ErrorType KDC_ERR_DIGEST_IN_SIGNED_DATA_NOT_ACCEPTED = new ErrorType( 80,
        "Digest in signed data not accepted" );

    /**
     * Public key encryption not supported.
     */
    public static final ErrorType KDC_ERR_PUBLIC_KEY_ENCRYPTION_NOT_SUPPORTED = new ErrorType( 81,
        "Public key encryption not supported" );

    /**
     * Array for building a List of VALUES.
     */
    private static final ErrorType[] values =
        { KDC_ERR_NONE, KDC_ERR_NAME_EXP, KDC_ERR_SERVICE_EXP, KDC_ERR_BAD_PVNO, KDC_ERR_C_OLD_MAST_KVNO,
            KDC_ERR_S_OLD_MAST_KVNO, KDC_ERR_C_PRINCIPAL_UNKNOWN, KDC_ERR_S_PRINCIPAL_UNKNOWN,
            KDC_ERR_PRINCIPAL_NOT_UNIQUE, KDC_ERR_NULL_KEY, KDC_ERR_CANNOT_POSTDATE, KDC_ERR_NEVER_VALID,
            KDC_ERR_POLICY, KDC_ERR_BADOPTION, KDC_ERR_ETYPE_NOSUPP, KDC_ERR_SUMTYPE_NOSUPP,
            KDC_ERR_PADATA_TYPE_NOSUPP, KDC_ERR_TRTYPE_NOSUPP, KDC_ERR_CLIENT_REVOKED, KDC_ERR_SERVICE_REVOKED,
            KDC_ERR_TGT_REVOKED, KDC_ERR_CLIENT_NOTYET, KDC_ERR_SERVICE_NOTYET, KDC_ERR_KEY_EXPIRED,
            KDC_ERR_PREAUTH_FAILED, KDC_ERR_PREAUTH_REQUIRED, KDC_ERR_SERVER_NOMATCH, KDC_ERR_MUST_USE_USER2USER,
            KDC_ERR_PATH_NOT_ACCEPTED, KDC_ERR_SVC_UNAVAILABLE, KRB_AP_ERR_BAD_INTEGRITY, KRB_AP_ERR_TKT_EXPIRED,
            KRB_AP_ERR_TKT_NYV, KRB_AP_ERR_REPEAT, KRB_AP_ERR_NOT_US, KRB_AP_ERR_BADMATCH, KRB_AP_ERR_SKEW,
            KRB_AP_ERR_BADADDR, KRB_AP_ERR_BADVERSION, KRB_AP_ERR_MSG_TYPE, KRB_AP_ERR_MODIFIED, KRB_AP_ERR_BADORDER,
            KRB_AP_ERR_BADKEYVER, KRB_AP_ERR_NOKEY, KRB_AP_ERR_MUT_FAIL, KRB_AP_ERR_BADDIRECTION, KRB_AP_ERR_METHOD,
            KRB_AP_ERR_BADSEQ, KRB_AP_ERR_INAPP_CKSUM, KRB_AP_PATH_NOT_ACCEPTED, KRB_ERR_RESPONSE_TOO_BIG,
            KRB_ERR_GENERIC, KRB_ERR_FIELD_TOOLONG, KDC_ERR_CLIENT_NOT_TRUSTED, KRB_ERR_KDC_NOT_TRUSTED,
            KDC_ERR_INVALID_SIG, KDC_ERR_DH_KEY_PARAMETERS_NOT_ACCEPTED, KRB_ERR_CERTIFICATE_MISMATCH,
            KRB_AP_ERR_NO_TGT, KRB_ERR_WRONG_REALM, KRB_AP_ERR_USER_TO_USER_REQUIRED, KDC_ERR_CANT_VERIFY_CERTIFICATE,
            KDC_ERR_INVALID_CERTIFICATE, KDC_ERR_REVOKED_CERTIFICATE, KDC_ERR_REVOCATION_STATUS_UNKNOWN,
            KRB_ERR_REVOCATION_STATUS_UNAVAILABLE, KDC_ERR_CLIENT_NAME_MISMATCH, KRB_ERR_KDC_NAME_MISMATCH,
            KDC_ERR_INCONSISTENT_KEY_PURPOSE, KDC_ERR_DIGEST_IN_CERT_NOT_ACCEPTED,
            KDC_ERR_PA_CHECKSUM_MUST_BE_INCLUDED, KDC_ERR_DIGEST_IN_SIGNED_DATA_NOT_ACCEPTED,
            KDC_ERR_PUBLIC_KEY_ENCRYPTION_NOT_SUPPORTED };

    /**
     * A List of all the error type constants.
     */
    public static final List<ErrorType> VALUES = Collections.unmodifiableList( Arrays.asList( values ) );

    /**
     * The name of the error type.
     */
    private final String name;

    /**
     * The value/code for the error type.
     */
    private final int value;


    /**
     * Private constructor prevents construction outside of this class.
     */
    private ErrorType( int value, String name )
    {
        this.value = value;
        this.name = name;
    }


    /**
     * Returns the message for this Kerberos error.
     *
     * @return the message for this Kerberos error.
     */
    public String getMessage()
    {
        return name;
    }


    /**
     * Returns the message for this Kerberos error.
     *
     * @return the message for this Kerberos error.
     */
    public String toString()
    {
        return name;
    }


    /**
     * Compares this type to another object hopefully one that is of the same
     * type.
     *
     * @param that the object to compare this KerberosError to
     * @return value - ( ( KerberosError ) that ).ordinal;
     */
    public int compareTo( ErrorType that )
    {
        return value - that.value;
    }


    /**
     * Gets the value by its value value.
     *
     * @param value the value value of the value
     * @return the type corresponding to the value value
     */
    public static ErrorType getTypeByValue( int ordinal )
    {
        for ( int ii = 0; ii < values.length; ii++ )
        {
            if ( values[ii].value == ordinal )
            {
                return values[ii];
            }
        }

        return KRB_ERR_GENERIC;
    }


    /**
     * Gets the value value associated with this Kerberos error.
     *
     * @return the value value associated with this Kerberos error
     */
    public int getValue()
    {
        return value;
    }
}
