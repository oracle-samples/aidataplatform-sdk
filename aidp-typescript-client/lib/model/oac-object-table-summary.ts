// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Summary information about a table exposed by an Oracle Analytics object.
*/
export interface OacObjectTableSummary {
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
    * Child tables nested under this Oracle Analytics table.
    */
    'childTables'?: Array<model.OacObjectTableSummary>;
    /**
    * Additional tables nested under this Oracle Analytics table.
    */
    'tables'?: Array<model.OacObjectTableSummary>;

}

export namespace OacObjectTableSummary {






    export function getJsonObj(obj: OacObjectTableSummary): object {
        const jsonObj = {...obj, ...{
            



                'childTables': obj.childTables ?
                
                obj.childTables.map((item)=>{return model.OacObjectTableSummary.getJsonObj(item)})
                
                 : undefined,
                'tables': obj.tables ?
                
                obj.tables.map((item)=>{return model.OacObjectTableSummary.getJsonObj(item)})
                
                 : undefined,
        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: OacObjectTableSummary): object {
        const jsonObj = {...obj, ...{
            



                    'childTables': obj.childTables ?
                
                obj.childTables.map((item)=>{return model.OacObjectTableSummary.getDeserializedJsonObj(item)})
                
                 : undefined,
                    'tables': obj.tables ?
                
                obj.tables.map((item)=>{return model.OacObjectTableSummary.getDeserializedJsonObj(item)})
                
                 : undefined,
         }};

        
        
        return jsonObj;
    }
}
