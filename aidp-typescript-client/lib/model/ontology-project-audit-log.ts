// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Audit log record for an ontology project.
*/
export interface OntologyProjectAuditLog {
    /**
    * Audited action, for example CREATE, UPDATE, or DELETE.
    */
    'action': string;
    /**
    * Identity of the actor that performed the action. An OCI user OCID for recent rows; older rows may carry a serialized principal instead.
    */
    'actorId'?: string;
    /**
    * Human-readable description of the audited change.
    */
    'details'?: string;
    /**
    * Request id of the call that produced this record.
    */
    'opcRequestId'?: string;
    'timeCreated': Date;

}

export namespace OntologyProjectAuditLog {






    export function getJsonObj(obj: OntologyProjectAuditLog): object {
        const jsonObj = {...obj, ...{
            





        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: OntologyProjectAuditLog): object {
        const jsonObj = {...obj, ...{
            





         }};

        
        
        return jsonObj;
    }
}
