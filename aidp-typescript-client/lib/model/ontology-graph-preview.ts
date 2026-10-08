// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Bounded graph preview streamed from an Apache Jena TDB2 dataset for a design-time ontology Turtle file.
*/
export interface OntologyGraphPreview {
    'file': model.OntologyGraphPreviewFile;
    /**
    * Preview status.
    */
    'status': string;
    'graph': model.OntologyGraphPreviewModel;
    'limits': model.OntologyGraphPreviewLimits;
    /**
    * Parser or preview diagnostics.
    */
    'diagnostics'?: Array<model.OntologyGraphPreviewDiagnostic>;
    /**
    * Turtle/RDF constructs that were not fully represented in the preview.
    */
    'unsupportedConstructs'?: Array<string>;
    /**
    * Cursor for fetching another graph slice.
    */
    'nextCursor'?: string;
    /**
    * Cursor for fetching another root or parent node page in hierarchy mode.
    */
    'nextParentCursor'?: string;

}

export namespace OntologyGraphPreview {









    export function getJsonObj(obj: OntologyGraphPreview): object {
        const jsonObj = {...obj, ...{
            
                'file': obj.file ?
                
                
                model.OntologyGraphPreviewFile.getJsonObj(obj.file) : undefined,

                'graph': obj.graph ?
                
                
                model.OntologyGraphPreviewModel.getJsonObj(obj.graph) : undefined,
                'limits': obj.limits ?
                
                
                model.OntologyGraphPreviewLimits.getJsonObj(obj.limits) : undefined,
                'diagnostics': obj.diagnostics ?
                
                obj.diagnostics.map((item)=>{return model.OntologyGraphPreviewDiagnostic.getJsonObj(item)})
                
                 : undefined,



        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: OntologyGraphPreview): object {
        const jsonObj = {...obj, ...{
            
                    'file': obj.file ?
                
                
                model.OntologyGraphPreviewFile.getDeserializedJsonObj(obj.file) : undefined,

                    'graph': obj.graph ?
                
                
                model.OntologyGraphPreviewModel.getDeserializedJsonObj(obj.graph) : undefined,
                    'limits': obj.limits ?
                
                
                model.OntologyGraphPreviewLimits.getDeserializedJsonObj(obj.limits) : undefined,
                    'diagnostics': obj.diagnostics ?
                
                obj.diagnostics.map((item)=>{return model.OntologyGraphPreviewDiagnostic.getDeserializedJsonObj(item)})
                
                 : undefined,



         }};

        
        
        return jsonObj;
    }
}
