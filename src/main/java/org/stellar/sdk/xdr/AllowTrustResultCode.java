// Automatically generated by xdrgen
// DO NOT EDIT or your changes may be overwritten

package org.stellar.sdk.xdr;


import java.io.IOException;


// === xdr source ============================================================

//  enum AllowTrustResultCode
//  {
//      // codes considered as "success" for the operation
//      ALLOW_TRUST_SUCCESS = 0,
//      // codes considered as "failure" for the operation
//      ALLOW_TRUST_MALFORMED = -1,     // asset is not ASSET_TYPE_ALPHANUM
//      ALLOW_TRUST_NO_TRUST_LINE = -2, // trustor does not have a trustline
//                                      // source account does not require trust
//      ALLOW_TRUST_TRUST_NOT_REQUIRED = -3,
//      ALLOW_TRUST_CANT_REVOKE = -4,     // source account can't revoke trust,
//      ALLOW_TRUST_SELF_NOT_ALLOWED = -5, // trusting self is not allowed
//      ALLOW_TRUST_LOW_RESERVE = -6 // claimable balances can't be created
//                                   // on revoke due to low reserves 
//  };

//  ===========================================================================
public enum AllowTrustResultCode implements XdrElement {
  ALLOW_TRUST_SUCCESS(0),
  ALLOW_TRUST_MALFORMED(-1),
  ALLOW_TRUST_NO_TRUST_LINE(-2),
  ALLOW_TRUST_TRUST_NOT_REQUIRED(-3),
  ALLOW_TRUST_CANT_REVOKE(-4),
  ALLOW_TRUST_SELF_NOT_ALLOWED(-5),
  ALLOW_TRUST_LOW_RESERVE(-6),
  ;
  private int mValue;

  AllowTrustResultCode(int value) {
      mValue = value;
  }

  public int getValue() {
      return mValue;
  }

  public static AllowTrustResultCode decode(XdrDataInputStream stream) throws IOException {
    int value = stream.readInt();
    switch (value) {
      case 0: return ALLOW_TRUST_SUCCESS;
      case -1: return ALLOW_TRUST_MALFORMED;
      case -2: return ALLOW_TRUST_NO_TRUST_LINE;
      case -3: return ALLOW_TRUST_TRUST_NOT_REQUIRED;
      case -4: return ALLOW_TRUST_CANT_REVOKE;
      case -5: return ALLOW_TRUST_SELF_NOT_ALLOWED;
      case -6: return ALLOW_TRUST_LOW_RESERVE;
      default:
        throw new RuntimeException("Unknown enum value: " + value);
    }
  }

  public static void encode(XdrDataOutputStream stream, AllowTrustResultCode value) throws IOException {
    stream.writeInt(value.getValue());
  }

  public void encode(XdrDataOutputStream stream) throws IOException {
    encode(stream, this);
  }
}
