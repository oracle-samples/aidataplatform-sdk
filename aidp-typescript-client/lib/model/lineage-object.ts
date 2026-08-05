// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Object describing an individual element of object lineage.
*/
export interface LineageObject {
    /**
    * Key of the object, such as an entity, about which this lineage applies.
    */
    'id'?: string;
    /**
    * External source identifier name of the object.
    */
    'qualifiedName'?: string;
    /**
    * Display name of the object.
    */
    'displayName'?: string;
    /**
    * Key of the parent object for this object.
    */
    'parentId'?: string;
    /**
    * Type name of the object.
    */
    'type'?: string;
    /**
    * Direction of the lineage.
    */
    'direction'?: model.LineageDirection;
    /**
    * Depth is measured as number of links from anchor node to matching nodes.
*  Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues.
    */
    'depth'?: number;
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

export namespace LineageObject {









    export function getJsonObj(obj: LineageObject): object {
        const jsonObj = {...obj, ...{
            








        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: LineageObject): object {
        const jsonObj = {...obj, ...{
            








         }};

        
        
        return jsonObj;
    }
}
