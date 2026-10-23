// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* DFL connections registered in the workspace.
*/
export interface OntologyDflConnectionCollection {
    /**
    * DFL connection registry entries visible in the workspace partition.
    */
    'items': Array<model.OntologyDflConnection>;

}

export namespace OntologyDflConnectionCollection {


    export function getJsonObj(obj: OntologyDflConnectionCollection): object {
        const jsonObj = {...obj, ...{
            
                'items': obj.items ?
                
                obj.items.map((item)=>{return model.OntologyDflConnection.getJsonObj(item)})
                
                 : undefined,
        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: OntologyDflConnectionCollection): object {
        const jsonObj = {...obj, ...{
            
                    'items': obj.items ?
                
                obj.items.map((item)=>{return model.OntologyDflConnection.getDeserializedJsonObj(item)})
                
                 : undefined,
         }};

        
        
        return jsonObj;
    }
}
