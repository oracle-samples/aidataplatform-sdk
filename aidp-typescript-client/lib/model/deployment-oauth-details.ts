// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* OAuth trust configuration for a model deployment's query endpoint. Required when authType is OAUTH and must be omitted for AIDP. A closed schema: the gateway turns these values into the token policy it enforces, so a member outside this set is not accepted -- it is discarded rather than stored or forwarded, and a misspelled member therefore leaves the one it was meant to be unset, which fails validation. The serialized object must not exceed 16000 characters. Cannot be changed while the deployment is ACTIVE.
*/
export interface DeploymentOAuthDetails {
    /**
    * OAuth issuer claim (iss) the query endpoint requires. An https URI whose host is a fully qualified domain name, not an IP literal in any notation, and which carries no userinfo and no fragment.
    */
    'issuerClaim': string;
    /**
    * OAuth audience claims (aud) the query endpoint accepts. Entries must be unique.
    */
    'audienceClaim': Array<string>;
    /**
    * URI the gateway retrieves the signing keys (JWKS) from. An https URI whose host is a fully qualified domain name, not an IP literal in any notation, and which carries no userinfo and no fragment. A query string and a non-default port are permitted: published provider JWKS endpoints use both.
    */
    'jwksUri': string;

}

export namespace DeploymentOAuthDetails {




    export function getJsonObj(obj: DeploymentOAuthDetails): object {
        const jsonObj = {...obj, ...{
            



        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: DeploymentOAuthDetails): object {
        const jsonObj = {...obj, ...{
            



         }};

        
        
        return jsonObj;
    }
}
