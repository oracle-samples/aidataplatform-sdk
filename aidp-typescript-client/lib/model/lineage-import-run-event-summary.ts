// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Summary of an imported OpenLineage run event.
*/
export interface LineageImportRunEventSummary {
    /**
    * OpenLineage event type.
    */
    'eventType'?: string;
    /**
    * Time the OpenLineage event occurred.
    */
    'eventTime'?: Date;
    /**
    * Unique identifier for the imported run event.
    */
    'key'?: string;
    /**
    * Name of the OpenLineage job.
    */
    'jobName'?: string;
    /**
    * Graph-ingestion state for this imported run event.
    */
    'ingestionLifecycleState': model.LineageImportRunEventIngestionLifecycleState;
    /**
    * Input datasets referenced by the run event.
    */
    'inputs'?: Array<model.LineageImportRunEventDataset>;
    /**
    * Output datasets referenced by the run event.
    */
    'outputs'?: Array<model.LineageImportRunEventDataset>;

}

export namespace LineageImportRunEventSummary {








    export function getJsonObj(obj: LineageImportRunEventSummary): object {
        const jsonObj = {...obj, ...{
            





                'inputs': obj.inputs ?
                
                obj.inputs.map((item)=>{return model.LineageImportRunEventDataset.getJsonObj(item)})
                
                 : undefined,
                'outputs': obj.outputs ?
                
                obj.outputs.map((item)=>{return model.LineageImportRunEventDataset.getJsonObj(item)})
                
                 : undefined,
        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: LineageImportRunEventSummary): object {
        const jsonObj = {...obj, ...{
            





                    'inputs': obj.inputs ?
                
                obj.inputs.map((item)=>{return model.LineageImportRunEventDataset.getDeserializedJsonObj(item)})
                
                 : undefined,
                    'outputs': obj.outputs ?
                
                obj.outputs.map((item)=>{return model.LineageImportRunEventDataset.getDeserializedJsonObj(item)})
                
                 : undefined,
         }};

        
        
        return jsonObj;
    }
}
