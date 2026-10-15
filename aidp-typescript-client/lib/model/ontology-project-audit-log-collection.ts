// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


export interface OntologyProjectAuditLogCollection {
    'items': Array<model.OntologyProjectAuditLog>;
    'nextPage'?: string;

}

export namespace OntologyProjectAuditLogCollection {



    export function getJsonObj(obj: OntologyProjectAuditLogCollection): object {
        const jsonObj = {...obj, ...{
            
                'items': obj.items ?
                
                obj.items.map((item)=>{return model.OntologyProjectAuditLog.getJsonObj(item)})
                
                 : undefined,

        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: OntologyProjectAuditLogCollection): object {
        const jsonObj = {...obj, ...{
            
                    'items': obj.items ?
                
                obj.items.map((item)=>{return model.OntologyProjectAuditLog.getDeserializedJsonObj(item)})
                
                 : undefined,

         }};

        
        
        return jsonObj;
    }
}
