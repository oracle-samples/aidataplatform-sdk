// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Declares how two elements of object lineage are related.
*/
export interface LineageRelationship {
    /**
    * Object key of source lineage element.
    */
    'fromNodeId'?: string;
    /**
    * Object key of target lineage element.
    */
    'toNodeId'?: string;
    /**
    * Type of the relationship.
    */
    'type'?: string;
    /**
    * Type of the relationship.
    */
    'providerType'?: string;
    /**
    * A map of maps that contains the properties which are specific to the entity type. Each entity type
* definition defines it's set of required and optional properties. The map keys are category names and the
* values are maps of property name to property value. Every property is contained inside of a category. Most
* data entities have required properties within the \"default\" category.
* Example: {@code {\"properties\": { \"default\": { \"key1\": \"value1\"}}}}
* 
    */
    'properties'?: { [key: string]: { [key: string]: string; }; };

}

export namespace LineageRelationship {






    export function getJsonObj(obj: LineageRelationship): object {
        const jsonObj = {...obj, ...{
            





        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: LineageRelationship): object {
        const jsonObj = {...obj, ...{
            





         }};

        
        
        return jsonObj;
    }
}
