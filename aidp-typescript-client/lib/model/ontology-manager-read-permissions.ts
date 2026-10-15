// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Normalized permission map returned by Ontology Manager permission GET operations.
*/
export interface OntologyManagerReadPermissions {
    /**
    * Normalized principals with direct read access.
    */
    'r'?: Array<model.OntologyManagerPermissionGrant>;
    /**
    * Normalized principals with direct use or execute access.
    */
    'u'?: Array<model.OntologyManagerPermissionGrant>;
    /**
    * Normalized principals with direct manage access.
    */
    'm'?: Array<model.OntologyManagerPermissionGrant>;
    /**
    * Normalized principals with direct admin access.
    */
    'a'?: Array<model.OntologyManagerPermissionGrant>;

}

export namespace OntologyManagerReadPermissions {





    export function getJsonObj(obj: OntologyManagerReadPermissions): object {
        const jsonObj = {...obj, ...{
            
                'r': obj.r ?
                
                obj.r.map((item)=>{return model.OntologyManagerPermissionGrant.getJsonObj(item)})
                
                 : undefined,
                'u': obj.u ?
                
                obj.u.map((item)=>{return model.OntologyManagerPermissionGrant.getJsonObj(item)})
                
                 : undefined,
                'm': obj.m ?
                
                obj.m.map((item)=>{return model.OntologyManagerPermissionGrant.getJsonObj(item)})
                
                 : undefined,
                'a': obj.a ?
                
                obj.a.map((item)=>{return model.OntologyManagerPermissionGrant.getJsonObj(item)})
                
                 : undefined,
        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: OntologyManagerReadPermissions): object {
        const jsonObj = {...obj, ...{
            
                    'r': obj.r ?
                
                obj.r.map((item)=>{return model.OntologyManagerPermissionGrant.getDeserializedJsonObj(item)})
                
                 : undefined,
                    'u': obj.u ?
                
                obj.u.map((item)=>{return model.OntologyManagerPermissionGrant.getDeserializedJsonObj(item)})
                
                 : undefined,
                    'm': obj.m ?
                
                obj.m.map((item)=>{return model.OntologyManagerPermissionGrant.getDeserializedJsonObj(item)})
                
                 : undefined,
                    'a': obj.a ?
                
                obj.a.map((item)=>{return model.OntologyManagerPermissionGrant.getDeserializedJsonObj(item)})
                
                 : undefined,
         }};

        
        
        return jsonObj;
    }
}
