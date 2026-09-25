// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Lazy-loaded ontology tree node.
*/
export interface OntologyGraphTreeSearchNode {
    /**
    * Stable unique identifier used as parentUid on expansion requests.
    */
    'uid': string;
    /**
    * Parent node UID, or null for root ontology nodes.
    */
    'parentUid'?: string;
    /**
    * Node type. Supported values include ontology, class, subclass, relationship, property, constraint, and annotation.
    */
    'type': string;
    'name': string;
    'displayName': string;
    'hasChildren': boolean;
    /**
    * Root-to-item context path for this tree node.
    */
    'contextPath': Array<model.OntologyGraphTreeContextPathItem>;

}

export namespace OntologyGraphTreeSearchNode {








    export function getJsonObj(obj: OntologyGraphTreeSearchNode): object {
        const jsonObj = {...obj, ...{
            






                'contextPath': obj.contextPath ?
                
                obj.contextPath.map((item)=>{return model.OntologyGraphTreeContextPathItem.getJsonObj(item)})
                
                 : undefined,
        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: OntologyGraphTreeSearchNode): object {
        const jsonObj = {...obj, ...{
            






                    'contextPath': obj.contextPath ?
                
                obj.contextPath.map((item)=>{return model.OntologyGraphTreeContextPathItem.getDeserializedJsonObj(item)})
                
                 : undefined,
         }};

        
        
        return jsonObj;
    }
}
