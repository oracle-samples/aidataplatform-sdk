// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Table and column metadata exposed by an Oracle Analytics object.
*/
export interface OacObjectTable {
    /**
    * The Oracle Analytics table identifier.
    */
    'id': string;
    /**
    * The Oracle Analytics table display name.
    */
    'name': string;
    /**
    * The Oracle Analytics table description.
    */
    'description'?: string;
    /**
    * The Oracle Analytics columns in the table.
    */
    'columns'?: Array<model.OacObjectColumn>;
    /**
    * Child tables nested under this Oracle Analytics table.
    */
    'childTables'?: Array<model.OacObjectTable>;
    /**
    * Additional tables nested under this Oracle Analytics table.
    */
    'tables'?: Array<model.OacObjectTable>;

}

export namespace OacObjectTable {







    export function getJsonObj(obj: OacObjectTable): object {
        const jsonObj = {...obj, ...{
            



                'columns': obj.columns ?
                
                obj.columns.map((item)=>{return model.OacObjectColumn.getJsonObj(item)})
                
                 : undefined,
                'childTables': obj.childTables ?
                
                obj.childTables.map((item)=>{return model.OacObjectTable.getJsonObj(item)})
                
                 : undefined,
                'tables': obj.tables ?
                
                obj.tables.map((item)=>{return model.OacObjectTable.getJsonObj(item)})
                
                 : undefined,
        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: OacObjectTable): object {
        const jsonObj = {...obj, ...{
            



                    'columns': obj.columns ?
                
                obj.columns.map((item)=>{return model.OacObjectColumn.getDeserializedJsonObj(item)})
                
                 : undefined,
                    'childTables': obj.childTables ?
                
                obj.childTables.map((item)=>{return model.OacObjectTable.getDeserializedJsonObj(item)})
                
                 : undefined,
                    'tables': obj.tables ?
                
                obj.tables.map((item)=>{return model.OacObjectTable.getDeserializedJsonObj(item)})
                
                 : undefined,
         }};

        
        
        return jsonObj;
    }
}
