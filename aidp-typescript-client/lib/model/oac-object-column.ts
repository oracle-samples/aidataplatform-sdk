// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Column metadata for a table exposed by an Oracle Analytics object.
*/
export interface OacObjectColumn {
    /**
    * The Oracle Analytics column name.
    */
    'name'?: string;
    /**
    * The Oracle Analytics column description.
    */
    'description'?: string;
    /**
    * The Oracle Analytics expression backing the column.
    */
    'formula'?: string;
    /**
    * Indicates whether this Oracle Analytics column represents time.
    */
    'isTime'?: boolean;
    /**
    * The Oracle Analytics column type.
    */
    'type'?: string;
    /**
    * The hierarchy identifier reported for an Oracle Analytics hierarchical column.
    */
    'hierarchyID'?: string;
    /**
    * The hierarchy display name reported for a hierarchical column in an OAC data object.
    */
    'hierarchyDisplayName'?: string;
    /**
    * The dimension identifier reported for an Oracle Analytics hierarchical column.
    */
    'dimensionID'?: string;
    /**
    * The table name reported for a hierarchical column in an OAC data object.
    */
    'tableName'?: string;
    /**
    * The hierarchy levels reported for an Oracle Analytics hierarchical column.
    */
    'levels'?: Array<model.OacObjectHierarchyLevel>;
    'sqlInfo'?: model.OacObjectColumnSqlInfo;

}

export namespace OacObjectColumn {












    export function getJsonObj(obj: OacObjectColumn): object {
        const jsonObj = {...obj, ...{
            









                'levels': obj.levels ?
                
                obj.levels.map((item)=>{return model.OacObjectHierarchyLevel.getJsonObj(item)})
                
                 : undefined,
                'sqlInfo': obj.sqlInfo ?
                
                
                model.OacObjectColumnSqlInfo.getJsonObj(obj.sqlInfo) : undefined,
        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: OacObjectColumn): object {
        const jsonObj = {...obj, ...{
            









                    'levels': obj.levels ?
                
                obj.levels.map((item)=>{return model.OacObjectHierarchyLevel.getDeserializedJsonObj(item)})
                
                 : undefined,
                    'sqlInfo': obj.sqlInfo ?
                
                
                model.OacObjectColumnSqlInfo.getDeserializedJsonObj(obj.sqlInfo) : undefined,
         }};

        
        
        return jsonObj;
    }
}
